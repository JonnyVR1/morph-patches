package io.agora.base.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class ContextUtils {
    private static final String TAG = "ContextUtils";

    @Nullable
    private static Context applicationContext;

    @Nullable
    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
        } else {
            ig3.m135964a("Application context cannot be null for ContextUtils.initialize.");
        }
    }

    public static void uninitialize() {
        applicationContext = null;
    }
}
