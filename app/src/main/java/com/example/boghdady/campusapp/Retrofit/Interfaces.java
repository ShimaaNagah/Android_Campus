package com.example.boghdady.campusapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by boghdady on 23/02/17.
 */

public class Interfaces {

    public interface User_Details{
        @POST("Campus/Get_User_Details.php")
        Call<Responses.GetUserDetailsResponse> getUserData(@Body SentBody.UserOperationBody userOperationBody);
    }
    public interface User_RegisterAPI{
        @POST("Campus/Insert_User.php")
        Call<Responses.SignupResponse> insertUser(@Body SentBody.UserOperationBody userOperationBody);
    }
}
