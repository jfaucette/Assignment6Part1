package com.example.jfaucette.androidparsetodolist;

/**
 * Created by JFaucette on 11/8/15.
 */
    import android.app.Application;

import com.parse.Parse;

    public class App extends Application {

        private String ApplicationID = "6kAuQrnZFROire0NRNaSnMoINCl1ogecGv2gTjES";
        private String ClientKey = "gJlETPndLyDQVQHwKosTjH2XLXe6Intzc1BS6QFM";

        @Override
        public void onCreate() {
            super.onCreate();

            Parse.initialize(this, ApplicationID, ClientKey);
        }
    }
