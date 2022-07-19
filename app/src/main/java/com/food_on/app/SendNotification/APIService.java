package com.food_on.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=BCJJjmx0_IXEumkmOtV7B9bAhzemZNdLeRD3pPlfhH2u8epm34g1JQTF5PgZDmx1ur-8166tlGUW_phF9dAzr4k"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
