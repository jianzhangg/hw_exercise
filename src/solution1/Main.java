package solution1;

import java.util.*;

/**
 * 字符串最后一个单词的长度
 * https://www.nowcoder.com/practice/8c949ea5f36f422594b306a2300315da?tpId=37&tqId=21224&tPage=1&rp=&ru=/ta/huawei&qru=/ta/huawei/question-ranking
 */
public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            System.out.println(lengthOfLast(str));
        }
    }

    public static int lengthOfLast(String str) {
        String[] s =str.split(" ");
        return s[s.length-1].length();
    }
}