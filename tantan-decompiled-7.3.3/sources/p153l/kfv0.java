package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;

/* JADX INFO: loaded from: classes6.dex */
public final class kfv0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f126510a;

    /* JADX INFO: renamed from: b */
    public final piu0 f126511b;

    public kfv0(Context context, piu0 piu0Var) {
        this.f126510a = context;
        this.f126511b = piu0Var;
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzeml, zzfho {
        efv0 efv0Var = new efv0(q6w0Var, (hzs0) scv0Var.f167348b, AdFormat.INTERSTITIAL);
        ihu0 ihu0VarMo150795c = this.f126511b.mo150795c(new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a), new lhu0(efv0Var, null));
        efv0Var.m120735b(ihu0VarMo150795c.mo99224b());
        ((vev0) scv0Var.f167349c).m201078p8(ihu0VarMo150795c.mo99226f());
        return ihu0VarMo150795c.mo131319i();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        try {
            ((hzs0) scv0Var.f167348b).mo113446T(q6w0Var.f155874a0);
            ((hzs0) scv0Var.f167348b).mo113449b3(q6w0Var.f155868V, q6w0Var.f155916w.toString(), b7w0Var.f75342a.f197721a.f145318d, h950.m134038Y2(this.f126510a), new jfv0(this, scv0Var, null), (jxs0) scv0Var.f167349c);
        } catch (RemoteException e) {
            d2v0.m113738l("Remote exception loading a interstitial RTB ad", e);
            guu0.m132414a(e);
        }
    }
}
