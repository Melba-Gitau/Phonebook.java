import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
	    Map<String, String> phoneBook = new HashMap<>();
	    Scanner sc = new Scanner(System.in);
	    //input from user
	    for(int i = 0; i < 3; i++){
	        System.out.println("Enter a name:");
            String name = sc.nextLine();
            System.out.println("Enter the phone number:");
            String phoneNumber = sc.nextLine();
            phoneBook.put(name, phoneNumber);
	    }
		System.out.println("Enter a name to look up:");
        String name = sc.nextLine();
        
        // Check if the name exists in the map and print the corresponding phone number
        if (phoneBook.containsKey(name)) {
            System.out.println(phoneBook.get(name));
        } else {
            System.out.println("Name not found in phone book.");
        }
	}
}