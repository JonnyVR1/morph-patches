package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class l9v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f127148a;

    /* JADX INFO: renamed from: b */
    public final Executor f127149b;

    /* JADX INFO: renamed from: c */
    public final jju0 f127150c;

    public l9v0(Context context, Executor executor, jju0 jju0Var) {
        this.f127148a = context;
        this.f127149b = executor;
        this.f127150c = jju0Var;
    }

    /* JADX INFO: renamed from: e */
    public static final void m149110e(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) {
        try {
            ((lzv0) m3v0Var.f131187b).m152386p(vxv0Var.f183477a.f166831a.f115494d, kxv0Var.f125226w.toString());
        } catch (Exception e) {
            x2t0.m206870h("Fail to load ad from adapter ".concat(String.valueOf(m3v0Var.f131186a)), e);
        }
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, kxv0 kxv0Var, final m3v0 m3v0Var) throws zzeml, zzfho {
        fju0 fju0VarMo96733b = this.f127150c.mo96733b(new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a), new gju0(new q9u0() { // from class: l.h9v0
            @Override // p149l.q9u0
            /* JADX INFO: renamed from: a */
            public final void mo100276a(boolean z, Context context, wxt0 wxt0Var) throws zzdkv {
                m3v0 m3v0Var2 = m3v0Var;
                try {
                    ((lzv0) m3v0Var2.f131187b).m152366A(z);
                    ((lzv0) m3v0Var2.f131187b).m152371a();
                } catch (zzfho e) {
                    x2t0.m206870h("Cannot show rewarded video.", e);
                    throw new zzdkv(e.getCause());
                }
            }
        }));
        fju0VarMo96733b.mo96325c().m114710q0(new hkt0((lzv0) m3v0Var.f131187b), this.f127149b);
        xyt0 xyt0VarMo122745d = fju0VarMo96733b.mo122745d();
        axt0 axt0VarMo96323a = fju0VarMo96733b.mo96323a();
        ((q5v0) m3v0Var.f131188c).m173102p8(new k9v0(this, fju0VarMo96733b.mo121630h(), axt0VarMo96323a, xyt0VarMo122745d, fju0VarMo96733b.mo121631i()));
        return fju0VarMo96733b.mo121633k();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        if (((lzv0) m3v0Var.f131187b).m152373c()) {
            m149110e(vxv0Var, kxv0Var, m3v0Var);
            return;
        }
        ((q5v0) m3v0Var.f131188c).m173103q8(new j9v0(this, vxv0Var, kxv0Var, m3v0Var));
        Object obj = m3v0Var.f131187b;
        Context context = this.f127148a;
        iyv0 iyv0Var = vxv0Var.f183477a.f166831a;
        ((lzv0) obj).m152383m(context, iyv0Var.f115494d, null, (yxs0) m3v0Var.f131188c, kxv0Var.f125226w.toString());
    }
}
