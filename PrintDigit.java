public class PrintDigit {
    

    public void printDigitWorld(int digit){
        //digit=123
        int sum=0;

        while(digit>0){

            int sep=digit%10;//3,2
             sum=sum*10+sep;//30,
            digit=digit/10;//12

        }

        while(sum>0){
            int di=sum%10;
            switch (di) {
                case 0:System.out.print("Zero");
                break;
                case 1:System.out.print("ONe ");
                break;
                case 2:System.out.print("Two ");
                break;
                case 3:System.out.print("Three ");
                break;
            
                
            }
            sum/=10;
        }

    }
    public static void main(String[] args) {
        
        PrintDigit obj=new PrintDigit();
        int no=123;
        obj.printDigitWorld(no);
    }
}
