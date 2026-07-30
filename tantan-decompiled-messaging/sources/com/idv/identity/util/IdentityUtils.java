package com.idv.identity.util;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityUtils {
    private static IdentityUtils s_instance;

    static {
        System.loadLibrary("identityutils");
        s_instance = new IdentityUtils();
    }

    public static native String cpm(byte[] bArr, int i);

    public static native String gdsk();

    public static IdentityUtils getInstance() {
        return s_instance;
    }

    /* JADX INFO: renamed from: gk */
    public static native String m18162gk();

    /* JADX INFO: renamed from: gs */
    public static native String m18163gs(String str);

    /* JADX INFO: renamed from: sd */
    public static native String m18164sd(byte[] bArr, String str);

    /* JADX INFO: renamed from: se */
    public static native String m18165se(byte[] bArr, String str);
}
