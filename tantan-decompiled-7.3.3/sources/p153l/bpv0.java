package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.C2098b;

/* JADX INFO: loaded from: classes6.dex */
public final class bpv0 implements wuv0 {

    /* JADX INFO: renamed from: j */
    public static final Object f77815j = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f77816a;

    /* JADX INFO: renamed from: b */
    public final String f77817b;

    /* JADX INFO: renamed from: c */
    public final String f77818c;

    /* JADX INFO: renamed from: d */
    public final t1u0 f77819d;

    /* JADX INFO: renamed from: e */
    public final b9w0 f77820e;

    /* JADX INFO: renamed from: f */
    public final o7w0 f77821f;

    /* JADX INFO: renamed from: g */
    public final grw0 f77822g = bxy0.m106933q().m120264i();

    /* JADX INFO: renamed from: h */
    public final swu0 f77823h;

    /* JADX INFO: renamed from: i */
    public final g2u0 f77824i;

    public bpv0(Context context, String str, String str2, t1u0 t1u0Var, b9w0 b9w0Var, o7w0 o7w0Var, swu0 swu0Var, g2u0 g2u0Var) {
        this.f77816a = context;
        this.f77817b = str;
        this.f77818c = str2;
        this.f77819d = t1u0Var;
        this.f77820e = b9w0Var;
        this.f77821f = o7w0Var;
        this.f77823h = swu0Var;
        this.f77824i = g2u0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m105852a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167921A5)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168551z5)).booleanValue()) {
                synchronized (f77815j) {
                    this.f77819d.m188937k(this.f77821f.f145318d);
                    bundle2.putBundle("quality_signals", this.f77820e.m103143a());
                }
            } else {
                this.f77819d.m188937k(this.f77821f.f145318d);
                bundle2.putBundle("quality_signals", this.f77820e.m103143a());
            }
        }
        bundle2.putString("seq_num", this.f77817b);
        if (!this.f77822g.mo131896f()) {
            bundle2.putString("session_id", this.f77818c);
        }
        bundle2.putBoolean("client_purpose_one", !this.f77822g.mo131896f());
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167933B5)).booleanValue()) {
            try {
                bxy0.m106934r();
                bundle2.putString("_app_id", C2098b.m12351R(this.f77816a));
            } catch (RemoteException e) {
                bxy0.m106933q().m120275w(e, "AppStatsSignal_AppId");
            }
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167945C5)).booleanValue() && this.f77821f.f145320f != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.f77824i.m128662b(this.f77821f.f145320f));
            bundle3.putInt("pcc", this.f77824i.m128661a(this.f77821f.f145320f));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168543y9)).booleanValue() || bxy0.m106933q().m120258a() <= 0) {
            return;
        }
        bundle2.putInt("nrwv", bxy0.m106933q().m120258a());
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 12;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168541y7)).booleanValue()) {
            swu0 swu0Var = this.f77823h;
            swu0Var.m188363a().put("seq_num", this.f77817b);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167921A5)).booleanValue()) {
            this.f77819d.m188937k(this.f77821f.f145318d);
            bundle.putAll(this.f77820e.m103143a());
        }
        return pvw0.m173981h(new vuv0() { // from class: l.apv0
            @Override // p153l.vuv0
            /* JADX INFO: renamed from: a */
            public final void mo99378a(Object obj) {
                this.f72760a.m105852a(bundle, (Bundle) obj);
            }
        });
    }
}
