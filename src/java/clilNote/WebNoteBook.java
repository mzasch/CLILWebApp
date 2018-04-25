package clilNote;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WebNoteBook")
public class WebNoteBook {
    NoteBook tl = new NoteBook();
    
    @WebMethod(operationName = "Add")
    public void AddNote(@WebParam(name = "description") String txt) {
        tl.AddNote(txt);
    }
    
    @WebMethod(operationName = "GetAll")
    public NoteBook GetAll() {
        return tl;
    }
    
    @WebMethod(operationName = "GetByDescription")
    public void GetByDescription(@WebParam(name = "text") String txt) {
        tl.GetNoteByDescription(txt);
    }  
}
