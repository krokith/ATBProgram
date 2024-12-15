package java_November_exercises;
import java.util.*;

public class rotatearray {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int n=3;

        int[] rotatearray = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            rotatearray[((i+n)%a.length)] = a[i];
        }
        System.out.print(Arrays.toString(rotatearray));
    }
}
