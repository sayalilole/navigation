
package com.example.myapplication.retrofit;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Meta {

    @SerializedName("code")
    private Long mCode;
    @SerializedName("requestId")
    private String mRequestId;

    public Long getCode() {
        return mCode;
    }

    public void setCode(Long code) {
        mCode = code;
    }

    public String getRequestId() {
        return mRequestId;
    }

    public void setRequestId(String requestId) {
        mRequestId = requestId;
    }

}
