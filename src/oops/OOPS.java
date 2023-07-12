package oops;

class Pen{
    String colour;
    String type;


    public void Write(){
        System.out.println("write");
    }

    public void Printcolour(){
        System.out.println(this.colour);
    }

}


     public class OOPS {

    public static void main(String[] args) {

            Pen pen1 = new Pen();
            pen1.colour = "black";
            pen1.type = "ball";


            Pen pen2 = new Pen();
            pen2.colour = "blue";
            pen2.type = "gel";

            pen1.Printcolour();
            pen2.Printcolour();
        }

    }

