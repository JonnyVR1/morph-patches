package p149l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class vww0 {

    /* JADX INFO: renamed from: b */
    public static final vww0 f183396b = new vww0();

    /* JADX INFO: renamed from: c */
    public static final uww0 f183397c = new uww0(null);

    /* JADX INFO: renamed from: a */
    public final AtomicReference f183398a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static vww0 m200458a() {
        return f183396b;
    }

    /* JADX INFO: renamed from: b */
    public final j1x0 m200459b() {
        j1x0 j1x0Var = (j1x0) this.f183398a.get();
        return j1x0Var == null ? f183397c : j1x0Var;
    }
}
