package levels;


import java.awt.Graphics;

import java.awt.image.BufferedImage;

import utilz.LoadSave;



public class LevelManager {

    private BufferedImage[] levels;

    private int[][] currentLevelData;



    public LevelManager() {

        loadLevels();

        loadCurrentLevel(0); // Start with the first level

    }



    private void loadLevels() {

        BufferedImage atlas = LoadSave.GetSpriteAtlas(LoadSave.LEVEL_ATLAS);

        levels = new BufferedImage[1]; // For now, just one level

        levels[0] = atlas.getSubimage(0, 0, 800, 600); // Stub for level dimensions

    }



    private void loadCurrentLevel(int index) {

        currentLevelData = new int[12][16]; // Stub level data

        // Logic for parsing level data would go here

    }



    public void render(Graphics g) {

        g.drawImage(levels[0], 0, 0, null); // Draw the first level for now

    }



    public int[][] getCurrentLevelData() {

        return currentLevelData;

    }

}


