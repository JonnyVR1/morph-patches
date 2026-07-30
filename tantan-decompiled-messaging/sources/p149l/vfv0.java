package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.C2075b;

/* JADX INFO: loaded from: classes6.dex */
public final class vfv0 implements qlv0 {

    /* JADX INFO: renamed from: j */
    public static final Object f181308j = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f181309a;

    /* JADX INFO: renamed from: b */
    public final String f181310b;

    /* JADX INFO: renamed from: c */
    public final String f181311c;

    /* JADX INFO: renamed from: d */
    public final nst0 f181312d;

    /* JADX INFO: renamed from: e */
    public final vzv0 f181313e;

    /* JADX INFO: renamed from: f */
    public final iyv0 f181314f;

    /* JADX INFO: renamed from: g */
    public final aiw0 f181315g = vny0.m199079q().m212279i();

    /* JADX INFO: renamed from: h */
    public final mnu0 f181316h;

    /* JADX INFO: renamed from: i */
    public final att0 f181317i;

    public vfv0(Context context, String str, String str2, nst0 nst0Var, vzv0 vzv0Var, iyv0 iyv0Var, mnu0 mnu0Var, att0 att0Var) {
        this.f181309a = context;
        this.f181310b = str;
        this.f181311c = str2;
        this.f181312d = nst0Var;
        this.f181313e = vzv0Var;
        this.f181314f = iyv0Var;
        this.f181316h = mnu0Var;
        this.f181317i = att0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m198293a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131850A5)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132480z5)).booleanValue()) {
                synchronized (f181308j) {
                    this.f181312d.m160794k(this.f181314f.f115494d);
                    bundle2.putBundle("quality_signals", this.f181313e.m200787a());
                }
            } else {
                this.f181312d.m160794k(this.f181314f.f115494d);
                bundle2.putBundle("quality_signals", this.f181313e.m200787a());
            }
        }
        bundle2.putString("seq_num", this.f181310b);
        if (!this.f181315g.mo96947f()) {
            bundle2.putString("session_id", this.f181311c);
        }
        bundle2.putBoolean("client_purpose_one", !this.f181315g.mo96947f());
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131862B5)).booleanValue()) {
            try {
                vny0.m199080r();
                bundle2.putString("_app_id", C2075b.m12297R(this.f181309a));
            } catch (RemoteException e) {
                vny0.m199079q().m212290w(e, "AppStatsSignal_AppId");
            }
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131874C5)).booleanValue() && this.f181314f.f115496f != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.f181317i.m98880b(this.f181314f.f115496f));
            bundle3.putInt("pcc", this.f181317i.m98879a(this.f181314f.f115496f));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132472y9)).booleanValue() || vny0.m199079q().m212273a() <= 0) {
            return;
        }
        bundle2.putInt("nrwv", vny0.m199079q().m212273a());
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 12;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132470y7)).booleanValue()) {
            mnu0 mnu0Var = this.f181316h;
            mnu0Var.m155566a().put("seq_num", this.f181310b);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131850A5)).booleanValue()) {
            this.f181312d.m160794k(this.f181314f.f115494d);
            bundle.putAll(this.f181313e.m200787a());
        }
        return jmw0.m142235h(new plv0() { // from class: l.ufv0
            @Override // p149l.plv0
            /* JADX INFO: renamed from: a */
            public final void mo96132a(Object obj) {
                this.f176332a.m198293a(bundle, (Bundle) obj);
            }
        });
    }
}
