import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class WeatherFetcher 
{
	public static Double Temperatures;

	
	
	
	static String startWebRequest(String city) throws IOException
	{
		String weatherURL = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=d0fa36cffa016ddf9953354002f4d296"; 			//please get your own token to use from API.Openweathermap
		
		  StringBuilder result = new StringBuilder(); //this is going to hold the JSON Response from the server
	      URL url = new URL(weatherURL);
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
	      System.out.println(result.toString()); 
	   
	      
	      
	 
	     Temperatures =  parseJson(result.toString());
	     
	     
	    
	     System.out.println("Temperature is "+ Temperatures);
	     
	
	     
	     
	     return parseJson(result.toString()).toString();
	     
	     
		     
	     
	     
	     
	
	
	     
	     
	    
		     
	     
	      
	     
	   }
	

	
	
	static Double parseJson(String json) //json is a string of json, we get this from making our request
	{
		JsonElement jelement = new JsonParser().parse(json); //you will parse it first into a JSONElement
        JsonObject  MasterWeatherObject = jelement.getAsJsonObject();  //You will then take that jelement, and then break it down into a json object. Use the JSONEDITORONLINE website, basically, you are trying narrow down to whatever you want

        JsonObject  myObject = MasterWeatherObject.getAsJsonObject("main");
        //we will get the coordinate object 
        double  Temperatures = myObject.get("temp").getAsDouble(); //now we will narrow down to get the value of the longitute
        return  (9/5.0 * Temperatures) - 459.67 ;  //return our longitude
       
      
        
        
		
	}
	
	

	
	
	
	
	
}
