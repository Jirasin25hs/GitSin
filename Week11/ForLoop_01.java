package Week11;

public class ForLoop_01 {
    public static void main(String[] args) {
        // ค่าเริ่มต้น
        // เงื่อนไข
        // upadate รอบ
        // int count = 1; //ค่าเริ่มต้น
        // while (count <= 10) { //เงื่อนไข
        // System.out.println("รอบที่ "+count+"java"); //ค่าที่ต้องการแสดง
        // count++; //upadate รอบ
        int sum = 0;
        for (int number = 1; number <= 10; number++) {
            sum = sum + number;
            System.out.println("รอบที่ " + number + " ผลบวกเท่ากับ" + sum);
        }
        System.out.println("รวมเท่ากับ " + sum);
    }

}
