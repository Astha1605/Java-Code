import java.util.HashMap;
import java.util.TreeSet;

public class numFrequency {
    static void frequencyNumber(int num[])
    {
        TreeSet<Integer> freq=new TreeSet<>();
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<num.length;i++)
        {
            freq.add(num[i]);
            if(count.containsKey(num[i]))
            {
                count.put(num[i], (count.get((num[i])))+1);
            }
            else
            {
                count.put(num[i],1);
            }
        }
        for(int output:freq)
        {
            System.out.println("The count of::"+output+ "-->"+count.get(output));
        }
    }

    public static void main(String[] args) {
        int num[]={11,22,222,11,22,11,22,99,9,9,9,9,0,0,0,3,3};
        frequencyNumber(num);
    }
}
