package p153l;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;

/* JADX INFO: loaded from: classes6.dex */
public class s5y0 {

    /* JADX INFO: renamed from: a */
    public volatile m9y0 f166526a;

    /* JADX INFO: renamed from: b */
    public volatile zzik f166527b;

    /* JADX INFO: renamed from: a */
    public final int m184831a() {
        if (this.f166527b != null) {
            return this.f166527b.zzb();
        }
        if (this.f166526a != null) {
            return this.f166526a.mo14408P();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final m9y0 m184832b(m9y0 m9y0Var) {
        m9y0 m9y0Var2 = this.f166526a;
        this.f166527b = null;
        this.f166526a = m9y0Var;
        return m9y0Var2;
    }

    /* JADX INFO: renamed from: c */
    public final zzik m184833c() {
        if (this.f166527b != null) {
            return this.f166527b;
        }
        synchronized (this) {
            try {
                if (this.f166527b != null) {
                    return this.f166527b;
                }
                if (this.f166526a == null) {
                    this.f166527b = zzik.zza;
                } else {
                    this.f166527b = this.f166526a.mo14304O();
                }
                return this.f166527b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final m9y0 m184834d(m9y0 m9y0Var) {
        if (this.f166526a == null) {
            synchronized (this) {
                if (this.f166526a == null) {
                    try {
                        this.f166526a = m9y0Var;
                        this.f166527b = zzik.zza;
                    } catch (zzkb unused) {
                        this.f166526a = m9y0Var;
                        this.f166527b = zzik.zza;
                    }
                }
            }
        }
        return this.f166526a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5y0)) {
            return false;
        }
        s5y0 s5y0Var = (s5y0) obj;
        m9y0 m9y0Var = this.f166526a;
        m9y0 m9y0Var2 = s5y0Var.f166526a;
        if (m9y0Var == null && m9y0Var2 == null) {
            return m184833c().equals(s5y0Var.m184833c());
        }
        if (m9y0Var == null || m9y0Var2 == null) {
            return m9y0Var != null ? m9y0Var.equals(s5y0Var.m184834d(m9y0Var.mo14413b())) : m184834d(m9y0Var2.mo14413b()).equals(m9y0Var2);
        }
        return m9y0Var.equals(m9y0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
