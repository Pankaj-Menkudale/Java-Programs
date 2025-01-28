
public class CheckPerfectSquare {
    

    public boolean checkPerfectSquare(long num){

        if(num>0){
    
     long sq=(long)Math.sqrt(num);

     return(sq*sq==num);

    }
    return false;
}
    public static void main(String[] args) {
        
        CheckPerfectSquare obj = new CheckPerfectSquare();
        long num=17;

        if(obj.checkPerfectSquare(num)){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
