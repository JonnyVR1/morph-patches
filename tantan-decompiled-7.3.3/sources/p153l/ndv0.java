package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;

/* JADX INFO: loaded from: classes6.dex */
public final class ndv0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f141548a;

    /* JADX INFO: renamed from: b */
    public final zvt0 f141549b;

    public ndv0(Context context, zvt0 zvt0Var) {
        this.f141548a = context;
        this.f141549b = zvt0Var;
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzeml, zzfho {
        efv0 efv0Var = new efv0(q6w0Var, (hzs0) scv0Var.f167348b, AdFormat.APP_OPEN_AD);
        wvt0 wvt0VarMo196949a = this.f141549b.mo196949a(new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a), new lhu0(efv0Var, null), new xvt0(q6w0Var.f155876b0));
        efv0Var.m120735b(wvt0VarMo196949a.mo99224b());
        ((vev0) scv0Var.f167349c).m201078p8(wvt0VarMo196949a.mo99226f());
        return wvt0VarMo196949a.mo177266h();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        try {
            ((hzs0) scv0Var.f167348b).mo113446T(q6w0Var.f155874a0);
            ((hzs0) scv0Var.f167348b).mo113456z6(q6w0Var.f155868V, q6w0Var.f155916w.toString(), b7w0Var.f75342a.f197721a.f145318d, h950.m134038Y2(this.f141548a), new mdv0(scv0Var, null), (jxs0) scv0Var.f167349c);
        } catch (RemoteException e) {
            d2v0.m113738l("Remote exception loading an app open RTB ad", e);
            guu0.m132414a(e);
        }
    }
}
