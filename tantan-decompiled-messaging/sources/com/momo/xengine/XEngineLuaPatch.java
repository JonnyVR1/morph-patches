package com.momo.xengine;

import android.util.Log;
import com.momo.xeengine.XELogger;

/* JADX INFO: loaded from: classes8.dex */
public class XEngineLuaPatch {
    private static boolean SO_LOAD_SUCCEEDED = false;

    public static void init() {
        try {
            System.loadLibrary("xengine_lua_patch");
            SO_LOAD_SUCCEEDED = true;
        } catch (Throwable th) {
            Log.e(XELogger.ENGINE_TAG, "Lua补丁库加载失败: " + th.getMessage());
        }
    }

    private static native void nativeRegister(long j);

    public static void open(long j) {
        init();
        if (SO_LOAD_SUCCEEDED) {
            nativeRegister(j);
        }
    }
}
