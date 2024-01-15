import java.util.Scanner;

//Second class Flower
public class Flower extends Plant {
    Season obj;
    public String color;
    public String blooming;
    public String benefits;

    public Flower() {
        Scanner read = new Scanner(System.in);
        System.out.println("please enter the length");
        length = read.nextLine();
        System.out.println("please enter the color of flower");
        color = read.nextLine();
        System.out.println("please enter the benefits of plant");
        benefits = read.nextLine();
        System.out.println("please enter the blooming of flower");
        blooming = read.nextLine();

    }

    public void displayIn_F() {

        System.out.println("•\tIts length reaches" + " " +length + " "+",the flower color is " + color+".");
        System.out.println("•\tIts benefits are :" + benefits +" ."+"\n"+"•\tIt blooms "+blooming+ ",its season is "+obj.SeasonName+"." );


    }
}
