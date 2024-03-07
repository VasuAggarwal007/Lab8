package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

public class CustomListTest {

    private final List<City> cities = new ArrayList<>();
    
    /**
     * this gets size of the list
     * return
     */
    public int getCount(){
        return cities.size();
    }

    private CustomList list;
    /**
     * create a mock list for my city list
     * return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

         /*
          get the size of the list
          increase the list by adding a new city
          check if our current size matches the initial size
         plus one
         */

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * this adds a city object to the list
     *for the first phase it will be
     empty * @param city
     */
    public void addCity(City city){

        /*
          this adds a city object to the list
         the second phase, you can add the
         city * @param city
         */
            cities.add(city);


    }





}
