package java_week5_Handwritten_Homework;
/**
 *   Write a Java program to iterate through all elements in an array list using Iterator.
 *
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5 {
        public static void main(String[] args) {
            ArrayList<String> fruitList = new ArrayList<>();
            fruitList.add("APPLE");
            fruitList.add("BANANA");
            fruitList.add("GRAPE");
            fruitList.add("MANGO");
            fruitList.add("KIWI");
            fruitList.add("ORANGE");
            fruitList.add("BLACKBERRY");
            fruitList.add("STRAWBERRY");
            fruitList.add("CHERRY");

            ListIterator<String> iterate = fruitList.listIterator();
            while (iterate.hasNext()) {
                System.out.print(iterate.next() + ", ");
            }
        }

}
