class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a = new int[256];
        int[] b = new int[256];
         
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
          if (a[s.charAt(i)] == 0) {
                a[s.charAt(i)] = i + 1;
            }
            if (b[t.charAt(i)] == 0) {
                b[t.charAt(i)] = i + 1;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(a[s.charAt(i)]!=b[t.charAt(i)])
            {
                return false;
            }
        }
        return true;
    }
}