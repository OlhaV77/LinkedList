class LinkedList {
    Node head;                         //object
    int size;

    public void add(int data) {                     // element to insert
        if (head == null) {                         //check is  empty  space
            size++;                                 // size + 1;
            return;                                 //invalid position
        }

        Node list = head;                        //object  takes on the meaning number(data)
        if (list.next != null) {                 // while next object no equal null
            list = list.next;                    // the object takes the following next number
        }
        list.next = new Node(data);         //next object  = new number(data)
        size++;                                    // size + 1

    }


    public void addWithIndexPosition(int data, int index) {                 // data = element to insert , index = position at which to insert the element
        if (index > size - 1) {                               // check the index was not bigger size
            return;                                       // invalid position
        }

        Node current = head;                   // object  current next number (текущии номер)
        Node list = new Node(data);            // new object
        int position = 0;

        if (index == 0) {                              //  since its a single reference change
            list.next = head;                       //  takes number on the first position
            head = list;                             // copy object
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
        size++;
        head.next = current.next;
    }

    public void  addInFront(int data){

    }

    public int findByIndex(int index) {
      //  if (index > size - 1 || index < 0) {
       //     return head.next;
      //  }

        if(index == 0){
            return head.data;
        }

        Node list = head;
        int count = 0;
        while (list != null) {
            list = list.next;
            count++;
            if (count == index) {
                head = list;
                return head.data;
            }
        }
        return 0;
    }

    public Node remove(int index){
        return  null;
    }

    public void getPrintAll() {
        if (size == 0) {                                 //list is empty
            return;
        }

        Node current = head;                     //object with current number
        while (current.next != null) {
            System.out.print(current.data + " - ");
            current = current.next;
        }
        System.out.print(current.data + "\n");

    }

    public int[] toArray() {
        return new int[0];
    }
}
