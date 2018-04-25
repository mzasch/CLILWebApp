package clilNote;

import java.util.ArrayList;
import javax.xml.bind.annotation.*;

@XmlRootElement
public class NoteBook {
    private ArrayList<Note> noteList = new ArrayList<Note>();

    @XmlElement
    public ArrayList<Note> getNoteList() {
        return noteList;
    }
    
    public void AddNote(String description)
    {
        Note t = new Note(description);
        noteList.add(t);
    }
    
    public void AddNote(Note t)
    {
        noteList.add(t);
    }
    
    public NoteBook GetNoteByDescription(String desc)
    {
        NoteBook res = new NoteBook();
        for (Note note : noteList) {
            if(note.getDescription().contains(desc))
                res.AddNote(note);
        }
        return res;
    }
}
