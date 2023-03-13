package ru.geekbrains.lesson3;

public class LinkedListV2<T> {

    public NodeV2 head;
    public NodeV2 tail;
    public int count;
    int countRevers;

    public class NodeV2{
        public T value;
        public NodeV2 next;
        public NodeV2 prev;
    }

    public NodeV2 addFirst(T value){
        NodeV2 node = new NodeV2();
        node.value = value;
        if (head == null)
            tail = node;
        else{
            node.next = head;
            head.prev = node;
        }
        head = node;
        count++;
        return node;
    }

    public void RemoveFirst(){
        if (head != null && head.next != null){
            NodeV2 node = head;
            node.next.prev = null;
            head = head.next;
            count--;
        }
        else{
            head = null;
            tail = null;
            count = 0;
        }
    }
    public void reverseList(){
        if (head == null || head.next == null) return;
        else if(count / 2 == 0){
            reverseList(head, tail);
        }else {
            reverseList(head, tail, count);
        }
    }
    private void reverseList(NodeV2 head, NodeV2 tail){
        if (!head.equals(tail)){
            T tamp = head.value;
            head.value = tail.value;
            tail.value = tamp;
            reverseList(head.next, tail.prev);
        } else return;
    }
    private void reverseList(NodeV2 head, NodeV2 tail, int countRevers){
        for (int i = 0; i < countRevers / 2; i++){
            T tamp = head.value;
            head.value = tail.value;
            tail.value = tamp;
            head = head.next;
            tail = tail.prev;
        }
    }

}
