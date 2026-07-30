package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class a6v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f67804a;

    /* JADX INFO: renamed from: b */
    public final j9u0 f67805b;

    /* JADX INFO: renamed from: c */
    public final zzcei f67806c;

    /* JADX INFO: renamed from: d */
    public final Executor f67807d;

    public a6v0(Context context, zzcei zzceiVar, j9u0 j9u0Var, Executor executor) {
        this.f67804a = context;
        this.f67806c = zzceiVar;
        this.f67805b = j9u0Var;
        this.f67807d = executor;
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, kxv0 kxv0Var, final m3v0 m3v0Var) throws zzeml, zzfho {
        c8u0 c8u0VarMo116365c = this.f67805b.mo116365c(new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a), new f8u0(new q9u0() { // from class: l.z5v0
            @Override // p149l.q9u0
            /* JADX INFO: renamed from: a */
            public final void mo100276a(boolean z, Context context, wxt0 wxt0Var) throws zzdkv {
                this.f201866a.m95163c(m3v0Var, z, context, wxt0Var);
            }
        }, null));
        c8u0VarMo116365c.mo96325c().m114710q0(new hkt0((lzv0) m3v0Var.f131187b), this.f67807d);
        ((p5v0) m3v0Var.f131188c).m167520p8(c8u0VarMo116365c.mo96328g());
        return c8u0VarMo116365c.mo96330i();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        lzv0 lzv0Var = (lzv0) m3v0Var.f131187b;
        iyv0 iyv0Var = vxv0Var.f183477a.f166831a;
        lzv0Var.m152390t(this.f67804a, iyv0Var.f115494d, kxv0Var.f125226w.toString(), prs0.m171071l(kxv0Var.f125221t), (dos0) m3v0Var.f131188c);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m95163c(m3v0 m3v0Var, boolean z, Context context, wxt0 wxt0Var) throws zzdkv {
        try {
            ((lzv0) m3v0Var.f131187b).m152366A(z);
            int i = this.f67806c.zzc;
            int iIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f131929H0)).intValue();
            Object obj = m3v0Var.f131187b;
            if (i < iIntValue) {
                ((lzv0) obj).m152368C();
            } else {
                ((lzv0) obj).m152369D(context);
            }
        } catch (zzfho e) {
            x2t0.m206868f("Cannot show interstitial.");
            throw new zzdkv(e.getCause());
        }
    }
}
