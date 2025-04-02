import java.util.Scanner;
import java.util.Arrays;


public class ArrayDelete {
    public static void main(String[] args) {
        String[] guests = { "john", "krishna", "ram", "laxman", "balram" };
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of guest who checked out from hotel: ");
        String guestToRemove = input.nextLine();

        boolean removed = false;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && guests[i].equalsIgnoreCase(guestToRemove)) {
                guests[i] = null;
                removed = true;
                break;
            }
        }

        System.out.println("Updated the guests List: " + Arrays.toString(guests));


        if (!removed) {
            System.out.println("Guest not found");
        }
}    
}
