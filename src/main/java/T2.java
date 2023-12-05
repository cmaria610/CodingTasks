public class T2 {
    public static void main(String[] args) {

        int[] numArray={1,2,3,4,5};
        int length= numArray.length;
        int sum=0;
        for(int i=0; i<length; i++){
            sum= sum+ numArray[i];
        }
        System.out.println("Sum of element of Array is "+sum);
    }
}
