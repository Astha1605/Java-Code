import java.util.HashMap;
import java.util.TreeSet;

public class sentence {
    static void sentenceWordCount(String sentence)
    {
        TreeSet<String> uniqueWord=new TreeSet<>();
        HashMap<String,Integer> wordsCount=new HashMap<>();
        String words[]=sentence.split(" ");
        for(int i=0; i<words.length;i++)
        {
            uniqueWord.add(words[i]);
            //    wordsCount.put(words[i],wordsCount.getOrDefault(words[i],0)+1);
            if(wordsCount.containsKey(words[i]))
            {
                wordsCount.put(words[i],(wordsCount.get(words[i]))+1);
            }
            else
            {
                wordsCount.put(words[i],1);
            }
        }
        for(String st:uniqueWord)
        {
            System.out.println("The key::"+st+"-->"+wordsCount.get(st));
        }
    }

    public static void main(String[] args) {
        sentenceWordCount("blue is water and blue is sky");
    }
}
