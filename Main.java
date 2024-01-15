
//class Main
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner c= new Scanner(System.in);
    Season S=new Season();
      Plant P=new Plant();
       P.set();
        Flower f=new Flower();
        System.out.println("please enter the season");
        S.SeasonName=c.next();
        f.obj=S;

        System.out.println("If you want to display enter yes or to exit press no");
        String ch=c.next();
        if (ch.equals("yes")){
        P.get();
        f.displayIn_F();}
        if(ch.equals("no"))
            System.exit(0);



    }
}
