package com.example.navigationdrawer.Retrofit;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitInterface {
    @GET("v6/6e9d5ac3c152685a60772ab9/latest/{currency}")
    Call<JsonObject> getExchangeCurrency(@Path("currency") String currency);
}