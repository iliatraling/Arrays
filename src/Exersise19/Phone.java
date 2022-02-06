package Exersise19;
//Создание телефонного справочника
public class Phone {
    public static void main(String args[]) {
        String numbers[][] = {
                {"Andra", "555-3322"},
                {"Nick", "555-8976"},
                {"Jon", "555-1037"},
                {"Bob", "555-1400"}};
        int i;
        //чтобы воспользоваться программой, ей нужно передать один аргумент командной строки
        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe: java Phone <имя>");
        } else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0]+": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length) {
                System.out.println("Имя не найдено.");
            }
        }}
}
