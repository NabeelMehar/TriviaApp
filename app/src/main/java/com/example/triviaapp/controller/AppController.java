package com.example.triviaapp.controller;

import android.app.Application;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.triviaapp.data.QuestionBank;

public class AppController extends Application {

    private static AppController instance;
    private static RequestQueue requestQueue;


    public static synchronized AppController getInstance()
     {
//         if (instance==null)
//             instance=new AppController();

        return instance;
     }

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }

    public RequestQueue getRequestQueue() {

        if (requestQueue==null)
            requestQueue= Volley.newRequestQueue(getApplicationContext());


        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req)
     {
        getRequestQueue().add(req);
     }




}
