

    public class Main
    {
    private static int x=0;
    private static int y=5;
        public static void main(String[] args) {
            printOne(x);
            printOne(x);
            printTwo(y);
        }
        public static void printOne(int x) {
            x = x + 2;
            System.out.println("value of x is = "+x);
        }

        public static void printTwo(int y) {
            y=y*y;
            System.out.println("value of y is= "+y);
            printOne(y);

        }
    }
    //Ctrl+Shift+V shortcut to choose and insert recent clipboard contents into the text
