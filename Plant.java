import java.util.Scanner;

//First class Plant
public class Plant {
    private String planName;
    private String growTime;
    public String length;

    public void set() {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the name of plant");
        planName = input.nextLine();
        System.out.println("please enter the grow time of plant");
        growTime=input.nextLine();

    }

    public void get() {
        System.out.print("•\tThe flower name is: " + planName);
        System.out.println(",it takes"+" "+growTime +" "+"to grow from seed.");


    }

}
