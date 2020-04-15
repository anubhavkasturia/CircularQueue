
public class CQClient {
public static void main(String[] args) {
    CircularQueue cq=new CircularQueue();
    // System.out.println(cq.isEmpty());
    // System.out.println(cq.isFull());
    cq.enqueue(10);
    cq.enqueue(20);
    cq.enqueue(30);
    cq.display();
    // System.out.println(cq.first());
    // System.out.println(cq.last());
    System.out.println();
    cq.dequeue();
    cq.display();
}
}