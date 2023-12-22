import java.util.HashSet;
import java.util.List;

public class Day2 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result=false;
        String ss1="";
        String ss2="";
        for(int i=0; i<word1.length; i++)
        {
            ss1+=word1[i];
        }
        for(int j=0; j<word2.length; j++)
        {
            ss2+=word2[j];
        }
        if((ss1).equals(ss2))
        {
            result=true;
        }
        return result;
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int output=0;
        int index=0;
        if(ruleKey.equals("type"))
        {
            index=0;
        }
        else if(ruleKey.equals("color"))
        {
            index=1;
        }
        else if(ruleKey.equals("name"))
        {
            index=2;
        }
        for(int i=0; i<items.size();i++)
        {
            if(items.get(i).get(index).equals(ruleValue))
            {
                output++;
            }
        }
        return output;
    }
    public String restoreString(String s, int[] indices) {
        char ar[]= new char[indices.length];
        for(int i=0; i<s.length();i++)
        {
            ar[indices[i]]= s.charAt(i);
        }
        return String.valueOf(ar);
    }
    public String truncateSentence(String s, int k) {
        String out[]=s.split(" ");
        String res="";
        for(int i=0;i<out.length;i++)
        {
            if(i==k)
                break;

            else if(i<k-1)
            {
                res+=out[i]+" ";
            }
            else
            {
                res+=out[i];
            }
        }
        return res;
    }
    public boolean checkIfPangram(String sentence) {
        boolean output=false;
        HashSet<Character> hs= new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
            hs.add(sentence.charAt(i));
        }
        if(hs.size()==26)
        {
            output=true;
        }
        return output;
    }
}
