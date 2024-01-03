import java.util.HashMap;
import java.util.TreeSet;

public class frequency {
    static void printFrequency(String name){
        TreeSet<Character> ts= new TreeSet<>();
        HashMap<Character,Integer> count=new HashMap<>();
        for(int i=0; i<name.length();i++)
        {
            ts.add(name.charAt(i));
            if(count.containsKey(name.charAt(i)))
            {
                count.put(name.charAt(i), count.get(name.charAt(i))+1);
            }
            else
            {
                count.put(name.charAt(i),1);
            }
        }
        for(char ch: ts)
        {
            System.out.println("Count of ::"+ch+ "->" +count.get(ch));
        }
    }

    public static void main(String[] args) {
        printFrequency("aasstthhhaaaaaaaaasinggghhhh");
    }
}
