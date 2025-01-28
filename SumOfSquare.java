public class SumOfSquare {
    
    //sum of square of first three digit



    public int sumOfSquareofFirstThreeDigit(int num){//12
        int sum = 0;
        int n = num;
        int result=0;

        for(int i=1;i<=num;i++){

            sum=sum+i;//
        }
        int square=sum*sum;
        for(int i=1;i<=num;i++){

             result=result+i*i;
        }

        return square-result;
     



    }
    public static void main(String[] args) {

        SumOfSquare obj=new SumOfSquare();
        int difference=obj.sumOfSquareofFirstThreeDigit(10);
        System.out.println(difference);
        

    }
}
