package com.google.android.gms.internal.ads;

import java.io.IOException;
import p153l.alx0;
import p153l.dgx0;
import p153l.fhx0;
import p153l.fkx0;
import p153l.jhx0;
import p153l.khx0;
import p153l.ohx0;
import p153l.olx0;
import p153l.plx0;
import p153l.qkx0;
import p153l.ukx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2277t5 implements ukx0 {

    /* JADX INFO: renamed from: a */
    public final fkx0 f10104a;

    /* JADX INFO: renamed from: b */
    public final olx0 f10105b;

    /* JADX INFO: renamed from: c */
    public final boolean f10106c;

    /* JADX INFO: renamed from: d */
    public final khx0 f10107d;

    public C2277t5(olx0 olx0Var, khx0 khx0Var, fkx0 fkx0Var) {
        this.f10105b = olx0Var;
        this.f10106c = khx0Var.mo149840h(fkx0Var);
        this.f10107d = khx0Var;
        this.f10104a = fkx0Var;
    }

    /* JADX INFO: renamed from: g */
    public static C2277t5 m13382g(olx0 olx0Var, khx0 khx0Var, fkx0 fkx0Var) {
        return new C2277t5(olx0Var, khx0Var, fkx0Var);
    }

    @Override // p153l.ukx0
    /* JADX INFO: renamed from: a */
    public final void mo13338a(Object obj) {
        this.f10105b.mo13527m(obj);
        this.f10107d.mo149837e(obj);
    }

    @Override // p153l.ukx0
    /* JADX INFO: renamed from: b */
    public final boolean mo13339b(Object obj, Object obj2) {
        olx0 olx0Var = this.f10105b;
        if (!olx0Var.mo13518d(obj).equals(olx0Var.mo13518d(obj2))) {
            return false;
        }
        if (!this.f10106c) {
            return true;
        }
        this.f10107d.mo149833a(obj);
        this.f10107d.mo149833a(obj2);
        throw null;
    }

    @Override // p153l.ukx0
    /* JADX INFO: renamed from: c */
    public final boolean mo13340c(Object obj) {
        this.f10107d.mo149833a(obj);
        throw null;
    }

    @Override // p153l.ukx0
    /* JADX INFO: renamed from: d */
    public final void mo13341d(Object obj, byte[] bArr, int i, int i2, dgx0 dgx0Var) throws IOException {
        AbstractC2245p5 abstractC2245p5 = (AbstractC2245p5) obj;
        if (abstractC2245p5.zzc == plx0.m172889c()) {
            abstractC2245p5.zzc = plx0.m172891f();
        }
        throw null;
    }

    @Override // p153l.ukx0
    /* JADX INFO: renamed from: e */
    public final void mo13342e(Object obj, fhx0 fhx0Var) throws IOException {
        this.f10107d.mo149833a(obj);
        throw null;
    }

    @Override // p153l.ukx0
    /* JADX INFO: renamed from: f */
    public final void mo13343f(Object obj, qkx0 qkx0Var, jhx0 jhx0Var) throws IOException {
        boolean zZzO;
        olx0 olx0Var = this.f10105b;
        Object objMo13517c = olx0Var.mo13517c(obj);
        khx0 khx0Var = this.f10107d;
        ohx0 ohx0VarMo149834b = khx0Var.mo149834b(obj);
        while (qkx0Var.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = qkx0Var.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objMo149835c = khx0Var.mo149835c(jhx0Var, this.f10104a, iZzd >>> 3);
                        if (objMo149835c != null) {
                            khx0Var.mo149838f(qkx0Var, objMo149835c, jhx0Var, ohx0VarMo149834b);
                        } else {
                            zZzO = olx0Var.m168175p(objMo13517c, qkx0Var);
                        }
                    } else {
                        zZzO = qkx0Var.zzO();
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    Object objMo149835c2 = null;
                    int iZzj = 0;
                    zzgyl zzgylVarZzp = null;
                    while (qkx0Var.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = qkx0Var.zzd();
                        if (iZzd2 == 16) {
                            iZzj = qkx0Var.zzj();
                            objMo149835c2 = khx0Var.mo149835c(jhx0Var, this.f10104a, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objMo149835c2 != null) {
                                khx0Var.mo149838f(qkx0Var, objMo149835c2, jhx0Var, ohx0VarMo149834b);
                            } else {
                                zzgylVarZzp = qkx0Var.zzp();
                            }
                        } else if (!qkx0Var.zzO()) {
                            break;
                        }
                    }
                    if (qkx0Var.zzd() != 12) {
                        throw zzhag.zzb();
                    }
                    if (zzgylVarZzp != null) {
                        if (objMo149835c2 != null) {
                            khx0Var.mo149839g(zzgylVarZzp, objMo149835c2, jhx0Var, ohx0VarMo149834b);
                        } else {
                            olx0Var.mo13525k(objMo13517c, iZzj, zzgylVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                olx0Var.mo13528n(obj, objMo13517c);
                throw th;
            }
        }
        olx0Var.mo13528n(obj, objMo13517c);
    }

    @Override // p153l.ukx0
    public final int zza(Object obj) {
        olx0 olx0Var = this.f10105b;
        int iMo13516b = olx0Var.mo13516b(olx0Var.mo13518d(obj));
        if (!this.f10106c) {
            return iMo13516b;
        }
        this.f10107d.mo149833a(obj);
        throw null;
    }

    @Override // p153l.ukx0
    public final int zzb(Object obj) {
        int iHashCode = this.f10105b.mo13518d(obj).hashCode();
        if (!this.f10106c) {
            return iHashCode;
        }
        this.f10107d.mo149833a(obj);
        throw null;
    }

    @Override // p153l.ukx0
    public final Object zze() {
        fkx0 fkx0Var = this.f10104a;
        return fkx0Var instanceof AbstractC2245p5 ? ((AbstractC2245p5) fkx0Var).m13242m() : fkx0Var.mo13238e().mo121087I();
    }

    @Override // p153l.ukx0
    public final void zzg(Object obj, Object obj2) {
        alx0.m98765x(this.f10105b, obj, obj2);
        if (this.f10106c) {
            this.f10107d.mo149833a(obj2);
            throw null;
        }
    }
}
