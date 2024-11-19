public class SimplePrintf {
    public static void main(String[] args) {
        String name = "Deepak";
        int age = 30;
        double height = 5.9;

        // Using printf to format the output
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years old%n", age);
        System.out.printf("Height: %.1f feet%n", height);
    }
}
