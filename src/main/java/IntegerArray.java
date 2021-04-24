public class IntegerArray  implements OlgaList{
    int[] storage = new int[0];
    int size = 0;

    public void add(int data) {
        int count = 0;

        for(int i = 0; i < storage.length; i++){
            if(storage[i] == 0){                          // check empty space
                count++;                                  // if empty , count++
            }
        }

        if(count < 1){                                        //if space empty
            int[] newStorege = new int[storage.length + 1];   // make new array, with new size

            for(int i = 0; i < storage.length; i++){         // cope old array in new
                newStorege[i] = storage[i];
            }

            newStorege[newStorege.length -1] = data;       //then new array  equal data
           storage = newStorege;                           // old array takes new array
        }
        size++;

    }

    @Override


    public int[] getAll(){
        return storage;
    }


    public int get(int index) {
        return storage[index] ;
    }

    public int[] remove(int index) {
        int[] newStorage = new int[storage.length - 1];    // make new smaller array
        for(int i = 0; i < index; i++){                    // copy array before index
            newStorage[i] = storage[i];                    // copy
        }

        for(int i = index + 1; i < storage.length; i++){    // copy array after index
            newStorage[i -1] = storage[i];
        }
        storage = newStorage;

        return storage;
    }
}

