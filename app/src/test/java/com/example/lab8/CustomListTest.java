package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    // Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Garmond","boziat"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Garmond", "Boziat");
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Garmond", "Boziat");
        list.addCity(city);
        int listsize = list.getCount();
        list.deleteCity(city);
        assertEquals(list.getCount(),listsize -1);
    }
    @Test
    public void countCitiesTest(){
        list = MockCityList();
        City city = new City("Garmond", "Boziat");
        int listsize = list.countCities();
        list.addCity(city);
        assertEquals(listsize + 1, list.countCities());
        list.deleteCity(city);
        assertEquals(listsize, list.countCities());
    }
}
