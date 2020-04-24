package solution3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 明明的随机数
 * https://www.nowcoder.com/practice/3245215fffb84b7b81285493eae92ff0?tpId=37&tqId=21226&tPage=1&rp=&ru=%2Fta%2Fhuawei&qru=%2Fta%2Fhuawei%2Fquestion-ranking
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int count = sc.nextInt();
            ArrayList<Integer> ints = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                ints.add(sc.nextInt());
            }
            ints.stream()
                    .distinct()
                    .sorted()
                    .forEach(System.out::println);
        }
    }

}