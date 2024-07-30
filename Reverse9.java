public class Reverse9{
 
    public static void main(String[] args) {
        System.out.println(palindrome(12321));
        System.out.println(palindrome(123));
    }

    public static boolean palindrome(int x){
         
        int rev =0;
        int temp =x;
        while(x>0){
            rev= rev*10 +x%10;
            x= x/10;
        }
        if(rev !=temp){
            return false;
        }

        return true;
    }
}
