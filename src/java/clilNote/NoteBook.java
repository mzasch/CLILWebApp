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
    
    public void AddNote(String description, Date d)
    {
        Note t = new Note(description, d);
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
    
    public NoteBook GetNoteByDate(Date d)
    {
        NoteBook res = new NoteBook();
        for (Note note : noteList) {
            if(note.getDate() == d)
                res.AddNote(note);
        }
        return res;
    }
}
