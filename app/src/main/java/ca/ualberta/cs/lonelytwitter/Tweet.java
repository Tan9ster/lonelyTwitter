package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by watts1 on 9/13/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;

    //constructor that sets user's preferred message as message
    public Tweet(String message, currentMood mood){

        this.message = message;
        ArrayList<currentMood> moodList = new ArrayList<currentMood>();
        moodList.add(mood);
    }
    //alternative constructor that sets user's preferred message and date
    public Tweet(String message, Date date, currentMood mood){
        this.message = message;
        this.date = date;
        ArrayList<currentMood> moodList = new ArrayList<currentMood>();
        moodList.add(mood);
    }


    public abstract Boolean isImportant();




    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
