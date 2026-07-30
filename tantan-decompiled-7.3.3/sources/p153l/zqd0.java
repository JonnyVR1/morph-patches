package p153l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zqd0 {
    private static final zqd0 INSTANCE = new zqd0();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<ard0> f205607a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public static zqd0 m221008a() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public ard0 m221009b() {
        if (this.f205607a.get() == null) {
            m31.m156916a(this.f205607a, null, ard0.m99672a());
        }
        return this.f205607a.get();
    }
}
