package p149l;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;

/* JADX INFO: loaded from: classes6.dex */
public class mwx0 {

    /* JADX INFO: renamed from: a */
    public volatile g0y0 f136096a;

    /* JADX INFO: renamed from: b */
    public volatile zzik f136097b;

    /* JADX INFO: renamed from: a */
    public final int m156776a() {
        if (this.f136097b != null) {
            return this.f136097b.zzb();
        }
        if (this.f136096a != null) {
            return this.f136096a.mo14354P();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final g0y0 m156777b(g0y0 g0y0Var) {
        g0y0 g0y0Var2 = this.f136096a;
        this.f136097b = null;
        this.f136096a = g0y0Var;
        return g0y0Var2;
    }

    /* JADX INFO: renamed from: c */
    public final zzik m156778c() {
        if (this.f136097b != null) {
            return this.f136097b;
        }
        synchronized (this) {
            try {
                if (this.f136097b != null) {
                    return this.f136097b;
                }
                if (this.f136096a == null) {
                    this.f136097b = zzik.zza;
                } else {
                    this.f136097b = this.f136096a.mo14250O();
                }
                return this.f136097b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final g0y0 m156779d(g0y0 g0y0Var) {
        if (this.f136096a == null) {
            synchronized (this) {
                if (this.f136096a == null) {
                    try {
                        this.f136096a = g0y0Var;
                        this.f136097b = zzik.zza;
                    } catch (zzkb unused) {
                        this.f136096a = g0y0Var;
                        this.f136097b = zzik.zza;
                    }
                }
            }
        }
        return this.f136096a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwx0)) {
            return false;
        }
        mwx0 mwx0Var = (mwx0) obj;
        g0y0 g0y0Var = this.f136096a;
        g0y0 g0y0Var2 = mwx0Var.f136096a;
        if (g0y0Var == null && g0y0Var2 == null) {
            return m156778c().equals(mwx0Var.m156778c());
        }
        if (g0y0Var == null || g0y0Var2 == null) {
            return g0y0Var != null ? g0y0Var.equals(mwx0Var.m156779d(g0y0Var.mo14359b())) : m156779d(g0y0Var2.mo14359b()).equals(g0y0Var2);
        }
        return g0y0Var.equals(g0y0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
