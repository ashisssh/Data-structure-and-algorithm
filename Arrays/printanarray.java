public class printanarray{
    public static void main(String[] args){
        int arr[]= {1,2,3};
        printarr(arr);
    }
    public static void printarr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " " );
        }
    }
}