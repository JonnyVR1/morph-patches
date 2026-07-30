package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;

/* JADX INFO: loaded from: classes6.dex */
public final class o8v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f142677a;

    /* JADX INFO: renamed from: b */
    public final jju0 f142678b;

    public o8v0(Context context, jju0 jju0Var) {
        this.f142677a = context;
        this.f142678b = jju0Var;
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzeml, zzfho {
        y5v0 y5v0Var = new y5v0(kxv0Var, (bqs0) m3v0Var.f131187b, AdFormat.REWARDED);
        fju0 fju0VarMo96733b = this.f142678b.mo96733b(new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a), new gju0(y5v0Var));
        y5v0Var.m213020b(fju0VarMo96733b.mo96324b());
        ((p5v0) m3v0Var.f131188c).m167520p8(fju0VarMo96733b.mo121636n());
        return fju0VarMo96733b.mo121633k();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        try {
            ((bqs0) m3v0Var.f131187b).mo103413T(kxv0Var.f125184a0);
            int i = vxv0Var.f183477a.f166831a.f115505o.f161517a;
            Object obj = m3v0Var.f131187b;
            if (i == 3) {
                ((bqs0) obj).mo103411I7(kxv0Var.f125178V, kxv0Var.f125226w.toString(), vxv0Var.f183477a.f166831a.f115494d, s050.m181848Y2(this.f142677a), new n8v0(this, m3v0Var, null), (dos0) m3v0Var.f131188c);
            } else {
                ((bqs0) obj).mo103420t7(kxv0Var.f125178V, kxv0Var.f125226w.toString(), vxv0Var.f183477a.f166831a.f115494d, s050.m181848Y2(this.f142677a), new n8v0(this, m3v0Var, null), (dos0) m3v0Var.f131188c);
            }
        } catch (RemoteException e) {
            xsu0.m210835l("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
