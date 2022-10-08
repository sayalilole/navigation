
package com.example.myapplication.retrofit;

import android.support.annotation.TransitionRes;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Venue extends ApiResponse {

    @SerializedName("beenHere")
    private BeenHere mBeenHere;
    @SerializedName("categories")
    private List<Category> mCategories;
    @SerializedName("contact")
    private Contact mContact;
    @SerializedName("hasPerk")
    private Boolean mHasPerk;
    @SerializedName("hereNow")
    private HereNow mHereNow;
    @SerializedName("id")
    private String mId;
    @SerializedName("location")
    private Location mLocation;
    @SerializedName("name")
    private String mName;
    @SerializedName("referralId")
    private String mReferralId;
    @SerializedName("stats")
    private Stats mStats;
    @SerializedName("venueChains")
    private List<Object> mVenueChains;
    @SerializedName("venuePage")
    private VenuePage mVenuePage;
    @SerializedName("verified")
    private Boolean mVerified;
    private transient Boolean isSave = false;

    public BeenHere getBeenHere() {
        return mBeenHere;
    }

    public void setBeenHere(BeenHere beenHere) {
        mBeenHere = beenHere;
    }

    public List<Category> getCategories() {
        return mCategories;
    }

    public void setCategories(List<Category> categories) {
        mCategories = categories;
    }

    public Contact getContact() {
        return mContact;
    }

    public void setContact(Contact contact) {
        mContact = contact;
    }

    public Boolean getHasPerk() {
        return mHasPerk;
    }

    public void setHasPerk(Boolean hasPerk) {
        mHasPerk = hasPerk;
    }

    public HereNow getHereNow() {
        return mHereNow;
    }

    public void setHereNow(HereNow hereNow) {
        mHereNow = hereNow;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getReferralId() {
        return mReferralId;
    }

    public void setReferralId(String referralId) {
        mReferralId = referralId;
    }

    public Stats getStats() {
        return mStats;
    }

    public void setStats(Stats stats) {
        mStats = stats;
    }

    public List<Object> getVenueChains() {
        return mVenueChains;
    }

    public void setVenueChains(List<Object> venueChains) {
        mVenueChains = venueChains;
    }

    public VenuePage getVenuePage() {
        return mVenuePage;
    }

    public void setVenuePage(VenuePage venuePage) {
        mVenuePage = venuePage;
    }

    public Boolean getVerified() {
        return mVerified;
    }

    public void setVerified(Boolean verified) {
        mVerified = verified;
    }

    public Boolean getIsSave(){return isSave;}
    public void setIsSave(Boolean isSave){this.isSave = isSave;}

}
