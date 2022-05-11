
public class CollisionDetect{ // this is going t

    Game game;

    public CollisionDetect(Game g){

        game = g;

    }

    public void checkObj(Entity entity, Entity entity2){ // needs to be turned into an arraylist ig
        // System.out.println(entity.movement);


        //So now what we have to do is depending on what way the player is moving we check that direction, then we move the hitbox closer just to check if they would collide then
        //set espeed to 0, reset that during the update loop then whatever ig
            switch(entity.movement){
                case 87: //up
                    entity.hitbox.y -= entity.eSpeed;
                    if(entity.hitbox.intersects(entity2.hitbox)){
                        entity.hitbox.y += entity.eSpeed;
                        // entity.posY -= entity.eSpeed;
                        entity.collides = true;
                        entity2.collides = true;
                    }
                    break;
                case 83: //down
                    entity.hitbox.y += entity.eSpeed;
                    if(entity.hitbox.intersects(entity2.hitbox)){
                        entity.hitbox.y -= entity.eSpeed;
                        // entity.posY += entity.eSpeed;
                        entity.collides = true;
                        entity2.collides = true;
                    }
                    break;
                case 65: //left
                    entity.hitbox.x -= entity.eSpeed;
                    if(entity.hitbox.intersects(entity2.hitbox)){
                        entity.hitbox.x += entity.eSpeed;
                        // entity.posX -= entity.eSpeed;
                        entity.collides = true;
                        entity2.collides = true;
                    }
                    break;
                case 68: //right
                    entity.hitbox.x += entity.eSpeed;
                    if(entity.hitbox.intersects(entity2.hitbox)){
                        entity.hitbox.x -= entity.eSpeed;
                        // entity.posX += entity.eSpeed;
                        entity.collides = true;
                        entity2.collides = true;
                    }
                    break;



        }
         
    }//We want to check the parameter rather than the area of the hit box?










}