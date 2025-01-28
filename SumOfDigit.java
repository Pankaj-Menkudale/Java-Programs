public class SumOfDigit {
    
    public int sumOfDigit(int num){

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;

        }
        return sum;

    }
    public static void main(String[] args) {
        
        SumOfDigit sum = new SumOfDigit();
        System.out.println(sum.sumOfDigit(12345));

    }
}
