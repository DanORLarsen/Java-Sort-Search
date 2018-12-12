//Filens opgave = Genopfriske java, og lave seach method i Array og Arraylist.
//Name: Dan Larsen.
import java.util.ArrayList;

class Main{
public static void main(String[]args) {
    ArrayList dan = new ArrayList();
    String d = "D";
    String a = "A";
    String n = "N";

    dan.add(d);
    dan.add(a);
    dan.add(n);
    System.out.println(dan.toString());
    //Max tal for int
    int j = (int) Math.pow(2, 31);
    System.out.println(j);
    for (Object lul: dan
         )
    {
        System.out.println(lul);
    }

    LinearSeachDan xd = new LinearSeachDan();
    MyTimerDan.start();
    xd.Find(3);
    MyTimerDan.stop();
    xd.Find("Dan");
    xd.Find("Hamster");
    xd.Find(21);
}}