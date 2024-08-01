

public class RemoveDuplicate26 {

    public static void main(String[] args) {
        int arr[] ={1,2,2,3,3,4,4,5};
        System.out.println(removeDup(arr));
    }

    public static  int removeDup(int arr[]){

        int count =0;
      for (int i = 1; i < arr.length; i++) {
        
          if(arr[i-1]==arr[i]){
            arr[i-1] =arr[i]; 
            count++;
          }
      }
        return count;
    }
    
}
