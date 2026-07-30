package p006l;

import l.roj0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ej1 {

    /* JADX INFO: renamed from: b */
    public static volatile ej1 f11173b;

    /* JADX INFO: renamed from: a */
    public final a<roj0> f11174a = a.c(roj0.a);

    /* JADX INFO: renamed from: b */
    public static ej1 m14552b() {
        if (f11173b == null) {
            synchronized (ej1.class) {
                try {
                    if (f11173b == null) {
                        f11173b = new ej1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11173b;
    }

    /* JADX INFO: renamed from: a */
    public a<roj0> m14553a() {
        return this.f11174a;
    }
}
