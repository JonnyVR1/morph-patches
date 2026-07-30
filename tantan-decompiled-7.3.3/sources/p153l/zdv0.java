package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcvt;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class zdv0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f203945a;

    /* JADX INFO: renamed from: b */
    public final zxt0 f203946b;

    /* JADX INFO: renamed from: c */
    public final Executor f203947c;

    public zdv0(Context context, zxt0 zxt0Var, Executor executor) {
        this.f203945a = context;
        this.f203946b = zxt0Var;
        this.f203947c = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, final q6w0 q6w0Var, scv0 scv0Var) throws zzeml, zzfho {
        final View viewM180260f;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168019I7)).booleanValue() && q6w0Var.f155888h0) {
            mxs0 mxs0VarM180262h = ((r8w0) scv0Var.f167348b).m180262h();
            if (mxs0VarM180262h == null) {
                dct0.m115295d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfho(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewM180260f = (View) h950.m134037P2(mxs0VarM180262h.zze());
                boolean zZzf = mxs0VarM180262h.zzf();
                if (viewM180260f == null) {
                    throw new zzfho(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewM180260f = (View) pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.xdv0
                            @Override // p153l.xuw0
                            public final hpr zza(Object obj) {
                                return this.f193647a.m219386c(viewM180260f, q6w0Var, obj);
                            }
                        }, oct0.f146737e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        guu0.m132414a(e);
                        return null;
                    }
                }
            } catch (RemoteException e2) {
                guu0.m132414a(e2);
                return null;
            }
        } else {
            viewM180260f = ((r8w0) scv0Var.f167348b).m180260f();
        }
        zxt0 zxt0Var = this.f203946b;
        a0u0 a0u0Var = new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a);
        final r8w0 r8w0Var = (r8w0) scv0Var.f167348b;
        Objects.requireNonNull(r8w0Var);
        vwt0 vwt0VarMo121814a = zxt0Var.mo121814a(a0u0Var, new bxt0(viewM180260f, null, new izt0() { // from class: l.ydv0
            @Override // p153l.izt0
            public final lpu0 zza() {
                return r8w0Var.m180261g();
            }
        }, (r6w0) q6w0Var.f155915v.get(0)));
        vwt0VarMo121814a.mo99229i().m97733w0(viewM180260f);
        vwt0VarMo121814a.mo99225c().m149283q0(new ntt0((r8w0) scv0Var.f167348b), this.f203947c);
        ((vev0) scv0Var.f167349c).m201078p8(vwt0VarMo121814a.mo99227g());
        return vwt0VarMo121814a.mo99228h();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        zzq zzqVar;
        zzq zzqVar2 = b7w0Var.f75342a.f197721a.f145319e;
        if (zzqVar2.zzn) {
            zzqVar = new zzq(this.f203945a, l9s0.m153449d(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) jas0.m144075c().m176505a(sgs0.f168019I7)).booleanValue() && q6w0Var.f155888h0) ? new zzq(this.f203945a, l9s0.m153450e(zzqVar2.zze, zzqVar2.zzb)) : u7w0.m194892a(this.f203945a, q6w0Var.f155915v);
        }
        zzq zzqVar3 = zzqVar;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168019I7)).booleanValue() && q6w0Var.f155888h0) {
            Object obj = scv0Var.f167348b;
            ((r8w0) obj).m180273s(this.f203945a, zzqVar3, b7w0Var.f75342a.f197721a.f145318d, q6w0Var.f155916w.toString(), v0t0.m198940l(q6w0Var.f155911t), (jxs0) scv0Var.f167349c);
            return;
        }
        Object obj2 = scv0Var.f167348b;
        ((r8w0) obj2).m180272r(this.f203945a, zzqVar3, b7w0Var.f75342a.f197721a.f145318d, q6w0Var.f155916w.toString(), v0t0.m198940l(q6w0Var.f155911t), (jxs0) scv0Var.f167349c);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m219386c(View view, q6w0 q6w0Var, Object obj) throws Exception {
        return pvw0.m173981h(zzcvt.m13799a(this.f203945a, view, q6w0Var));
    }
}
