import org.jibble.pircbot.*;

public class MyBotMain2 {
    
    public static void main(String[] args) throws Exception {
        
        // Now start our bot up.
        MyBot2 bot = new MyBot2();
        
        // Enable debugging output.
        bot.setVerbose(true);
        
        // Connect to the IRC server.
        bot.connect("irc.freenode.net");

        // Join the #pircbot channel.
        bot.joinChannel("#tran2");
        
    }
    
}