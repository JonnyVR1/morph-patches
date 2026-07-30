package com.p006ss.bytertc.base.media.screen;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import l.nck0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ScreenServiceManager {
    private static final String TAG = "ScreenServiceManager";

    @CalledByNative
    public ScreenServiceManager() {
    }

    @CalledByNative
    public void stopService() {
        if (Build.VERSION.SDK_INT > 28 && RXScreenCaptureService.serviceStarted.get()) {
            try {
                Context applicationContext = ContextUtils.getApplicationContext();
                nck0.a(applicationContext, RXScreenCaptureService.getServiceIntent(applicationContext, 9, null));
            } catch (ForegroundServiceStartNotAllowedException unused) {
                Log.e(TAG, "stopService failed.");
            }
        }
    }
}
