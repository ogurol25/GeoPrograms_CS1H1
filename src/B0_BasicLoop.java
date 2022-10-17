public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.teleport(500, 500);
        plane.trailWidth = 5;

        //squareRow();
        //grid();
        house();
        equitriangle(10);
        rectangle(10);


        grid2loops(plane.random(0, 35));
    }
        public void big() {
            plane.move(111);
            plane.turn(90);
            plane.move(111);
            plane.turn(90);
            plane.move(111);
            plane.turn(90);
            plane.move(111);
            plane.turn(90);


        }

        public void small(int a, int b) {
            plane.move(a);
            plane.turn(90);
            plane.move(b);
            plane.turn(90);
            plane.move(a);
            plane.turn(90);
            plane.move(b);
            plane.turn(90);


        }


        public void house() {
            plane.isTrail = true;
            plane.startingAngle(0);
            square(50);
            plane.isTrail = false;
            plane.startingAngle(270);
            plane.move(200);
            plane.isTrail = true;
            plane.pausetime = 0;
            sun(20);
            plane.turn(270);
            plane.isTrail = false;
            plane.move(300);
            plane.turn(270);
            plane.move(200);
            plane.turn(90);
            plane.isTrail = true;
            plane.startingAngle(0);
            plane.setColor(0,0,0);
            square(50);
            plane.isTrail = false;
            plane.startingAngle(270);
            plane.move(200);
            plane.isTrail = true;
            plane.pausetime = 0;
            sun(20);

        }

        public void square(int a) {
            plane.move(a);
            plane.turn(90);
            plane.move(a);
            plane.turn(90);
            plane.move(a);
            plane.turn(90);
            plane.move(a);
            plane.turn(90);
        }

        public void equitriangle(int b) {
            plane.isTrail = true;
            plane.setColor(0,0,0);
            plane.turn(90);
            plane.move(100);
            plane.turn(120);
            plane.move(100);
            plane.turn(120);
            plane.move(100);
            plane.turn(120);


        }

        public void rectangle(int a, int b) {


        }

        public void fillRec(int a, int b) {


        }

        public void tree(int a) {

        }

        public void sun(int a) {
            plane.setColor(255, 255, 0);
            plane.fillCircle(a);
        }

        public void rectangle(int a) {
            plane.move(200);
            plane.turn(90);
            plane.move(100);
            plane.turn(90);
            plane.move(200);
            plane.turn(90);
            plane.move(100);
            plane.turn(90);

        }
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
    }







