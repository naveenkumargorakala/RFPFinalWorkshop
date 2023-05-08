package com.bridgelabz;
import java.util.Arrays;
import java.util.Scanner;

public class InsertArray {
    public int[] array(int[] array){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Before Insertion: " + Arrays.toString(array));
        System.out.println("enter index number: ");
        int index = input1.nextInt();
        System.out.println("enter element to insert: ");
        int element =input1.nextInt();
        for(int i=index;i<=array.length;i++){
            array[index]=element;
            array[i+1]=array[i];
        }
//        array[index] = element;

        System.out.println("After Insertion: " +  Arrays.toString(array));

        return array;
    }

    public void sortArray(int[] arr){
        array(arr);
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sorted array is: "+Arrays.toString(arr));
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        InsertArray insertArray = new InsertArray();
        System.out.println("enter no.of elements: ");
        int numOfElements = input.nextInt();
        int[] array = new int[numOfElements];
        System.out.println("Enter elements of array: ");
        for( int i=0;i<numOfElements;i++){
            int value = input.nextInt();
            array[i]=value;
        }

//      System.out.println( insertArray.array(array));
        insertArray.sortArray(array);
    }

}