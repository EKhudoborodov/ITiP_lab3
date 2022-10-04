public class Palindrome{
    public static void main(String[] args){
        for(int i=0; i<args.length; i++){
            String s = args[i];
            String a = reverseString(s);
            System.out.println(isPalindrome(s, a))
        }
    }
    public static String reverseString(String s){
        String a = "";
        for(int i=s.length()-1; i>=0; i--){ // Перебор чисел от длины строки s до 0
            a += s.charAt(i); // Запись строки s наоборот посимвольно
        }
        return a;
    }
    public static boolean isPalindrome(String s, String a){
        System.out.println(s);
        return s.equals(a);
    }
}