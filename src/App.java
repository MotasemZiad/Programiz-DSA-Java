public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Data Structures and Algorithms using Java!");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
