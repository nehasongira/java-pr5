import java.util.*;
class wordcountmap{
    public static void main(String[] args)
    {
        System.out.println("enter the string"); 
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();  
        str = str.replaceAll("\\p{Punct}"," ");
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
        
            for (Map.Entry<String, Integer> val : map.entrySet()) { 
                System.out.println("Element " + val.getKey() + " "
                                   + "occurs"
                                   + ": " + val.getValue() + " times"); 
            } 
    }
}