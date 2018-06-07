package com.demo.recognition.face.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.recognition.face.retrofitdemo.logs.LogImpl;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private TextView tvRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvRetrofit = (TextView) findViewById(R.id.tv_retrofit);
        // 创建 网络请求接口 的实例
        RequestService requestSerives = RetrofitClass.retrofit.create(RequestService.class);
//        Call<ResponseBody> call = requestSerives.getWeather("深圳");//传入我们请求的键值对的值value
        Call<ResponseBody> call = requestSerives.getWeather();//传入我们请求的键值对的值value
        call.enqueue(new Callback<ResponseBody>() {
            //请求成功的方法
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String bodyJSON = response.body().string();
                    LogImpl.getInstance().d("返回的数据", ">>>" + bodyJSON);
                    RetrofitEntity retrofitEntity = GsonUtils.fromJson(bodyJSON, RetrofitEntity.class);
                    tvRetrofit.setText(retrofitEntity.getData().getWeather());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            //请求失败的方法
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {
                Log.e("请求失败：", "error");
            }
        });

    }

}
