package org.gfg.flight;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class FlightDataTask implements Callable {

    private FlightService flightService;

    private String src;

    private String dest;


    public FlightDataTask(FlightService flightService, String src, String dest) {
        this.flightService = flightService;
        this.src = src;
        this.dest = dest;
    }

    @Override
    public List<FlightData> call() throws Exception {
        // i am expected to call the getFlights(src, dest
       return flightService.getFlights(src, dest);
    }
}
