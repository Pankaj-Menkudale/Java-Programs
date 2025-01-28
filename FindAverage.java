public class FindAverage {
    
    public int findAverage(int arr[]){

        int size=arr.length;

        int sum=0;

        for(int i=0;i<size;i++){

             sum=sum+arr[i];
        }

        return sum/size;

    }

    public static void main(String[] args) {
        
        FindAverage fa = new FindAverage();
        int[] arr = {1, 2, 3, 4, 5,6,5,34,5};
        int average = fa.findAverage(arr);
        System.out.println("Average of the array is: " + average);
        
    }
}
