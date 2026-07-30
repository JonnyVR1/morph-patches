package com.tencent.liteav.trtc.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class TRTCVideoServerConfig {
    private static final String KEY_ENABLE_DEC_VUI = "enable_hw_vui";
    private static final String VIDEO_SERVER_CONFIG = "trtc_video_server_config";
    public boolean enableHWVUI = true;

    public static TRTCVideoServerConfig loadFromSharedPreferences(Context context) {
        TRTCVideoServerConfig tRTCVideoServerConfig;
        synchronized (TRTCVideoServerConfig.class) {
            tRTCVideoServerConfig = new TRTCVideoServerConfig();
            tRTCVideoServerConfig.enableHWVUI = context.getSharedPreferences(VIDEO_SERVER_CONFIG, 0).getBoolean(KEY_ENABLE_DEC_VUI, true);
        }
        return tRTCVideoServerConfig;
    }

    public static void saveToSharedPreferences(Context context, TRTCVideoServerConfig tRTCVideoServerConfig) {
        synchronized (TRTCVideoServerConfig.class) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(VIDEO_SERVER_CONFIG, 0).edit();
            editorEdit.putBoolean(KEY_ENABLE_DEC_VUI, tRTCVideoServerConfig.enableHWVUI);
            editorEdit.apply();
        }
    }

    public String toString() {
        return "enableHWVUI: " + this.enableHWVUI;
    }
}
