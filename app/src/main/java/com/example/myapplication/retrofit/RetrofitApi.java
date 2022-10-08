package com.example.myapplication.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApi {

    @GET("v2/venues/search?ll=40.7484,-73.9857&oauth_token=NPKYZ3WZ1VYMNAZ2FLX1WLECAWSMUVOQZOIDBN53F3LVZBPQ&v=20180616")
    public Call<ApiResponse> getAllMatches();
}

