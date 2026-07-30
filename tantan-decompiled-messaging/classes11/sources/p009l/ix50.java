package p009l;

import com.p1.mobile.putong.data.RememberUserInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ix50 {

    /* JADX INFO: renamed from: a */
    public static volatile ix50 f14849a;

    /* JADX INFO: renamed from: b */
    public static ix50 m16780b() {
        if (f14849a == null) {
            synchronized (ix50.class) {
                try {
                    if (f14849a == null) {
                        f14849a = new ix50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14849a;
    }

    /* JADX INFO: renamed from: a */
    public void m16781a() {
    }

    /* JADX INFO: renamed from: c */
    public void m16782c(RememberUserInfo rememberUserInfo) {
    }
}
