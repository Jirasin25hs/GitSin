import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter radius : ");
        int radius = kb.nextInt();

        float result = PI*radius*radius;
        System.out.println("Result : "+ result);
        kb.close();


        
    }
    
}
