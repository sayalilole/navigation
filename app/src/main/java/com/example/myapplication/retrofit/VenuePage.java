
package com.example.myapplication.retrofit;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class VenuePage {

    @SerializedName("id")
    private String mId;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

}
