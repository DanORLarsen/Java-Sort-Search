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

    LinearSeachDan xd = new LinearSeachDan();
    xd.Find(3);
    xd.Find("Dan");
    xd.Find("Hamster");
    xd.Find(21);
}}