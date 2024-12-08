package entities;



import java.awt.Graphics;

import java.awt.image.BufferedImage;



import static utilz.Constants.PlayerConstants.*;

import static utilz.HelpMethods.*;



public class Player extends Entity {

    private BufferedImage[][] animations;

    private int aniTick, aniIndex, aniSpeed = 25;

    private int playerAction = IDLE;

    private boolean moving = false, attacking = false, left, right, jump;

    private float playerSpeed = 2.0f;

    private float airSpeed = 0f, gravity = 0.04f, jumpSpeed = -2.25f;

    private boolean inAir = false;

    private int[][] lvlData;



    public Player(float x, float y, int width, int height) {

        super(x, y, width, height);

        initHitbox(x, y, width, height);

        loadAnimations();

    }



    public void update() {

        updatePos();

        updateAnimationTick();

        setAnimation();

    }



    public void render(Graphics g) {

        g.drawImage(animations[playerAction][aniIndex], (int) hitbox.x, (int) hitbox.y, width, height, null);

    }



    private void updatePos() {

        moving = false;

        float xSpeed = 0;



        if (left) xSpeed -= playerSpeed;

        if (right) xSpeed += playerSpeed;



        if (inAir) {

            hitbox.y += airSpeed;

            airSpeed += gravity;

        } else if (jump) {

            airSpeed = jumpSpeed;

            inAir = true;

        }



        hitbox.x += xSpeed;

        moving = xSpeed != 0;

    }



    private void setAnimation() {

        if (inAir) playerAction = airSpeed < 0 ? JUMP : FALLING;

        else if (moving) playerAction = RUNNING;

        else playerAction = IDLE;

    }



    private void updateAnimationTick() {

        aniTick++;

        if (aniTick >= aniSpeed) {

            aniTick = 0;

            aniIndex = (aniIndex + 1) % animations[playerAction].length;

        }

    }



    private void loadAnimations() {

        // Load animations logic here

    }



    public void setLeft(boolean left) {

        this.left = left;

    }



    public void setRight(boolean right) {

        this.right = right;

    }



    public void setJump(boolean jump) {

        this.jump = jump;

    }

}