package htw.berlin.coronatracker.services;

import htw.berlin.coronatracker.models.LocationStats;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CoronaVirusDataServiceTest {

    @Test
    void fetchVirusDataTest() throws IOException, InterruptedException {
        CoronaVirusDataService service = new CoronaVirusDataService();
        service.fetchVirusData();
        assertEquals(service.getAllStats().get(0).getCountry(), "Afghanistan");
    }
}