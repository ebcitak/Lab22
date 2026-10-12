public class MiddleNodeDemo {
    public static void main(String[] args) {
        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        // Test 1: Tek sayıdaki düğüm testi
        SinglyLinkedList list1 = new SinglyLinkedList();
        for (int i = 1; i <= 5; i++) {
            list1.add(i);
        }

        System.out.println("List 1:");
        list1.display();
        System.out.println("Middle Node: " + list1.findMiddle().data);
        System.out.println();

        // Test 2: Çift sayıdaki düğüm testi
        SinglyLinkedList list2 = new SinglyLinkedList();
        for (int i = 10; i <= 60; i += 10) {
            list2.add(i);
        }

        System.out.println("List 2:");
        list2.display();
        System.out.println("Middle Node: " + list2.findMiddle().data);
        System.out.println();
    }
}