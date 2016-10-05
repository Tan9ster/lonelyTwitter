package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/13/16.
 */
public class NormalTweet extends Tweet implements Tweetable {
/*
*This constructor makes a normalTweet with given string parameter.
* @param message this parameter is the givin string for the tweet. If it is se to empty
* string then it will be replaced by...
 */
    public NormalTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
