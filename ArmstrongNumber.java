public class ArmstrongNumber {
    

    public boolean isArmStrong(int num){//121
        int reverse=0;

        int original=num;

        while(num>0){

            int reminder=num%10;//1//2
            reverse=reverse+reminder*reminder*reminder;//1//
             num=num/10;//12j 

        }
        if(original==reverse){
            return true;
        }
        else{
            return false;
        }


    }
    public static void main(String[] args) {

        ArmstrongNumber obj=new ArmstrongNumber();
        System.out.println(obj.isArmStrong(153));
        
    }
}
