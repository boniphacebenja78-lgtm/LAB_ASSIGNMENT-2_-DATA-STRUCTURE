public class Node<T> {
    private T data;

    // then constructor
    public Node(T data) {
        this.data = data;
    }

    // Getter methods and setter
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}