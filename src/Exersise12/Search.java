package Exersise12;
// Поиск в массиве с использованием цикла for-each.
public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val= 5;
        boolean isVal = false;
        for (int x : nums) {
            if(val == x) {
                isVal = true;
                break;
            }
        }
        if(isVal) {
            System.out.println("Я нашелся");
        }
    }
}
