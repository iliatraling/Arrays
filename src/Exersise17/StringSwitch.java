package Exersise17;
// Использование строк для управления оператором switch
import java.util.Scanner;

public class StringSwitch {
    public static void main(String args[]) {
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите команду: ");
            String command = in.nextLine();
            switch (command) {
                case "connect":
                    System.out.println("Набор операторов для выполнения команды \"Соединение\"");
                    break;
                case "cancel":
                    System.out.println("Набор операторов для выполнения команды \"Отмена действия\"");
                    break;
                case "disconnect":
                    System.out.println("Набор операторов для выполнения команды \"Разъединение\"");
                    break;
                default:
                    System.out.println("Heвepнaя команда!");
                    break;
            }
        } while (true);
    }
}
