public class T8 {
    public static void main(String[] args) {
        int array[]={7,5,69,96,20,2}; //5 elements
        int smallest= array[0];
        int largest= array[0];

        for(int i=0; i<=5; i++){
            if(array[i]<smallest)
                smallest=array[i];
            if(array[i]>largest) largest=array[i];

        }
        System.out.println("The smallest value is "+smallest);
        System.out.println("The largest value is "+largest);


    }
}
