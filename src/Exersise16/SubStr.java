package Exersise16;
// Использование метода substring()
public class SubStr {
    public static void main(String args[]) {
        String orgStr = "Java - двигатель Интернета.";
        //Сформировать подстроку
        String subStr = orgStr.substring(7, 25);
        //Здесь создается новая строка, содержащая нужную подстроку
        System.out.println("orgStr: " + orgStr);
        System.out.println("subStr: " + subStr);
    }
}
