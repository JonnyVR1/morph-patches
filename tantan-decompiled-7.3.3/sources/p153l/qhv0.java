package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class qhv0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f157766a;

    /* JADX INFO: renamed from: b */
    public final Executor f157767b;

    /* JADX INFO: renamed from: c */
    public final psu0 f157768c;

    public qhv0(Context context, Executor executor, psu0 psu0Var) {
        this.f157766a = context;
        this.f157767b = executor;
        this.f157768c = psu0Var;
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, q6w0 q6w0Var, final scv0 scv0Var) throws zzeml, zzfho {
        lsu0 lsu0VarMo131473b = this.f157768c.mo131473b(new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a), new msu0(new wiu0() { // from class: l.phv0
            @Override // p153l.wiu0
            /* JADX INFO: renamed from: a */
            public final void mo104077a(boolean z, Context context, c7u0 c7u0Var) throws zzdkv {
                scv0 scv0Var2 = scv0Var;
                try {
                    ((r8w0) scv0Var2.f167348b).m180250A(z);
                    ((r8w0) scv0Var2.f167348b).m180254E(context);
                } catch (zzfho e) {
                    throw new zzdkv(e.getCause());
                }
            }
        }));
        lsu0VarMo131473b.mo99225c().m149283q0(new ntt0((r8w0) scv0Var.f167348b), this.f157767b);
        ((vev0) scv0Var.f167349c).m201078p8(lsu0VarMo131473b.mo111987m());
        return lsu0VarMo131473b.mo111985k();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        try {
            o7w0 o7w0Var = b7w0Var.f75342a.f197721a;
            if (o7w0Var.f145329o.f192644a == 3) {
                ((r8w0) scv0Var.f167348b).m180277w(this.f157766a, o7w0Var.f145318d, q6w0Var.f155916w.toString(), (jxs0) scv0Var.f167349c);
            } else {
                ((r8w0) scv0Var.f167348b).m180276v(this.f157766a, o7w0Var.f145318d, q6w0Var.f155916w.toString(), (jxs0) scv0Var.f167349c);
            }
        } catch (Exception e) {
            dct0.m115299h("Fail to load ad from adapter ".concat(String.valueOf(scv0Var.f167347a)), e);
        }
    }
}
