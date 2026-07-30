package com.immomo.momosec.jni;

/* JADX INFO: loaded from: classes7.dex */
public class MNative {
    private static MNative instance;

    static {
        System.loadLibrary("message_crypto_android");
    }

    private MNative() {
    }

    /* JADX INFO: renamed from: b */
    public static MNative m19294b() {
        MNative mNative;
        synchronized (MNative.class) {
            try {
                if (instance == null) {
                    instance = new MNative();
                }
                mNative = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mNative;
    }

    /* JADX INFO: renamed from: a */
    public native String m19295a(String str, String str2, String str3);

    public native String a49kdEba83(String str, String str2);

    public native String a4YB80f4Zo(String str, String str2, int i);

    public native String a9ehcDdu3j(String str, String str2);

    public native String ec08UzcIZd(String str, int i);

    public native String ecdsaSign(String str);

    public native String en45Qw12Rt(String str);

    /* JADX INFO: renamed from: h */
    public native String m19296h(String str, String str2);

    /* JADX INFO: renamed from: m */
    public native String m19297m(String str, String str2);

    /* JADX INFO: renamed from: o */
    public native String m19298o();
}
