package es.fan;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("")
public class Fan {

    public void turnOn() {
        System.out.println("es.fan.ElectricalFan.turnOn");
    }

    public void turnOff() {
        System.out.println("es.fan.ElectricalFan.turnOff");
    }

}