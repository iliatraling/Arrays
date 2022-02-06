package Exersise8;
// Использование класса Arrays для копирования массивов
import java.util.Arrays;

public class UseArrays {
    public static void main(String[] args) {
        System.out.println("Работа с одномерными массивами:");
        float[] numbers = {167.5f, -2, 16.6f, 99.8f, 26, 92, 43.4f, -234, 35, 80};
        float[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbersCopy));
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
        System.out.println();
        numbersCopy = Arrays.copyOfRange(numbers, 2, 6);
        System.out.println(Arrays.toString(numbersCopy));
        System.out.println(numbers.equals(numbersCopy));
        System.out.println("Работа с двумерными массивами:");
        int[][] numbers2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] numbers2DCopy = Arrays.copyOf(numbers2D, numbers2D.length);
        System.out.println("Равны ли эти двумерные массивы между собой?");
        System.out.println(Arrays.deepEquals(numbers2D, numbers2DCopy));// сравнениедвумерныхмассивов
        System.out.println(Arrays.deepToString(numbers2DCopy));
    }
}
