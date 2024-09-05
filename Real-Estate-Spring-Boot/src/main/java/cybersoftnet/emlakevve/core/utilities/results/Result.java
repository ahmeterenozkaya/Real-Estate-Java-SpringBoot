package cybersoftnet.emlakevve.core.utilities.results;

public class Result  {
    private boolean success;
    private String message;

    //buradaki yazdığımız mesaj ve true bilgisi api.controller dan işlem yapacağız

    public Result(boolean success){
        this.success = success;

    }

    public Result(boolean success,String message){
        this(success);
        this.message = message;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }
}
