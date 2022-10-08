
package com.example.myapplication.retrofit;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Contact {

    @SerializedName("formattedPhone")
    private String mFormattedPhone;
    @SerializedName("phone")
    private String mPhone;

    public String getFormattedPhone() {
        return mFormattedPhone;
    }

    public void setFormattedPhone(String formattedPhone) {
        mFormattedPhone = formattedPhone;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

}
