package br.states;

import java.awt.Graphics;

public interface State {
      void init();
      void update();
      void render(Graphics g);
      void KeyPress(int cod);
      void KeyReleased(int cod);
 }
