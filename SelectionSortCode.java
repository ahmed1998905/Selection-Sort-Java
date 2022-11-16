import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,64, 25,8, 12, 22, 11,1000};


        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            swap(arr,minIndex,i);
        }

        for(int i=0;i< arr.length;i++){
            if(i==0){
                System.out.print("{"+arr[i]);
            } else if(i==arr.length-1) {
                System.out.print(","+arr[i]+"}");
            }
            else {
                System.out.print(","+arr[i]);
            }
        }
    }

    public static void swap(int array [],int minIndex,int swapIndex){
        int temp = array[swapIndex];
        array[swapIndex] = array[minIndex];
        array[minIndex] = temp;
    }
}
