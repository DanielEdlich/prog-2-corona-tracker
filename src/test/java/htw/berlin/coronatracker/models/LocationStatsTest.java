package htw.berlin.coronatracker.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationStatsTest {

    @Test
    @DisplayName("Prints values of LocationStats")
    void testToString() {
        LocationStats locationStat = new LocationStats();
        locationStat.setState("Brandenburg");
        locationStat.setCountry("Germany");
        locationStat.setLatestTotalCases(100);
        locationStat.setDiffFromPrevDay(100);

        String expected = "LocationStats{" +
                "state='Brandenburg" + '\'' +
                ", country='Germany"  + '\'' +
                ", latestTotalCases=100" +
                ", diffFromPrevDay=100" +
                '}';
        String actual = locationStat.toString();

        assertEquals(actual, expected);
    }
}