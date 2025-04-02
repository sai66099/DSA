public class Array{
    public static void main(String[] args) {
        String[] array = { "John", "Krishna", "Ram", "laxman" };
        System.out.println("Hotel guests:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Room No " + i +": "+ array[i]);
        }
    }
}