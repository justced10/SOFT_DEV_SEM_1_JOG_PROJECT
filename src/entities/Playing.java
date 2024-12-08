package main;



import entities.Player;

import levels.LevelManager;



import java.awt.*;

import java.awt.event.KeyEvent;



public class Playing {

    private Player player;

    private LevelManager levelManager;



    public Playing() {

        levelManager = new LevelManager();

        player = new Player(100, 100, 64, 64);

        player.loadLvlData(levelManager.getCurrentLevelData());

    }



    public void update() {

        levelManager.render(null); // Update levels if necessary

        player.update();

    }



    public void render(Graphics g) {

        levelManager.render(g); // Render the current level

        player.render(g);

    }



    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {

            case KeyEvent.VK_A -> player.setLeft(true);

            case KeyEvent.VK_D -> player.setRight(true);

            case KeyEvent.VK_W -> player.setJump(true);

        }

    }



    public void keyReleased(KeyEvent e) {

        switch (e.getKeyCode()) {

            case KeyEvent.VK_A -> player.setLeft(false);

            case KeyEvent.VK_D -> player.setRight(false);

            case KeyEvent.VK_W -> player.setJump(false);

        }

    }

}