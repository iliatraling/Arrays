package Exersise10;
// Циклы for-each предназначены только для чтения.
public class NoChange {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int x : nums) {
//            System.out.print(x+ " ");
//            x= x* 10;//Эта операция фактически не изменяет содержимое массива nums
//            }
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            System.out.print(x + " ");
            nums[i] = x * 10;
        }
        System.out.println();
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
