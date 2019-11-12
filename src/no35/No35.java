package no35;

/**
 * Created by bumblebee on 2019/11/12.
 * 第一个只出现一次的字符
 */
public class No35 {

    public static void main(String[] args) {
        System.out.println(new No35().firstUniqChar("aeacccdbff"));
    }

    private int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int[] temp = new int[256];

        for (int i = 0; i < temp.length; i ++) {
            temp[i] = 0;
        }

        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            temp[c] ++;
        }

        for (int i = 0; i < sChars.length; i ++) {
            if (temp[sChars[i]] == 1) {
                return i;
            }
        }

        return -1;
    }
}
