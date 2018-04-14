/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot.Controller;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author violin
 */
public class Command {
    public Map<String, Method> commandsMap;

    public Command() {
        commandsMap = new HashMap<String, Method>();
        try {
            CommandsHashMap();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    private void CommandsHashMap() throws NoSuchMethodException {
        commandsMap.put("create_parking_lot", 
                ParkingController.class.getMethod("createParkingLot", 
                        String.class));
        commandsMap.put("park", 
                ParkingController.class.getMethod("park", String.class, 
                        String.class));
        commandsMap.put("leave", 
                ParkingController.class.getMethod("leave", String.class));
        commandsMap.put("status", 
                ParkingController.class.getMethod("status"));
        commandsMap.put("registration_numbers_for_cars_with_colour", 
                ParkingController.class.getMethod("getRegistrationNumbersFromColor", 
                        String.class));
        commandsMap.put("slot_numbers_for_cars_with_colour", 
                ParkingController.class.getMethod("getSlotNumbersFromColor", 
                        String.class));
        commandsMap.put("slot_number_for_registration_number", 
                ParkingController.class.getMethod("getSlotNumberFromRegNo", 
                        String.class));
    }
}
