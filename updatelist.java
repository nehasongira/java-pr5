import java.util.*;
class updatelist{
    public static void main(String[] args)
    {
        List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Apple");
  list_Strings.add("grape");
  list_Strings.add("melon");
  list_Strings.add("berry");
  
  // Print the list
  System.out.println(list_Strings);
  // Update the third element with "Yellow"
  list_Strings.set(0, "kiwi");
   // Print the list again
  System.out.println(list_Strings);
    }
}