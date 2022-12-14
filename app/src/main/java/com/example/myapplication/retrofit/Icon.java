
package com.example.myapplication.retrofit;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Icon {

    @SerializedName("prefix")
    private String mPrefix;
    @SerializedName("suffix")
    private String mSuffix;

    public String getPrefix() {
        return mPrefix;
    }

    public void setPrefix(String prefix) {
        mPrefix = prefix;
    }

    public String getSuffix() {
        return mSuffix;
    }

    public void setSuffix(String suffix) {
        mSuffix = suffix;
    }

}
