package api;

import api.core.ApiContext;
import api.core.Dispatcher;
import api.functionalities.Cases;
import api.objects.cases.Case;
import com.gurock.testrail.APIClient;

public class TestRailApi {

    private Cases cases;

    public TestRailApi(ApiContext context){
        Dispatcher.setClient(context);
    }

    public Cases cases() {
        return cases != null ? cases : new Cases() ;
    }






}
