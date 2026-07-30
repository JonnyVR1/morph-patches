package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;

/* JADX INFO: loaded from: classes6.dex */
public final class z6v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f201962a;

    /* JADX INFO: renamed from: b */
    public final kau0 f201963b;

    /* JADX INFO: renamed from: c */
    public los0 f201964c;

    /* JADX INFO: renamed from: d */
    public final zzcei f201965d;

    public z6v0(Context context, kau0 kau0Var, zzcei zzceiVar) {
        this.f201962a = context;
        this.f201963b = kau0Var;
        this.f201965d = zzceiVar;
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzeml, zzfho {
        if (!vxv0Var.f183477a.f166831a.f115497g.contains(Integer.toString(6))) {
            throw new zzeml(2, "Unified must be used for RTB.");
        }
        ocu0 ocu0VarM163564g0 = ocu0.m163564g0(this.f201964c);
        iyv0 iyv0Var = vxv0Var.f183477a.f166831a;
        if (!iyv0Var.f115497g.contains(Integer.toString(ocu0VarM163564g0.m163573P()))) {
            throw new zzeml(1, "No corresponding native ad listener");
        }
        qcu0 qcu0VarMo145185d = this.f201963b.mo145185d(new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a), new adu0(ocu0VarM163564g0), new dfu0(null, null, this.f201964c));
        ((p5v0) m3v0Var.f131188c).m167520p8(qcu0VarMo145185d.mo96327f());
        return qcu0VarMo145185d.mo126223h();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        try {
            ((bqs0) m3v0Var.f131187b).mo103413T(kxv0Var.f125184a0);
            int i = this.f201965d.zzc;
            int iIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f131930H1)).intValue();
            Object obj = m3v0Var.f131187b;
            x6v0 x6v0Var = null;
            if (i < iIntValue) {
                ((bqs0) obj).mo103414T0(kxv0Var.f125178V, kxv0Var.f125226w.toString(), vxv0Var.f183477a.f166831a.f115494d, s050.m181848Y2(this.f201962a), new y6v0(this, m3v0Var, x6v0Var), (dos0) m3v0Var.f131188c);
            } else {
                ((bqs0) obj).mo103415X3(kxv0Var.f125178V, kxv0Var.f125226w.toString(), vxv0Var.f183477a.f166831a.f115494d, s050.m181848Y2(this.f201962a), new y6v0(this, m3v0Var, x6v0Var), (dos0) m3v0Var.f131188c, vxv0Var.f183477a.f166831a.f115499i);
            }
        } catch (RemoteException e) {
            alu0.m97454a(e);
        }
    }
}
