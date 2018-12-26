package retrofittest.ezlife.com.retrofittest;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface SOService {


    @GET("ListWifi.php?offset=0&limit=100")
    Call<KetQua> getExamples(@Query("lat") String lat, @Query("lon") String lon);

    @POST("CollectWifi.php")
    @FormUrlEncoded
    Call<Example> post(@Field("wName") String name,
                       @Field("wBSSID") String bssid,
                       @Field("userId") String pass,
                       @Field("wLon") String lon,
                       @Field("wLat") String lat);
}
