public class T1 {
    public static void main(String[] args) {

        int [] tempArray= {54,50,48,52,55,49,51};

        int temp;
        for(int i=0; i<tempArray.length-1; i++){
            for(int j=i+1; j<tempArray.length; j++){
                if(tempArray[i]>tempArray[j]){
                    temp=tempArray[i];
                    tempArray[i]=tempArray[j];
                    tempArray[j]=temp;

                }
            }
    }for(int a: tempArray){
            System.out.print(a+ " ");
        }

}}
