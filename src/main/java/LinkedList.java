class LinkedList implements  OlgaList{
    Node firstNode;
    int size;


    public void add(int data) {
        Node node = new Node(data);

        if (firstNode == null) {
            firstNode = node;
        } else {
           Node last = firstNode;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        size++;
    }

    @Override


    public int[] getAll() {
        int[] result = new int[size];
        if (size == 0) {
            return null;
        }
        Node current = firstNode;
        int counter = 0;
        while (current != null) {
            result[counter] = current.data;
            current = current.next;
            counter++;
        }

        return result;
    }

    public void addInFront(int data) {
        Node node = new Node(data);

        // firstNode -> [data|next]
        // [new] -> firstNode -> ...

        node.next = firstNode;
        firstNode = node;

        size++;
    }

    public int get(int index) {
        if (index == 0) {
            return firstNode.data;
        }
        Node list = firstNode;
        int count = 0;
        while (list != null) {
            list = list.next;
            count++;
            if (count == index) {
                return list.data;
            }
        }
        return 0;
    }


}
