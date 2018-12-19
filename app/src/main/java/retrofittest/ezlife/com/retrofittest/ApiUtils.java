package retrofittest.ezlife.com.retrofittest;


public class ApiUtils {

    public static final String BASE_URL = "http://ec2-54-191-153-21.us-west-2.compute.amazonaws.com/wifishare/Services/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}