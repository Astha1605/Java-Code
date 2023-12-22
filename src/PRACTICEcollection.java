import java.net.SocketOption;
import java.util.*;

public class PRACTICEcollection {
    public static void main(String[] args) {
        List<Integer> num= new ArrayList<>();
        List<Integer> num1= new ArrayList<>();
        List<Integer> link1= new LinkedList<>();
        List<Integer> vec1= new Vector<>();
        Stack<Integer> st1= new Stack<>();
        st1.push(2);
        st1.push(3);
        vec1.add(2);
        vec1.add(0,5);
        num1.addAll(vec1);
        vec1.addAll(link1);
        System.out.println("Vector list is empty::"+vec1.isEmpty());
        //Collections.sort(vec1);
        Collections.sort(vec1, Collections.reverseOrder());
        link1.add(0,-1);
        link1.add(1,2);
        link1.add(2,3);
        link1.remove(1);
        link1.add(4);
        link1.add(1);
        //link1.removeAll(link1);
        //link1.clear();
        if(link1.contains(3))
        {
            //link1.remove(new Integer(-1));
            link1.remove(Integer.valueOf(-1));
        }
        Collections.sort(link1,Collections.reverseOrder());
        Collections.sort((link1));
        num1.add(6);
        num1.add(5);
        num.add(1);
        num.add(6);
        num.size();
        num.addAll(num);
        num.add(2,9);
        //num1.clear();
        //num.removeAll(num1);
        num.remove(2);
        System.out.println(num.containsAll(num1));
        System.out.println(num.size());
        //System.out.println(num.get(1));
        System.out.println(num);
        System.out.println(num1);
        System.out.println(link1);
        System.out.println(vec1);
        System.out.println(st1);
    }
}
