package solution4;

import java.util.Scanner;

/**
 * 字符串分隔
 * https://www.nowcoder.com/practice/d9162298cb5a437aad722fccccaae8a7?tpId=37&tqId=21227&tPage=1&rp=&ru=%2Fta%2Fhuawei&qru=%2Fta%2Fhuawei%2Fquestion-ranking
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            split(new StringBuilder(line));
        }
    }

    private static void split(StringBuilder lineBuffer) {
        int length = lineBuffer.length();
        if (length < 8) {
            for (int i = 0; i < 8 - length; i++) {
                lineBuffer.append("0");
            }
            System.out.println(lineBuffer.toString());
        } else if (length == 8) {
            System.out.println(lineBuffer.toString());
        } else {
            System.out.println(lineBuffer.substring(0,8));
            split(new StringBuilder(lineBuffer.substring(8,length)));
        }
    }

    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.length()%8 !=0 )
                s = s + "00000000";

            while(s.length()>=8){
                System.out.println(s.substring(0, 8));
                s = s.substring(8);
            }
        }
    }
}