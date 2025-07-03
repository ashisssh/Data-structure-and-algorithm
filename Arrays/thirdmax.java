public class thirdmax{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,5,6,7};
        thirdmaximum(arr);
    }

    public static void thirdmaximum(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int thirdmax1 = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
              thirdmax1 = secondmax;
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i] > secondmax){
                secondmax =  arr[i];
            }
            else if(arr[i]>thirdmax1 && arr[i] < secondmax){
              thirdmax1 =  arr[i];
            }
        }
        System.out.println(thirdmax1);
    }
}