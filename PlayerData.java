// import java.awt.Graphics2D;
import java.io.IOException;
// import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class PlayerData extends Entity{


    Game game;
    KeyHandler key;
    // public BufferedImage sprite; // this one for the "character frames" ig

    public PlayerData(KeyHandler k, Game g){
        super();
        game = g;
        key = k;
        this.setSprite("/Player_Images/JermaUp.png");
    }

    public PlayerData(KeyHandler k, Game g, int startingX, int startingY, int playerS){
        super(startingX, startingY, playerS);
        game = g;
        key = k;
        this.setSprite("/Player_Images/JermaUp.png");
    }

    public void playerMove(){
        if(!collides){
            if(key.upKey == true){
                // getPlayerImage("up");
                posY -= eSpeed;
            }
            if(key.downKey == true){
                // getPlayerImage("down");
                posY += eSpeed;
            }
            if(key.leftKey == true){
                // getPlayerImage("left");
                posX -= eSpeed;
            }
            if(key.rightKey == true){
                // getPlayerImage("right");
                posX += eSpeed;
            }
        }
        getPlayerImage(key.lastPressed);
        hitbox.setLocation(posX, posY);
    }

    public void getPlayerImage(int direction){
        try{
            // System.out.println(direction);
            switch(direction){
                case 87: // W
                    sprite = ImageIO.read(getClass().getResourceAsStream("/Player_Images/JermaUp.png"));
                    break;
                case 83: //S
                    sprite = ImageIO.read(getClass().getResourceAsStream("/Player_Images/JermaDown.png"));
                    break;
                 case 65: // A
                    sprite = ImageIO.read(getClass().getResourceAsStream("/Player_Images/JermaLeft.png"));
                    break;
                case 68: //D
                    sprite = ImageIO.read(getClass().getResourceAsStream("/Player_Images/JermaRight.png"));
                    break;

            }

        }catch(IOException e){

            e.getStackTrace();

        }
    }



    // DRAW METHOD REWRITTEN, ALWAYS ON THE BOTTOM OR ELSE MY EYES WILL HURT LOOKING FOR IT
    // public void draw(Graphics2D g1){
    //     super.draw(g1, sprite);
    // }




}
