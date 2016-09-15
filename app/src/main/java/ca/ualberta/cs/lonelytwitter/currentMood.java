package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by john on 2016-09-13.
 */
public abstract class currentMood {

    private Date date;
    private String mood;

    public currentMood(String mood){
        this.mood=mood;
        this.date=new Date();
    }

    public currentMood(String mood, Date date){
        this.mood=mood;
        this.date= date;

    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public abstract String formatMood();
}
