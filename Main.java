public class Main {

    public static void main(String[] args) {
        System.out.println("==== Initializing Generic Node Buffer ====");

        NodeBuffer<Integer> buffer = new NodeBuffer<>(10);

        buffer.add(45);
        buffer.add(12);
        buffer.add(85);
        buffer.add(3);
        buffer.add(21);

        System.out.println("Original Buffer:");
        buffer.display();

        System.out.println("Buffer Size: " + buffer.getSize());

        buffer.swap(1, 3);

        System.out.println("After Swapping/ Sorted Bufffer:");
        buffer.display();

        System.out.println("Basic Operations excuted (Comparisons): ");

    }
}