package clilNote;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Note {
    private String description;
    private String date;

    public Note() {}
    
    public Note(String description) {
        this.description = description;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
