package solution5;

import java.util.Scanner;

/**
 * 进制转换
 * https://www.nowcoder.com/practice/8f3df50d2b9043208c5eed283d1d4da6?tpId=37&tqId=21228&rp=0&ru=/ta/huawei&qru=/ta/huawei/question-ranking
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(Integer.decode(line));
        }
    }
}