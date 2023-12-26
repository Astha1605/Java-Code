import java.util.*;

public class PracticeQueue {
    public static void main(String[] args) {
            //queue();
        //priorityqueue();
        int ar[] ={4,3,7,2,9,8,1,6};
        getMaxKElement(ar,3);
    }

    static void queue()
    {
        Queue<String> ar = new LinkedList<>();
        ar.offer("hello");
        ar.offer("Astha");
        String data = ar.poll();
        System.out.println(data);
        System.out.println(ar.size());
    }
    static void priorityqueue()
    {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        Queue<Integer> maxqueue = new PriorityQueue<>(Collections.reverseOrder());
        maxqueue.add(5);
        maxqueue.add(1);
        maxqueue.add(3);
        System.out.println(maxqueue.poll());
        System.out.println(maxqueue.poll());
    }

    static void getMaxKElement(int ar[],int k)
    {
        Queue<Integer> maxqueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<ar.length;i++)
        {
            maxqueue.add(ar[i]);
        }
        for (int i=0;i<k;i++)
        {
            System.out.println(maxqueue.poll());
        }
    }
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq1= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length;i++)
        {
            pq1.add(nums[i]);
        }
        return ((pq1.poll()-1)* (pq1.poll()-1));
    }
}
