public class IntegerArray {
    int[] storage ;
    int count = 0;
    public void  add(int data){
        storage = new int[] {data};
        count++;
    }

    public  int[] getAll(){
        return storage;
    }

    public int get(int index){
        return  0;
    }

    public int[] remove(int index){
        return null;
    }
}

