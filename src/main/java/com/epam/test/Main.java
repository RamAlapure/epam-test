package com.epam.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Find a pair of number whose sum is closer to 0
        //12, -7, 9, -3, 23, 8, -18, 14, 43, -2, 5,25

        List<Pair> list = new ArrayList<>();

        int[] arr = new int[]{12, -7, 9, -3, 23, 8, -18, 14, 43, -2, 5, 25};

        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            while (j < arr.length - 1) {
                list.add(new Pair(arr[i] + arr[j], arr[i], arr[j]));
                j++;
            }
        }

        Pair target = list.get(0);
        for (Pair pair : list) {
            if (Math.abs(pair.getSum()) <  Math.abs(target.getSum())) {
                target = pair;
            }
        }
        System.out.println(target);

    }
}

class Pair {
    int sum, i, j;

    public Pair(int sum, int i, int j) {
        this.sum = sum;
        this.i = i;
        this.j = j;
    }

    public int getSum() {
        return sum;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pair{");
        sb.append("sum=").append(sum);
        sb.append(", i=").append(i);
        sb.append(", j=").append(j);
        sb.append('}');
        return sb.toString();
    }
}
