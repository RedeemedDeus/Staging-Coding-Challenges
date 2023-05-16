package Challenge_5_15_2023;


import java.util.Objects;

public class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return data == node.data && Objects.equals(next, node.next);
    }


    @Override
    public String toString() {
        String next = "";
        if(this.next == null) {
            next = "null";
        }
        else {
            next = "Node";
        }

        return "Node[" +
                "data=" + data +
                ", next=" + next +
                ']';
    }
}