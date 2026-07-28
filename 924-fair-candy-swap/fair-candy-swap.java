class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;

        for (int n : aliceSizes) {
            aliceSum += n;
        }

        for (int n : bobSizes) {
            bobSum += n;
        }

        int diff = (aliceSum - bobSum) / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int n : bobSizes) {
            set.add(n);
        }

        for (int candy : aliceSizes) {

            int n = candy - diff;

            if (set.contains(n)) {
                return new int[]{candy, n};
            }
        }

        return new int[]{};


    }
}