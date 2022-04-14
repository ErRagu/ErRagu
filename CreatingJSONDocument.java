package json;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
//Create, ADD, Append
public class CreatingJSONDocument {
   public static void main(String args[]) throws JSONException {
      //Creating a JSONObject object
      JSONObject jsonObject = new JSONObject();
      //Inserting key-value pairs into the json object
      jsonObject.put("ID", "1");
      jsonObject.put("First_Name", "Sri");
      jsonObject.put("Last_Name", "Ram");
      jsonObject.put("Date_Of_Birth", "1998-12-05");
      jsonObject.put("Place_Of_Birth", "covai");
      jsonObject.put("Country", "India");
      jsonObject.append("Company_Name", "L&T");
      
      try {
         FileWriter file = new FileWriter("E:/output.json");
         file.write(jsonObject.toString());
         file.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
      System.out.println("JSON file created: "+jsonObject);
//Read
      JSONParser parser = new JSONParser();
    		try {
    			Object obj = parser.parse(new FileReader("E:/output.json"));
    			JSONObject jsonObject1 = (JSONObject) obj;
    			JSONArray EmpList = (JSONArray) jsonObject1.get("Emp List");

    			Iterator<JSONObject> iterator = EmpList.iterator();
    			while (iterator.hasNext()) {
    				System.out.println(iterator.next());
    			}
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    
   }
}