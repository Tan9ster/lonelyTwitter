package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Maintains a list of tweets!
 * This class is mainly to be used for testing TweetListTest
 *
 */
public class TweetList {
    private List<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Add.
     * Adding tweet to tweet
     * @param tweet the tweet
     */
    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    /**
     * Has tweet boolean.
     * Return true if Tweet has the tweet
     * @param tweet the tweet
     * @return the boolean
     */
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    /**
     * Gets tweet.
     * get value of tweet
     * @param i index
     * @return the tweet
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    /**
     * Remove.
     * remove tweet from tweet
     * @param tweet the tweet
     */
    public void remove(Tweet tweet) {
        tweets.remove(tweet);
    }
}
