package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class k8v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f121866a;

    /* JADX INFO: renamed from: b */
    public final Executor f121867b;

    /* JADX INFO: renamed from: c */
    public final jju0 f121868c;

    public k8v0(Context context, Executor executor, jju0 jju0Var) {
        this.f121866a = context;
        this.f121867b = executor;
        this.f121868c = jju0Var;
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, kxv0 kxv0Var, final m3v0 m3v0Var) throws zzeml, zzfho {
        fju0 fju0VarMo96733b = this.f121868c.mo96733b(new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a), new gju0(new q9u0() { // from class: l.j8v0
            @Override // p149l.q9u0
            /* JADX INFO: renamed from: a */
            public final void mo100276a(boolean z, Context context, wxt0 wxt0Var) throws zzdkv {
                m3v0 m3v0Var2 = m3v0Var;
                try {
                    ((lzv0) m3v0Var2.f131187b).m152366A(z);
                    ((lzv0) m3v0Var2.f131187b).m152370E(context);
                } catch (zzfho e) {
                    throw new zzdkv(e.getCause());
                }
            }
        }));
        fju0VarMo96733b.mo96325c().m114710q0(new hkt0((lzv0) m3v0Var.f131187b), this.f121867b);
        ((p5v0) m3v0Var.f131188c).m167520p8(fju0VarMo96733b.mo121635m());
        return fju0VarMo96733b.mo121633k();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        try {
            iyv0 iyv0Var = vxv0Var.f183477a.f166831a;
            if (iyv0Var.f115505o.f161517a == 3) {
                ((lzv0) m3v0Var.f131187b).m152393w(this.f121866a, iyv0Var.f115494d, kxv0Var.f125226w.toString(), (dos0) m3v0Var.f131188c);
            } else {
                ((lzv0) m3v0Var.f131187b).m152392v(this.f121866a, iyv0Var.f115494d, kxv0Var.f125226w.toString(), (dos0) m3v0Var.f131188c);
            }
        } catch (Exception e) {
            x2t0.m206870h("Fail to load ad from adapter ".concat(String.valueOf(m3v0Var.f131186a)), e);
        }
    }
}
