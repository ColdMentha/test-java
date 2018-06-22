package com.company;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] T = new int[]{5,-2,3,8,6};
        System.out.println(s.solution(T));
    }
}

class Solution {

    public int solution(int[] T) {

        int n = 0;
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int i = 0; i < T.length; i++) {
            if (T[i] > high1) {
                high2 = high1;
                high1 = T[i];


            } else if (T[i] > high2) {
                high2 = T[i];

            }

        }

        for (int j = 0; j < T.length; j++) {
            if (T[j] < high1 && T[j] < high2) {
                n++;
            }
        }

        return n;
    }
}