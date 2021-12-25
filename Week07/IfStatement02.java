import java.util.Scanner;
public class IfStatement02 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter username : ");
     
        int username = kb.nextInt();
        System.out.print("Enter password : ");
        int password = kb.nextInt();

        if (username == 123 && password == 1234) {
         System.out.println("You're logged in.");
        } else {
         System.out.println("Sorry, username or password is incorrect.");
        }
        kb.close();
    }
}
        
        
        
        
        
        
        
        
        
        
        // int age =1;
        // //เขียนด้วยคำสั่ง if ...else...
        // if (age>=15) {
        //     System.out.println("man/women");
            
        // } else {
        //     System.out.println("boy/girl");
            
        // }
        
        
        
        // เขียนด้วยคำสั่ง If อย่างเดียว
        // if (age>=15) {
        //     System.out.println("boy/girl");
        // }
        // if (age>=15) {
        //     System.out.println("man/woman");
        // }
//         System.out.println("End of Program");
//     }
    
// }
