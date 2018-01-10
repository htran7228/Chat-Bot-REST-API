import java.io.IOException;

import org.jibble.pircbot.*;




public class MyBot extends PircBot {
	

    
    public MyBot() {
        this.setName("Tran1 Bot");
    }
    
    public void onMessage(String channel, String sender,
                       String login, String hostname, String message) {
    	String[] tokens = message.split(" ");
    	
    	if(message.equalsIgnoreCase("time")){
    		String time = new java.util.Date().toString();
    		sendMessage(channel, sender + ": The temperature is now " + time);
    	}
    
    	else if (tokens[0].contains("weather") ) {
            //String time = new java.util.Date().toString();
        	String res;
        	//String res2;
            try {
            	res = WeatherFetcher.startWebRequest(tokens[1]);
            	//res2 = WeatherFetcher.startWebRequest(tokens[2]);
				sendMessage(channel, sender + ": The temperature is now " + res );
				//sendMessage(channel, sender + ": The temperature is now " + res2 );
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
    
}
 




