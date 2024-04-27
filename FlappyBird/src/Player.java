import java.awt.*;

public class Player {
    private int posX;
    private int posY;
    private int width;
    private int height;
    private Image image;
    private int velocityY;

    public Player(int posX, int posY, int width, int height, Image image) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.image = image;
        this.velocityY = -0;
    }

    // Getter untuk posX
    public int getPosX() {
        return posX;
    }

    // Setter untuk posX
    public void setPosX(int posX) {
        this.posX = posX;
    }

    // Getter untuk posY
    public int getPosY() {
        return posY;
    }

    // Setter untuk posY
    public void setPosY(int posY) {
        this.posY = posY;
    }

    // Getter untuk width
    public int getWidth() {
        return width;
    }

    // Setter untuk width
    public void setWidth(int width) {
        this.width = width;
    }

    // Getter untuk height
    public int getHeight() {
        return height;
    }

    // Setter untuk height
    public void setHeight(int height) {
        this.height = height;
    }

    // Getter untuk image
    public Image getImage() {
        return image;
    }

    // Setter untuk image
    public void setImage(Image image) {
        this.image = image;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }
}