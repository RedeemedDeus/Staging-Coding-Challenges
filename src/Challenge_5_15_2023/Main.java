package Challenge_5_15_2023;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //a)Intersection
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = new Node(4);

        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(7);
        headB.next.next.next = headA.next.next;

        System.out.println("Intersection");
        Node result = getIntersectingNode(headA,headB);
        if(result != null) {
            System.out.println("The two linked lists intersect at Node: " + result.toString() + "\n");
        }
        else {
            System.out.println("The two linked lists do not intersect\n");
        }

        //b) Loop Detection:
        Node corruptList = new Node(7);
        corruptList.next = new Node(8);
        corruptList.next.next = new Node(9);
        corruptList.next.next.next = new Node(10);
        corruptList.next.next.next.next = corruptList.next.next.next;

        System.out.println("Loop Detection");
        Node result2 = getCorruptedNode(corruptList);
        if(result2 != null) {
            System.out.println("The corrupt node is: " + result2.toString());
        }
        else {
            System.out.println("There is no corrupt node");
        }


    }

    public static Node getIntersectingNode(Node headA, Node headB) {
        Set<Node> setA = new HashSet<>();

        while(headA != null) {
            setA.add(headA);
            headA = headA.next;
        }

        while(headB != null) {
            if(setA.contains(headB)) {
                return headB;
            }

            headB = headB.next;
        }

        return null;
    }

    public static Node getCorruptedNode(Node corruptList) {
        while(corruptList != null) {
            if(corruptList.equals(corruptList.next)){
                return corruptList;
            }

            corruptList = corruptList.next;
        }

        return null;
    }
}
