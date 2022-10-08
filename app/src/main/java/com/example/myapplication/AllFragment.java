package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.retrofit.ApiResponse;
import com.example.myapplication.retrofit.RetrofitApi;
import com.example.myapplication.retrofit.RetrofitClient;
import com.example.myapplication.retrofit.Venue;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllFragment extends Fragment {

    TextView txt;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        RetrofitClient.getRetrofitClient().getAllMatches().enqueue(new Callback<ApiResponse>() {



              @Override
          public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                List<Venue> list = response.body().getResponse().getVenues();
              txt.setText(new Gson().toJson(response.body().getResponse()));
             //  Log.d("TAG!!", new Gson().toJson(response.body()).toString());
            //    Log.d("TAG!!", "onResponse: " + response.body().getResponse().getVenues().size());
              // for (int i =0; i<response.body().getResponse().getVenues().size();i++){
                 //   Log.d("TAG!!", "onResponse: " + response.body().getResponse().getVenues().get(i).getName());
              //  }

          //  }

          //  @Override
         //   public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
            //    List<Venue>list=  response.body().getResponse().getVenues();
             //   if(!response.isSuccessful()){
            //        txt.setText(new Gson().toJson( response.body().getResponse().getVenues().toString()));
            //        return;

            //    }

             List<Venue> apiResponses = response.body().getResponse().getVenues();
             for (ApiResponse apiResponse : apiResponses){
                    String content="";
                    content = "" + response.body().getResponse().getVenues()+"\n";

                    txt.append(content);
                }

            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                txt.setText(t.getMessage());
            }
        });

        View view = inflater.inflate(R.layout.fragment_all,container,false);
        txt = view.findViewById(R.id.text1);
        return view;

    }

}
