package p153l;

import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class lj1 {

    /* JADX INFO: renamed from: b */
    public static volatile lj1 f132290b;

    /* JADX INFO: renamed from: a */
    public final C22507a<uxj0> f132291a = C22507a.m222759c(uxj0.f181467a);

    /* JADX INFO: renamed from: b */
    public static lj1 m154454b() {
        if (f132290b == null) {
            synchronized (lj1.class) {
                try {
                    if (f132290b == null) {
                        f132290b = new lj1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f132290b;
    }

    /* JADX INFO: renamed from: a */
    public C22507a<uxj0> m154455a() {
        return this.f132291a;
    }
}
