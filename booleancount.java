import java.util.*;
class booleancount{
    public static void main(String[] args)
    {
        System.out.println("enter the string"); 
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();  
        int count=0;  
        Map <String, Integer> map = new HashMap <String, Integer> ();
        String[] separatedWords = str.split(" ");
        
            for (String str1: separatedWords) {
                if (map.containsKey(str1)) {
                    
                    map.put(str1,(map.get(str1)+1 ));
                } else {
                    map.put(str1, 1);
                }
            }
            Map <String, Boolean> map1 = new HashMap <String, Boolean> ();
            for (String str2: map.keySet()) {
                if (map.get(str2)<2) {
                    
                    map1.put(str2,false);
                } else {
                    map1.put(str2, true);
                }
            }
            for (Map.Entry<String, Integer> val : map.entrySet()) { 
                System.out.println("Element " + val.getKey() + " "
                                   + "occurs"
                                   + ": " + val.getValue() + " times"); 
            } 
            
            for (Map.Entry<String, Boolean> val : map1.entrySet()) { 
                System.out.println("Element " + val.getKey() + " "
                                   + "occurs"
                                   + ": " + val.getValue() + " times"); 
            } 
    }
}