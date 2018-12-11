import java.util.Scanner;

public class LinearSeachDan {

    public LinearSeachDan() {
        int [] intArray = {2,5,3,7,8,9};
        System.out.println("Oprettede int Array: " + "{2,5,3,7,8,9}"); //toString Method not what i wanted
        String [] stringArray = {"Dan","Jakob","hans"};
        System.out.println("Oprettede String array: " + "{\"Dan\",\"Jakob\",\"hans\"}\n"); //toString Method not what i wanted
    }
    public void Find(String x)
    {
        String [] stringArray = {"Dan","Jakob","hans"};

        for (int i = 0; i < stringArray.length; i++)
        {
            if (x.equalsIgnoreCase(stringArray[i])) {
                System.out.println("The word \"" + x + "\" occurs at index: " + i + "\n");
                break;
            } else if (i == stringArray.length - 1) {
                System.out.println("The word \"" + x + "\" does not occur in the array\n");
            }
        }
    }
    public void Find(int x)
    {
        int [] intArray = {2,5,3,7,8,9};

        for (int i = 0; i < intArray.length; i++)
        {
        if(x == intArray[i])
        {
            System.out.println(x + " is at index: " + i + " in the array\n");
            break;
        }
        else if (i == intArray.length-1)
        {
            System.out.println(x + " does not occur in the array\n");
        }
        }
    }
}
