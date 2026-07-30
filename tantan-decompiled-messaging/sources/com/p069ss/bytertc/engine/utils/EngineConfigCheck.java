package com.p069ss.bytertc.engine.utils;

import android.text.TextUtils;
import com.p069ss.bytertc.engine.data.EngineConfig;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class EngineConfigCheck {
    public static final int ENGINE_CONFIG_INVALID_APP_ID = 1;
    public static final int ENGINE_CONFIG_INVALID_CONTEXT = 3;
    public static final int ENGINE_CONFIG_INVALID_NATIVE_LIB_PATH = 2;
    public static final int ENGINE_CONFIG_VALID = 0;

    public static int checkValid(EngineConfig engineConfig) {
        if (TextUtils.isEmpty(engineConfig.appID)) {
            return 1;
        }
        if (!TextUtils.isEmpty(engineConfig.nativeLoadPath)) {
            File file = new File(engineConfig.nativeLoadPath);
            if (!file.exists() || !file.isDirectory()) {
                return 2;
            }
        }
        return engineConfig.context == null ? 3 : 0;
    }
}
