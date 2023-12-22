import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PRACTICEcollection {
    public static void main(String[] args) {
        List<Integer> num= new ArrayList<>();
        List<Integer> num1= new ArrayList<>();
        List<Integer> link1= new LinkedList<>();
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

    }
}
