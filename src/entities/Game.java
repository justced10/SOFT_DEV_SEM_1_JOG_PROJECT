package main;



import gamestates.GameState;

import inputs.KeyboardInputs;



import javax.swing.JPanel;

import java.awt.*;



public class Game extends JPanel {

    private Menu menu;

    private Playing playing;



    public Game() {

        menu = new Menu();

        playing = new Playing();

        setFocusable(true);

        addKeyListener(new KeyboardInputs(this));

    }



    public void update() {

        switch (GameState.state) {

            case MENU -> menu.update();

            case PLAYING -> playing.update();

        }

    }



    @Override

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        switch (GameState.state) {

            case MENU -> menu.render(g);

            case PLAYING -> playing.render(g);

        }

    }



    public Menu getMenu() {

        return menu;

    }



    public Playing getPlaying() {

        return playing;

    }

}

