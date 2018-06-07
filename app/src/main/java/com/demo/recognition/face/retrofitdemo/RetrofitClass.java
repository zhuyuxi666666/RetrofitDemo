package com.demo.recognition.face.retrofitdemo;

import retrofit2.Retrofit;

/**
 * 创建Retrofit的接口
 */

public interface RetrofitClass {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://tjllt.ethane.com.cn/PalmViolationInfo/")//接口总根
                .build();
}
