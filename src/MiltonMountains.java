public class MiltonMountains  extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        ground();
        plane.teleport(0,620);
        plane.turn(160);
        for (int x = 0; x < 5; x=x+1){
            mountains();
        }

    }
//

    public void ground() {
        plane.pausetime = 0;
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0,0);


        for(int row=0; row<620; row=row+1)
        {

            for(int col=0; col<1000; col=col+1)
            {
                plane.teleport(col, row);
                plane.setPixelColor(200,(int)col/4,(int)row/3); // Fills a pixel the red, green, blue (RGB) values you set
            }
        }

        for (int row = 620; row < 800; row = row + 1) {
            for (int col = 0; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//
                if ( red == 0) {
                    plane.setPixelColor(1, 68, 33);


                }



            }
        }


    }

    public void mountains() {
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(300);
        plane.turn(220);
        plane.move(300);
        plane.turn(140);




    }
}



