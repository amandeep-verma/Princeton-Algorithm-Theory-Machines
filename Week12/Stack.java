/* *****************************************************************************
Stack implementation using LinkedList
 **************************************************************************** */

public class Stack<Item> {
    private Node first;
    private int N = 0;

    private class Node {
        private Item item;
        private Node next;
    }

    public void push(Item item) {
        Node second = first;
        first = new Node();
        first.item = item;
        first.next = second;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        return item;
    }

    public int size() {
        return N;
    }

    public static void main(String[] args) {

    }
}
