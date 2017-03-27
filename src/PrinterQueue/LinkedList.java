package PrinterQueue;

/**
 * Created by olal15 on 2017-03-20.
 */
public class LinkedList {
    node first;
    node last;
    private int size;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    private class node {
        private String data;
        private node next;


        public node(String data) {
            this.data = data;
        }
    }

    public int size() {
        node temp = first;
        int count = 1;
        while(temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return (first == null);
    }
    public String toString() {
        String output = "";
        node temp = first;
        while (temp != null) {
            output += temp.data;
                    temp = temp.next;
        }
        return output;
    }
    public void addFirst(String item) {
        if (!isEmpty()) {
            node before = first;
            first = new node(item);
        } else {
            first = new node(item);
            last = first;
        }
        size++;
    }
    public void addLast(String item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new node(item);
        }
    }
    public void removeFirst() {
        if (!isEmpty()) { //already empty
        } else {
            first = first.next;
            size--;
        }
    }
    public void removeLast() {
        if (!isEmpty()) { //already empty
        } else {
            last = null;
            size--;
        }
    }
}