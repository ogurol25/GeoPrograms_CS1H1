public class A2_Thickness extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("A2 Thickness");
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 50;
        plane.move(100);

    }



/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/
















    public void grid2loops(int square) {
        for (int y=0; y<10; y=y+1) {
            for (int x=0; x<10; x=x+1) {
                plane.trailWidth = plane.random(2, 30);
                plane.setColor(plane.random(0,255),plane.random(0,255), plane.random(0,255) );
                plane.teleport(x*square, y*square);
                System.out.println(x);
                plane.square(square);
            }
        }

    }

    public void squareRow(int y) {
        for(int x=0;x<10;x=x+1) {
            plane.setColor(200, y * 10, x * 20);
            plane.teleport(x * 100, y);
            System.out.println(x);
            plane.square(100);
        }
    }


    public void grid() {
        for (int y = 0; y < 7; y = y + 1) {
            squareRow(y);
        }

    }
}