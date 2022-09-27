package br.imput;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener  {

	private boolean[] keys = new boolean[256];
	public static boolean up, down, left, right ;
	

	public void update() {
		up = keys[KeyEvent.VK_UP];
		down = keys[KeyEvent.VK_DOWN];
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
	}

	@Override
	public void keyPressed(KeyEvent k) {
		if (k.getKeyCode() < 0 || k.getKeyCode() > 255)
			return;
		keys[k.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent k) {
		if (k.getKeyCode() < 0 || k.getKeyCode() > 255)
			return;
		keys[k.getKeyCode()] = false;
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		
		
	}

}
