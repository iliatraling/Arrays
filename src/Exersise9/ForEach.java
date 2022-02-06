package Exersise9;
// Использование разновидности for-each цикла for
class ForEach {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        //Использовать разновидность for-each цикла for для суммирования отображения значений
        for (int x : nums) {
            System.out.println("Знaчeниe: " + x);
            sum += x;
        }
        System.out.println("Сумма: " + sum);
    }
}