package com.google.android.gms.internal.ads;

import java.io.IOException;
import p149l.d8x0;
import p149l.e8x0;
import p149l.i8x0;
import p149l.icx0;
import p149l.jcx0;
import p149l.kbx0;
import p149l.obx0;
import p149l.ubx0;
import p149l.x6x0;
import p149l.z7x0;
import p149l.zax0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2254t5 implements obx0 {

    /* JADX INFO: renamed from: a */
    public final zax0 f10067a;

    /* JADX INFO: renamed from: b */
    public final icx0 f10068b;

    /* JADX INFO: renamed from: c */
    public final boolean f10069c;

    /* JADX INFO: renamed from: d */
    public final e8x0 f10070d;

    public C2254t5(icx0 icx0Var, e8x0 e8x0Var, zax0 zax0Var) {
        this.f10068b = icx0Var;
        this.f10069c = e8x0Var.mo115314h(zax0Var);
        this.f10070d = e8x0Var;
        this.f10067a = zax0Var;
    }

    /* JADX INFO: renamed from: g */
    public static C2254t5 m13328g(icx0 icx0Var, e8x0 e8x0Var, zax0 zax0Var) {
        return new C2254t5(icx0Var, e8x0Var, zax0Var);
    }

    @Override // p149l.obx0
    /* JADX INFO: renamed from: a */
    public final void mo13284a(Object obj) {
        this.f10068b.mo13473m(obj);
        this.f10070d.mo115311e(obj);
    }

    @Override // p149l.obx0
    /* JADX INFO: renamed from: b */
    public final boolean mo13285b(Object obj, Object obj2) {
        icx0 icx0Var = this.f10068b;
        if (!icx0Var.mo13464d(obj).equals(icx0Var.mo13464d(obj2))) {
            return false;
        }
        if (!this.f10069c) {
            return true;
        }
        this.f10070d.mo115307a(obj);
        this.f10070d.mo115307a(obj2);
        throw null;
    }

    @Override // p149l.obx0
    /* JADX INFO: renamed from: c */
    public final boolean mo13286c(Object obj) {
        this.f10070d.mo115307a(obj);
        throw null;
    }

    @Override // p149l.obx0
    /* JADX INFO: renamed from: d */
    public final void mo13287d(Object obj, byte[] bArr, int i, int i2, x6x0 x6x0Var) throws IOException {
        AbstractC2222p5 abstractC2222p5 = (AbstractC2222p5) obj;
        if (abstractC2222p5.zzc == jcx0.m140997c()) {
            abstractC2222p5.zzc = jcx0.m140999f();
        }
        throw null;
    }

    @Override // p149l.obx0
    /* JADX INFO: renamed from: e */
    public final void mo13288e(Object obj, z7x0 z7x0Var) throws IOException {
        this.f10070d.mo115307a(obj);
        throw null;
    }

    @Override // p149l.obx0
    /* JADX INFO: renamed from: f */
    public final void mo13289f(Object obj, kbx0 kbx0Var, d8x0 d8x0Var) throws IOException {
        boolean zZzO;
        icx0 icx0Var = this.f10068b;
        Object objMo13463c = icx0Var.mo13463c(obj);
        e8x0 e8x0Var = this.f10070d;
        i8x0 i8x0VarMo115308b = e8x0Var.mo115308b(obj);
        while (kbx0Var.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = kbx0Var.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objMo115309c = e8x0Var.mo115309c(d8x0Var, this.f10067a, iZzd >>> 3);
                        if (objMo115309c != null) {
                            e8x0Var.mo115312f(kbx0Var, objMo115309c, d8x0Var, i8x0VarMo115308b);
                        } else {
                            zZzO = icx0Var.m135371p(objMo13463c, kbx0Var);
                        }
                    } else {
                        zZzO = kbx0Var.zzO();
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    Object objMo115309c2 = null;
                    int iZzj = 0;
                    zzgyl zzgylVarZzp = null;
                    while (kbx0Var.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = kbx0Var.zzd();
                        if (iZzd2 == 16) {
                            iZzj = kbx0Var.zzj();
                            objMo115309c2 = e8x0Var.mo115309c(d8x0Var, this.f10067a, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objMo115309c2 != null) {
                                e8x0Var.mo115312f(kbx0Var, objMo115309c2, d8x0Var, i8x0VarMo115308b);
                            } else {
                                zzgylVarZzp = kbx0Var.zzp();
                            }
                        } else if (!kbx0Var.zzO()) {
                            break;
                        }
                    }
                    if (kbx0Var.zzd() != 12) {
                        throw zzhag.zzb();
                    }
                    if (zzgylVarZzp != null) {
                        if (objMo115309c2 != null) {
                            e8x0Var.mo115313g(zzgylVarZzp, objMo115309c2, d8x0Var, i8x0VarMo115308b);
                        } else {
                            icx0Var.mo13471k(objMo13463c, iZzj, zzgylVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                icx0Var.mo13474n(obj, objMo13463c);
                throw th;
            }
        }
        icx0Var.mo13474n(obj, objMo13463c);
    }

    @Override // p149l.obx0
    public final int zza(Object obj) {
        icx0 icx0Var = this.f10068b;
        int iMo13462b = icx0Var.mo13462b(icx0Var.mo13464d(obj));
        if (!this.f10069c) {
            return iMo13462b;
        }
        this.f10070d.mo115307a(obj);
        throw null;
    }

    @Override // p149l.obx0
    public final int zzb(Object obj) {
        int iHashCode = this.f10068b.mo13464d(obj).hashCode();
        if (!this.f10069c) {
            return iHashCode;
        }
        this.f10070d.mo115307a(obj);
        throw null;
    }

    @Override // p149l.obx0
    public final Object zze() {
        zax0 zax0Var = this.f10067a;
        return zax0Var instanceof AbstractC2222p5 ? ((AbstractC2222p5) zax0Var).m13188m() : zax0Var.mo13184e().mo153516I();
    }

    @Override // p149l.obx0
    public final void zzg(Object obj, Object obj2) {
        ubx0.m192970x(this.f10068b, obj, obj2);
        if (this.f10069c) {
            this.f10070d.mo115307a(obj2);
            throw null;
        }
    }
}
