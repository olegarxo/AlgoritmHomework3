package ru.geekbrains.lesson3;

public class Program {

    public static void main(String[] args) {
        LinkedListV2<Employee> linkedList = new LinkedListV2<Employee>();
        linkedList.addFirst(new Employee("Cvvss", 25));
        linkedList.addFirst(new Employee("Acsss", 35));
        linkedList.addFirst(new Employee("Baaaaa", 40));
        linkedList.addFirst(new Employee("asgdBaaaaa", 140));
        linkedList.addFirst(new Employee("Baa161aaa", 4340));
        //linkedList.removeFirst();
        //linkedList.directSort(new EmployeeNameComparator(SortType.Ascending));
//        printList(linkedList);
//        System.out.println();
        //linkedList.directSort(new EmployeeNameComparator(SortType.Descending));
        printList(linkedList);
        System.out.println();
        linkedList.reverseList();
        printList(linkedList);
        /*String str = "hello";
        String str2 = new String(new char[] {'s', 's'});
        String str3 = new String("hello");
        String str5 = "hello";
        String str4 = "hello";*/
    }

    public static void printList(LinkedListV2<Employee> list){
        LinkedListV2<Employee>.NodeV2 node = list.head;
        while (node != null){
            System.out.printf("%s - %d\n", node.value.getName(), node.value.getAge());
            node = node.next;
        }

    }

}

class Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
