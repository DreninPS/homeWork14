import java.util.Scanner;

public class LibNumbers {
    private static String zero = "" +
              " 1111 "+
            "\n11  11"+
            "\n11  11"+
            "\n11  11"+
            "\n 1111 ";
    private static String one = "" +
              "  11  "+
            "\n 111  "+
            "\n1 11  "+
            "\n  11  "+
            "\n111111";
    private static String two = "" +
              "11111 "+
            "\n    11"+
            "\n  111 "+
            "\n11    "+
            "\n111111";
    private static String three = "" +
              "111111"+
            "\n    11"+
            "\n 1111 "+
            "\n    11"+
            "\n111111";
    private static String four = "" +
              "11  11"+
            "\n11  11"+
            "\n111111"+
            "\n    11"+
            "\n    11";
    private static String five = "" +
              "111111"+
            "\n11    "+
            "\n11111 "+
            "\n    11"+
            "\n11111 ";
    private static String six = "" +
              " 11111"+
            "\n11    "+
            "\n11111 "+
            "\n11  11"+
            "\n 1111 ";
    private static String seven = "" +
              "111111"+
            "\n   11 "+
            "\n  11  "+
            "\n 11   "+
            "\n11    ";
    private static String eight = "" +
              " 1111 "+
            "\n11  11"+
            "\n 1111 "+
            "\n11  11"+
            "\n 1111 ";
    private static String nine = "" +
              " 11111"+
            "\n11  11"+
            "\n 11111"+
            "\n    11"+
            "\n111111";

    private static Scanner[] massOfScannerNumbers = {new Scanner(zero),new Scanner(one),new Scanner(two),new Scanner(three)
        ,new Scanner(four),new Scanner(five),new Scanner(six),new Scanner(seven),new Scanner(eight),new Scanner(nine)};
    private static boolean[][][] massOfNumberMatrixOfBool = new boolean[10][5][6];

    public static void print(byte[] numberInMassOfBytes, char printChar){

        boolean[][][] matrix = getMassOfNumberMatrixOfBool();
        boolean[][][] matrixToPrint = new boolean[numberInMassOfBytes.length][5][6];
        for (int i = 0; i < numberInMassOfBytes.length; i++) {
            matrixToPrint[i] = matrix[numberInMassOfBytes[i]];
        }
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < matrixToPrint.length; i++) {
                for (int k = 0; k < 6; k++) {
                    if(matrixToPrint[i][j][k]) System.out.print(printChar);
                    else System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    private static boolean[][] getMatrixOfBool(int i){
         boolean[][] matrixOfBoolean = new boolean[5][6];
            for (int j = 0; j < 5; j++) {
                char[] charsInLine = massOfScannerNumbers[i].nextLine().toCharArray();
                for (int k = 0; k < 6; k++) {
                    if(charsInLine[k]!=' ') matrixOfBoolean[j][k] = true;
                    else matrixOfBoolean[j][k] = false;
                }
            }
        return matrixOfBoolean;
    }
    private static boolean[][][] getMassOfNumberMatrixOfBool(){
        for (int i = 0; i < 10; i++) {
            massOfNumberMatrixOfBool[i] = getMatrixOfBool(i);
        }
        return massOfNumberMatrixOfBool;
    }
}
