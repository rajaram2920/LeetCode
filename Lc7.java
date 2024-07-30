
 public class Lc7{

  public static void main(String []arg){
     System.out.println(rev(12345));
  }

  public static  int rev(int n){
     boolean temp = true;
     if(n<0){
        temp =false;
     }

    n = Math.abs(n);
    long rev = 0;
    while(n>0){
      rev = (rev*10)+(n%10);
      n= n/10;
      if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
        return 0;
      }
    }
    if(!temp)
        return -1*(int)rev;
    
   return (int)rev;
  }

}