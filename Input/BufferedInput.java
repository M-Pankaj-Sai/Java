package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name= reader.readLine();
        int a = Integer.parseInt(reader.readLine());
        System.out.println(name);
        System.out.println(a);
    }
}
