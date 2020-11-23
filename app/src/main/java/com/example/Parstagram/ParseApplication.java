package com.example.Parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Z2wyPwEIWRSuqv3zoQZhmNh7Sol48rADeH5J7Ijo")
                .clientKey("Zz0DMJ3f09NIlgmcOvF7yRzRrsbeGF8DAUArKffm")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
