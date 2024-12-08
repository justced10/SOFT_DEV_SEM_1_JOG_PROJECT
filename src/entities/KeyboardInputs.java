package inputs;



import gamestates.GameState;

import main.Game;



import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;



public class KeyboardInputs implements KeyListener {

    private Game game;



    public KeyboardInputs(Game game) {

        this.game = game;

    }



    @Override

    public void keyTyped(KeyEvent e) {}



    @Override

    public void keyPressed(KeyEvent e) {

        switch (GameState.state) {

            case MENU -> {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    GameState.state = GameState.PLAYING;

                }

            }

            case PLAYING -> game.getPlaying().keyPressed(e);

        }

    }



    @Override

    public void keyReleased(KeyEvent e) {

        if (GameState.state == GameState.PLAYING) {

            game.getPlaying().keyReleased(e);

        }

    }

}


