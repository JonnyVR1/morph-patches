package com.momo.xeengine.xnative;

import androidx.annotation.Keep;
import com.momo.xeengine.AnalyticsCallback;
import com.momo.xeengine.XEnginePreferences;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
final class JNIHelper {
    public static void analytics(int i, String str, long j, String str2) {
        AnalyticsCallback analyticsCallback = XEnginePreferences.getAnalyticsCallback();
        if (analyticsCallback != null) {
            analyticsCallback.upload(new AnalyticsCallback.Params(i, str, j, str2));
        }
    }
}
