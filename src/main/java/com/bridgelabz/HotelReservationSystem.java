package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;

/**
 * Purpose - To build a Hotel Reservation System
 * Author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-09-02
 */
public class HotelReservationSystem {
    private List<Hotel> hotels;

    public HotelReservationSystem(){
        this.hotels = new ArrayList<>();
    }

    /**
     * This method is used to add hotel to the Hotel List
     */
    public boolean addHotel(Hotel hotel) {
        return this.hotels.add(hotel);
    }
}

