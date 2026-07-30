package p153l;

import com.p051p1.mobile.putong.core.p058ui.match.C8619b;

/* JADX INFO: loaded from: classes12.dex */
public class k190 {

    /* JADX INFO: renamed from: g */
    public static k190 f123457g;

    /* JADX INFO: renamed from: a */
    public boolean f123458a = false;

    /* JADX INFO: renamed from: b */
    public boolean f123459b = false;

    /* JADX INFO: renamed from: c */
    public boolean f123460c = false;

    /* JADX INFO: renamed from: d */
    public boolean f123461d = false;

    /* JADX INFO: renamed from: e */
    public boolean f123462e = false;

    /* JADX INFO: renamed from: f */
    public boolean f123463f = false;

    /* JADX INFO: renamed from: a */
    public static k190 m147845a() {
        if (f123457g == null) {
            synchronized (C8619b.class) {
                try {
                    if (f123457g == null) {
                        f123457g = new k190();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f123457g;
    }

    /* JADX INFO: renamed from: b */
    public static void m147846b() {
        f123457g = null;
    }
}
