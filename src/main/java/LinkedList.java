class LinkedList {
    //        firstNode ->  (1) [int|next] -> (2) [int|next] -> (3) [int|next] -> null
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

    public int[] toArray() {
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

    public void addWithIndexPosition(int data, int index) {                 // data = element to insert , index = position at which to insert the element
        if (index > this.size - 1) {                               // check the index was not bigger size
            return;                                       // invalid position
        }

        Node current = firstNode;                   // object  current next number (текущии номер)
        Node list = new Node(data);            // new object
        int position = 0;

        if (index == 0) {                              //  since its a single reference change
            list.next = firstNode;                       //  takes number on the first position
            firstNode = list;                             // copy object
            size++;
            return;
        }

        while (current.next != null) {                      // while current number  not equal empty
            if (position == index - 1) {                         // when position equal 0
                break;                                      //так, как  в начале метод добвляет на 0 позицию
            }
            current = current.next;
            position++;
        }

        list.next = current.next;                           //  changing a reference
        current.next = list;                                // changing a reference  as we need
        this.size++;
        firstNode.next = current.next;
    }

    public void addInFront(int data) {
        Node node = new Node(data);
        if (firstNode == null) {
            firstNode = node;
            return;
        }
        Node last = firstNode;
        while (firstNode.next != null) {
            last = last.next;
            last.next = node;
            return;
        }
        size++;
    }

    public int findByIndex(int index) {
        if (index == 0) {
            return firstNode.data;
        }
        Node list = firstNode;
        int count = 0;
        while (list != null) {
            list = list.next;
            count++;
            if (count == index) {
                firstNode = list;
                return firstNode.data;
            }
        }
        return 0;
    }

    public Node remove(int index) {
        return null;
    }


}
