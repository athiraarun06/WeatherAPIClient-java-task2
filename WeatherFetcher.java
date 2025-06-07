import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherFetcher {

    static final String API_KEY = "bc0faa6edc212f3eccaf52578814c4c0";
    
 
    static final String CITY = "Bangalore";
    static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=" + CITY + "&appid=" + API_KEY + "&units=metric";

    public static void main(String[] args) {
        try {
            URL url = new URL(BASE_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.connect();

            // Check response code
            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                System.out.println("Error: " + responseCode);
            } else {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder jsonResponse = new StringBuilder();
                String line;

                while ((line = in.readLine()) != null) {
                    jsonResponse.append(line);
                }
                in.close();

                // Parse JSON
                JSONObject obj = new JSONObject(jsonResponse.toString());
                JSONObject main = obj.getJSONObject("main");
                JSONObject weather = obj.getJSONArray("weather").getJSONObject(0);

                // Display data
                System.out.println("Weather Report for " + CITY);
                System.out.println("-----------------------------");
                System.out.println("Temperature: " + main.getDouble("temp") + "°C");
                System.out.println("Humidity: " + main.getInt("humidity") + "%");
                System.out.println("Condition: " + weather.getString("description"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
