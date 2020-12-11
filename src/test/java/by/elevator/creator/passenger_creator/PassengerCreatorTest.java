package by.elevator.creator.passenger_creator;

import by.elevator.creator.passenger_creator.impl.PassengerCreator;
import by.elevator.entity.human.impl.Passenger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PassengerCreatorTest {

    private static PassengerCreator passengerCreator;

    @BeforeAll
    public static void init() {
        passengerCreator = new PassengerCreator();
    }

    /*
     * Check correct passenger instance creation
     */
    @Test
    @DisplayName("Create passenger with different desired floor and current floor")
    void create_currentFlourEquivalentDesiredFloor_passenger() {
        int amountOfPassenger = 5;

        Passenger passenger = passengerCreator.create(amountOfPassenger);

        assertNotNull(passenger);
    }
}
