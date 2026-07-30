package com.google.android.gms.internal.play_billing;

import p149l.smx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0 */
/* JADX INFO: loaded from: classes6.dex */
public class C2382e0 {

    /* JADX INFO: renamed from: a */
    public volatile smx0 f10315a;

    /* JADX INFO: renamed from: b */
    public volatile zzgk f10316b;

    /* JADX INFO: renamed from: a */
    public final int m14785a() {
        if (this.f10316b != null) {
            return ((zzgi) this.f10316b).zza.length;
        }
        if (this.f10315a != null) {
            return this.f10315a.zzk();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final zzgk m14786b() {
        if (this.f10316b != null) {
            return this.f10316b;
        }
        synchronized (this) {
            try {
                if (this.f10316b != null) {
                    return this.f10316b;
                }
                if (this.f10315a == null) {
                    this.f10316b = zzgk.zzb;
                } else {
                    this.f10316b = this.f10315a.zzf();
                }
                return this.f10316b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final smx0 m14787c(smx0 smx0Var) {
        smx0 smx0Var2 = this.f10315a;
        this.f10316b = null;
        this.f10315a = smx0Var;
        return smx0Var2;
    }

    /* JADX INFO: renamed from: d */
    public final void m14788d(smx0 smx0Var) {
        if (this.f10315a != null) {
            return;
        }
        synchronized (this) {
            if (this.f10315a != null) {
                return;
            }
            try {
                this.f10315a = smx0Var;
                this.f10316b = zzgk.zzb;
            } catch (zzhr unused) {
                this.f10315a = smx0Var;
                this.f10316b = zzgk.zzb;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2382e0)) {
            return false;
        }
        C2382e0 c2382e0 = (C2382e0) obj;
        smx0 smx0Var = this.f10315a;
        smx0 smx0Var2 = c2382e0.f10315a;
        if (smx0Var == null && smx0Var2 == null) {
            return m14786b().equals(c2382e0.m14786b());
        }
        if (smx0Var != null && smx0Var2 != null) {
            return smx0Var.equals(smx0Var2);
        }
        if (smx0Var != null) {
            c2382e0.m14788d(smx0Var.zzi());
            return smx0Var.equals(c2382e0.f10315a);
        }
        m14788d(smx0Var2.zzi());
        return this.f10315a.equals(smx0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
