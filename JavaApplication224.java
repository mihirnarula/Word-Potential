// word potential

package javaapplication224;
import java.util.*;
public class JavaApplication224 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a String: ");
        String word = sc.nextLine();
        int len = word.length();
        
        for(int i = 0; i < len; i++){
            char ch = word.charAt(i);
            int poten = ch;
            System.out.println(poten);
            sum = sum + poten;
        }
        System.out.println("Potential of the word: " + sum);
    }
    
}
