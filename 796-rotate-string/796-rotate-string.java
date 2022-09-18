class Solution {
    public boolean rotateString(String s, String goal) {
    String str1=s+s;
       return s.length() == goal.length() && str1.contains(goal);
    }
}