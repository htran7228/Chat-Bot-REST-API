import java.util.List;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.Status;


public class GetTrendingTopics {

    public static void main(String[] args) throws TwitterException {
    		ConfigurationBuilder configurationBuilder = new ConfigurationBuilder(); 
    		configurationBuilder.setDebugEnabled(true).setOAuthConsumerKey("2hySc4L16tWXVXgjBaoS7516B")
    		.setOAuthConsumerSecret("umzY0jT7hwmdqNHRUm7Barjrswt6xYpyrLXgItYx7ZE9ugk1b5")
    		.setOAuthAccessToken("2986616297-tsl7Fy2zCquGlrOietF1jjIKYXGoZoowF0wQVzC")
    		.setOAuthAccessTokenSecret("pRfN8nsPP9oPhldWnKWcUuUeednAMP0Myr902knCZpCv7");
             //setDebugEnabled(true).setOAuthConsumerKey("2hySc4L16tWXVXgjBaoS7516B")
    		//.setOAuthConsumerSecret("umzY0jT7hwmdqNHRUm7Barjrswt6xYpyrLXgItYx7ZE9ugk1b5")
    	    //.setOAuthAccessToken("2986616297-tsl7Fy2zCquGlrOietF1jjIKYXGoZoowF0wQVzC")
    		//.setOAuthAccessTokenSecret("pRfN8nsPP9oPhldWnKWcUuUeednAMP0Myr902knCZpCv7");

    		 TwitterFactory tf= new TwitterFactory(configurationBuilder.build());
    		 twitter4j.Twitter twitter=tf.getInstance();
    		// String twitterfeed;
    		 
    		List<Status> status=twitter.getHomeTimeline();
    		for(Status s:status) {
    			
    		 System.out.println(s.getUser().getName()+"        "+ s.getText());
    			
    		 
    			
    		}
    		 

    }
    
    
   

    }




