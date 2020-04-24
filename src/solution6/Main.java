package solution6;

import java.util.Scanner;

/**
 * 进制转换
 * https://www.nowcoder.com/practice/8f3df50d2b9043208c5eed283d1d4da6?tpId=37&tqId=21228&rp=0&ru=/ta/huawei&qru=/ta/huawei/question-ranking
 */
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = 0;

        while (scanner.hasNextLong()) {
            number = scanner.nextLong();
            isPrimerFactors(number);
        }

    }

    private static void isPrimerFactors(long num) {
        long number = num;
        while (number != 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    number /= i;
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}