package com.momo.xeengine.p043L;

import androidx.annotation.Keep;

/* JADX INFO: renamed from: com.momo.xeengine.L.L */
/* JADX INFO: loaded from: classes8.dex */
@Keep
public class C4175L {
    /* JADX INFO: renamed from: M */
    public static boolean m20223M(Object obj) {
        return SDKLicenseManager.getInstance().isLicenseValid();
    }

    /* JADX INFO: renamed from: N */
    public static void m20224N(String str) {
        SDKLicenseManager.getInstance().setAppID(str);
    }
}
