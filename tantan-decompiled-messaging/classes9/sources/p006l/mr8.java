package p006l;

import l.bs5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mr8 {

    /* JADX INFO: renamed from: b */
    public static mr8 f17204b;

    /* JADX INFO: renamed from: a */
    public bs5 f17205a = new bs5();

    /* JADX INFO: renamed from: b */
    public static mr8 m19501b() {
        if (f17204b == null) {
            synchronized (mr8.class) {
                try {
                    if (f17204b == null) {
                        f17204b = new mr8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17204b;
    }

    /* JADX INFO: renamed from: a */
    public void m19502a() {
        this.f17205a.c();
    }

    /* JADX INFO: renamed from: c */
    public void m19503c() {
    }
}
