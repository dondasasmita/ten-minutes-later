package tenMinutesLater.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tenMinutesLater.models.RateLimit;
import tenMinutesLater.models.Time;

@RestController
public class TimeController {

    RateLimit rateLimit = new RateLimit();

    @RequestMapping("/10minutes")
    public Time get10minutes(){
        //check if there is remaining balance
        if (rateLimit.rateCheck(rateLimit.getCallLimit()) == true) {
            //create time object
            Time tenMinutes = new Time();
            tenMinutes.setTenMinutesLater(tenMinutes.getCurrentTime());
            tenMinutes.getTenMinutesLater();
            //reduce the number of limits by 1
            rateLimit.minusLimit();
            return tenMinutes;
        } else return null;
    }
}
