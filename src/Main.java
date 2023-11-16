import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void scannerNum(int n, int[]arr){
        int i = 0;
        while (i < n) {
            Scanner inputNum = new Scanner(System.in);
            System.out.print("ค่าของเลขที่ " + (i+1) + " : ");
            int num = inputNum.nextInt();
            if(num < 0) {
                System.out.println("ค่าที่ได้มีค่าติดลบกรอกข้อมูลใหม่!!!");
            } else {
                arr[i] = num;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner inputN = new Scanner(System.in);
        System.out.print("จำนวนตัวเลขของจำนวนเต็ม : ");
        int n = inputN.nextInt();

        if(n > 0) {
            int[] arr = new int[n];
            scannerNum(n, arr);
            Arrays.sort(arr);
            System.out.print("ค่าที่ได้เรียงลำกับจากน้อยไปมาก :");
            for(int i : arr){
                System.out.print(" " + i);
            }
        }
    }
}