package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class v5v0 implements q9u0 {

    /* JADX INFO: renamed from: a */
    public final Context f180130a;

    /* JADX INFO: renamed from: b */
    public final zzcei f180131b;

    /* JADX INFO: renamed from: c */
    public final gnr f180132c;

    /* JADX INFO: renamed from: d */
    public final kxv0 f180133d;

    /* JADX INFO: renamed from: e */
    public final q9t0 f180134e;

    /* JADX INFO: renamed from: f */
    public final iyv0 f180135f;

    /* JADX INFO: renamed from: g */
    public final xgs0 f180136g;

    /* JADX INFO: renamed from: h */
    public final boolean f180137h;

    /* JADX INFO: renamed from: i */
    public final k2v0 f180138i;

    public v5v0(Context context, zzcei zzceiVar, gnr gnrVar, kxv0 kxv0Var, q9t0 q9t0Var, iyv0 iyv0Var, boolean z, xgs0 xgs0Var, k2v0 k2v0Var) {
        this.f180130a = context;
        this.f180131b = zzceiVar;
        this.f180132c = gnrVar;
        this.f180133d = kxv0Var;
        this.f180134e = q9t0Var;
        this.f180135f = iyv0Var;
        this.f180136g = xgs0Var;
        this.f180137h = z;
        this.f180138i = k2v0Var;
    }

    @Override // p149l.q9u0
    /* JADX INFO: renamed from: a */
    public final void mo100276a(boolean z, Context context, wxt0 wxt0Var) {
        c8u0 c8u0Var = (c8u0) jmw0.m142244q(this.f180132c);
        this.f180134e.mo13721y0(true);
        boolean zM208697e = this.f180137h ? this.f180136g.m208697e(false) : false;
        vny0.m199080r();
        zzj zzjVar = new zzj(zM208697e, C2075b.m12315h(this.f180130a), this.f180137h ? this.f180136g.m208696d() : false, this.f180137h ? this.f180136g.m208693a() : 0.0f, -1, z, this.f180133d.f125172P, false);
        if (wxt0Var != null) {
            wxt0Var.zzf();
        }
        vny0.m199073k();
        g9u0 g9u0VarMo96331j = c8u0Var.mo96331j();
        q9t0 q9t0Var = this.f180134e;
        kxv0 kxv0Var = this.f180133d;
        zzcei zzceiVar = this.f180131b;
        int i = kxv0Var.f125174R;
        String str = kxv0Var.f125159C;
        oxv0 oxv0Var = kxv0Var.f125221t;
        a8y0.m95388a(context, new AdOverlayInfoParcel((b1r0) null, g9u0VarMo96331j, (l1r0) null, q9t0Var, i, zzceiVar, str, zzjVar, oxv0Var.f146254b, oxv0Var.f146253a, this.f180135f.f115496f, wxt0Var, kxv0Var.f125202j0 ? this.f180138i : null), true);
    }
}
