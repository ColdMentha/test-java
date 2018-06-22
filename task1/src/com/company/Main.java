package com.company;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4, 17));
    }
}

class Solution {
// task 1

    public int solution(int A, int B) {

        int i;
        int n = 0;
        for (i = A; i < B; i++) {
            if (i % Math.sqrt(i) == 0) {
                n++;
            }

        }

        return n;
    }
}

