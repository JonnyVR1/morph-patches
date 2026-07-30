package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;

/* JADX INFO: loaded from: classes6.dex */
public final class fgv0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f98979a;

    /* JADX INFO: renamed from: b */
    public final qju0 f98980b;

    /* JADX INFO: renamed from: c */
    public rxs0 f98981c;

    /* JADX INFO: renamed from: d */
    public final zzcei f98982d;

    public fgv0(Context context, qju0 qju0Var, zzcei zzceiVar) {
        this.f98979a = context;
        this.f98980b = qju0Var;
        this.f98982d = zzceiVar;
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzeml, zzfho {
        if (!b7w0Var.f75342a.f197721a.f145321g.contains(Integer.toString(6))) {
            throw new zzeml(2, "Unified must be used for RTB.");
        }
        ulu0 ulu0VarM196571g0 = ulu0.m196571g0(this.f98981c);
        o7w0 o7w0Var = b7w0Var.f75342a.f197721a;
        if (!o7w0Var.f145321g.contains(Integer.toString(ulu0VarM196571g0.m196580P()))) {
            throw new zzeml(1, "No corresponding native ad listener");
        }
        wlu0 wlu0VarMo176887d = this.f98980b.mo176887d(new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a), new gmu0(ulu0VarM196571g0), new jou0(null, null, this.f98981c));
        ((vev0) scv0Var.f167349c).m201078p8(wlu0VarMo176887d.mo99226f());
        return wlu0VarMo176887d.mo159611h();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        try {
            ((hzs0) scv0Var.f167348b).mo113446T(q6w0Var.f155874a0);
            int i = this.f98982d.zzc;
            int iIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f168001H1)).intValue();
            Object obj = scv0Var.f167348b;
            dgv0 dgv0Var = null;
            if (i < iIntValue) {
                ((hzs0) obj).mo113447T0(q6w0Var.f155868V, q6w0Var.f155916w.toString(), b7w0Var.f75342a.f197721a.f145318d, h950.m134038Y2(this.f98979a), new egv0(this, scv0Var, dgv0Var), (jxs0) scv0Var.f167349c);
            } else {
                ((hzs0) obj).mo113448X3(q6w0Var.f155868V, q6w0Var.f155916w.toString(), b7w0Var.f75342a.f197721a.f145318d, h950.m134038Y2(this.f98979a), new egv0(this, scv0Var, dgv0Var), (jxs0) scv0Var.f167349c, b7w0Var.f75342a.f197721a.f145323i);
            }
        } catch (RemoteException e) {
            guu0.m132414a(e);
        }
    }
}
