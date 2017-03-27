package PrinterQueue;

/**
 * Created by olal15 on 2017-03-20.
 */
public class Printer {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("hej");
        linkedList.addLast("då");
        System.out.println(linkedList.isEmpty()); //visa på om listan är tom eller inte
        System.out.println(linkedList.toString());
    }
}
