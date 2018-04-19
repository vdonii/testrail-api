package main;

import api.TestRailApi;
import api.core.ApiContext;
import api.objects.cases.Case;


public class Main {

    public static void main(String[] args){
        ApiContext context = new ApiContext();
        context.url = "";
        context.password = "";
        context.user = "";

        TestRailApi api = new TestRailApi(context);
        Case _case = api.cases().getById(0);

    }

}
