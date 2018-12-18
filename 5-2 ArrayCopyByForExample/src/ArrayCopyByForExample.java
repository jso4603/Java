public class ArrayCopyByForExample {
    public static void main(String[] args) {

        String[] oldstrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldstrArray,0,newStrArray,0,oldstrArray.length);

        for(int i=0;i<newStrArray.length;i++) {
            System.out.print(newStrArray[i] + ",");
        }

        /* // for문 이용
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        for(int i=0;i<oldIntArray.length;i++) {
            newIntArray[i] = oldIntArray[i];
        }

        for(int i=0; i<newIntArray.length; i++) {
            System.out.print(newIntArray[i]+",");
        }
        */
    }
}
