
import java.util.Arrays;

public class LongestCommon14{

    public static void main(String arg[]){
            
        String arr[] ={"flower","flow","fligth"};
        System.out.println(prefixs(arr));

    }

    public static String prefixs(String []s ){
        
        String start = s[0];
        String end = s[s.length-1];
        Arrays.sort(s);
        String ans="";

        for(int i =0;i<start.length();i++){
            if(start.charAt(i)==end.charAt(i)){
                 ans += start.charAt(i); 
            }else{
                break;
            }
        }

    return ans;

    }

}