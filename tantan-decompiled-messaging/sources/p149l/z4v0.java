package p149l;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzcvt;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class z4v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f201639a;

    /* JADX INFO: renamed from: b */
    public final tot0 f201640b;

    /* JADX INFO: renamed from: c */
    public View f201641c;

    /* JADX INFO: renamed from: d */
    public gos0 f201642d;

    public z4v0(Context context, tot0 tot0Var) {
        this.f201639a = context;
        this.f201640b = tot0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, final kxv0 kxv0Var, final m3v0 m3v0Var) throws zzeml, zzfho {
        final View view;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131948I7)).booleanValue() && kxv0Var.f125198h0) {
            try {
                view = (View) s050.m181847P2(this.f201642d.zze());
                boolean zZzf = this.f201642d.zzf();
                if (view == null) {
                    throw new zzfho(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.w4v0
                            @Override // p149l.rlw0
                            public final gnr zza(Object obj) {
                                return this.f184611a.m217132c(view, kxv0Var, obj);
                            }
                        }, i3t0.f111376e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        alu0.m97454a(e);
                        return null;
                    }
                }
            } catch (RemoteException e2) {
                alu0.m97454a(e2);
                return null;
            }
        } else {
            view = this.f201641c;
        }
        pnt0 pnt0VarMo189928a = this.f201640b.mo189928a(new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a), new vnt0(view, null, new cqt0() { // from class: l.v4v0
            @Override // p149l.cqt0
            public final fgu0 zza() throws zzfho {
                try {
                    return ((bqs0) m3v0Var.f131187b).zze();
                } catch (RemoteException e3) {
                    alu0.m97454a(e3);
                    return null;
                }
            }
        }, (lxv0) kxv0Var.f125225v.get(0)));
        pnt0VarMo189928a.mo170464i().m192029w0(view);
        ((p5v0) m3v0Var.f131188c).m167520p8(pnt0VarMo189928a.mo96327f());
        return pnt0VarMo189928a.mo170463h();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        try {
            ((bqs0) m3v0Var.f131187b).mo103413T(kxv0Var.f125184a0);
            x4v0 x4v0Var = null;
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131948I7)).booleanValue() && kxv0Var.f125198h0) {
                ((bqs0) m3v0Var.f131187b).mo103421z1(kxv0Var.f125178V, kxv0Var.f125226w.toString(), vxv0Var.f183477a.f166831a.f115494d, s050.m181848Y2(this.f201639a), new y4v0(this, m3v0Var, x4v0Var), (dos0) m3v0Var.f131188c, vxv0Var.f183477a.f166831a.f115495e);
            } else {
                ((bqs0) m3v0Var.f131187b).mo103412O1(kxv0Var.f125178V, kxv0Var.f125226w.toString(), vxv0Var.f183477a.f166831a.f115494d, s050.m181848Y2(this.f201639a), new y4v0(this, m3v0Var, x4v0Var), (dos0) m3v0Var.f131188c, vxv0Var.f183477a.f166831a.f115495e);
            }
        } catch (RemoteException e) {
            alu0.m97454a(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m217132c(View view, kxv0 kxv0Var, Object obj) throws Exception {
        return jmw0.m142235h(zzcvt.m13745a(this.f201639a, view, kxv0Var));
    }
}
