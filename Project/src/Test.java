public class Test{
    public static void main(String[] args) {
        System.out.println("test");
        int num = 123;
        System.out.println("Test number is " + 123);
        printLines(100);
        System.out.println();
    }
    public static void printLines(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("_");
        }
    }
}