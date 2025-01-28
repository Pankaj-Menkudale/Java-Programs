public class FindMaximumEle {
    

    public int findMaximumEle(int arr[][]){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <5; j++) {

                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }
        }
            return max;
               
    

    }
    public static void main(String[] args) {
        
        int arr[][]={{1,2,3,4,5},
        {2,4,5,7,5},
        {9,7,6,5,3},
        {12,4,3,54,32}};
        FindMaximumEle obj=new FindMaximumEle();
        System.out.println(obj.findMaximumEle(arr));
    }
}
