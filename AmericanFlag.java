/*
Numaan Cheema
CSC220 - 01
Lab 3
*/


import doodlepad.*;

public class AmericanFlag {

    public static void createCircle(double x, double y, double width, double height) {
        Oval stars = new Oval(x, y, width, height);
        stars.setFillColor(255,250,250);
        stars.setStrokeColor(255,250,250);
    }

    public static void createRedStripe(double x, double y, double width, double height) {
        Rectangle rstripe1 = new Rectangle (x, y, width, height);
        rstripe1.setFillColor(255,0,0);
        rstripe1.setStrokeColor(255,0,0);
    }

    public static void createWhiteStripe(double x, double y, double width, double height) {
        Rectangle wstripe1 = new Rectangle (x, y, width, height);
        wstripe1.setFillColor(255,250,250);
        wstripe1.setStrokeColor(255,250,250);
    }

    public static void longLine(double y){
        createCircle(9,y, 9,9);
        createCircle(39,y, 9,9);
        createCircle(69,y, 9,9);
        createCircle(99,y, 9,9);
        createCircle(129,y, 9,9);
        createCircle(155,y, 9,9);
    }

    public static void shortLine(double y){
        createCircle(24,y, 9,9);
        createCircle(54,y, 9,9);
        createCircle(84,y, 9,9);
        createCircle(114,y, 9,9);
        createCircle(144,y, 9,9);
    }


    public static void main (String[] args){
        Pad p1 = new Pad(500,250);
        createRedStripe(0,230.8, 500, 19.2 );
        createWhiteStripe(0,211.6,500,19.2);
        createRedStripe(0,192.4, 500, 19.2 );
        createWhiteStripe(0,173.2,500,19.2);
        createRedStripe(0,154, 500, 19.2 );
        createWhiteStripe(0,134.8,500,19.2);
        Rectangle bluebox = new Rectangle(0, 0, 166.6, 134.8);
            bluebox.setFillColor(0,0,255);
        createRedStripe(166.6,115.6,333.2, 19.2);
        createWhiteStripe(166.6,96.4,33.2,19.2);
        createRedStripe(166.6,77.2,333.2, 19.2);
        createWhiteStripe(166.6,58,33.2,19.2);
        createRedStripe(166.6,38.8,333.2, 19.2);
        createWhiteStripe(166.6,19.6,33.2,19.2);
        createRedStripe(166.6,0,333.2, 19.8);

        //stars
        longLine(2);
        longLine(28);
        longLine(54);
        longLine(80);
        longLine(106);

        shortLine(13);
        shortLine(40);
        shortLine(66);
        shortLine(92);

    }

}
