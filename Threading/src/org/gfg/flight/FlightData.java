package org.gfg.flight;


import java.util.Date;

public class FlightData {

    private String src;

    private String dest;

    private int price;
    
    private Date dateOfFLight;
    private String flightName;
    private int id;

    public FlightData(String src, String dest, int price, Date dateOfFLight, String flightName, int id) {
        this.src = src;
        this.dest = dest;
        this.price = price;
        this.dateOfFLight = dateOfFLight;
        this.flightName = flightName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "FlightData{" +
                "src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                ", dateOfFLight=" + dateOfFLight +
                ", flightName='" + flightName + '\'' +
                ", id=" + id +
                '}';
    }
}
