import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;




public class Main {
    public static void main(String[] args) {
        Note note1 = new Note("Note text#1", new Date());
        Note note2 = new Note("Note text#2", new Date());
        Note note3 = new Note("Note text#3", new Date());
        List<Note> notes = new ArrayList<>(Arrays.asList(note1,note2,note3));

        CRUD.WriteJson(notes);
        CRUD.ReadJson();

    }
}
