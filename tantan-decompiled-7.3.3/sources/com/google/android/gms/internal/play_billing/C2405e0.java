package com.google.android.gms.internal.play_billing;

import p153l.yvx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0 */
/* JADX INFO: loaded from: classes6.dex */
public class C2405e0 {

    /* JADX INFO: renamed from: a */
    public volatile yvx0 f10352a;

    /* JADX INFO: renamed from: b */
    public volatile zzgk f10353b;

    /* JADX INFO: renamed from: a */
    public final int m14839a() {
        if (this.f10353b != null) {
            return ((zzgi) this.f10353b).zza.length;
        }
        if (this.f10352a != null) {
            return this.f10352a.zzk();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final zzgk m14840b() {
        if (this.f10353b != null) {
            return this.f10353b;
        }
        synchronized (this) {
            try {
                if (this.f10353b != null) {
                    return this.f10353b;
                }
                if (this.f10352a == null) {
                    this.f10353b = zzgk.zzb;
                } else {
                    this.f10353b = this.f10352a.zzf();
                }
                return this.f10353b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final yvx0 m14841c(yvx0 yvx0Var) {
        yvx0 yvx0Var2 = this.f10352a;
        this.f10353b = null;
        this.f10352a = yvx0Var;
        return yvx0Var2;
    }

    /* JADX INFO: renamed from: d */
    public final void m14842d(yvx0 yvx0Var) {
        if (this.f10352a != null) {
            return;
        }
        synchronized (this) {
            if (this.f10352a != null) {
                return;
            }
            try {
                this.f10352a = yvx0Var;
                this.f10353b = zzgk.zzb;
            } catch (zzhr unused) {
                this.f10352a = yvx0Var;
                this.f10353b = zzgk.zzb;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2405e0)) {
            return false;
        }
        C2405e0 c2405e0 = (C2405e0) obj;
        yvx0 yvx0Var = this.f10352a;
        yvx0 yvx0Var2 = c2405e0.f10352a;
        if (yvx0Var == null && yvx0Var2 == null) {
            return m14840b().equals(c2405e0.m14840b());
        }
        if (yvx0Var != null && yvx0Var2 != null) {
            return yvx0Var.equals(yvx0Var2);
        }
        if (yvx0Var != null) {
            c2405e0.m14842d(yvx0Var.zzi());
            return yvx0Var.equals(c2405e0.f10352a);
        }
        m14842d(yvx0Var2.zzi());
        return this.f10352a.equals(yvx0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
