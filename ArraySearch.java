import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        String[] guests = { "john", "krishna", "ram", "laxman" };

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the guest name to be searched: ");
        String name = input.nextLine();

        boolean found = false;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i].equalsIgnoreCase(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Guest found.");
        }
        else{
            System.out.println("Guest not Found.");
        }
    }
}
