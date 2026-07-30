package p003l;

import java.util.concurrent.atomic.AtomicReference;
import l.f31;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class wid0 {
    private static final wid0 INSTANCE = new wid0();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<xid0> f8551a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public static wid0 m8561a() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public xid0 m8562b() {
        if (this.f8551a.get() == null) {
            f31.a(this.f8551a, (Object) null, xid0.m8704a());
        }
        return this.f8551a.get();
    }
}
