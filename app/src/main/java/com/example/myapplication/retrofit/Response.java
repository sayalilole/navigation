
package com.example.myapplication.retrofit;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Response {

    @SerializedName("confident")
    private Boolean mConfident;
    @SerializedName("venues")
    private List<Venue> mVenues;

    public Boolean getConfident() {
        return mConfident;
    }

    public void setConfident(Boolean confident) {
        mConfident = confident;
    }

    public List<Venue> getVenues() {
        return mVenues;
    }

    public void setVenues(List<Venue> venues) {
        mVenues = venues;
    }

}
