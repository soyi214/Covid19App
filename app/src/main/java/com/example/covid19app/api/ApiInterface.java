package com.example.covid19app.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    /* Get the data from open api website */
    static final String BASE_URL = "https://disease.sh/v3/covid-19/";

    @GET("countries")
    Call<List<CountryData>> getCountryData();
}
