package Exeresise8;
// Использование класса Arrays для копирования массивов
import java.util.Arrays;

public class UseArrays {
    public static void main(String[] args) {
        System.out.println("Работа с одномерными массивами:");
        float[] numbers = {167.5f, -2, 16.6f, 99.8f, 26, 92, 43.4f, -234, 35, 80};
        float[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length/2);
        System.out.println(Arrays.toString(copyOfNumbers));
        System.out.println("Работа с двумерными массивами:");
        int[][] numbers2D= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] numbers2DCopy= Arrays.copyOf(numbers2D, numbers2D.length);
        System.out.println("Равны ли эти двумерные массивы между собой?");
        System.out.println(Arrays.deepEquals(numbers2D, numbers2DCopy));// сравнение двумерных массивов
        System.out.println(Arrays.deepToString(numbers2DCopy));// вывод на консоль двумерных массивов
    }
}
