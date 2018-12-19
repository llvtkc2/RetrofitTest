package retrofittest.ezlife.com.retrofittest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface SOService {

//    @GET("ListWifi.php?lat=21.019503&lon=105.771017&offset=0&limit=100")
//    Call<Example> getAllExamples();

    @GET("ListWifi.php?offset=0&limit=100")
    Call<Example> getExamples(@Query("lat") String lat,@Query("lon") String lon);
}
