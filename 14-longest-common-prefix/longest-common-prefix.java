class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f=strs[0];
        String res="";
        String l=strs[strs.length-1];
        for(int i=0;i<Math.min(f.length(),l.length());i++){
            if(f.charAt(i)==l.charAt(i)){
                res+=f.charAt(i);
            }else{
                break;
            }
        }
        return res;
    }
}