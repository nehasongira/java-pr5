import java.util.*;
class modifymap{
    public static void main(String[] args)
    {
        System.out.println("enter the string in form of  value  value"); 
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();  
        int count=0;  
        Map <String, String> map = new HashMap <String, String> ();
        
        String[] arr = str.split(" ");
        String val1,val2;
        map.put("val1", arr[0]);
        map.put("val2", arr[1]);

        
            
        map.replace("val2" ,map.get("val2"), map.get("val1"));
        map.replace("val1" ,map.get("val1")," ");

            for (Map.Entry<String, String> val : map.entrySet()) { 
                System.out.println(val.getKey() + " " + val.getValue()); 
            } 
            
            
    }
}