package java_November_exercises;
import java.util.*;
public class rearrangeNumbers {
        public static void rearrange(int[] arr){
            ArrayList<Integer> negatives = new ArrayList<>();
            ArrayList<Integer> positives = new ArrayList<>();


            //separate the postives and negatives
            for(int num:arr){
                if(num<0)
                {
                    negatives.add(num);
                }else{
                    positives.add(num);
                }
            }

            //combine both in order
            int index=0;
            for(int num:negatives){

                arr[index]=num;
                index = index+1;
            }

            for(int num:positives){
                arr[index]=num;
                index=index+1;
            }
        }

        public static void main(String args[]){
            int[] a = {-13,-12,-4,-5,98,57,63};
            rearrange(a);
            for(int num : a){
                System.out.print(num+" ");
            }
        }

    }

