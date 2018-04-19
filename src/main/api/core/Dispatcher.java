package api.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;
import org.json.simple.JSONObject;

import java.io.IOException;

public class Dispatcher<T> {

    private static APIClient apiClient;

    public static void setClient(ApiContext _apiContext){
        apiClient = new APIClient(_apiContext.url);
        apiClient.setUser(_apiContext.user);
        apiClient.setPassword(_apiContext.password);
    }

    public static <T> T dispatchGetRequest(String path, Class<T> type) throws IOException {
        JSONObject object = null;
        try {
            object = (JSONObject) apiClient.sendGet(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }

        ObjectMapper mapper = new ObjectMapper();
        String stringObject = object.toString();
        System.out.println(stringObject);
        T output = mapper.readValue(stringObject, type);

        return output;
    }

}
