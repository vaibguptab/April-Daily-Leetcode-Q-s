package April;

import java.util.Arrays;

public class _2ndApril {
    public static void main(String[] args) {
        int[] spell = {5,1,3};
        int[] potions = {1,2,3,4,5};
        int[] ans = Q2300(spell,potions,7);
        for (int e:ans) {
            System.out.println(e);
        }
    }

    private static int[] Q2300(int[] spells, int[] potions, int success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int left = 0;
            int right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) spell * potions[mid];
                if (product >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            pairs[i] = m - left;
        }
        return pairs;
    }
}
