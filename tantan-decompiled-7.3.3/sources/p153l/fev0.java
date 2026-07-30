package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzcvt;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class fev0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f98717a;

    /* JADX INFO: renamed from: b */
    public final zxt0 f98718b;

    /* JADX INFO: renamed from: c */
    public View f98719c;

    /* JADX INFO: renamed from: d */
    public mxs0 f98720d;

    public fev0(Context context, zxt0 zxt0Var) {
        this.f98717a = context;
        this.f98718b = zxt0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, final q6w0 q6w0Var, final scv0 scv0Var) throws zzeml, zzfho {
        final View view;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168019I7)).booleanValue() && q6w0Var.f155888h0) {
            try {
                view = (View) h950.m134037P2(this.f98720d.zze());
                boolean zZzf = this.f98720d.zzf();
                if (view == null) {
                    throw new zzfho(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.cev0
                            @Override // p153l.xuw0
                            public final hpr zza(Object obj) {
                                return this.f81421a.m125334c(view, q6w0Var, obj);
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
            view = this.f98719c;
        }
        vwt0 vwt0VarMo121814a = this.f98718b.mo121814a(new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a), new bxt0(view, null, new izt0() { // from class: l.bev0
            @Override // p153l.izt0
            public final lpu0 zza() throws zzfho {
                try {
                    return ((hzs0) scv0Var.f167348b).zze();
                } catch (RemoteException e3) {
                    guu0.m132414a(e3);
                    return null;
                }
            }
        }, (r6w0) q6w0Var.f155915v.get(0)));
        vwt0VarMo121814a.mo99229i().m97733w0(view);
        ((vev0) scv0Var.f167349c).m201078p8(vwt0VarMo121814a.mo99226f());
        return vwt0VarMo121814a.mo99228h();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        try {
            ((hzs0) scv0Var.f167348b).mo113446T(q6w0Var.f155874a0);
            dev0 dev0Var = null;
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168019I7)).booleanValue() && q6w0Var.f155888h0) {
                ((hzs0) scv0Var.f167348b).mo113455z1(q6w0Var.f155868V, q6w0Var.f155916w.toString(), b7w0Var.f75342a.f197721a.f145318d, h950.m134038Y2(this.f98717a), new eev0(this, scv0Var, dev0Var), (jxs0) scv0Var.f167349c, b7w0Var.f75342a.f197721a.f145319e);
            } else {
                ((hzs0) scv0Var.f167348b).mo113445O1(q6w0Var.f155868V, q6w0Var.f155916w.toString(), b7w0Var.f75342a.f197721a.f145318d, h950.m134038Y2(this.f98717a), new eev0(this, scv0Var, dev0Var), (jxs0) scv0Var.f167349c, b7w0Var.f75342a.f197721a.f145319e);
            }
        } catch (RemoteException e) {
            guu0.m132414a(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m125334c(View view, q6w0 q6w0Var, Object obj) throws Exception {
        return pvw0.m173981h(zzcvt.m13799a(this.f98717a, view, q6w0Var));
    }
}
