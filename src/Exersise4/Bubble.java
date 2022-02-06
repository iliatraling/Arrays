package Exersise4;
// Демонстрация алгоритма пузырьковой сортировки
public class Bubble {
    public static void main(String args[]) {
        int nums[]={99,-10,100123, 18, -978, 5623, 463, -9, 287, 49};
        int i, j, tempInt;
        int size = 10; // количество сортируемых элементов
        // Отобразить исходный массив
        System.out.print("Иcxoдный массив:");
        for (i = 0; i < size; i++) System.out.print(" " + nums[i]);
        System.out.println();
        // Реализация алгоритма пузырьковой сортировки
        for (i = 1; i < size; i++) {
            for (j = size - 1; j >= i; j--) {
                if (nums[j - 1] > nums[j]) {
                    // если требуемый порядок следования не соблюдается, то следует поменять элементы местами
                    tempInt = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = tempInt;
                }
            }}
        System.out.print("Oтcopтиpoвaнный массив:");
        for (i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
