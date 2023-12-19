import java.util.ArrayList;
import java.util.List;

public class Day1 {
    public int[] twoSum(int[] nums, int target) {
        int result[]= new int[2];
        for( int i=0; i < nums.length ; i++)
        {
            for (int j=i+1; j<nums.length ; j++){
                if (nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }

        }
        return result;

    }
    public int mostWordsFound1(String[] sentences) {
        int count=0;
        for(int i=0;i<sentences.length;i++)
        {
            String as[]=sentences[i].split(" ");
            if(as.length>count)
            {
                count=as.length;
            }
        }
        return count;
    }
    public String defangIPaddr(String address) {
        String output= " ";
        output= address.replace(".", "[.]");
        return output;
    }
    public int finalValueAfterOperations(String[] operations) {
        int output=0;
        for(int i=0; i<operations.length;i++)
        {
            if(operations[i].equals("--X") || operations[i].equals("X--"))
            {
                output--;
            }
            else if(operations[i].equals("++X") || operations[i].equals("X++"))
            {
                output++;
            }
        }
        return output;
    }
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length(); i++)
        {
            char jew= jewels.charAt(i);
            for(int j=0; j<stones.length(); j++)
            {
                if(stones.charAt(j)== jew)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<words.length; i++)
        {
            if(words[i].contains(String.valueOf(x)))
            {
                list.add(i);
            }
        }
        return list;
    }
    public String interpret(String command) {
        String output= command.replace("()","o");
        output=output.replace("(al)","al");
        return output;
    }
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(int i=0;i<sentences.length;i++)
        {
            String as[]=sentences[i].split(" ");
            if(as.length>count)
            {
                count=as.length;
            }
        }
        return count;
    }
    public int balancedStringSplit(String s) {
        int x=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
                x++;
            else if(s.charAt(i)=='L')
                x--;
            if(x==0)
                count++;
        }
        return count;
    }
}
