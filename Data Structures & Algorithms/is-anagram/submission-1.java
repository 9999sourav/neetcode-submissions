class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        Map<Character, Long> ss = s.chars()
        .mapToObj(c-> (char) c)
        .collect(Collectors.groupingBy(c-> c, Collectors.counting()));
        Map<Character, Long> tt = t.chars()
        .mapToObj(c-> (char) c)
        .collect(Collectors.groupingBy(c-> c, Collectors.counting()));
        return ss.equals(tt);
    }

}
