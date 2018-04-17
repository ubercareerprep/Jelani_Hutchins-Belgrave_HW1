/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    
    
public static ArrayList<Integer> filter(int x, int y, ArrayList<Integer> arr){
        
        if(x > y)
        {
            return arr;
        }
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.size(); i++){
            int temp = arr.get(i);
            if(temp >= x && temp <= y){
                ans.add(temp);
            }
        }
        
        return ans;
    }
     public static void main(String []args){
         ArrayList<Integer> k = new ArrayList<Integer>();
         k.add(59);
         k.add(-333333);
         k.add(3);
         k.add(84746268);
         k.add(11);
         k.add(2);
         k.add(79);
         k.add(5);
         k.add(4);
         
        System.out.println("Hello World");
        System.out.println(filter(-2, 4, k));
        System.out.println(filter(4, 4, k));
        System.out.println(filter(-2, -4, k));
     }
}
