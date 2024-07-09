package com.example.mvpxnew.api;



import com.example.mvpxnew.app.base.BaseApi;

import retrofit2.Retrofit;

/**
 * Description:
 */

public class ApiIn extends BaseApi {

    @Override
    public Api getObservable(Retrofit retrofit) {
        return retrofit.create(Api.class);
    }
}
