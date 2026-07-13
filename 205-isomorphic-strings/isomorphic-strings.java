class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Store first occurrence index
            if (!map1.containsKey(ch1)) {
                map1.put(ch1, i);
            }

            if (!map2.containsKey(ch2)) {
                map2.put(ch2, i);
            }

            // Compare first occurrence indexes
            if (!map1.get(ch1).equals(map2.get(ch2))) {
                return false;
            }
        }

        return true;
    }
}