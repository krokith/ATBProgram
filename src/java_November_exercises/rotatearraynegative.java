package java_November_exercises;
import java.util.*;
public class rotatearraynegative {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int n=-2;
        int len = a.length;
        n= n%len;
        if(n<0)
        {
            n = n+len;
        }
        int[] rotatearray = new int[len];

        for(int i =0;i<len;i++)
        {
            rotatearray[i]=a[((i+n)%len)];  //
        }

        System.out.print(Arrays.toString(rotatearray));
    }
}

