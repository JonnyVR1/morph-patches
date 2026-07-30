package p153l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class b6x0 {

    /* JADX INFO: renamed from: b */
    public static final b6x0 f75227b = new b6x0();

    /* JADX INFO: renamed from: c */
    public static final a6x0 f75228c = new a6x0(null);

    /* JADX INFO: renamed from: a */
    public final AtomicReference f75229a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static b6x0 m102798a() {
        return f75227b;
    }

    /* JADX INFO: renamed from: b */
    public final pax0 m102799b() {
        pax0 pax0Var = (pax0) this.f75229a.get();
        return pax0Var == null ? f75228c : pax0Var;
    }
}
