package Q2;

public class StrReversal {
    public static void main(String[] args) {
        System.out.println("String:");
        String s = "мираж";
        System.out.println(s);
        System.out.println("Revers string is:");
        System.out.println(StringRevers(s));
    }

    public static String StringRevers(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[s.length() - i - 1] = s.charAt(i);
        }
        return new String(arr);
    }
}

