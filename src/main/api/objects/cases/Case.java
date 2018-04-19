package api.objects.cases;

public class Case {
    public int id;
    public int milestone_id;
    public int type_id;
    public int suite_id;
    public int created_by;
    public int created_on;
    public int priority_id;
    public int section_id;
    public int updated_by;
    public int updated_on;
    public int template_id;

    public String title;
    public String custom_mission;
    public String custom_goals;
    public String custom_expected;
    public String custom_preconds;
    public String custom_steps;
    public String estimate;
    public String estimate_forecast;
    public String refs;
    public String custom_optional;

    public Step[] custom_steps_separated;

}
