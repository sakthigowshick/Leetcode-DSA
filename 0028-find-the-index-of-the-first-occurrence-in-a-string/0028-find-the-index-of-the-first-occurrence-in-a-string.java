class Solution {
    public int strStr(String haystack, String needle) {
        int l=needle.length();
        for(int i=0;i<haystack.length()-l+1;i++)
        {
            String sub=haystack.substring(i,i+l);
            if(needle.equals(sub))
            {
                return i;
            }
        }
        return -1;
    }
}