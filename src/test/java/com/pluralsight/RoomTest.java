package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {
  @Test
    public void checkIn_shouldbe_occupiedanddirty(){
      Room room = new Room(135.0, 2);
      //act
      room.checkIn();
      //asserts
      assertFalse(room.isAvailable());
  }
    @Test
    public void checkIn_shouldbe_whenoccupied(){
        Room room = new Room(135.0, 2);
        room.setOccupied(true);
        //act
        room.checkIn();
        assertTrue(room.isOccupied());
        //asserts
        assertFalse(room.isDirty());
    }
    public void checkIn_shouldbe_whendirty(){
        Room room = new Room(135.0, 2);
        room.setDirty(true);
        //act
        room.checkIn();
        assertTrue(room.isDirty());
        //asserts
        assertFalse(room.isOccupied());
    }

    @Test
    public void checkOut_shouldbe_notoccupiedanddirty(){
        Room room = new Room(135.0, 2);
        room.checkIn();
        //act
        room.checkOut();
        //asserts
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
        assertEquals(!room.isAvailable(), !room.isAvailable());
    }
    @Test
    public void cleanUp_shouldbe_available(){
        Room room = new Room(135.0, 2);
        room.checkIn();
        room.checkOut();
        //acts
        room.cleanRoom();
        //asserts
        assertTrue(room.isAvailable());
    }
    @Test
    public void cleanUp_shouldbe_unavailablewhenoccupied(){
        Room room = new Room(135.0, 2);
        room.checkIn();
        room.checkOut();
        room.setOccupied(true);
        //acts
        room.cleanRoom();
        //asserts
        assertFalse(room.isAvailable());
    }
}