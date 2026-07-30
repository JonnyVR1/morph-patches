package com.tencent.could.aicamare.util;

import com.tencent.could.aicamare.callback.CameraLoggerCallBack;

/* JADX INFO: loaded from: classes2.dex */
public class CameraLogger {

    /* JADX INFO: renamed from: a */
    public static LOG_LEVEL f57238a = LOG_LEVEL.LEVEL_VERBOSE;

    public enum LOG_LEVEL {
        LEVEL_VERBOSE,
        LEVEL_DEBUG,
        LEVEL_INFO,
        LEVEL_WARN,
        LEVEL_ERROR,
        LEVEL_NONE
    }

    /* JADX INFO: renamed from: a */
    public static void m82190a(boolean z, String str, String str2, CameraLoggerCallBack cameraLoggerCallBack) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("[ai-camera-debug]");
        } else {
            sb.append("[ai-camera-error]");
        }
        sb.append(str2);
        if (cameraLoggerCallBack != null) {
            cameraLoggerCallBack.logger(str, sb.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m82191b(String str, String str2, CameraLoggerCallBack cameraLoggerCallBack) {
        if (LOG_LEVEL.LEVEL_ERROR.compareTo(f57238a) >= 0) {
            m82190a(false, str, str2, cameraLoggerCallBack);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m82189a(String str, String str2, CameraLoggerCallBack cameraLoggerCallBack) {
        if (LOG_LEVEL.LEVEL_DEBUG.compareTo(f57238a) >= 0) {
            m82190a(true, str, str2, cameraLoggerCallBack);
        }
    }
}
