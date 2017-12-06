package es.powerbutton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PowerButton {

    private boolean enabled = false;

    private PoweredDevice device;

    @Autowired
    public PowerButton(PoweredDevice device) {
        this.device = device;
    }

    public void click() {

        enabled = !enabled;

        if (enabled) {
            device.enable();
        } else {
            device.disable();
        }
    }
}