import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
            list.getPrintAll();
            list.add(3);
            list.add(5);
            list.add(6);
            list.getPrintAll();
            list.addWithIndexPosition(4, 1);
            list.getPrintAll();
            list.addWithIndexPosition(4, 3);
            list.getPrintAll();
            list.addWithIndexPosition(8, 0);
            list.getPrintAll();

        }
    }


