package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/13/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message is the message to display
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message is the input message to display
     * @param date    the date is the input date to display
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }


    /**
     * Is important boolean.
     * @return the boolean
     * return true if the tweet is of important
     */
    public abstract Boolean isImportant();


    /**
     * Sets message.
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Sets date. set default date
     * @param date the date input
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets message. gets the message back
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets date. gets the value of date back
     * @return the date
     */
    public Date getDate() {
        return date;
    }
    /*
    this method helps display the date and message
     */
    @Override
    public String toString(){
        return  date.toString() + " | " + message;
    }
}
