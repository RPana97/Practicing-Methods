public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(returnString());
        System.out.println(returnInteger());
        System.out.println(returnBoolean());
    }

    public static String returnString() {
        return "Hello, World!";
    }

    public static int returnInteger() {
        return 21;
    }

    public static boolean returnBoolean() {
        return true;
    }
}