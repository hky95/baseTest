package base;

import java.util.Arrays;

public class BottomSort {
    public static void sort(int[] arr){
        System.out.println("ԭʼ����:"+Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println("��"+(i+1)+"��������:"+Arrays.toString(arr));
        }
        System.err.println("���ս��:"+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,7,1,6,3};
        sort(arr);
    }
}
