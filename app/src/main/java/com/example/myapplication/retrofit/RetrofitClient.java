package com.example.myapplication.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    public static RetrofitApi retrofit;

    public static RetrofitApi getRetrofitClient(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://api.foursquare.com/")
                    .build().create(RetrofitApi.class);
        }
        return retrofit;
    }
}
