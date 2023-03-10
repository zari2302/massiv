import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*int[] array = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19,};
        double namber = 0;
        for (int sum : array) {
            namber = sum + namber;
        }
        System.out.println(namber / array.length);*/
        Random random = new Random();
        int[] array = new int[50];
        int sum = 0;
        int sum1 =0;
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            int nom1= random.nextInt(0,100);
            if (nom1>50){
             sum+=nom1;
             count++;
            } else if (nom1<50) {
                sum1 += nom1;
                count1++;
            }
        }
            System.out.println("бул 50 чон сандардын орточо арифметикасы = " +sum/count);
            System.out.print("бул 50 кичине сандардын орточо арифметикасы = " +sum1/count1);
        }

    }





