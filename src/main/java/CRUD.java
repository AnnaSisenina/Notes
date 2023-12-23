import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CRUD {

    public static void WriteJson (List<Note> notes){
        Gson gson = new GsonBuilder().
                setPrettyPrinting().
                create();
        try (FileWriter writer = new FileWriter("note.json")) {
            gson.toJson(notes, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadJson() {
        try (FileReader reader = new FileReader("note.json")) {
            Gson gson = new GsonBuilder().
                    setPrettyPrinting().
                    create();
            Note[] notes = gson.fromJson(reader, Note[].class);
            for (Note note : notes) {
                System.out.println(note);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
