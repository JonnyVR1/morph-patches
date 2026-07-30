package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class gfv0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f103959a;

    /* JADX INFO: renamed from: b */
    public final piu0 f103960b;

    /* JADX INFO: renamed from: c */
    public final zzcei f103961c;

    /* JADX INFO: renamed from: d */
    public final Executor f103962d;

    public gfv0(Context context, zzcei zzceiVar, piu0 piu0Var, Executor executor) {
        this.f103959a = context;
        this.f103961c = zzceiVar;
        this.f103960b = piu0Var;
        this.f103962d = executor;
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, q6w0 q6w0Var, final scv0 scv0Var) throws zzeml, zzfho {
        ihu0 ihu0VarMo150795c = this.f103960b.mo150795c(new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a), new lhu0(new wiu0() { // from class: l.ffv0
            @Override // p153l.wiu0
            /* JADX INFO: renamed from: a */
            public final void mo104077a(boolean z, Context context, c7u0 c7u0Var) throws zzdkv {
                this.f98841a.m130124c(scv0Var, z, context, c7u0Var);
            }
        }, null));
        ihu0VarMo150795c.mo99225c().m149283q0(new ntt0((r8w0) scv0Var.f167348b), this.f103962d);
        ((vev0) scv0Var.f167349c).m201078p8(ihu0VarMo150795c.mo99227g());
        return ihu0VarMo150795c.mo131319i();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        r8w0 r8w0Var = (r8w0) scv0Var.f167348b;
        o7w0 o7w0Var = b7w0Var.f75342a.f197721a;
        r8w0Var.m180274t(this.f103959a, o7w0Var.f145318d, q6w0Var.f155916w.toString(), v0t0.m198940l(q6w0Var.f155911t), (jxs0) scv0Var.f167349c);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m130124c(scv0 scv0Var, boolean z, Context context, c7u0 c7u0Var) throws zzdkv {
        try {
            ((r8w0) scv0Var.f167348b).m180250A(z);
            int i = this.f103961c.zzc;
            int iIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f168000H0)).intValue();
            Object obj = scv0Var.f167348b;
            if (i < iIntValue) {
                ((r8w0) obj).m180252C();
            } else {
                ((r8w0) obj).m180253D(context);
            }
        } catch (zzfho e) {
            dct0.m115297f("Cannot show interstitial.");
            throw new zzdkv(e.getCause());
        }
    }
}
