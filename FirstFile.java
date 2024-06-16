
import java.util.*;

public class FirstFile {

    public static int pow(int a , int b){

      if (b == 1)
         return a;
      return a*pow(a,b-1);
    }
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
        System.out.println(pow(sc.nextInt(),sc.nextInt()));
    }
}