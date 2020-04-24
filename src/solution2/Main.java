package solution2;

import java.util.Scanner;

/**
 * 计算字符个数
 * https://www.nowcoder.com/practice/a35ce98431874e3a820dbe4b2d0508b1?tpId=37&tqId=21225&tPage=1&rp=&ru=%2Fta%2Fhuawei&qru=%2Fta%2Fhuawei%2Fquestion-ranking
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();
        char target = sc.nextLine().toCharArray()[0];
        System.out.println(count(line, target));
    }

    private static int count(String line, char target) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == (target)) {
                count++;
            }
        }
        return count;
    }
}