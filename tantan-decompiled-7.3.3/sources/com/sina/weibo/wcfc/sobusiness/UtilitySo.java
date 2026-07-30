package com.sina.weibo.wcfc.sobusiness;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class UtilitySo {
    private static UtilitySo sInstance;

    static {
        try {
            System.loadLibrary("utility");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private UtilitySo() {
    }

    public static synchronized UtilitySo getInstance() {
        try {
            if (sInstance == null) {
                sInstance = new UtilitySo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    public native String calculateS(Context context, String str);

    public native String generateCheckToken(Context context, String str, String str2);

    public native String getDecryptionString(Context context, String str);

    public native String getIValue(Context context, String str);
}
