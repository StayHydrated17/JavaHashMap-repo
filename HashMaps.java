import java.util.HashMap;
//importing the hashmap library
import java.util.Scanner;

//@author github.com/StayHydrated17
//@date 3/15/2021

public class HashMaps 
{    
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        int c = 3;
        String userDelete; //used to delete from HashMap

        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> myHash = new HashMap<String, Integer>();
        //creating a myHash object from the HashMap class
        //defining what types our values are, "a" is a string, and 1 is an integer.

        myHash.put("a", 1);  //this function works as storing it as [key, value]
                             //in this case, the key is 'a' and the value is 1.

        myHash.put("b", 2);
        myHash.put("c", 3);

        System.out.println(myHash);
        //outputs all keys and respected values of myHash
        System.out.println(myHash.get("c") + "\n ");
        //this outputs the specific key of 'c' and gets its value

        HashMap<String, String> myOtherHash = new HashMap<String, String>();
        //creating another HashMap object named myOtherHash, and defining the key and values as type String

        myOtherHash.put("Billy Bob", "Age 25");
        myOtherHash.put("Joe Smith", "Age 30");
        System.out.println(myOtherHash);
        //adding pre-determined key and values into myOtherHash and then displaying it

        System.out.println("Who would you like to remove?");
        userDelete = input.nextLine();
        //asking the user to delete someone from myOtherHash and storing input into userDelete variable

        while (!myOtherHash.containsKey(userDelete))
        {
            System.out.println("Please enter a valid name: ");
            userDelete = input.nextLine();
        }
        //While statement to ensure user enters a valid name to delete

        myOtherHash.remove(userDelete);
        System.out.println(myOtherHash);
        //removing the user stored in userDelete and then displaying the myOtherHash HashMap




    }
    
}
