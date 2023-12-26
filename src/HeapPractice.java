import java.util.Collections;
import java.util.PriorityQueue;

public class HeapPractice {
    public static void main(String[] args) {
        int ar[]={22,33,44,55,66,77,88,99,11};
        int k=3;
        kMinElement(ar,k);
        kMaxElement(ar,k);
        kthMinElement(ar,k);
        kthMaxElement(ar,k);
    }
    static void kMinElement(int ar[],int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<ar.length; i++)
        {
            pq.add(ar[i]);
        }
        for(int j=0; j<k;j++)
        {
            System.out.println(pq.poll() + "::The min k element is");
        }
    }
    static void kthMinElement(int ar[],int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < ar.length; i++) {
            if(pq.size()<k){
                pq.add(ar[i]);
            }
            else if(ar[i]<pq.peek())
            {
                pq.poll();
                pq.add(ar[i]);
            }
        }
        System.out.println("the kth min element is::" +pq.poll());
    }
    static void kMaxElement(int ar[],int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<ar.length; i++)
        {
            pq.add(ar[i]);
        }
        for(int j=0; j<k;j++)
        {
            System.out.println(pq.poll() + "::The max k element is");
        }
    }
    static void kthMaxElement(int ar[],int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<ar.length;i++){
            if(pq.size()<k)
            {
                pq.add(ar[i]);
            }
            else if(ar[i]>pq.peek())
            {
                pq.poll();
                pq.add(ar[i]);
            }
        }
        System.out.println("the kth max element is::" +pq.poll());
    }
}
