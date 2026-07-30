package com.cosmos.photon.baseim.push;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class PushContextHolder {
    public static Context sContext;

    public static void init(Context context) {
        sContext = context;
    }
}
