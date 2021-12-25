package Week12;

public class Ex_WhileLoop01 {
    public static void main(String[] args) {
        // for (int i = 0; i <= 10; i++) { //ขึ้นโครงของFor
        // System.out.print(i+ " "\n);
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j += 3;
        }
        System.out.println();

        for (int i = 10; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
      
    }

}
