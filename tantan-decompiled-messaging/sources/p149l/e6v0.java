package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;

/* JADX INFO: loaded from: classes6.dex */
public final class e6v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f89639a;

    /* JADX INFO: renamed from: b */
    public final j9u0 f89640b;

    public e6v0(Context context, j9u0 j9u0Var) {
        this.f89639a = context;
        this.f89640b = j9u0Var;
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzeml, zzfho {
        y5v0 y5v0Var = new y5v0(kxv0Var, (bqs0) m3v0Var.f131187b, AdFormat.INTERSTITIAL);
        c8u0 c8u0VarMo116365c = this.f89640b.mo116365c(new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a), new f8u0(y5v0Var, null));
        y5v0Var.m213020b(c8u0VarMo116365c.mo96324b());
        ((p5v0) m3v0Var.f131188c).m167520p8(c8u0VarMo116365c.mo96327f());
        return c8u0VarMo116365c.mo96330i();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        try {
            ((bqs0) m3v0Var.f131187b).mo103413T(kxv0Var.f125184a0);
            ((bqs0) m3v0Var.f131187b).mo103416b3(kxv0Var.f125178V, kxv0Var.f125226w.toString(), vxv0Var.f183477a.f166831a.f115494d, s050.m181848Y2(this.f89639a), new d6v0(this, m3v0Var, null), (dos0) m3v0Var.f131188c);
        } catch (RemoteException e) {
            xsu0.m210835l("Remote exception loading a interstitial RTB ad", e);
            alu0.m97454a(e);
        }
    }
}
