public class Main {
    public static void main(String[] args) {
        /*System.out.print(System.lineSeparator());
        for (int i = 0; i < 65_536; i++) {
            char ch = (char) i;
            System.out.println(ch);
        }*/
        //System.out.println("first line:" + newLine + "Second line");

        //char ch = '\t';
        /*int numberChar = 9;
        char ch = (char) numberChar;
        System.out.println("Number of tab: " + ch);
*/


        /*for (int i = 0; i < 65_536; i++) {
            System.out.println(i + " - " + (char) i);
        }*/

        int numberFirstChar = Character.MIN_VALUE;
        int numberSecondChar = Character.MAX_VALUE;
        System.out.println(numberFirstChar + " - " + Character.MIN_VALUE);
        System.out.println(numberSecondChar + " - " + Character.MAX_VALUE);
    }
}
