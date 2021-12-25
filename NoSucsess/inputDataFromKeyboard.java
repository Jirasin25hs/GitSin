import java.util.Scanner;
public class inputDataFromKeyboard {
    public static void main(String[] args) {
// nextByte   nextShort   nextInt  nextLong  nextFloat nextDouble
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนรหัสนักศึกษา : ");
        String id = kb.nextLine();
        System.out.print("กรุณาป้อนชื่อ-นามสกุล : ");
        String name = kb.nextLine();
        System.out.print("กรุณาป้อนปีเกิด : ");
        int year = kb.nextInt();
        System.out.print("กรุณาป้อนผลการเรียนเฉลี่ย : ");
        double gpa = kb.nextDouble();

        int age = 2564-year;  //คำนวณอายุ


        System.out.println("สิ่งที่ท่านป้อนเข้ามาคือ "+id);
        System.out.println("ชื่อ-นามสกุลที่ป้อน คือ "+name);
        System.out.println("อายุที่ป้อน คือ "+age);
        System.out.println("เกรดเฉลี่ยที่ป้อน คือ "+gpa);
        kb.close();
        
    }
    
}
