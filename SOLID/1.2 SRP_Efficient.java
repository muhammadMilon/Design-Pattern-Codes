import java.util.ArrayList;

// Data holder class for key-value pair
class Team_Detail {
    String Context, Value;

    Team_Detail(String Context, String Value) {
        this.Context = Context;
        this.Value = Value;
    }
}

// Interface to fetch team info as key-value list
interface Output_Data {
    ArrayList<Team_Detail> fetchInfo();
}

// Main Team class (only handles storing and managing team data)
class Team_Subcontinent1 implements Output_Data {
    private String team_name, team_group, icon_player;
    private Integer team_point, goal_count;

    Team_Subcontinent1(String team_name, String team_group,
                       Integer team_point, Integer goal_count, String icon_player) {
        this.team_name = team_name;
        this.team_group = team_group;
        this.team_point = team_point;
        this.goal_count = goal_count;
        this.icon_player = icon_player;
    }

    public Integer set_Team_Point(Integer team_point) {
        this.team_point = team_point;
        return this.team_point;
    }

    public String set_Team_Group(String team_group) {
        this.team_group = team_group;
        return this.team_group;
    }

    public Integer set_Goal_Count(Integer goal_count) {
        this.goal_count = goal_count;
        return this.goal_count;
    }

    @Override
    public ArrayList<Team_Detail> fetchInfo() {
        ArrayList<Team_Detail> info = new ArrayList<>();
        info.add(new Team_Detail("Team Name", this.team_name));
        info.add(new Team_Detail("Team Group", this.team_group));
        info.add(new Team_Detail("Team Point", this.team_point.toString()));
        info.add(new Team_Detail("Goal Count", this.goal_count.toString()));
        info.add(new Team_Detail("Icon Player", this.icon_player));
        return info;
    }
}

// Responsible only for output/presentation
class Outputter {
    Output_Data obj;

    public Outputter(Output_Data obj) {
        this.obj = obj;
    }

    public void print() {
        System.out.println("{");
        for (int i = 0; i < obj.fetchInfo().size(); i++) {
            System.out.print("   " + obj.fetchInfo().get(i).Context + " : ");
            System.out.println(obj.fetchInfo().get(i).Value + ",");
        }
        System.out.println("}");
    }
}

// Responsible only for qualification logic
class Qualify {
    Output_Data qualify;

    public Qualify(Output_Data qualify) {
        this.qualify = qualify;
    }

    public void decision() {
        Integer point = Integer.parseInt(qualify.fetchInfo().get(2).Value); // Team Point
        String teamName = qualify.fetchInfo().get(0).Value; // Team Name

        if (point > 5) {
            System.out.println(teamName + " is QUALIFIED for the next round");
        } else {
            System.out.println(teamName + " is NOT QUALIFIED for the next round");
        }
    }
}

// Main class to execute the program
public class Single_Responsibility_Efficient {
    public static void main(String[] args) {
        Team_Subcontinent1 team1 = new Team_Subcontinent1("FC Barcelona", "A", 3, 5, "Messi");
        Outputter o1 = new Outputter(team1);
        o1.print();

        Qualify q1 = new Qualify(team1);
        q1.decision();

        Team_Subcontinent1 team2 = new Team_Subcontinent1("Real Madrid CF", "B", 8, 10, "CR7");
        Outputter o2 = new Outputter(team2);
        o2.print();

        Qualify q2 = new Qualify(team2);
        q2.decision();
    }
}
