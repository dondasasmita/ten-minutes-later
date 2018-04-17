package tenMinutesLater.models;
/*
simple rate limit class that will used by the application to set a certain number of calls can be done.
 */
public class RateLimit {

    //limit to 10 calls
    private int callLimit = 10;

    //getters and setters
    public int getCallLimit() {
        return callLimit;
    }

    public void setCallLimit(int callLimit) {
        this.callLimit = callLimit;
    }

    //method to reduce the number of call limit by 1 each time the API is called
    public void minusLimit () {
        this.callLimit -= 1;
    }

    //a method to check for remaining balance of limit returns true if remamining balance is not zero
    public boolean rateCheck(int callLimit){
        boolean ableToUseAPI;
        if (callLimit != 0) {
            ableToUseAPI = true;
        } else ableToUseAPI = false;
        return ableToUseAPI;
    }
}
