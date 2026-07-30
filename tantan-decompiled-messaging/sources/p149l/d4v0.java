package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class d4v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f84355a;

    /* JADX INFO: renamed from: b */
    public final tmt0 f84356b;

    /* JADX INFO: renamed from: c */
    public final Executor f84357c;

    public d4v0(Context context, tmt0 tmt0Var, Executor executor) {
        this.f84355a = context;
        this.f84356b = tmt0Var;
        this.f84357c = executor;
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, kxv0 kxv0Var, final m3v0 m3v0Var) throws zzeml, zzfho {
        qmt0 qmt0VarMo164021a = this.f84356b.mo164021a(new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a), new f8u0(new q9u0() { // from class: l.c4v0
            @Override // p149l.q9u0
            /* JADX INFO: renamed from: a */
            public final void mo100276a(boolean z, Context context, wxt0 wxt0Var) throws zzdkv {
                m3v0 m3v0Var2 = m3v0Var;
                try {
                    ((lzv0) m3v0Var2.f131187b).m152366A(z);
                    ((lzv0) m3v0Var2.f131187b).m152367B(context);
                } catch (zzfho e) {
                    throw new zzdkv(e.getCause());
                }
            }
        }, null), new rmt0(kxv0Var.f125186b0));
        qmt0VarMo164021a.mo96325c().m114710q0(new hkt0((lzv0) m3v0Var.f131187b), this.f84357c);
        ((p5v0) m3v0Var.f131188c).m167520p8(qmt0VarMo164021a.mo96328g());
        return qmt0VarMo164021a.mo145803h();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        lzv0 lzv0Var = (lzv0) m3v0Var.f131187b;
        iyv0 iyv0Var = vxv0Var.f183477a.f166831a;
        lzv0Var.m152387q(this.f84355a, iyv0Var.f115494d, kxv0Var.f125226w.toString(), (dos0) m3v0Var.f131188c);
    }
}
