public class NodeBuffer<T extends Comparable<T>> {

    // Array storing encapsulated generic Node
    private Node<T>[] elements;

    private int size;

    @SuppressWarnings("unchecked")
    public NodeBuffer(int capacity) {
        this.elements = (Node<T>[]) new Node[capacity];
        this.size = 0;
    }

    /**
     * Adds a new item into the buffer.
     */
    public void add(T item) {

        if (size < elements.length) {
            elements[size] = new Node<>(item);
            size++;
        } else {
            System.out.println("Buffer is full!");
        }
    }

    public int getSize() {
        return size;
    }

    /**
     * Returns the node at specified indexes.
     */
    public Node<T> get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid buffer index!");
        }

        return elements[index];
    }

    /**
     * Swaps two nodes at two different indixies
     */
    public void swap(int i, int j) {

        Node<T> temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;

    }

    // translating the selectionSort pseudocode into java
    // sorting the node inside the buffer and return total comparison
    public int selectionSort(){
        int n = this.getSize();
        int comparisonCount = 0;

        for (int i = 0; i < n-1; i++){
            int minIndex =i;

            for (int j = i + 1; j < n; j++){
                comparisonCount++;

                T itemA = this.get(j).getData();
                T itemB = this.get(minIndex).getData();

                if(itemA.compareTo(itemB) < 0){
                    minIndex = j;
                }
            }
            if (minIndex ! =1){
                this.swap(i, minIndex);
            }
        }
        return comparisonCount;
    }

    public void display() {

        System.out.print("[");

        for (int i = 0; i < size; i++) {

            System.out.print(elements[i]);

            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}