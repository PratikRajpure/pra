package StringPattern;
import java.awt.List;  
import java.util.*;  
  
public class d {  
  
    public static void main(String[] args) {  
        ArrayList<Integer> list = new ArrayList<>();  
  
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(2);  
        list.add(5);  

Collections.sort(list);

        System.out.println(list);
  
        Iterator<Integer> it = list.iterator();  
        while (it.hasNext()) {                   
Integer value = it.next();              
            System.out.println("List Value:" + value);  
           /* if (value.equals(3))  
                list.remove(value);  */
        }  
  
    
    } 
}  