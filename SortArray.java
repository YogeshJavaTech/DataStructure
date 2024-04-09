import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] a = {1,3,7,9,8,6,4,2};
        System.out.println("original array "+ Arrays.toString(a));
        sortedArray(a,a.length);
        System.out.println("sorted array "+ Arrays.toString(a));
    }

    private static void sortedArray(int[] a, int length) {
        int temp;
        for (int i=0;i<length-1;i++){
            for(int j=i+1; j<=length-1;j++){
                if(a[i]>a[j]){
                    temp=  a[i];
                    a[i] = a[j];
                    a[j] =temp;
                }
            }
        }
    }
}
