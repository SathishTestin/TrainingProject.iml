package MyTask;

public class BinarySearch{

    public static int binarySearch(int[] a, int first, int last, int key){

    if (last>=first){
        int mid = first + (last - first)/2;
        if (a[mid] == key){
            return mid;
        }
        if (a[mid] > key){
            return binarySearch(a, first, mid-1, key);//search in left subarray
        }else{
            return binarySearch(a, mid+1, last, key);//search in right subarray
        }
    }
        return -1;
}
public static void main(String args[]){
        int a[] = {10,20,30,40,50};
        int key = 30;
        int last=a.length-1;
        int result = binarySearch(a,0,last,key);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}








