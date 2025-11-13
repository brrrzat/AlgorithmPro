import java.util.HashMap;
import java.util.Scanner;

public class Crypt {
     public static HashMap<String,Integer> cipherList = new HashMap<>();
     public static String[] cipherText = {"_","I","5","4","h","L","9","b","2","J","X"};

     public static void main(String[] args) {
          
         cipherList.put("BH", 3); 
         cipherList.put("ZQ", 2);

          Scanner sc = new Scanner(System.in);
          System.out.println("Text to encrypt");
          String text = sc.nextLine();
          System.out.println("Key:");
          int key = sc.nextInt();

          decoding(text, key);
         
     }

     public static int[] decoding(String text, int key){
          String[] textArr = text.split("");
          String numString = String.valueOf(key);
          char[] keyArr = numString.toCharArray();
          int length = textArr.length;


          int[] intArray = new int[keyArr.length];
        for (int i = 0; i < keyArr.length; i++) {
            intArray[i] = Character.getNumericValue(keyArr[i]);
        }
          String result;
          for(int i = 0; i < length; i++ ){
               for(int j = 0; j < length; i++){
                    if (condition) {
                         
                    }
               }
          }

          return intArray;
     }
}
