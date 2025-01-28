// public class CountOddNEven {
    
//     public void countEvenOdd(int arr[],int size){

//         int even_Count=0;
//         int odd_Count=0;
//         for(int i=0;i<size;i++){
//             if(arr[i]%2==0)
//                even_Count++;
            
//             else
//                 odd_Count++;
            
//         }
//         System.out.println("Even Count: "+even_Count);
//         System.out.println("Odd Count: "+odd_Count);
//     }

//     public static void main(String[] args) {
//         CountOddNEven obj = new CountOddNEven();
//         int arr[] = {1, 2, 3, 4, 5,
//             6, 7, 8, 9, 10};
//             int size = arr.length;
//             obj.countEvenOdd(arr,size);
//     }

// }





//another wat
public class CountOddNEven {


    public int[] countEvenOdd(int arr[],int size){
        int even_Count=0;
        int odd_Count=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0)
            {
            even_Count++;
            }
            else{
                odd_Count++;
            }
        }

        return new int[]{even_Count,odd_Count};
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,
            6, 7, 8, 9};
            int size = arr.length;

            CountOddNEven obj=new CountOddNEven();
            int[] result=obj.countEvenOdd(arr,size);
             int even=result[0];
             int odd=result[1];
             System.out.println("count of even number is "+even);
             System.out.println("count of odd number "+odd);

        }
    }



