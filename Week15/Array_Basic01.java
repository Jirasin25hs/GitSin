package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        //การประกาศตัวแปรแบบ array
        // แบบที่1 : ประกาศแบบกำหนดสมาชิก
        
        int [] number= {1,2,3,44,34,54,77,11,9};

        int size = number.length;

        System.out.println(size);
        System.out.println(number.length);//หาความยาวของอาเรย์
        System.out.println(number[3]);//การเข้าถึงตำแหน่งของตัวแปร
        //การเปลี่ยนค่าข้อมูลในตัวแปร
        number[3] = 88;
        System.out.println(number[3]);
        
        //แบบที่2 : ประกาศแบบกำหนดขนาด
        
        char[] alphabet; //ประกาศอาเรย์
        alphabet = new char[26]; //สร้างอาเรย์
        alphabet [0] = 'a';
        alphabet [1] = 'b';
        alphabet [2] = 'c';

        System.out.println(alphabet[2]);
        System.out.println(alphabet[25]);

        int []num=new int [10];
        System.out.println(num[9]);
        // char[] alphabet = new char[26];

    }
}
