package Input;

public class ConsoleInput {
    public static void main(String[] args) {
        char[] s= System.console().readPassword();
        System.out.println(s);
        String s1= System.console().readLine();
        System.out.println(s1);
    }
}
