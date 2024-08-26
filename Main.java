import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // ArrayList <String> cars = new ArrayList<String>();
        // cars.add("volvo");
        // cars.add("bmw");
        // cars.add("mazdaa");
        
        // System.out.println(cars.get(0));


        // Collections.sort(cars);

        // System.out.println(cars);
        // System.out.println(cars.get(0));

        // for(String i: cars){
        //     System.out.println(i);
        // }

        // ArrayList<Integer> number = new ArrayList<Integer>();
        int number[]= {1,5,10,6,6};
         int tlenght=0;
         for(int Len : number){
             tlenght++;
            System.out.println(Len);

            
         }
         System.out.println(tlenght);
for(int i= 0; i<tlenght-1;i++ ){
    for (int j =0; j<tlenght-i-1;j++){
    if (number[j]> number[j+1]) {

        int temp = number[j];
        number[j]=number[j+1];
        number[j+1]=temp;
            
        }
        
    }
    for(int len : number){
        System.err.println(len);
    }

}



    }
}
