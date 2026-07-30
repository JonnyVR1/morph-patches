package p149l;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcvt;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class t4v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f167752a;

    /* JADX INFO: renamed from: b */
    public final tot0 f167753b;

    /* JADX INFO: renamed from: c */
    public final Executor f167754c;

    public t4v0(Context context, tot0 tot0Var, Executor executor) {
        this.f167752a = context;
        this.f167753b = tot0Var;
        this.f167754c = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, final kxv0 kxv0Var, m3v0 m3v0Var) throws zzeml, zzfho {
        final View viewM152376f;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131948I7)).booleanValue() && kxv0Var.f125198h0) {
            gos0 gos0VarM152378h = ((lzv0) m3v0Var.f131187b).m152378h();
            if (gos0VarM152378h == null) {
                x2t0.m206866d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfho(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewM152376f = (View) s050.m181847P2(gos0VarM152378h.zze());
                boolean zZzf = gos0VarM152378h.zzf();
                if (viewM152376f == null) {
                    throw new zzfho(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewM152376f = (View) jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.r4v0
                            @Override // p149l.rlw0
                            public final gnr zza(Object obj) {
                                return this.f157732a.m187228c(viewM152376f, kxv0Var, obj);
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
            viewM152376f = ((lzv0) m3v0Var.f131187b).m152376f();
        }
        tot0 tot0Var = this.f167753b;
        uqt0 uqt0Var = new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a);
        final lzv0 lzv0Var = (lzv0) m3v0Var.f131187b;
        Objects.requireNonNull(lzv0Var);
        pnt0 pnt0VarMo189928a = tot0Var.mo189928a(uqt0Var, new vnt0(viewM152376f, null, new cqt0() { // from class: l.s4v0
            @Override // p149l.cqt0
            public final fgu0 zza() {
                return lzv0Var.m152377g();
            }
        }, (lxv0) kxv0Var.f125225v.get(0)));
        pnt0VarMo189928a.mo170464i().m192029w0(viewM152376f);
        pnt0VarMo189928a.mo96325c().m114710q0(new hkt0((lzv0) m3v0Var.f131187b), this.f167754c);
        ((p5v0) m3v0Var.f131188c).m167520p8(pnt0VarMo189928a.mo96328g());
        return pnt0VarMo189928a.mo170463h();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        zzq zzqVar;
        zzq zzqVar2 = vxv0Var.f183477a.f166831a.f115495e;
        if (zzqVar2.zzn) {
            zzqVar = new zzq(this.f167752a, f0s0.m119046d(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) d1s0.m109677c().m144697a(m7s0.f131948I7)).booleanValue() && kxv0Var.f125198h0) ? new zzq(this.f167752a, f0s0.m119047e(zzqVar2.zze, zzqVar2.zzb)) : oyv0.m166723a(this.f167752a, kxv0Var.f125225v);
        }
        zzq zzqVar3 = zzqVar;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131948I7)).booleanValue() && kxv0Var.f125198h0) {
            Object obj = m3v0Var.f131187b;
            ((lzv0) obj).m152389s(this.f167752a, zzqVar3, vxv0Var.f183477a.f166831a.f115494d, kxv0Var.f125226w.toString(), prs0.m171071l(kxv0Var.f125221t), (dos0) m3v0Var.f131188c);
            return;
        }
        Object obj2 = m3v0Var.f131187b;
        ((lzv0) obj2).m152388r(this.f167752a, zzqVar3, vxv0Var.f183477a.f166831a.f115494d, kxv0Var.f125226w.toString(), prs0.m171071l(kxv0Var.f125221t), (dos0) m3v0Var.f131188c);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m187228c(View view, kxv0 kxv0Var, Object obj) throws Exception {
        return jmw0.m142235h(zzcvt.m13745a(this.f167752a, view, kxv0Var));
    }
}
