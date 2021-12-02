/**
 * Java Core. Homework 1
 *
 * @author Egor Vyatkin
 * @version 02.12.2021
 */
public class Team {
    String name;
    Member[] member = new Member[4];

    public Team (String name, Member member1, Member member2, Member member3, Member member4); {
        this.name = name;
        members[0] = member1;
        members[1] = member2;
        members[2] = member3;
        members[3] = member4;
    }
 
    public void showInfoAboutAllMembers () {
        for (Member member: members) {
            System.out.println(Member);
        }

    }

    public void showInfoAboutWinners () {
        for (Member member: members) {
            if (member.isWinner) {
                System.out.println(member);
        }
    }

}


//класс Members

public class Members {
    String name;
    boolean isWinner = false;
    int maxRunDistance;

    public Members (String name, int maxRunDistance); {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        isWinner = false;
         
    } 

    @Override
    public String toString() {
        return "[" + name + ", " + maxRunDistance + "]";
    }

}
   
//класс Course

public class Course {
    int[] obstacles = new int[3];

    public Course(int o1, int o2, int o3) {
         obstacles[0] = o1;
         obstacles[1] = o2;
         obstacles[2] = o3;
    }
}
    public void doIt(Team team) {
        for (Member member: team.members){
            for (int distance: obstacles){
                System.out.println(distance + " " + member);
                if (member.maxRunDistance >= distance) {
                    member.isWinner = true;
                }
                else {
                    member.isWinner = false;
                    break;
                }
            }
        }
    }

}
// выдает ошибку... не зная почему
public class Main {
    public static void main(String[] args) {
        Member member1 = new Member(name:"Alex", maxRunDistance:300);
        Member member2 = new Member(name:"Andr", maxRunDistance:400);
        Member member3 = new Member(name:"Boris", maxRunDistance:150);
        Member member4 = new Member(name:"Seva", maxRunDistance:50);
        Team team = new Team(name: "команда", member1, member2, member3, member4);
        Course course = new Course(150, 200, 300);

        team.showInfoAboutAllMembers();
        System.out.println();

        cource.doIt(team);

        team.showInfoAboutWinners();
    }
}
