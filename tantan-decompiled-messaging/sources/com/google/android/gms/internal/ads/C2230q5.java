package com.google.android.gms.internal.ads;

import p149l.d8x0;
import p149l.zax0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q5 */
/* JADX INFO: loaded from: classes6.dex */
public class C2230q5 {

    /* JADX INFO: renamed from: c */
    public static final d8x0 f10026c = d8x0.f84914c;

    /* JADX INFO: renamed from: a */
    public volatile zax0 f10027a;

    /* JADX INFO: renamed from: b */
    public volatile zzgyl f10028b;

    /* JADX INFO: renamed from: a */
    public final int m13209a() {
        if (this.f10028b != null) {
            return ((zzgyh) this.f10028b).zza.length;
        }
        if (this.f10027a != null) {
            return this.f10027a.zzaz();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final zzgyl m13210b() {
        if (this.f10028b != null) {
            return this.f10028b;
        }
        synchronized (this) {
            try {
                if (this.f10028b != null) {
                    return this.f10028b;
                }
                if (this.f10027a == null) {
                    this.f10028b = zzgyl.zzb;
                } else {
                    this.f10028b = this.f10027a.mo12742c();
                }
                return this.f10028b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13211c(zax0 zax0Var) {
        if (this.f10027a != null) {
            return;
        }
        synchronized (this) {
            if (this.f10027a != null) {
                return;
            }
            try {
                this.f10027a = zax0Var;
                this.f10028b = zzgyl.zzb;
            } catch (zzhag unused) {
                this.f10027a = zax0Var;
                this.f10028b = zzgyl.zzb;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2230q5)) {
            return false;
        }
        C2230q5 c2230q5 = (C2230q5) obj;
        zax0 zax0Var = this.f10027a;
        zax0 zax0Var2 = c2230q5.f10027a;
        if (zax0Var == null && zax0Var2 == null) {
            return m13210b().equals(c2230q5.m13210b());
        }
        if (zax0Var != null && zax0Var2 != null) {
            return zax0Var.equals(zax0Var2);
        }
        if (zax0Var != null) {
            c2230q5.m13211c(zax0Var.mo13182a());
            return zax0Var.equals(c2230q5.f10027a);
        }
        m13211c(zax0Var2.mo13182a());
        return this.f10027a.equals(zax0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
