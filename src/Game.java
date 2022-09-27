package br;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import br.display.Display;
import br.imput.KeyManager;
import br.states.StateManager;

public class Game implements Runnable {
		
		private Display display;
		private Thread thread;
		private boolean running = false;
		
		
		public static int width = 800;
		public static int height = 500;
		
		private StateManager sm;
		private KeyManager km;
		
		public Game() {
			display = new Display("Jogo Pong", width, height);
			sm = new StateManager();
			km = new KeyManager();
			display.setKeyListener(sm);
			display.setKeyListener(km);
			StateManager.setState(StateManager.MENU);
		}

		@Override
		public void run() {
			init();
			int FPS = 75;
			double timePerTick = 1000000000 / 75;
			double delta = 0;
			long now;
			long lastTime = System.nanoTime();
			
	        while(running) {
	        	now = System.nanoTime();
	        	delta += (now - lastTime) / timePerTick;
	        	lastTime = now;
	        	
	        	if (delta >= 1) {
	        		update();
	        		render();
	        		delta--;
	        	}
	        
	        }
			stop();
		}
	    
		private void init() {
		
		}

		private void update() {
			if (StateManager.getState() == null) return;
			sm.update();
			km.update();
		}
		
		private void render() {
			BufferStrategy bs = display.getBufferStrategy();
			if (bs == null) {
				display.createBufferStrategy();
				bs = display.getBufferStrategy();
			}
			
			Graphics g = bs.getDrawGraphics();
			g.clearRect(0, 0, width, height);
			
			if (StateManager.getState() != null) {
			sm.render(g);
			}
			
			g.dispose();
			bs.show();
		}

		public synchronized void start() {
			if (thread != null) return;
			thread = new Thread(this);
			thread.start();
			running = true;
		}
		
		public synchronized void stop() {
			if (thread == null) return;
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
}
