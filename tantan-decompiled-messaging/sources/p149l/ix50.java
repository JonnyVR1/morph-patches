package p149l;

import com.p046p1.mobile.putong.data.RememberUserInfo;

/* JADX INFO: loaded from: classes11.dex */
public class ix50 {

    /* JADX INFO: renamed from: a */
    public static volatile ix50 f115331a;

    /* JADX INFO: renamed from: b */
    public static ix50 m138790b() {
        if (f115331a == null) {
            synchronized (ix50.class) {
                try {
                    if (f115331a == null) {
                        f115331a = new ix50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f115331a;
    }

    /* JADX INFO: renamed from: a */
    public void m138791a() {
    }

    /* JADX INFO: renamed from: c */
    public void m138792c(RememberUserInfo rememberUserInfo) {
    }
}
