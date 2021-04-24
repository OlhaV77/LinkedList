import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OlgaListTest {


    @Test
    public void add_whenSimpleInteger_works() {
        IntegerArray subject = new IntegerArray();

        subject.add(1);
    }


    @Test
    public void add_whenSimpleInteger_worksTwo() {
        IntegerArray subject = new IntegerArray();

        subject.add(1);
        subject.add(2);

        int[] actual =subject.getAll();

        assertThat(actual).hasSize(2);
        assertThat(actual[0]).isEqualTo(1);
        assertThat(actual[1]).isEqualTo(2);
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

}
