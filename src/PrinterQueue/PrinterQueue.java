package PrinterQueue;

/**
 * Created by olal15 on 2017-03-20.
 */
public class PrinterQueue {
    LinkedList PrinterQueue = new LinkedList();

    boolean isEmpty() {
        return PrinterQueue.isEmpty();
    } //för om listan är tom
    int size() {
        return PrinterQueue.size();
    }
    void enqueue(String data) {
        PrinterQueue.addLast(data);
    }
    String dequeue() {
        PrinterQueue.removeFirst(); //ta bort första ordet när det använts
        return PrinterQueue.toString(); //ta nästa ord i listan
    }
}

