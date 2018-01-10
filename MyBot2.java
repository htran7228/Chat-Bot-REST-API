
import org.jibble.pircbot.*;

import java.util.List;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.Status;



public class MyBot2 extends PircBot {
	
	
    
    public MyBot2() {
        this.setName("Tran2 Bot");
    }
    
    public void onMessage(String channel, String sender,
                       String login, String hostname, String message) {
    	
    	
        if (message.equalsIgnoreCase("twitter") || message.equalsIgnoreCase("twitter timeline") || message.equalsIgnoreCase("my twitter timeline") 
        || message.equalsIgnoreCase("timeline")) {
            //String time = new java.util.Date().toString();
            try {
            	
            
            	ConfigurationBuilder configurationBuilder = new ConfigurationBuilder(); 
        		configurationBuilder.setDebugEnabled(true).setOAuthConsumerKey("2hySc4L16tWXVXgjBaoS7516B")
        		.setOAuthConsumerSecret("umzY0jT7hwmdqNHRUm7Barjrswt6xYpyrLXgItYx7ZE9ugk1b5")
        		.setOAuthAccessToken("2986616297-tsl7Fy2zCquGlrOietF1jjIKYXGoZoowF0wQVzC")
        		.setOAuthAccessTokenSecret("pRfN8nsPP9oPhldWnKWcUuUeednAMP0Myr902knCZpCv7");
        		TwitterFactory tf= new TwitterFactory(configurationBuilder.build());	
       		 twitter4j.Twitter twitter=tf.getInstance(); 
       		List<Status> status=twitter.getHomeTimeline();
       		for(Status s:status) {
				//sendMessage(channel, sender + ": The temperature is now " + temperature);
				sendMessage(channel, sender + s.getUser().getName()+"        "+ s.getText());
       		}
			} catch (TwitterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
    
    
    //not using this class for bot used to show the twitter
    public class GetTrendingTopics {

        public void main(String[] args) throws TwitterException {
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
        		List<Status> status=twitter.getHomeTimeline();
        		for(Status s:status) {
        			
        		 System.out.println(s.getUser().getName()+"        "+ s.getText());
        			
        		 
        			
        		}
        		 

        }
        
        
       

        }





   
    
    }
    
