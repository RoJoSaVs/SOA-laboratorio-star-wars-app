import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.sun.jdi.ArrayReference;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Main {

    public ArrayList results;

    static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException, IOException {
        ApiResponse response = new ApiResponse();
        String json = response.getDataFromUrl();
        ParserHelper bot = mapper.readValue(json, ParserHelper.class);
        json = mapper.writeValueAsString(bot.results);
        Character[] array = mapper.readValue(json, Character[].class);
        String[][] data = new String[array.length][3];
        for (int index = 0; index < array.length; index++) {
            data[index][0] = array[index].getName();
            data[index][1] = array[index].getHeight();
            data[index][2] = array[index].getBirth_year();
        }
        GUI gui = new GUI(data);

    }
}
