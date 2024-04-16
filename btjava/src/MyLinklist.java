public class MyLinklist {
    public  Node head;

    public  Node tail;

    public MyLinklist() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(Object value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        }else {
            node.link = this.head;
            this.head = node;
        }
    }
}

