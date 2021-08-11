import java.util.Arrays;
import java.util.Scanner;

public class Exe3_CountWithIf {
    public static Scanner input = new Scanner(System.in);

    public static void start(){
        Scanner input = new Scanner(System.in);
        Boolean conti = true;
        do{
            content();

            System.out.print("Nhấn phím bất kỳ để tiếp tục.\nPhím 0 để kết thúc.\nNhập: ");
            int choose= input.nextInt();
            switch (choose){
                case 0:
                    conti = false;
                    break;
                default:
                    break;
            }
        }while (conti);

    }

    public static void content(){
        System.out.println("Nhập giới hạn mảng: ");
        int n = input.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị cho ["+i+"]: ");
            array[i] = input.nextInt();
        }
        System.out.println("Mảng: "+ Arrays.toString(array));
        System.out.println("Có "+ count(array)+" số chia hết cho 4 nhưng không chia hết cho 5");

    }

    public static int count(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]%4 == 0) && (arr[i]%5 !=0))
                count++;
        }
        return count;
    }

}
