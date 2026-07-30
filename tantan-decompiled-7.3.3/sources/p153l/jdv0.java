package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdkv;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class jdv0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f120367a;

    /* JADX INFO: renamed from: b */
    public final zvt0 f120368b;

    /* JADX INFO: renamed from: c */
    public final Executor f120369c;

    public jdv0(Context context, zvt0 zvt0Var, Executor executor) {
        this.f120367a = context;
        this.f120368b = zvt0Var;
        this.f120369c = executor;
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, q6w0 q6w0Var, final scv0 scv0Var) throws zzeml, zzfho {
        wvt0 wvt0VarMo196949a = this.f120368b.mo196949a(new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a), new lhu0(new wiu0() { // from class: l.idv0
            @Override // p153l.wiu0
            /* JADX INFO: renamed from: a */
            public final void mo104077a(boolean z, Context context, c7u0 c7u0Var) throws zzdkv {
                scv0 scv0Var2 = scv0Var;
                try {
                    ((r8w0) scv0Var2.f167348b).m180250A(z);
                    ((r8w0) scv0Var2.f167348b).m180251B(context);
                } catch (zzfho e) {
                    throw new zzdkv(e.getCause());
                }
            }
        }, null), new xvt0(q6w0Var.f155876b0));
        wvt0VarMo196949a.mo99225c().m149283q0(new ntt0((r8w0) scv0Var.f167348b), this.f120369c);
        ((vev0) scv0Var.f167349c).m201078p8(wvt0VarMo196949a.mo99227g());
        return wvt0VarMo196949a.mo177266h();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        r8w0 r8w0Var = (r8w0) scv0Var.f167348b;
        o7w0 o7w0Var = b7w0Var.f75342a.f197721a;
        r8w0Var.m180271q(this.f120367a, o7w0Var.f145318d, q6w0Var.f155916w.toString(), (jxs0) scv0Var.f167349c);
    }
}
