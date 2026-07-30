package p149l;

import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class ej1 {

    /* JADX INFO: renamed from: b */
    public static volatile ej1 f91656b;

    /* JADX INFO: renamed from: a */
    public final C22392a<roj0> f91657a = C22392a.m221513c(roj0.f160388a);

    /* JADX INFO: renamed from: b */
    public static ej1 m116750b() {
        if (f91656b == null) {
            synchronized (ej1.class) {
                try {
                    if (f91656b == null) {
                        f91656b = new ej1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f91656b;
    }

    /* JADX INFO: renamed from: a */
    public C22392a<roj0> m116751a() {
        return this.f91657a;
    }
}
