




// Array short exemple sabse badi value print


package org.example.ArrayExemple;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

                                                //First Exemple
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = new int[]{1, 4, 9, 3, 2};
//    int max=arr[0];
//    for(int i=0; i<arr.length; i++)
//        if (arr[i]>max)
//            max=arr[i];
//        System.out.println(""+max);
//    }
//}


                                        //SECOND EXEMPLE
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 24, 9, 53, 2};
        Arrays.sort(arr);
         int a=arr[arr.length-1];
         System.out.println(a);
    }
}

                                        //Third Exemple
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> obj=new ArrayList<>();
//        obj.add(1277);
//        obj.add(1297);
//        obj.add(182);
//        obj.add(129);
//        obj.add(156);
//        obj.add(56);
//        System.out.println("Array max value:"+Collections.max(obj));
//    }
//}