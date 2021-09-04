package com.bridgelabz.test;
import com.bridgelabz.Hotel;
import com.bridgelabz.HotelReservationSystem;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
   HotelReservationSystem hotelReservation = new HotelReservationSystem();

    @Test
    public void whenAddedHotel_ShouldReturn_AddedHotel() {
        Assert.assertTrue(hotelReservation.addHotel( new Hotel("LakeWood",110)));
        Assert.assertTrue(hotelReservation.addHotel( new Hotel("Bridgewood",160)));
        Assert.assertTrue(hotelReservation.addHotel( new Hotel("Ridgewood",220)));
    }
}