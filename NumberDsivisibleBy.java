public class NumberDsivisibleBy {
    
    public boolean isDivisible(int num){

        if(num%6==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        NumberDsivisibleBy nd = new NumberDsivisibleBy();
        System.out.println(nd.isDivisible(18)); // true
        System.out.println(nd.isDivisible(19)); // false
        System.out.println(nd.isDivisible(343546575)); // false

    }
}
