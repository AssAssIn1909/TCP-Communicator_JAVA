/**
 * Created by Lukasz on 2015-06-08.
 */
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.print("Test");

        try{
            System.in.read();
        }catch (IOException e){

        }
    }
}
