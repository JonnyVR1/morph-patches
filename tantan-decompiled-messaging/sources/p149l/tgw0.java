package p149l;

import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class tgw0<V> {

    /* JADX INFO: renamed from: g */
    public static final Object f170137g = new Object();

    /* JADX INFO: renamed from: a */
    public final String f170138a;

    /* JADX INFO: renamed from: b */
    public final hfw0<V> f170139b;

    /* JADX INFO: renamed from: c */
    public final V f170140c;

    /* JADX INFO: renamed from: d */
    public final Object f170141d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("overrideLock")
    public volatile V f170142e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("cachingLock")
    public volatile V f170143f;

    public tgw0(String str, V v2, V v3, hfw0<V> hfw0Var) {
        this.f170141d = new Object();
        this.f170142e = null;
        this.f170143f = null;
        this.f170138a = str;
        this.f170140c = v2;
        this.f170139b = hfw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final V m188827a(V v2) {
        synchronized (this.f170141d) {
        }
        if (v2 != null) {
            return v2;
        }
        if (kiw0.f123416a == null) {
            return this.f170140c;
        }
        synchronized (f170137g) {
            try {
                if (t2r0.m187058a()) {
                    return this.f170143f == null ? this.f170140c : this.f170143f;
                }
                try {
                    for (tgw0 tgw0Var : q8s0.f153268a) {
                        if (t2r0.m187058a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        V vZza = null;
                        try {
                            hfw0<V> hfw0Var = tgw0Var.f170139b;
                            if (hfw0Var != null) {
                                vZza = hfw0Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f170137g) {
                            tgw0Var.f170143f = vZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                hfw0<V> hfw0Var2 = this.f170139b;
                if (hfw0Var2 == null) {
                    return this.f170140c;
                }
                try {
                    return hfw0Var2.zza();
                } catch (IllegalStateException unused3) {
                    return this.f170140c;
                } catch (SecurityException unused4) {
                    return this.f170140c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m188828b() {
        return this.f170138a;
    }
}
