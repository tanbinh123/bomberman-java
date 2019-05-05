package gameobjects;

import java.awt.image.BufferedImage;

public class Wall extends GameObject {

    private boolean breakable;

    public Wall(float xPos, float yPos, BufferedImage sprite, boolean isBreakable) {
        super(xPos, yPos, sprite);
        this.breakable = isBreakable;
    }

    public boolean isBreakable() {
        return this.breakable;
    }

    @Override
    protected void destroy() {
        // TODO: Spawn random powerups
        super.destroy();
    }

    @Override
    public void update() {
        
    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void collides(GameObject collidingObj) {
        collidingObj.handleCollision(this);
    }

    @Override
    public void handleCollision(Explosion collidingObj) {
        if (this.isBreakable()) {
            this.destroy();
        }
    }

}
