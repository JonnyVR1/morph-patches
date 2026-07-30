package p153l;

import com.p051p1.mobile.putong.data.RememberUserInfo;

/* JADX INFO: loaded from: classes10.dex */
public class o560 {

    /* JADX INFO: renamed from: a */
    public static volatile o560 f145035a;

    /* JADX INFO: renamed from: b */
    public static o560 m166092b() {
        if (f145035a == null) {
            synchronized (o560.class) {
                try {
                    if (f145035a == null) {
                        f145035a = new o560();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f145035a;
    }

    /* JADX INFO: renamed from: a */
    public void m166093a() {
    }

    /* JADX INFO: renamed from: c */
    public void m166094c(RememberUserInfo rememberUserInfo) {
    }
}
