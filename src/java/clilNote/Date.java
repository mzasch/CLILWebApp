package clilNote;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Date {
    private int day;
    private int month;
    private int year;

    @XmlElement
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @XmlElement
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @XmlElement
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Date)) {
            return false;
        }

        Date that = (Date) other;
        
        return (this.day == that.getDay())
            && (this.month == that.getMonth())
            && (this.year == that.getYear());
    }
}
