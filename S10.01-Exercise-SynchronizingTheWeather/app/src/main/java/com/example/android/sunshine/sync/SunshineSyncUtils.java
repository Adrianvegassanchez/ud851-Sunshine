package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

// TODODONE (9) Create a class called SunshineSyncUtils
public class SunshineSyncUtils {

//  TODODONE (10) Create a public static void method called startImmediateSync
//  TODODONE (11) Within that method, start the SunshineSyncIntentService
    public static void startImmediateSync(@NonNull final Context context) {
        Intent intentToSyncImmediately = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intentToSyncImmediately);
    }

}

