package no28;

/**
 * Created by bumblebee on 2019/11/10.
 * 求字符串的全排列
 */
public class No28 {

    public static void main(String[] args) {
        new No28().getPermutation("abcd".toCharArray(), 0);
    }


    private void getPermutation(char[] chars, int begin) {
        if (begin == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }

        for (int i = begin; i < chars.length; i ++) {
            char temp = chars[begin];
            chars[begin] = chars[i];
            chars[i] = temp;

            getPermutation(chars, begin + 1);

            temp = chars[begin];
            chars[begin] = chars[i];
            chars[i] = temp;
        }
    }
}
