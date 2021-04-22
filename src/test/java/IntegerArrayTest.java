import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class IntegerArrayTest {
    @Test
    public void add_whenSimpleInteger_works() {
        IntegerArray subject = new IntegerArray();

        subject.add(1);
    }

    @Test
    public void getAll_whenOneRecordExists_returnsOneRecord() {
        IntegerArray subject = new IntegerArray();

        subject.add(1);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(1);
        assertThat(actual[0]).isEqualTo(1);
    }

    @Test
    public void getAll_whenTwoRecordExists_returnsOneRecord() {
        IntegerArray subject = new IntegerArray();

        subject.add(1);
        subject.add(2);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(2);
        assertThat(actual[0]).isEqualTo(1);
        assertThat(actual[1]).isEqualTo(2);
    }

    @Test
    public void get_whenRecordExists_returnsTheRecord() {
        IntegerArray subject = new IntegerArray();

        subject.add(1);

        int actual = subject.get(0);

        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void get_whenTwoRecordExists_returnsTheRecord() {
        IntegerArray subject = new IntegerArray();

        subject.add(1);
        subject.add(2);

        int actual = subject.get(1);

        assertThat(actual).isEqualTo(2);
    }

    @Test
    public void remove_whenOneRecordExists_containsZeroRecords() {
        IntegerArray subject = new IntegerArray();
        subject.add(10);

        subject.remove(0);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(0);
    }

    @Test
    public void remove_whenTwoRecordExists_contains1Records() {
        IntegerArray subject = new IntegerArray();

        subject.add(10);
        subject.add(10);

        subject.remove(0);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(1);
        assertThat(actual[0]).isEqualTo(10);
    }

    @Test
    public void remove_when3RecordExistsAndRemoveFirstRecord_containsOnlyRemainingRecords() {
        IntegerArray subject = new IntegerArray();

        subject.add(10);
        subject.add(1);
        subject.add(2);

        subject.remove(0);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(2);

        assertThat(actual[0]).isEqualTo(1);
        assertThat(actual[1]).isEqualTo(2);
    }

    @Test
    public void remove_when3RecordExistsAndRemoveSecondRecord_containsOnlyRemainingRecords() {
        IntegerArray subject = new IntegerArray();

        subject.add(10);
        subject.add(1);
        subject.add(2);

        subject.remove(1);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(2);

        assertThat(actual[0]).isEqualTo(10);
        assertThat(actual[1]).isEqualTo(2);
    }

    @Test
    public void remove_when3RecordExistsAndRemoveThirdRecord_containsOnlyRemainingRecords() {
        IntegerArray subject = new IntegerArray();

        subject.add(10);
        subject.add(1);
        subject.add(2);

        subject.remove(2);

        int[] actual = subject.getAll();

        assertThat(actual).hasSize(2);

        assertThat(actual[0]).isEqualTo(10);
        assertThat(actual[1]).isEqualTo(1);
    }

}