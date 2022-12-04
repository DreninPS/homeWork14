import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        LibNumbers.print(enterNumber(), enterChar());

    }
    static byte[] enterNumber() throws IOException {
        System.out.print("Enter number ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        char[] chars = number.toCharArray();
        byte[] arrOfBytes = new byte[chars.length];
        for (int i = 0; i < chars.length; i++) {
            try {
                arrOfBytes[i] = (byte) Integer.parseInt(String.valueOf(chars[i]));
            }catch (Exception e){
                System.out.println("Enter only numbers\n" + e );
                System.exit(-1);
            }
        }
        return arrOfBytes;
    }
    static char enterChar() throws IOException {
        String printChar = "";
        System.out.print("Enter print Char ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        printChar = reader.readLine();
        System.out.println("");
        if(printChar.length()>1){
            System.out.println("Enter only one char! Default char is '@' \n \n");
            return '@';
        }
        return printChar.charAt(0);
    }

}
