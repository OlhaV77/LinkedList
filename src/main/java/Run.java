public class Run {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
            list.getPrintAll();
            list.add(1);
            list.add(2);
            list.add(3);
            list.getPrintAll();
            list.addWithIndexPosition(4, 1);
            list.getPrintAll();
            list.addWithIndexPosition(5, 2);
            list.getPrintAll();
            list.addWithIndexPosition(6, 0);
            list.getPrintAll();
            list.findByIndex(2);


        }
    }


