// import java.io.IOException;
// import java.awt.image.BufferedImage;
// import javax.imageio.ImageIO;
// import java.awt.Graphics2D;


public class People extends Entity{

    // public BufferedImage sprite; // this one for the "character frames" ig
    
    
    public People(String filePath){ //DOESNT NEED TO BE A STRING, I AM JUST LAZY SO INSTEAD OF SENDING A BUFFEREDIMAGE I FORCE PEOPLE TO SEND IN STRING
        super(
            ((int) (Math.random()*(500))),
            ((int) (Math.random()*(500))),
            0,
            100,
            100);
        this.setSprite(filePath);
    }


    public void peopleMove(){
        int direction = (int) (Math.random() * 4);
        // int amount = (int) (Math.random() * 30);
        int amount = 10;
        switch(direction){
            case 0:
                direction = 83;
                break;
            case 1:
                direction = 87;
                break;
            case 2:
                direction = 68;
                break;
            case 3:
                direction = 65;
                break;
        }

        switch(direction){
            case 87: // W 1
                posY -= amount;
                break;
            case 83: //S 0
                posY += amount;
                break;
             case 65: // A 3
                posX -= amount;;
                break;
            case 68: //D 2
                posX += amount;
                break;
        }
        hitbox.setLocation(posX, posY);
        movement = direction;
        eSpeed = amount;
        
            /*            switch(direction){
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

            }*/


        // DONT NEED THIS BECAUSE THE IMAGE WE ARE USING IS STATIC THEREFORE WE CAN JSUT INITALIZE IT WHEN WE CREATE THE OBJECT
        // try{

        //     sprite = ImageIO.read(getClass().getResourceAsStream("/People_Images/People.jpg"));

        // }catch(IOException e){

        //     e.getStackTrace();

        // }
    }

    // public void draw(Graphics2D g1){
    //     super.draw(g1, sprite);
    // }


}
