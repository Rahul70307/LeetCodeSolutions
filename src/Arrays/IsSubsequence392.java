//392. Is Subsequence

/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of
the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of
 "abcde" while "aec" is not).

 */
package Arrays;
public class IsSubsequence392 {

    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0){
            return true;
        }
        int i =0;
        int j =0;

        while(j< t.length() && i< s.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}
