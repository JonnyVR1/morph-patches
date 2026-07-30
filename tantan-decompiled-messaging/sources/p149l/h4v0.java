package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;

/* JADX INFO: loaded from: classes6.dex */
public final class h4v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f105893a;

    /* JADX INFO: renamed from: b */
    public final tmt0 f105894b;

    public h4v0(Context context, tmt0 tmt0Var) {
        this.f105893a = context;
        this.f105894b = tmt0Var;
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzeml, zzfho {
        y5v0 y5v0Var = new y5v0(kxv0Var, (bqs0) m3v0Var.f131187b, AdFormat.APP_OPEN_AD);
        qmt0 qmt0VarMo164021a = this.f105894b.mo164021a(new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a), new f8u0(y5v0Var, null), new rmt0(kxv0Var.f125186b0));
        y5v0Var.m213020b(qmt0VarMo164021a.mo96324b());
        ((p5v0) m3v0Var.f131188c).m167520p8(qmt0VarMo164021a.mo96327f());
        return qmt0VarMo164021a.mo145803h();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        try {
            ((bqs0) m3v0Var.f131187b).mo103413T(kxv0Var.f125184a0);
            ((bqs0) m3v0Var.f131187b).mo103422z6(kxv0Var.f125178V, kxv0Var.f125226w.toString(), vxv0Var.f183477a.f166831a.f115494d, s050.m181848Y2(this.f105893a), new g4v0(m3v0Var, null), (dos0) m3v0Var.f131188c);
        } catch (RemoteException e) {
            xsu0.m210835l("Remote exception loading an app open RTB ad", e);
            alu0.m97454a(e);
        }
    }
}
