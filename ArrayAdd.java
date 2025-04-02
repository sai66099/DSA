import java.util.Arrays;

public class ArrayAdd {
    public static void main(String[] args) {
        String[] guests = { "john", "krishna", "ram", "laxman", null };
        String newGuest = "Balram";

        boolean added = false;

        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                guests[i] = newGuest;
                added = true;
                break;
            }
        }
        

        System.out.println("The total guests are: " + Arrays.toString(guests));

        if (added) {
            System.out.println("All rooms are full.");
        }
    }
}

