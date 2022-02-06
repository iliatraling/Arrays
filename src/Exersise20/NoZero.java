package Exersise20;
//Предотвращение деления на нуль с помощью оператора?
public class NoZero {
    public static void main(String[] args) {
        System.out.println("Делим 100: ");
        for (int i = -5; i < 6; i++) {
            if(i == 0 ? true : false) {
                System.out.println("На ноль делить нельзя!!!");
                continue;
            }
            System.out.println("100/" + i + " = " +  100/i);
        }
    }
}
