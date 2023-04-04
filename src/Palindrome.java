

public class Palindrome {

    public static boolean isPalindrome(int x) {
        String str = x + "";
        String [] arr = str.split("");
        for(x = 0; x < arr.length / 2 ; x++) {
            if (!arr[x].equals(arr[arr.length - x - 1])) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        System.out.println(isPalindrome(-505));
    }
}
