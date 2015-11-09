package com.example.jfaucette.androidparsetodolist;

/**
 * Created by JFaucette on 11/8/15.
 */
    import android.app.Application;

import com.parse.Parse;

    public class App extends Application {

        private String ApplicationID = "";
        private String ClientKey = "";

        @Override
        public void onCreate() {
            super.onCreate();

            //variables stored elsewhere
            Parse.initialize(this, ApplicationID, ClientKey);
        }
    }
