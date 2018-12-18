public class Exercise07 {
    public static void main(String[] args) {
        int max = 0;
        int[]array = {1,5,3,8,2};

        for(int i=0;i<5;i++) {
            for(int j=i;j<5;j++) {

                int temp = 0;

                if(array[i]<array[j]) {

                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

        max = array[0];
        System.out.println("max: "+max);
    }
}
