public class LoopPractice extends World{
    public void go() {
        plane.pausetime = 0;
        for (int x = 0; x < 10; x=x+1){
            drawRandomShape();
        }





        // if/else statement





        }
        public void drawRandomShape() {
            int random = plane.random(0,3);
            System.out.println("our random number is " + random);
            if (random == 0){

                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.square(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.square(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.square(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.square(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.square(100);

            }
            if (random == 1) {

                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.house(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.house(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.house(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.house(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.house(100);
            }

            if (random == 2) {
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.fillCircle(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.fillCircle(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.fillCircle(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.fillCircle(100);
                plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.fillCircle(100);
            }


        }

    }




