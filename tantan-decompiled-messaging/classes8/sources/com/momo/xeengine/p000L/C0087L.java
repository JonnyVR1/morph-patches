package com.momo.xeengine.p000L;

import androidx.annotation.Keep;

/* JADX INFO: renamed from: com.momo.xeengine.L.L */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class C0087L {
    /* JADX INFO: renamed from: M */
    public static boolean m494M(Object obj) {
        return SDKLicenseManager.getInstance().isLicenseValid();
    }

    /* JADX INFO: renamed from: N */
    public static void m495N(String str) {
        SDKLicenseManager.getInstance().setAppID(str);
    }
}
