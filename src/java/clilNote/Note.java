package clilNote;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Note {
    private String description;
    private Date date;

    public Note() {}
    
    public Note(String description, Date d) {
        this.description = description;
        this.date = d;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
