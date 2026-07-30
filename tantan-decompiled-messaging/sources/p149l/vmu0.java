package p149l;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzdkv;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class vmu0 implements b3u0, b1r0, dyt0, nxt0 {

    /* JADX INFO: renamed from: a */
    public final Context f182151a;

    /* JADX INFO: renamed from: b */
    public final zyv0 f182152b;

    /* JADX INFO: renamed from: c */
    public final rnu0 f182153c;

    /* JADX INFO: renamed from: d */
    public final vxv0 f182154d;

    /* JADX INFO: renamed from: e */
    public final kxv0 f182155e;

    /* JADX INFO: renamed from: f */
    public final z1v0 f182156f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Boolean f182157g;

    /* JADX INFO: renamed from: h */
    public final boolean f182158h = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132055R6)).booleanValue();

    public vmu0(Context context, zyv0 zyv0Var, rnu0 rnu0Var, vxv0 vxv0Var, kxv0 kxv0Var, z1v0 z1v0Var) {
        this.f182151a = context;
        this.f182152b = zyv0Var;
        this.f182153c = rnu0Var;
        this.f182154d = vxv0Var;
        this.f182155e = kxv0Var;
        this.f182156f = z1v0Var;
    }

    /* JADX INFO: renamed from: q */
    private final boolean m198995q() {
        String strM12297R;
        if (this.f182157g == null) {
            synchronized (this) {
                if (this.f182157g == null) {
                    String str = (String) d1s0.m109677c().m144697a(m7s0.f132404t1);
                    vny0.m199080r();
                    try {
                        strM12297R = C2075b.m12297R(this.f182151a);
                    } catch (RemoteException unused) {
                        strM12297R = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strM12297R != null) {
                        try {
                            zMatches = Pattern.matches(str, strM12297R);
                        } catch (RuntimeException e) {
                            vny0.m199079q().m212290w(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f182157g = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f182157g.booleanValue();
    }

    @Override // p149l.nxt0
    /* JADX INFO: renamed from: Z */
    public final void mo161952Z(zzdkv zzdkvVar) {
        if (this.f182158h) {
            qnu0 qnu0VarM198996b = m198996b("ifts");
            qnu0VarM198996b.m175693b(Reason.TYPE, "exception");
            if (!TextUtils.isEmpty(zzdkvVar.getMessage())) {
                qnu0VarM198996b.m175693b("msg", zzdkvVar.getMessage());
            }
            qnu0VarM198996b.m175698g();
        }
    }

    @Override // p149l.dyt0
    /* JADX INFO: renamed from: a */
    public final void mo95459a() {
        if (m198995q() || this.f182155e.f125202j0) {
            m198997k(m198996b("impression"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final qnu0 m198996b(String str) {
        qnu0 qnu0VarM180208a = this.f182153c.m180208a();
        qnu0VarM180208a.m175696e(this.f182154d.f183478b.f178773b);
        qnu0VarM180208a.m175695d(this.f182155e);
        qnu0VarM180208a.m175693b("action", str);
        if (!this.f182155e.f125223u.isEmpty()) {
            qnu0VarM180208a.m175693b("ancn", (String) this.f182155e.f125223u.get(0));
        }
        if (this.f182155e.f125202j0) {
            qnu0VarM180208a.m175693b("device_connectivity", true != vny0.m199079q().m212293z(this.f182151a) ? UserBanAppealSwitch.offline : "online");
            qnu0VarM180208a.m175693b("event_timestamp", String.valueOf(vny0.m199064b().currentTimeMillis()));
            qnu0VarM180208a.m175693b("offline_ad", "1");
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132164a7)).booleanValue()) {
            boolean z = kpv0.m146891e(this.f182154d.f183477a.f166831a) != 1;
            qnu0VarM180208a.m175693b("scar", String.valueOf(z));
            if (z) {
                zzl zzlVar = this.f182154d.f183477a.f166831a.f115494d;
                qnu0VarM180208a.m175694c("ragent", zzlVar.zzp);
                qnu0VarM180208a.m175694c("rtype", kpv0.m146887a(kpv0.m146888b(zzlVar)));
            }
        }
        return qnu0VarM180208a;
    }

    @Override // p149l.nxt0
    /* JADX INFO: renamed from: i */
    public final void mo161953i(zze zzeVar) {
        zze zzeVar2;
        if (this.f182158h) {
            qnu0 qnu0VarM198996b = m198996b("ifts");
            qnu0VarM198996b.m175693b(Reason.TYPE, "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals("com.google.android.gms.ads") && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals("com.google.android.gms.ads")) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                qnu0VarM198996b.m175693b("arec", String.valueOf(i));
            }
            String strM220950a = this.f182152b.m220950a(str);
            if (strM220950a != null) {
                qnu0VarM198996b.m175693b("areec", strM220950a);
            }
            qnu0VarM198996b.m175698g();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m198997k(qnu0 qnu0Var) {
        if (!this.f182155e.f125202j0) {
            qnu0Var.m175698g();
            return;
        }
        this.f182156f.m216820g(new b2v0(vny0.m199064b().currentTimeMillis(), this.f182154d.f183478b.f178773b.f141055b, qnu0Var.m175697f(), 2));
    }

    @Override // p149l.b1r0
    public final void onAdClicked() {
        if (this.f182155e.f125202j0) {
            m198997k(m198996b("click"));
        }
    }

    @Override // p149l.nxt0
    public final void zzb() {
        if (this.f182158h) {
            qnu0 qnu0VarM198996b = m198996b("ifts");
            qnu0VarM198996b.m175693b(Reason.TYPE, "blocked");
            qnu0VarM198996b.m175698g();
        }
    }

    @Override // p149l.b3u0
    public final void zzi() {
        if (m198995q()) {
            m198996b("adapter_shown").m175698g();
        }
    }

    @Override // p149l.b3u0
    public final void zzj() {
        if (m198995q()) {
            m198996b("adapter_impression").m175698g();
        }
    }
}
