package p153l;

import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class zpw0<V> {

    /* JADX INFO: renamed from: g */
    public static final Object f205539g = new Object();

    /* JADX INFO: renamed from: a */
    public final String f205540a;

    /* JADX INFO: renamed from: b */
    public final now0<V> f205541b;

    /* JADX INFO: renamed from: c */
    public final V f205542c;

    /* JADX INFO: renamed from: d */
    public final Object f205543d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("overrideLock")
    public volatile V f205544e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("cachingLock")
    public volatile V f205545f;

    public zpw0(String str, V v2, V v3, now0<V> now0Var) {
        this.f205543d = new Object();
        this.f205544e = null;
        this.f205545f = null;
        this.f205540a = str;
        this.f205542c = v2;
        this.f205541b = now0Var;
    }

    /* JADX INFO: renamed from: a */
    public final V m220931a(V v2) {
        synchronized (this.f205543d) {
        }
        if (v2 != null) {
            return v2;
        }
        if (qrw0.f159225a == null) {
            return this.f205542c;
        }
        synchronized (f205539g) {
            try {
                if (zbr0.m219217a()) {
                    return this.f205545f == null ? this.f205542c : this.f205545f;
                }
                try {
                    for (zpw0 zpw0Var : whs0.f189244a) {
                        if (zbr0.m219217a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        V vZza = null;
                        try {
                            now0<V> now0Var = zpw0Var.f205541b;
                            if (now0Var != null) {
                                vZza = now0Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f205539g) {
                            zpw0Var.f205545f = vZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                now0<V> now0Var2 = this.f205541b;
                if (now0Var2 == null) {
                    return this.f205542c;
                }
                try {
                    return now0Var2.zza();
                } catch (IllegalStateException unused3) {
                    return this.f205542c;
                } catch (SecurityException unused4) {
                    return this.f205542c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m220932b() {
        return this.f205540a;
    }
}
