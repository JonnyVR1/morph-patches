package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p153l.efx0;
import p153l.hsx0;
import p153l.k0y0;
import p153l.o0y0;
import p153l.o2y0;
import p153l.uxx0;
import p153l.wtq0;
import p153l.ypw0;
import p153l.yvx0;
import p153l.zix0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2413i0 implements uxx0 {

    /* JADX INFO: renamed from: a */
    public final yvx0 f10384a;

    /* JADX INFO: renamed from: b */
    public final k0y0 f10385b;

    /* JADX INFO: renamed from: c */
    public final boolean f10386c;

    /* JADX INFO: renamed from: d */
    public final efx0 f10387d;

    public C2413i0(k0y0 k0y0Var, efx0 efx0Var, yvx0 yvx0Var) {
        this.f10385b = k0y0Var;
        this.f10386c = yvx0Var instanceof AbstractC2401c0;
        this.f10387d = efx0Var;
        this.f10384a = yvx0Var;
    }

    /* JADX INFO: renamed from: f */
    public static C2413i0 m14884f(k0y0 k0y0Var, efx0 efx0Var, yvx0 yvx0Var) {
        return new C2413i0(k0y0Var, efx0Var, yvx0Var);
    }

    @Override // p153l.uxx0
    /* JADX INFO: renamed from: a */
    public final void mo14868a(Object obj) {
        this.f10385b.mo14916a(obj);
        this.f10387d.mo14804a(obj);
    }

    @Override // p153l.uxx0
    /* JADX INFO: renamed from: b */
    public final boolean mo14869b(Object obj, Object obj2) {
        if (!((AbstractC2403d0) obj).zzc.equals(((AbstractC2403d0) obj2).zzc)) {
            return false;
        }
        if (this.f10386c) {
            return ((AbstractC2401c0) obj).zzb.equals(((AbstractC2401c0) obj2).zzb);
        }
        return true;
    }

    @Override // p153l.uxx0
    /* JADX INFO: renamed from: c */
    public final boolean mo14870c(Object obj) {
        return ((AbstractC2401c0) obj).zzb.m216464h();
    }

    @Override // p153l.uxx0
    /* JADX INFO: renamed from: d */
    public final void mo14871d(Object obj, byte[] bArr, int i, int i2, ypw0 ypw0Var) throws IOException {
        AbstractC2403d0 abstractC2403d0 = (AbstractC2403d0) obj;
        if (abstractC2403d0.zzc == o0y0.m165555c()) {
            abstractC2403d0.zzc = o0y0.m165557f();
        }
        throw null;
    }

    @Override // p153l.uxx0
    /* JADX INFO: renamed from: e */
    public final void mo14872e(Object obj, o2y0 o2y0Var) throws IOException {
        Iterator itM216461e = ((AbstractC2401c0) obj).zzb.m216461e();
        while (itM216461e.hasNext()) {
            Map.Entry entry = (Map.Entry) itM216461e.next();
            zix0 zix0Var = (zix0) entry.getKey();
            if (zix0Var.zzc() != zzjv.MESSAGE || zix0Var.zze() || zix0Var.zzd()) {
                wtq0.m207906a("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof hsx0) {
                o2y0Var.mo165828x(zix0Var.zza(), ((hsx0) entry).m137055a().m14840b());
            } else {
                o2y0Var.mo165828x(zix0Var.zza(), entry.getValue());
            }
        }
        ((AbstractC2403d0) obj).zzc.m165565k(o2y0Var);
    }

    @Override // p153l.uxx0
    public final int zza(Object obj) {
        int iM165559b = ((AbstractC2403d0) obj).zzc.m165559b();
        return this.f10386c ? iM165559b + ((AbstractC2401c0) obj).zzb.m216460c() : iM165559b;
    }

    @Override // p153l.uxx0
    public final int zzb(Object obj) {
        int iHashCode = ((AbstractC2403d0) obj).zzc.hashCode();
        return this.f10386c ? (iHashCode * 53) + ((AbstractC2401c0) obj).zzb.f200355a.hashCode() : iHashCode;
    }

    @Override // p153l.uxx0
    public final Object zze() {
        yvx0 yvx0Var = this.f10384a;
        return yvx0Var instanceof AbstractC2403d0 ? ((AbstractC2403d0) yvx0Var).m14827m() : yvx0Var.mo14828p().zzh();
    }

    @Override // p153l.uxx0
    public final void zzg(Object obj, Object obj2) {
        C2415j0.m14910u(this.f10385b, obj, obj2);
        if (this.f10386c) {
            C2415j0.m14909t(this.f10387d, obj, obj2);
        }
    }
}
