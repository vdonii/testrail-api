package api.functionalities;

import api.core.Dispatcher;
import api.core.Util;
import api.custom.Path;
import api.objects.cases.Case;
import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.lang.reflect.Method;

import static api.core.Dispatcher.dispatchGetRequest;

public class Cases {

    @Path(path="get_case/")
    public Case getById(int id){
        String path = null;
        Case object = null;
        try {
           path  = Util.getAnnotationValue(Cases.class.getMethod("getById", int.class), Path.class, "path");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
           object = Dispatcher.<Case>dispatchGetRequest(String.format("%s%d", path, id), Case.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return object;
    }



}
