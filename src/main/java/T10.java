public class T10 {
    public static void main(String[] args) {
        String[] array = {"dog", "cat", "cat", "bird", "dog", "monkey", "giraffe"};

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}

