package team2600.project_r.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucia on 1/22/2018.
 */

public class Country {
    String countryName;
    int knights;
    int clerics;
    List<Town> towns;

    public static Country buildTempCountry() {
        Country testCountry = new Country();
        testCountry.setCountryName("Testaria");
        testCountry.setKnights(99);
        testCountry.setClerics(99);

        final Town firstTown = new Town();
        firstTown.setName("Bridgetown");
        firstTown.setHealth(100);

        final Town secondTown = new Town();
        secondTown.setName("Port Lucy");
        firstTown.setHealth(50);

        List<Town> town = new ArrayList<Town>(){{
            add(firstTown);
            add(secondTown);
        }};
        testCountry.setTowns(town);
        return testCountry;

    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getKnights() {
        return knights;
    }

    public void setKnights(int knights) {
        this.knights = knights;
    }

    public int getClerics() {
        return clerics;
    }

    public void setClerics(int clerics) {
        this.clerics = clerics;
    }

    public List<Town> getTowns() {
        return towns;
    }

    public void setTowns(List<Town> towns) {
        this.towns = towns;
    }
}
