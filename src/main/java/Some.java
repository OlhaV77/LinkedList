public class Some {
   static int count =0;
   static int space;
   static int spaceNext;
  static int[] list ;

    static void add(int data) { //123
        if (space == 0) {
            space = data;
        }
        spaceNext = space;
        space = data;

        list[count] =  space;
        count++;
    }
    static int[] toArray(){
        for(int i = 0; i< list.length; i++){
            //list[i ]= space;
            System.out.println(list[i]);
        }

        return list;
    }

    public static void main(String[] args) {

        add(123);
        add(456);
        add(789);
        toArray();
    }
}
