import java.util.*;
class sorttree{
    public static void main(String[] args)
    {
        System.out.println("enter the number of string user wnat to enter"); 
        TreeSet<String> treeSet = new TreeSet<String>();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            String str=sc.next();
            treeSet.add(str);
        }
          
        System.out.println(treeSet);
        List<String> li=new ArrayList<String>(treeSet);  
        System.out.println(li);  
    }
}