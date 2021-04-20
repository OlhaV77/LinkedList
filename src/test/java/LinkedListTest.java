import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LinkedListTest {

    @Test
    public void toArray_whenOneEntry_returnsArrayOfOne() {
        LinkedList subject = new LinkedList();
        subject.add(123);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(1);
        assertThat(actual[0]).isEqualTo(123);
    }

    @Test
    public void toArray_whenTwoEntry_returnsArrayOfTwo() {
        LinkedList subject = new LinkedList();
        subject.add(123);
        subject.add(234);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(2);
        assertThat(actual[0]).isEqualTo(123);
        assertThat(actual[1]).isEqualTo(234);
    }

    @Test
    public void toArray_when3Entries_returnsArrayOf3() {
        LinkedList subject = new LinkedList();
        subject.add(123);
        subject.add(321);
        subject.add(456);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(3);
        assertThat(actual[0]).isEqualTo(123);
        assertThat(actual[1]).isEqualTo(321);
        assertThat(actual[2]).isEqualTo(456);
    }

    @Test
    public void findByIndex_when3Entries_returnsCorrectValue() {
        LinkedList subject = new LinkedList();
        subject.add(123);
        subject.add(321);
        subject.add(456);

        int actual = subject.findByIndex(1);

        assertThat(actual).isEqualTo(321);
    }

    @Test
    public void toArray_when3EntriesAddedInFront_returnsArrayOf3() {
        LinkedList subject = new LinkedList();
        subject.addInFront(123);
        subject.addInFront(321);
        subject.addInFront(456);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(3);
        assertThat(actual[0]).isEqualTo(456);
        assertThat(actual[1]).isEqualTo(321);
        assertThat(actual[2]).isEqualTo(123);
    }

    @Test
    public void toArray_when3Entries_returnsCorrectValue() {
        LinkedList subject = new LinkedList();
        subject.add(123);
        subject.add(321);
        subject.add(456);

        subject.findByIndex(2);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(3);
        assertThat(actual[0]).isEqualTo(123);
        assertThat(actual[1]).isEqualTo(321);
        assertThat(actual[2]).isEqualTo(456);
    }

}