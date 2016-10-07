package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/13/16.
 */
public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     *
     * @param message  the string message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /*
    *return true if message is important
     */

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
