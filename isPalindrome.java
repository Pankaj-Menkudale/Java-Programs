public class isPalindrome {
    
    public boolean checkPalindrome(int num){
        int reverse=0;
        int original=num;

        while(num>0){
            int remainder = num%10;
            reverse = reverse*10 + remainder;
            num = num/10;
        }
        if(reverse==original){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        isPalindrome obj = new isPalindrome();
        System.out.println(obj.checkPalindrome(12321)); // true
        System.out.println(obj.checkPalindrome(12545)); // true

    }
}
