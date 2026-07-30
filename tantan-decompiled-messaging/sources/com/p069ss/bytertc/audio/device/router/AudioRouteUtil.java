package com.p069ss.bytertc.audio.device.router;

import android.content.Context;
import com.bytedance.realx.base.ContextUtils;

/* JADX INFO: loaded from: classes12.dex */
public class AudioRouteUtil {
    public static Context getContext() {
        return ContextUtils.getApplicationContext();
    }

    public static String modeString(int i) {
        if (i == 0) {
            return "MODE_NORMAL";
        }
        if (i == 1) {
            return "MODE_RINGTONE";
        }
        if (i != 2) {
            return i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION";
        }
        return "MODE_IN_CALL";
    }
}
