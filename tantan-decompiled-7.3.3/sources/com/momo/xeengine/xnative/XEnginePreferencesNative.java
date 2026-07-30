package com.momo.xeengine.xnative;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public abstract class XEnginePreferencesNative {
    public static native long getEngineSoArchiveTime();

    public static native boolean nativeCheckLicense();

    public static native boolean nativeSetLicense(String str);
}
