package org.example.equalsHashCode;

import java.util.Map;
import java.util.HashMap;
class InconsistentTeam {
    String name;
    int size;

    public InconsistentTeam(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof InconsistentTeam)) return false;
        InconsistentTeam o = (InconsistentTeam) obj;
        boolean nameEquals = (o.name == null && this.name == null) ||
                (o.name != null && this.name.equals(o.name));
        return (nameEquals && this.size == o.size);
    }
}

//
class ConsistentTeam {
    InconsistentTeam team;

    ConsistentTeam(String name, int size) {
        team = new InconsistentTeam(name, size);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ConsistentTeam)) return false;
        ConsistentTeam o = (ConsistentTeam) obj;
        return this.team.equals(o.team);
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (team.name != null) {
            result = result + team.name.hashCode();
        }
        result += (team.size / 11);
//        System.out.println(team.name + " " + result);
        return result;
    }
}

public class hashCode {
    public static void main(String[] args) {
        Map<ConsistentTeam, String> leaders = new HashMap<>();
        leaders.put(new ConsistentTeam("California", 10), "Monu");
        leaders.put(new ConsistentTeam("SouthernCalifornia", 10), "Yogesh");
        leaders.put(new ConsistentTeam("NorthCalifornia", 10), "Ajit");

        InconsistentTeam team1 = new InconsistentTeam("California", 10);
        System.out.println(leaders.get(team1)); // null -- inconsistent result - returns true for equals but false for hashcode

        ConsistentTeam team2 = new ConsistentTeam("California", 10);
        System.out.println(leaders.get(team2)); // Monu -- consistent - equals true and hashcode true
    }

}
