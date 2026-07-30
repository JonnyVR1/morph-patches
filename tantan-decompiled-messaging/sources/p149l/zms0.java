package p149l;

import com.google.android.gms.internal.ads.zzbrm;

/* JADX INFO: loaded from: classes6.dex */
public final class zms0 {

    /* JADX INFO: renamed from: a */
    public final vls0 f203764a;

    /* JADX INFO: renamed from: b */
    public gnr f203765b;

    public zms0(vls0 vls0Var) {
        this.f203764a = vls0Var;
    }

    /* JADX INFO: renamed from: a */
    public final cns0 m219369a(String str, bms0 bms0Var, ams0 ams0Var) {
        m219372d();
        return new cns0(this.f203765b, "google.afma.activeView.handleUpdate", bms0Var, ams0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m219370b(final String str, final vgs0 vgs0Var) {
        m219372d();
        this.f203765b = jmw0.m142241n(this.f203765b, new rlw0() { // from class: l.yms0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                wls0 wls0Var = (wls0) obj;
                wls0Var.mo175389q0(str, vgs0Var);
                return jmw0.m142235h(wls0Var);
            }
        }, i3t0.f111377f);
    }

    /* JADX INFO: renamed from: c */
    public final void m219371c(final String str, final vgs0 vgs0Var) {
        this.f203765b = jmw0.m142240m(this.f203765b, new yew0() { // from class: l.vms0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                wls0 wls0Var = (wls0) obj;
                wls0Var.mo175388k0(str, vgs0Var);
                return wls0Var;
            }
        }, i3t0.f111377f);
    }

    /* JADX INFO: renamed from: d */
    public final void m219372d() {
        if (this.f203765b == null) {
            final n3t0 n3t0Var = new n3t0();
            this.f203765b = n3t0Var;
            this.f203764a.m198863b(null).m114708e(new r3t0() { // from class: l.wms0
                @Override // p149l.r3t0
                public final void zza(Object obj) {
                    n3t0Var.m157774b((wls0) obj);
                }
            }, new p3t0() { // from class: l.xms0
                @Override // p149l.p3t0
                public final void zza() {
                    n3t0Var.m157775c(new zzbrm("Cannot get Javascript Engine"));
                }
            });
        }
    }
}
