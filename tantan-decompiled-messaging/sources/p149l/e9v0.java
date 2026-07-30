package p149l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;

/* JADX INFO: loaded from: classes6.dex */
public final class e9v0 implements q9u0 {

    /* JADX INFO: renamed from: a */
    public final Context f90141a;

    /* JADX INFO: renamed from: b */
    public final fku0 f90142b;

    /* JADX INFO: renamed from: c */
    public final iyv0 f90143c;

    /* JADX INFO: renamed from: d */
    public final zzcei f90144d;

    /* JADX INFO: renamed from: e */
    public final kxv0 f90145e;

    /* JADX INFO: renamed from: f */
    public final gnr f90146f;

    /* JADX INFO: renamed from: g */
    public final q9t0 f90147g;

    /* JADX INFO: renamed from: h */
    public final xgs0 f90148h;

    /* JADX INFO: renamed from: i */
    public final boolean f90149i;

    /* JADX INFO: renamed from: j */
    public final k2v0 f90150j;

    public e9v0(Context context, fku0 fku0Var, iyv0 iyv0Var, zzcei zzceiVar, kxv0 kxv0Var, gnr gnrVar, q9t0 q9t0Var, xgs0 xgs0Var, boolean z, k2v0 k2v0Var) {
        this.f90141a = context;
        this.f90142b = fku0Var;
        this.f90143c = iyv0Var;
        this.f90144d = zzceiVar;
        this.f90145e = kxv0Var;
        this.f90146f = gnrVar;
        this.f90147g = q9t0Var;
        this.f90148h = xgs0Var;
        this.f90149i = z;
        this.f90150j = k2v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    /* JADX WARN: Code duplicated, block: B:22:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.q9u0
    /* JADX INFO: renamed from: a */
    public final void mo100276a(boolean z, Context context, wxt0 wxt0Var) {
        q9t0 q9t0Var;
        q9t0 q9t0Var2;
        boolean zM208697e;
        float fM208693a;
        fju0 fju0Var = (fju0) jmw0.m142244q(this.f90146f);
        try {
            kxv0 kxv0Var = this.f90145e;
            if (this.f90147g.mo13680c0()) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131989M0)).booleanValue()) {
                    final q9t0 q9t0VarM121894a = this.f90142b.m121894a(this.f90143c.f115495e, null, null);
                    mhs0.m154637b(q9t0VarM121894a, fju0Var.mo121631i());
                    final iku0 iku0Var = new iku0();
                    iku0Var.m136898a(this.f90141a, (View) q9t0VarM121894a);
                    fju0Var.mo121634l().m117003i(q9t0VarM121894a, true, this.f90149i ? this.f90148h : null);
                    q9t0VarM121894a.zzN().zzB(new fbt0() { // from class: l.c9v0
                        @Override // p149l.fbt0
                        /* JADX INFO: renamed from: a */
                        public final void mo96131a(boolean z2, int i, String str, String str2) {
                            iku0Var.m136899b();
                            q9t0 q9t0Var3 = q9t0VarM121894a;
                            q9t0Var3.mo13704p0();
                            q9t0Var3.zzN().zzr();
                        }
                    });
                    q9t0VarM121894a.zzN().zzH(new gbt0() { // from class: l.d9v0
                        @Override // p149l.gbt0
                        public final void zza() {
                            q9t0VarM121894a.mo13700n0();
                        }
                    });
                    oxv0 oxv0Var = kxv0Var.f125221t;
                    q9t0VarM121894a.mo13719x0(oxv0Var.f146254b, oxv0Var.f146253a, null);
                    q9t0Var = q9t0VarM121894a;
                } else {
                    q9t0Var2 = this.f90147g;
                }
                q9t0Var.mo13721y0(true);
                if (this.f90149i) {
                    zM208697e = this.f90148h.m208697e(false);
                } else {
                    zM208697e = false;
                }
                vny0.m199080r();
                Context context2 = this.f90141a;
                boolean z2 = this.f90149i;
                boolean zM12315h = C2075b.m12315h(context2);
                boolean zM208696d = z2 ? this.f90148h.m208696d() : false;
                if (this.f90149i) {
                    fM208693a = this.f90148h.m208693a();
                } else {
                    fM208693a = 0.0f;
                }
                float f = fM208693a;
                kxv0 kxv0Var2 = this.f90145e;
                zzj zzjVar = new zzj(zM208697e, zM12315h, zM208696d, f, -1, z, kxv0Var2.f125172P, kxv0Var2.f125173Q);
                if (wxt0Var != null) {
                    wxt0Var.zzf();
                }
                vny0.m199073k();
                g9u0 g9u0VarMo121632j = fju0Var.mo121632j();
                kxv0 kxv0Var3 = this.f90145e;
                zzcei zzceiVar = this.f90144d;
                int i = kxv0Var3.f125174R;
                String str = kxv0Var3.f125159C;
                oxv0 oxv0Var2 = kxv0Var3.f125221t;
                a8y0.m95388a(context, new AdOverlayInfoParcel((b1r0) null, g9u0VarMo121632j, (l1r0) null, q9t0Var, i, zzceiVar, str, zzjVar, oxv0Var2.f146254b, oxv0Var2.f146253a, this.f90143c.f115496f, wxt0Var, kxv0Var3.f125202j0 ? this.f90150j : null), true);
            }
            q9t0Var2 = this.f90147g;
            q9t0Var = q9t0Var2;
            q9t0Var.mo13721y0(true);
            if (this.f90149i) {
                zM208697e = this.f90148h.m208697e(false);
            } else {
                zM208697e = false;
            }
            vny0.m199080r();
            Context context3 = this.f90141a;
            boolean z3 = this.f90149i;
            boolean zM12315h2 = C2075b.m12315h(context3);
            boolean zM208696d2 = z3 ? this.f90148h.m208696d() : false;
            if (this.f90149i) {
                fM208693a = this.f90148h.m208693a();
            } else {
                fM208693a = 0.0f;
            }
            float f2 = fM208693a;
            kxv0 kxv0Var4 = this.f90145e;
            zzj zzjVar2 = new zzj(zM208697e, zM12315h2, zM208696d2, f2, -1, z, kxv0Var4.f125172P, kxv0Var4.f125173Q);
            if (wxt0Var != null) {
                wxt0Var.zzf();
            }
            vny0.m199073k();
            g9u0 g9u0VarMo121632j2 = fju0Var.mo121632j();
            kxv0 kxv0Var5 = this.f90145e;
            zzcei zzceiVar2 = this.f90144d;
            int i2 = kxv0Var5.f125174R;
            String str2 = kxv0Var5.f125159C;
            oxv0 oxv0Var3 = kxv0Var5.f125221t;
            a8y0.m95388a(context, new AdOverlayInfoParcel((b1r0) null, g9u0VarMo121632j2, (l1r0) null, q9t0Var, i2, zzceiVar2, str2, zzjVar2, oxv0Var3.f146254b, oxv0Var3.f146253a, this.f90143c.f115496f, wxt0Var, kxv0Var5.f125202j0 ? this.f90150j : null), true);
        } catch (zzcjw e) {
            x2t0.m206867e("", e);
        }
    }
}
