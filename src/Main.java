public class Main {

    public static void main(String[] args) {
        String name1 = "John Doe";
        String name2 = "Jane Doe";

        greetStudent(name1);
        greetStudent(name2);

        System.out.println(isEven(20));

        System.out.println(multiply(5, 2));
        System.out.println(multiply(5, 2));

    }

    // scope (static) RückgabeTyp name (ÜbergabeParameter) {}
    public static void greetStudent(String name) {

        System.out.println("Hallo, " + name + " wie geht es dir?");
        System.out.println("Willkommen im Java Bootcamp");
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}