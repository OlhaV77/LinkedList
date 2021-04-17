import java.util.LinkedList;
public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Tom");
        name.add("Kate");
        name.add("Mark");
        System.out.println(name);

        name.addFirst("Mike");
        System.out.println(name);
        name.addLast("Nila");
        System.out.println(name);
        name.remove(2);
        System.out.println(name);
        name.getFirst();
        System.out.println(name);




    }

}
