public class Node {
    public Object data;
    public Node link;
    private Node tail;
    private Node head;


    public Node(Object data) {
        this.data = data;
        this.link = null;

    }

    public void insertLast(Object value) {
        Node node = new Node(value);

        if (this.tail == null) {
            this.tail = node;
            this.head = node;
         }else {
            node.link = this.head;
            this.head = node;
        }
    }
}

