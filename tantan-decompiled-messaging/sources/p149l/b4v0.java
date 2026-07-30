package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class b4v0 implements q9u0 {

    /* JADX INFO: renamed from: a */
    public final zzcei f73407a;

    /* JADX INFO: renamed from: b */
    public final gnr f73408b;

    /* JADX INFO: renamed from: c */
    public final kxv0 f73409c;

    /* JADX INFO: renamed from: d */
    public final q9t0 f73410d;

    /* JADX INFO: renamed from: e */
    public final iyv0 f73411e;

    /* JADX INFO: renamed from: f */
    public final xgs0 f73412f;

    /* JADX INFO: renamed from: g */
    public final boolean f73413g;

    /* JADX INFO: renamed from: h */
    public final k2v0 f73414h;

    public b4v0(zzcei zzceiVar, gnr gnrVar, kxv0 kxv0Var, q9t0 q9t0Var, iyv0 iyv0Var, boolean z, xgs0 xgs0Var, k2v0 k2v0Var) {
        this.f73407a = zzceiVar;
        this.f73408b = gnrVar;
        this.f73409c = kxv0Var;
        this.f73410d = q9t0Var;
        this.f73411e = iyv0Var;
        this.f73413g = z;
        this.f73412f = xgs0Var;
        this.f73414h = k2v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    @Override // p149l.q9u0
    /* JADX INFO: renamed from: a */
    public final void mo100276a(boolean z, Context context, wxt0 wxt0Var) {
        qmt0 qmt0Var = (qmt0) jmw0.m142244q(this.f73408b);
        this.f73410d.mo13721y0(true);
        boolean zM208697e = this.f73413g ? this.f73412f.m208697e(true) : true;
        boolean z2 = this.f73413g;
        zzj zzjVar = new zzj(zM208697e, true, z2 ? this.f73412f.m208696d() : false, z2 ? this.f73412f.m208693a() : 0.0f, -1, z, this.f73409c.f125172P, false);
        if (wxt0Var != null) {
            wxt0Var.zzf();
        }
        vny0.m199073k();
        g9u0 g9u0VarMo145804i = qmt0Var.mo145804i();
        q9t0 q9t0Var = this.f73410d;
        int i = this.f73409c.f125174R;
        if (i == -1) {
            zzw zzwVar = this.f73411e.f115500j;
            if (zzwVar == null) {
                x2t0.m206864b("Error setting app open orientation; no targeting orientation available.");
                i = this.f73409c.f125174R;
            } else {
                int i2 = zzwVar.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                } else {
                    x2t0.m206864b("Error setting app open orientation; no targeting orientation available.");
                    i = this.f73409c.f125174R;
                }
            }
        }
        int i3 = i;
        zzcei zzceiVar = this.f73407a;
        kxv0 kxv0Var = this.f73409c;
        String str = kxv0Var.f125159C;
        oxv0 oxv0Var = kxv0Var.f125221t;
        a8y0.m95388a(context, new AdOverlayInfoParcel((b1r0) null, g9u0VarMo145804i, (l1r0) null, q9t0Var, i3, zzceiVar, str, zzjVar, oxv0Var.f146254b, oxv0Var.f146253a, this.f73411e.f115496f, wxt0Var, kxv0Var.f125202j0 ? this.f73414h : null), true);
    }
}
