package com.example.miravereda.API;


import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Url;

interface ApiService {
    @GET
    Call<ResponseBody> getCall(@Url String url);

    @POST
    Call<ResponseBody> postCall(@Url String url, @Body RequestBody data);

    @PUT
    Call<ResponseBody> putCall(@Url String url,@Body RequestBody data);

    @DELETE
    Call<ResponseBody> deleteCall(@Url String url);

    @HTTP(method = "DELETE", hasBody = true)
    Call<ResponseBody> deleteWithBodyCall(@Url String url, @Body RequestBody data);
}
