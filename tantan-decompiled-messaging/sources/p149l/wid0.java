package p149l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class wid0 {
    private static final wid0 INSTANCE = new wid0();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<xid0> f186523a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public static wid0 m203318a() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public xid0 m203319b() {
        if (this.f186523a.get() == null) {
            f31.m119248a(this.f186523a, null, xid0.m209635a());
        }
        return this.f186523a.get();
    }
}
