public class MaxConArr485{

    public static void main(String args[]){
       
        int arr[] ={0,0,0,1,1,0};
        System.out.println(maxConsecutive(arr));

    }

    static int maxConsecutive(int arr[]){
       int count =0;
       int maxCount = 0;
        
       for(int i =0;i<arr.length;i++){
         if(arr[i]==1){
            count++;
         }else{
            count =0;
         } 
         if(count>maxCount)
          maxCount = count;


       }
     return maxCount;
    }

}