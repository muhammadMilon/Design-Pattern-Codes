import java.util.ArrayList;

class Team_Subcontinent {
    public String team_name, team_group, icon_player;
    public Integer team_point, goal_count;

    Team_Subcontinent(String team_name, String team_group, Integer team_point, Integer goal_count, String icon_player) {
        this.team_name = team_name;
        this.team_group = team_group;
        this.team_point = team_point;
        this.goal_count = goal_count;
        this.icon_player = icon_player;
    }

    public void setFormatting(Integer team_point, String team_group, Integer goal_count) {
        if (team_point != null) {
            this.team_point = team_point;
            this.team_group = team_group;
            this.goal_count = goal_count;
        }
    }

    public String toString() {
        String str;
        str = "{\n";
        str += " Team Name: " + this.team_name + "\n";
        str += " Team Group: " + this.team_group + "\n";
        str += " Team Point: " + this.team_point + "\n";
        str += " Goal Count: " + this.goal_count + "\n";
        str += " Icon Player: " + this.icon_player + "\n";
        str += "}";
        return str;
    }
}

class Team_PrimaryStage {
    Team_Subcontinent teamobj;

    Team_PrimaryStage(Team_Subcontinent teamobj) {
        this.teamobj = teamobj;
        if (teamobj.team_point > 5) {
            System.out.println(teamobj.team_name + " is QUALIFIED for the next round");
        } else {
            System.out.println(teamobj.team_name + " is NOT QUALIFIED for the next round");
        }
    }
}

public class Single_Responsibility_Insufficient {
    public static void main(String[] args) {
        Team_Subcontinent team1 = new Team_Subcontinent("FC Barcelona", "A", 3, 5, "Messi");
        System.out.println(team1);
        Team_PrimaryStage t1 = new Team_PrimaryStage(team1);

        Team_Subcontinent team2 = new Team_Subcontinent("Real Madrid CF", "B", 8, 10, "CR7");
        System.out.println(team2);
        Team_PrimaryStage t2 = new Team_PrimaryStage(team2);
    }
}
