package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<Driver> results;

    public Race(String name, Driver... drivers) {
        this.name = name;
        this.results = Arrays.asList(drivers);
    }

    @Override
    public String toString() {
        return name;
    }

    public Map<String, Integer> results() {
        Map<String, Integer> results = new HashMap<>();
        for (Driver driver : this.results) {
            String driverName = driver.getName();
            int totalPoints = results.get(driverName) + (int) Race.POINTS[this.results.indexOf(driver)];
            results.put(driverName, totalPoints);
        }
        return results;
    }
}
