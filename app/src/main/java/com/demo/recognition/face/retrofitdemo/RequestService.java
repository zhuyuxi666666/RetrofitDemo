package com.demo.recognition.face.retrofitdemo;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;

public interface RequestService {
    @POST("weatherInfo.do")//接口
    Call<ResponseBody> getWeather();//参数
//    Call<ResponseBody> getWeather(@Query("city") String cityName);//参数
}

