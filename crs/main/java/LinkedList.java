
public class LinkedList {
    int data;
    LinkedList next;

    public LinkedList(int data) {
        this.data = data;
    }
}

class LinkedLists {
    LinkedList collection;                         //object
    int size;

    public void add(int data) {                     // element to insert
        if (collection == null) {                  //check is  empty  space
            collection = new LinkedList(data);     // object = data
            size++;                                 // size + 1;
            return;                                 //invalid position
        }

        LinkedList list = collection;            //object  takes on the meaning number(data)
        if (list.next != null) {                 // while next object no equal null
            list = list.next;                    // the object takes the following next number
        }
        list.next = new LinkedList(data);         //next object  = new number(data)
        size++;                                        // size + 1
    }


    public void addWithIndexPosition(int data, int index) {                 // data = element to insert , index = position at which to insert the element
        if (index > size) {                               // check the index was not bigger size
            return;                                       // invalid position
        }

        LinkedList current = collection;                   // object  current next number (текущии номер)

        LinkedList list = new LinkedList(data);            // new object
        int position = 0;

        if (index == 0) {                              //  since its a single reference change
            list.next = collection;                       //  takes number on the first position
            collection = list;                             // copy object
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

    }


    public void getPrintAll() {
        if (size == 0) {                                 //list is empty
            return;
        }
        LinkedList current = collection;                     //object with current number
        while (current.next != null) {
            System.out.print(current.data + " - ");
            current = current.next;
        }
        System.out.print(current.data + "\n");

    }
}




