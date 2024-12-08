package main;



import javax.swing.*;



public class MainClass {

    public static void main(String[] args) {

        JFrame frame = new JFrame("2D Platformer");

        Game game = new Game();



        frame.add(game);

        frame.setSize(800, 600);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);

        frame.setVisible(true);



        Timer timer = new Timer(16, e -> {

            game.update();

            game.repaint();

        });

        timer.start();

    }

}

