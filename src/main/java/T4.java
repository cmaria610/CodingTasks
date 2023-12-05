public class T4 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
        };
        int isEven=0;
        int isOdd=0;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j]%2==0){
                    isEven += array[i][j];
                }else {
                    isOdd += array[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is "+isEven);
        System.out.println("The sum of odd numbers is "+isOdd);

    }}
