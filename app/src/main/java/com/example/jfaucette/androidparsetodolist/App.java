package com.example.jfaucette.androidparsetodolist;

/**
 * Created by JFaucette on 11/8/15.
 */
    import android.app.Application;

import com.parse.Parse;

    public class App extends Application {

        @Override public void onCreate() {
            super.onCreate();

            Parse.initialize(this, "6kAuQrnZFROire0NRNaSnMoINCl1ogecGv2gTjES", "gJlETPndLyDQVQHwKosTjH2XLXe6Intzc1BS6QFM"); // Your Application ID and Client Key are defined elsewhere
        }
    }
