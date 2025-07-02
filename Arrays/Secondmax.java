public class Secondmax{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,5};
        Secondmaximum(arr);
    }

    public static void Secondmaximum(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i] > secondmax){
                secondmax =  arr[i];
            }
        }
        System.out.println(secondmax);
    }
}