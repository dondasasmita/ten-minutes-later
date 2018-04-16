package tenMinutesLater.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {

//    private String currentTime;
    private String tenMinutesLater;

    public String getCurrentTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(cal.getTime());
    }

    public String getTenMinutesLater() {
        return tenMinutesLater;
    }

    public void setTenMinutesLater(String currentTime) {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        try {
            Date d = df.parse(currentTime);
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            cal.add(Calendar.MINUTE,10);
            String tenMinutesLater = df.format(cal.getTime());
            this.tenMinutesLater = tenMinutesLater;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
