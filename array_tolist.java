/*
 Problem: Convert Array to Linked List

Given an array of integers, your task is to convert it into a singly linked list.
Each element of the array should become a node in the linked list, maintaining
the same order as in the array.

 Example:
Input: arr = [10, 20, 30, 40, 50]
Output: Linked List: 10 -> 20 -> 30 -> 40 -> 50 -> null
*/

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class array_tolist {

    public Node arrayToList(int arr[]) {
        if (arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

   
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        array_tolist obj = new array_tolist();
        int[] arr = {10, 20, 30, 40, 50};

        Node head = obj.arrayToList(arr);
        System.out.println("Converted Linked List:");
        obj.printList(head);
    }
}
