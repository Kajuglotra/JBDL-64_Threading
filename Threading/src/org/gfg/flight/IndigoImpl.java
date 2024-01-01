package org.gfg.flight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndigoImpl implements FlightService{
    @Override
    public List<FlightData> getFlights(String src, String dest) {

        // they will be calling third party apis to get all the schedule
       // i am not able to make a third party call
        // list which at the end should be returned

        List<FlightData> list = new ArrayList<>();
        list.add(new FlightData(src, dest, 100, new Date(),"indigo" , 1 ));
        list.add(new FlightData(src, dest, 200, new Date(),"indigo" , 2 ));
        list.add(new FlightData(src, dest, 300, new Date(),"indigo" , 3 ));
        list.add(new FlightData(src, dest, 400, new Date(),"indigo" , 4 ));
        list.add(new FlightData(src, dest, 500, new Date(),"indigo" , 5 ));
        list.add(new FlightData(src, dest, 600, new Date(),"indigo" , 6 ));

        return list;

    }
}
