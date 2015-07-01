package sample.jersey1;

import java.util.Date;

public class SomeData {
    
    int id;
    
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern =  "yyyy-MM-dd")
    Date date;
    
    public int getId() {
        return id;
    }
    public void setId(final int id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(final Date date) {
        this.date = date;
    }

}
