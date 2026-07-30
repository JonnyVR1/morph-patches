package com.google.android.gms.internal.ads;

import p153l.fkx0;
import p153l.jhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q5 */
/* JADX INFO: loaded from: classes6.dex */
public class C2253q5 {

    /* JADX INFO: renamed from: c */
    public static final jhx0 f10063c = jhx0.f121021c;

    /* JADX INFO: renamed from: a */
    public volatile fkx0 f10064a;

    /* JADX INFO: renamed from: b */
    public volatile zzgyl f10065b;

    /* JADX INFO: renamed from: a */
    public final int m13263a() {
        if (this.f10065b != null) {
            return ((zzgyh) this.f10065b).zza.length;
        }
        if (this.f10064a != null) {
            return this.f10064a.zzaz();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final zzgyl m13264b() {
        if (this.f10065b != null) {
            return this.f10065b;
        }
        synchronized (this) {
            try {
                if (this.f10065b != null) {
                    return this.f10065b;
                }
                if (this.f10064a == null) {
                    this.f10065b = zzgyl.zzb;
                } else {
                    this.f10065b = this.f10064a.mo12796c();
                }
                return this.f10065b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13265c(fkx0 fkx0Var) {
        if (this.f10064a != null) {
            return;
        }
        synchronized (this) {
            if (this.f10064a != null) {
                return;
            }
            try {
                this.f10064a = fkx0Var;
                this.f10065b = zzgyl.zzb;
            } catch (zzhag unused) {
                this.f10064a = fkx0Var;
                this.f10065b = zzgyl.zzb;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2253q5)) {
            return false;
        }
        C2253q5 c2253q5 = (C2253q5) obj;
        fkx0 fkx0Var = this.f10064a;
        fkx0 fkx0Var2 = c2253q5.f10064a;
        if (fkx0Var == null && fkx0Var2 == null) {
            return m13264b().equals(c2253q5.m13264b());
        }
        if (fkx0Var != null && fkx0Var2 != null) {
            return fkx0Var.equals(fkx0Var2);
        }
        if (fkx0Var != null) {
            c2253q5.m13265c(fkx0Var.mo13236a());
            return fkx0Var.equals(c2253q5.f10064a);
        }
        m13265c(fkx0Var2.mo13236a());
        return this.f10064a.equals(fkx0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
