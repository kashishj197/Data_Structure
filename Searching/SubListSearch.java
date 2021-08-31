import java.util.*;
public class SubListSearch {
    static class Node
    {
        int data;
        Node next;
    };
    
    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.data= key;
        temp.next = null;
        return temp;
    }
    
    public static void main(String args[]) {
        Node a = newNode(1);
        a.next = newNode(2);
        a.next.next = newNode(3);
        a.next.next.next = newNode(4);
     
        Node b = newNode(1);
        b.next = newNode(2);
        b.next.next = newNode(1);
        b.next.next.next = newNode(2);
        b.next.next.next.next = newNode(3);
        b.next.next.next.next.next = newNode(4);
     
        if(findList(a, b) == true)
            System.out.println("LIST FOUND");
        else
            System.out.println("LIST NOT FOUND");
    }
    
    public static boolean findList(Node first, Node second) {
        Node pt1 = first, pt2 = second;
        
        if(first == null && second == null) {
            return false;
        }
        
        if (first == null || first != null && second == null) {
            return false;
        }
        
        while(second != null) {
            pt2 = second;
            
            while(pt1 != null) {
                if (pt2 == null) {
                    return false;
                } else if (pt1.data == pt2.data) {
                    pt1 = pt1.next;
                    pt2 = pt2.next;
                } else break;
            }
            
            if (pt1 == null) {
                return true;
            }
            
            pt1 = first;
            second = second.next;
        }
        
        return false;
    }
}