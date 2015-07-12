package org.adrian;

import java.util.Date;

public class MyEntity {
    
    private int id;
    private Date date;
    
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
	@Override
	public String toString() {
		return "MyEntity [id=" + id + ", date=" + date + "]";
	}

}
