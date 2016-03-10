package com.example.android.lately.Cards;

import java.util.List;

/**
 * Created by perrycooperman on 3/10/16.
 */
public class WeatherCard extends ParentCard {
    String mCurrentTemp;
    String mCurrentSummary;
    String mCurrentLocation;
    String mFormattedCurrentDate;
    String[] mNextFiveDaysDates;
    String[] mNextFiveDaysSummary;
    String[] mNextFiveDaysHighTemp ;
    String[] mNextFiveDaysLowTemp;
    int mTabType;
    int mId;

    public WeatherCard(String mCurrentTemp, String mCurrentSummary, String mCurrentLocation, String mFormattedCurrentDate, String[] mNextFiveDaysDates, String[] mNextFiveDaysSummary, String[] mNextFiveDaysHighTemp, String[] mNextFiveDaysLowTemp, int mTabType, int mCardType, int id) {
        super(mCardType);
        this.mCurrentTemp = mCurrentTemp;
        this.mCurrentSummary = mCurrentSummary;
        this.mCurrentLocation = mCurrentLocation;
        this.mFormattedCurrentDate = mFormattedCurrentDate;
        this.mNextFiveDaysDates = mNextFiveDaysDates;
        this.mNextFiveDaysSummary = mNextFiveDaysSummary;
        this.mNextFiveDaysHighTemp = mNextFiveDaysHighTemp;
        this.mNextFiveDaysLowTemp = mNextFiveDaysLowTemp;
        this.mTabType = mTabType;
        this.mId = id;
    }

    public String getmCurrentTemp() {
        return mCurrentTemp;
    }

    public void setmCurrentTemp(String mCurrentTemp) {
        this.mCurrentTemp = mCurrentTemp;
    }

    public String getmCurrentSummary() {
        return mCurrentSummary;
    }

    public void setmCurrentSummary(String mcurrentSummary) {
        this.mCurrentSummary = mcurrentSummary;
    }

    public String getmCurrentLocation() {
        return mCurrentLocation;
    }

    public void setmCurrentLocation(String mCurrentLocation) {
        this.mCurrentLocation = mCurrentLocation;
    }

    public String getmFormattedCurrentDate() {
        return mFormattedCurrentDate;
    }

    public void setmFormattedCurrentDate(String mFormattedCurrentDate) {
        this.mFormattedCurrentDate = mFormattedCurrentDate;
    }

    public String[] getmNextFiveDaysDates() {
        return mNextFiveDaysDates;
    }

    public void setmNextFiveDaysDates(String[] mNextFiveDaysDates) {
        this.mNextFiveDaysDates = mNextFiveDaysDates;
    }

    public String[] getmNextFiveDaysSummary() {
        return mNextFiveDaysSummary;
    }

    public void setmNextFiveDaysSummary(String[] mNextFiveDaysSummary) {
        this.mNextFiveDaysSummary = mNextFiveDaysSummary;
    }

    public String[] getmNextFiveDaysHighTemp() {
        return mNextFiveDaysHighTemp;
    }

    public void setmNextFiveDaysHighTemp(String[] mNextFiveDaysHighTemp) {
        this.mNextFiveDaysHighTemp = mNextFiveDaysHighTemp;
    }

    public String[] getmNextFiveDaysLowTemp() {
        return mNextFiveDaysLowTemp;
    }

    public void setmNextFiveDaysLowTemp(String[] mNextFiveDaysLowTemp) {
        this.mNextFiveDaysLowTemp = mNextFiveDaysLowTemp;
    }

    public int getmTabType() {
        return mTabType;
    }

    public void setmTabType(int mTabType) {
        this.mTabType = mTabType;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }
}
