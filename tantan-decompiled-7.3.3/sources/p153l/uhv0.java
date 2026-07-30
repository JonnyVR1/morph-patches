package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;

/* JADX INFO: loaded from: classes6.dex */
public final class uhv0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f179060a;

    /* JADX INFO: renamed from: b */
    public final psu0 f179061b;

    public uhv0(Context context, psu0 psu0Var) {
        this.f179060a = context;
        this.f179061b = psu0Var;
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzeml, zzfho {
        efv0 efv0Var = new efv0(q6w0Var, (hzs0) scv0Var.f167348b, AdFormat.REWARDED);
        lsu0 lsu0VarMo131473b = this.f179061b.mo131473b(new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a), new msu0(efv0Var));
        efv0Var.m120735b(lsu0VarMo131473b.mo99224b());
        ((vev0) scv0Var.f167349c).m201078p8(lsu0VarMo131473b.mo111988n());
        return lsu0VarMo131473b.mo111985k();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        try {
            ((hzs0) scv0Var.f167348b).mo113446T(q6w0Var.f155874a0);
            int i = b7w0Var.f75342a.f197721a.f145329o.f192644a;
            Object obj = scv0Var.f167348b;
            if (i == 3) {
                ((hzs0) obj).mo113444I7(q6w0Var.f155868V, q6w0Var.f155916w.toString(), b7w0Var.f75342a.f197721a.f145318d, h950.m134038Y2(this.f179060a), new thv0(this, scv0Var, null), (jxs0) scv0Var.f167349c);
            } else {
                ((hzs0) obj).mo113454t7(q6w0Var.f155868V, q6w0Var.f155916w.toString(), b7w0Var.f75342a.f197721a.f145318d, h950.m134038Y2(this.f179060a), new thv0(this, scv0Var, null), (jxs0) scv0Var.f167349c);
            }
        } catch (RemoteException e) {
            d2v0.m113738l("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
