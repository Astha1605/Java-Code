public class Test {
    public static void main(String[] args) {

        String st= "Astha Singh Astha Astha astha";
        int x='c';
       // charSum(st);
        //namePrint2(st);
        //countChar(st);
        stringCount(st);
    }

    static void secondLargest(int ar[]) {
        int first, second;
        first = second = Integer.MIN_VALUE;
        int i=0;
        while( i< ar.length)
        {
            if(ar[i]>first)
            {
                second=first;
                first=ar[i];
            }
            else if(ar[i]>second)
            {
                second=ar[i];
            }
            /*else if(ar[i]>third)
            {
                third=ar[i];
            } */
            i++;
        }
        System.out.println("Second largest element is::"+second);

    }
    static void arrayReversal(int ar[])
    {
        for(int i=0 ;  i<ar.length;   i++)
        {
            System.out.println(ar[i]+" "+ar[ar.length-1-i]);
        }
    }
    static void ternaryOperator(int x)
    {
        int y;
        y= (x%2==0)? 0:1;
        System.out.print(y);
    }
    static void charSum(String st)
    {
        int sum=0;
        for(int i=0; i< st.length(); i++)
        {
            sum=sum+st.charAt(i);
        }
        System.out.print("the sum of characters of string is::"+sum);

    }
    static void namePrint(String st)
    {
        String FirstName="";
        String lastName="";
        int i=0;
        for( ;i< st.length(); i++)
        {
            if(st.charAt(i)== ' ')
            {
                break;
            }
            FirstName+= st.charAt(i);
        }

        for( i=i+1;i< st.length(); i++)
        {
            if(st.charAt(i)== ' ')
            {
                break;
            }
            lastName+= st.charAt(i);
        }
        System.out.println("firt name is::"+FirstName);
        System.out.println("Last name is::"+lastName);
    }
    static void namePrint2(String st)
    {
        String FirstName= st.split(" ")[0];
        String lastName=st.split(" ")[1];
        System.out.println("firt name is::"+FirstName);
        System.out.println("Last name is::"+lastName);
    }
    static void countChar(String st)
    {
        int count=0;
        for(int i=0; i<st.length();i++)
        {
           if(st.charAt(i)=='a' || st.charAt(i)=='A')
           {
               count++;
               //count+=st.charAt(i);
           }
        }
        System.out.println("The count is::"+count);
    }
    static void stringCount(String st)
    {
        String words[]= st.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals("astha"))
            {
                count++;
            }
        }
        System.out.println("The total count of string is::"+count);
    }
}
