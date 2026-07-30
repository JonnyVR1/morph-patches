package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class riv0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f163399a;

    /* JADX INFO: renamed from: b */
    public final Executor f163400b;

    /* JADX INFO: renamed from: c */
    public final psu0 f163401c;

    public riv0(Context context, Executor executor, psu0 psu0Var) {
        this.f163399a = context;
        this.f163400b = executor;
        this.f163401c = psu0Var;
    }

    /* JADX INFO: renamed from: e */
    public static final void m181610e(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) {
        try {
            ((r8w0) scv0Var.f167348b).m180270p(b7w0Var.f75342a.f197721a.f145318d, q6w0Var.f155916w.toString());
        } catch (Exception e) {
            dct0.m115299h("Fail to load ad from adapter ".concat(String.valueOf(scv0Var.f167347a)), e);
        }
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, q6w0 q6w0Var, final scv0 scv0Var) throws zzeml, zzfho {
        lsu0 lsu0VarMo131473b = this.f163401c.mo131473b(new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a), new msu0(new wiu0() { // from class: l.niv0
            @Override // p153l.wiu0
            /* JADX INFO: renamed from: a */
            public final void mo104077a(boolean z, Context context, c7u0 c7u0Var) throws zzdkv {
                scv0 scv0Var2 = scv0Var;
                try {
                    ((r8w0) scv0Var2.f167348b).m180250A(z);
                    ((r8w0) scv0Var2.f167348b).m180255a();
                } catch (zzfho e) {
                    dct0.m115299h("Cannot show rewarded video.", e);
                    throw new zzdkv(e.getCause());
                }
            }
        }));
        lsu0VarMo131473b.mo99225c().m149283q0(new ntt0((r8w0) scv0Var.f167348b), this.f163400b);
        d8u0 d8u0VarMo111981d = lsu0VarMo131473b.mo111981d();
        g6u0 g6u0VarMo111980a = lsu0VarMo131473b.mo111980a();
        ((wev0) scv0Var.f167349c).m206031p8(new qiv0(this, lsu0VarMo131473b.mo111982h(), g6u0VarMo111980a, d8u0VarMo111981d, lsu0VarMo131473b.mo111983i()));
        return lsu0VarMo131473b.mo111985k();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        if (((r8w0) scv0Var.f167348b).m180257c()) {
            m181610e(b7w0Var, q6w0Var, scv0Var);
            return;
        }
        ((wev0) scv0Var.f167349c).m206032q8(new piv0(this, b7w0Var, q6w0Var, scv0Var));
        Object obj = scv0Var.f167348b;
        Context context = this.f163399a;
        o7w0 o7w0Var = b7w0Var.f75342a.f197721a;
        ((r8w0) obj).m180267m(context, o7w0Var.f145318d, null, (e7t0) scv0Var.f167349c, q6w0Var.f155916w.toString());
    }
}
