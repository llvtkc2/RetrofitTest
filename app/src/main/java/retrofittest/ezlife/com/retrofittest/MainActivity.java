package retrofittest.ezlife.com.retrofittest;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Get(View view) {
        SOService service = ApiUtils.getSOService();

        service.getExamples("1","1").enqueue(new Callback<KetQua>() {
            @Override
            public void onResponse(@NonNull Call<KetQua> call, @NonNull Response<KetQua> response) {
                if(response.isSuccessful()){
                    for (Datum datum:response.body().getData()){
                        Log.e(datum.getWName(),datum.getWPass());
                    }
                }

            }

            @Override
            public void onFailure(@NonNull Call<KetQua> call, @NonNull Throwable t) {

                Toast.makeText(MainActivity.this, "onFailure", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Post(View view) {
        SOService service = ApiUtils.getSOService();
        service.post("hoang",System.currentTimeMillis()+"","pass","1","1").enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if(response.isSuccessful()){
                    Log.e(response.body().getMsg(),response.body().getMsg());
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });
    }
}
