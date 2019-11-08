package no12;

public class No12 {
    public static void main(String[] args) {
        new No12().printNumber(5);
    }

    private int mNum = 0;
    private int min;

    private void printNumber(int n) {
        char[] chars = new char[n];
        for (int i = 0; i < n; i ++) {
            chars[i] = '0';
        }
        min = n - 1;
        while (!increase(chars)) {
            print(chars);
        }
    }

    private boolean increase(char[] num) {
        int length = num.length;
        int carry = 0;

        for (int i = length - 1; i >= 0; i --) {
            if (i < min) {
                min = i;
            }
            if (i == length - 1) {
                num[i] += 1;
            } else {
                num[i] += carry;
            }
            if (num[i] > '9') {
                if (i == 0) {
                    return true;
                }
                num[i] = '0';
                carry = 1;
            } else {
                break;
            }
        }
        return false;
    }

    private void print(char[] num) {
        for (int i = min; i < num.length; i ++) {
            System.out.printf("%c", num[i]);
        }
        System.out.print(" ");
        mNum ++;
        if (mNum % 10 == 0) {
            System.out.println();
        }
    }
}
