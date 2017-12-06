package es;

import es.powerbutton.PoweredDevice;
import es.lamp.Lamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class PowerButtonLampAdapter implements PoweredDevice {

    private Lamp lamp;

    @Autowired
    public PowerButtonLampAdapter(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void enable() {
        lamp.turnOn();
    }

    @Override
    public void disable() {
        lamp.turnOff();
    }
}