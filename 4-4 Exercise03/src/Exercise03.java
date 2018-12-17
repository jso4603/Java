public class Exercise03 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i=0;i<=100;i++)
        {
            if(i%3!=0) continue; //3의 배수가 아니면 for문으로 돌아가서 다시 실행
            else sum += i;

        }

        System.out.println("3의 배수의 합 : " + sum);
    }
}
