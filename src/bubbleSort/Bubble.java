package bubbleSort;

public class Bubble {
    public static void main(String[] args) {
        int[] nums={99,-10,100123, 18, -978, 5623, 463, -9, 287, 49};
        int temp;
        Integer a = new Integer(5);
        char s = 's';


        boolean isSwap = true;
        System.out.print("Исходный массив: ");
        enterMass(nums);
        while (isSwap){
            isSwap = false;
            for (int j = 0; j < nums.length - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwap = true;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        enterMass(nums);
    }
    public static void enterMass(int[] mas) {
        System.out.print("[ ");
        for (int i = 0; i < mas.length - 1; i++) {
            System.out.print(mas[i] + ", ");
        }
        System.out.println(mas[mas.length - 1] + " ]");
    }
}
