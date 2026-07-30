package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p149l.bjx0;
import p149l.erx0;
import p149l.irx0;
import p149l.itx0;
import p149l.oox0;
import p149l.qkq0;
import p149l.sgw0;
import p149l.smx0;
import p149l.t9x0;
import p149l.y5x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2390i0 implements oox0 {

    /* JADX INFO: renamed from: a */
    public final smx0 f10347a;

    /* JADX INFO: renamed from: b */
    public final erx0 f10348b;

    /* JADX INFO: renamed from: c */
    public final boolean f10349c;

    /* JADX INFO: renamed from: d */
    public final y5x0 f10350d;

    public C2390i0(erx0 erx0Var, y5x0 y5x0Var, smx0 smx0Var) {
        this.f10348b = erx0Var;
        this.f10349c = smx0Var instanceof AbstractC2378c0;
        this.f10350d = y5x0Var;
        this.f10347a = smx0Var;
    }

    /* JADX INFO: renamed from: f */
    public static C2390i0 m14830f(erx0 erx0Var, y5x0 y5x0Var, smx0 smx0Var) {
        return new C2390i0(erx0Var, y5x0Var, smx0Var);
    }

    @Override // p149l.oox0
    /* JADX INFO: renamed from: a */
    public final void mo14814a(Object obj) {
        this.f10348b.mo14862a(obj);
        this.f10350d.mo14750a(obj);
    }

    @Override // p149l.oox0
    /* JADX INFO: renamed from: b */
    public final boolean mo14815b(Object obj, Object obj2) {
        if (!((AbstractC2380d0) obj).zzc.equals(((AbstractC2380d0) obj2).zzc)) {
            return false;
        }
        if (this.f10349c) {
            return ((AbstractC2378c0) obj).zzb.equals(((AbstractC2378c0) obj2).zzb);
        }
        return true;
    }

    @Override // p149l.oox0
    /* JADX INFO: renamed from: c */
    public final boolean mo14816c(Object obj) {
        return ((AbstractC2378c0) obj).zzb.m183126h();
    }

    @Override // p149l.oox0
    /* JADX INFO: renamed from: d */
    public final void mo14817d(Object obj, byte[] bArr, int i, int i2, sgw0 sgw0Var) throws IOException {
        AbstractC2380d0 abstractC2380d0 = (AbstractC2380d0) obj;
        if (abstractC2380d0.zzc == irx0.m137921c()) {
            abstractC2380d0.zzc = irx0.m137923f();
        }
        throw null;
    }

    @Override // p149l.oox0
    /* JADX INFO: renamed from: e */
    public final void mo14818e(Object obj, itx0 itx0Var) throws IOException {
        Iterator itM183123e = ((AbstractC2378c0) obj).zzb.m183123e();
        while (itM183123e.hasNext()) {
            Map.Entry entry = (Map.Entry) itM183123e.next();
            t9x0 t9x0Var = (t9x0) entry.getKey();
            if (t9x0Var.zzc() != zzjv.MESSAGE || t9x0Var.zze() || t9x0Var.zzd()) {
                qkq0.m175383a("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof bjx0) {
                itx0Var.mo138311x(t9x0Var.zza(), ((bjx0) entry).m102243a().m14786b());
            } else {
                itx0Var.mo138311x(t9x0Var.zza(), entry.getValue());
            }
        }
        ((AbstractC2380d0) obj).zzc.m137931k(itx0Var);
    }

    @Override // p149l.oox0
    public final int zza(Object obj) {
        int iM137925b = ((AbstractC2380d0) obj).zzc.m137925b();
        return this.f10349c ? iM137925b + ((AbstractC2378c0) obj).zzb.m183122c() : iM137925b;
    }

    @Override // p149l.oox0
    public final int zzb(Object obj) {
        int iHashCode = ((AbstractC2380d0) obj).zzc.hashCode();
        return this.f10349c ? (iHashCode * 53) + ((AbstractC2378c0) obj).zzb.f163460a.hashCode() : iHashCode;
    }

    @Override // p149l.oox0
    public final Object zze() {
        smx0 smx0Var = this.f10347a;
        return smx0Var instanceof AbstractC2380d0 ? ((AbstractC2380d0) smx0Var).m14773m() : smx0Var.mo14774p().zzh();
    }

    @Override // p149l.oox0
    public final void zzg(Object obj, Object obj2) {
        C2392j0.m14856u(this.f10348b, obj, obj2);
        if (this.f10349c) {
            C2392j0.m14855t(this.f10350d, obj, obj2);
        }
    }
}
