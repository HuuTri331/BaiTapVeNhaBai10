public class MyArrayList {
    public Object[] container;// container dc hieu la noi luu tru cac phan tu
    public int size = 0;

    private static final int CAPACITY = 10;

    public MyArrayList() {
        this.container = new Object[CAPACITY];
    }

    public void add(Object o) {
        this.container[size] = o;
        size += 1;
    }

    public void insert(int i, Object o) {
        for (int j = size; j > i; j--) {
            container[j] = container[j - 1];
        }
        container[i] = o;
        size++;
    }

    public void readList() {
        for (Object o : container) {
            if (o != null) {
                System.out.println(o);
            }
        }
    }


    public Object get(int index) {
        return this.container[index];
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            container[i] = container[i + 1];
        }
        container[size - 1] = null; // Clear the last element
        size--;
    }

    public void update(int index, Object value) {
        this.container[index] = value;
    }
}
