//Filens opgave = Genopfriske java, og lave seach method i Array og Arraylist.
//Name: Dan Larsen.
import java.lang.reflect.Array;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

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

    String[] names = {"Dan", "Mads", "Hans"};

    System.out.println(names[1]);

    //Find(x) method (uden metode) kan også nemt laves om til at finde Int, double osv...
    Scanner sc = new Scanner(System.in);
    String x;
    do {

        System.out.println("Input the desired seach word (Write \"Exit\" to exit)");
        x = sc.next();
        if (x.equalsIgnoreCase("Exit"))
        {
            System.out.println("DONE registered EXITING NOW");
            break;
        }
        for (int i = 0; i < names.length; i++)
        {
            if (x.equalsIgnoreCase(names[i])) {
                System.out.println("The word \"" + x + "\" occurs at index: " + i);
                break;
            } else if (i == names.length - 1) {
                System.out.println("The word \"" + x + "\" does not occur in the array");
            }
        }

    } while (x != "DONE"); //Blev nød til at bruge break, inden i koden da den hele tiden efter loppet resetter x, og derfor aldrig bliver "Done" i while loopet

//Find(x) metode slut
}}