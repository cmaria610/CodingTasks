public class T9 {
    public static void main(String[] args) {

        int array[]={15,10,20,5,25};
        int firstLargest=array[0];
        int secondLargest=array[0];
        for(int i=1; i<array.length;i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] > secondLargest && array[i] != firstLargest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Second largest element is: " + secondLargest);
    }
}
