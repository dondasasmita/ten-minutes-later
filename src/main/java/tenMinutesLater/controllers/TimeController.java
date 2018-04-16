package tenMinutesLater.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tenMinutesLater.models.Time;

@RestController
public class TimeController {

    @RequestMapping("/10minutes")
    public Time get10minutes(){
        Time tenMinutes = new Time();
        tenMinutes.setTenMinutesLater(tenMinutes.getCurrentTime());
        tenMinutes.getTenMinutesLater();
        return tenMinutes;
    }

}
