package com.csabi.busycodersguide;

import retrofit.http.GET;

/**
 * Created by Csabi on 2/16/2015.
 */
public interface BookUpdateInterface {
    @GET("/misc/empublite-update.json")
    BookUpdateInfo update();
}
