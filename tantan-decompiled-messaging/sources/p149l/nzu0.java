package p149l;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzdkv;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class nzu0 implements b3u0, b1r0, dyt0, nxt0 {

    /* JADX INFO: renamed from: a */
    public final Context f141252a;

    /* JADX INFO: renamed from: b */
    public final zyv0 f141253b;

    /* JADX INFO: renamed from: c */
    public final vxv0 f141254c;

    /* JADX INFO: renamed from: d */
    public final kxv0 f141255d;

    /* JADX INFO: renamed from: e */
    public final z1v0 f141256e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Boolean f141257f;

    /* JADX INFO: renamed from: g */
    public final boolean f141258g = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132055R6)).booleanValue();

    /* JADX INFO: renamed from: h */
    @NonNull
    public final p3w0 f141259h;

    /* JADX INFO: renamed from: i */
    public final String f141260i;

    public nzu0(Context context, zyv0 zyv0Var, vxv0 vxv0Var, kxv0 kxv0Var, z1v0 z1v0Var, @NonNull p3w0 p3w0Var, String str) {
        this.f141252a = context;
        this.f141253b = zyv0Var;
        this.f141254c = vxv0Var;
        this.f141255d = kxv0Var;
        this.f141256e = z1v0Var;
        this.f141259h = p3w0Var;
        this.f141260i = str;
    }

    /* JADX INFO: renamed from: q */
    private final boolean m162098q() {
        String strM12297R;
        if (this.f141257f == null) {
            synchronized (this) {
                if (this.f141257f == null) {
                    String str = (String) d1s0.m109677c().m144697a(m7s0.f132404t1);
                    vny0.m199080r();
                    try {
                        strM12297R = C2075b.m12297R(this.f141252a);
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
                    this.f141257f = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f141257f.booleanValue();
    }

    @Override // p149l.nxt0
    /* JADX INFO: renamed from: Z */
    public final void mo161952Z(zzdkv zzdkvVar) {
        if (this.f141258g) {
            o3w0 o3w0VarM162099b = m162099b("ifts");
            o3w0VarM162099b.m162491a(Reason.TYPE, "exception");
            if (!TextUtils.isEmpty(zzdkvVar.getMessage())) {
                o3w0VarM162099b.m162491a("msg", zzdkvVar.getMessage());
            }
            this.f141259h.mo124429a(o3w0VarM162099b);
        }
    }

    @Override // p149l.dyt0
    /* JADX INFO: renamed from: a */
    public final void mo95459a() {
        if (m162098q() || this.f141255d.f125202j0) {
            m162100k(m162099b("impression"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final o3w0 m162099b(String str) {
        o3w0 o3w0VarM162489b = o3w0.m162489b(str);
        o3w0VarM162489b.m162496h(this.f141254c, null);
        o3w0VarM162489b.m162494f(this.f141255d);
        o3w0VarM162489b.m162491a("request_id", this.f141260i);
        if (!this.f141255d.f125223u.isEmpty()) {
            o3w0VarM162489b.m162491a("ancn", (String) this.f141255d.f125223u.get(0));
        }
        if (this.f141255d.f125202j0) {
            o3w0VarM162489b.m162491a("device_connectivity", true != vny0.m199079q().m212293z(this.f141252a) ? UserBanAppealSwitch.offline : "online");
            o3w0VarM162489b.m162491a("event_timestamp", String.valueOf(vny0.m199064b().currentTimeMillis()));
            o3w0VarM162489b.m162491a("offline_ad", "1");
        }
        return o3w0VarM162489b;
    }

    @Override // p149l.nxt0
    /* JADX INFO: renamed from: i */
    public final void mo161953i(zze zzeVar) {
        zze zzeVar2;
        if (this.f141258g) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals("com.google.android.gms.ads") && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals("com.google.android.gms.ads")) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String strM220950a = this.f141253b.m220950a(str);
            o3w0 o3w0VarM162099b = m162099b("ifts");
            o3w0VarM162099b.m162491a(Reason.TYPE, "adapter");
            if (i >= 0) {
                o3w0VarM162099b.m162491a("arec", String.valueOf(i));
            }
            if (strM220950a != null) {
                o3w0VarM162099b.m162491a("areec", strM220950a);
            }
            this.f141259h.mo124429a(o3w0VarM162099b);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m162100k(o3w0 o3w0Var) {
        boolean z = this.f141255d.f125202j0;
        p3w0 p3w0Var = this.f141259h;
        if (!z) {
            p3w0Var.mo124429a(o3w0Var);
            return;
        }
        this.f141256e.m216820g(new b2v0(vny0.m199064b().currentTimeMillis(), this.f141254c.f183478b.f178773b.f141055b, p3w0Var.mo124430b(o3w0Var), 2));
    }

    @Override // p149l.b1r0
    public final void onAdClicked() {
        if (this.f141255d.f125202j0) {
            m162100k(m162099b("click"));
        }
    }

    @Override // p149l.nxt0
    public final void zzb() {
        if (this.f141258g) {
            p3w0 p3w0Var = this.f141259h;
            o3w0 o3w0VarM162099b = m162099b("ifts");
            o3w0VarM162099b.m162491a(Reason.TYPE, "blocked");
            p3w0Var.mo124429a(o3w0VarM162099b);
        }
    }

    @Override // p149l.b3u0
    public final void zzi() {
        if (m162098q()) {
            this.f141259h.mo124429a(m162099b("adapter_shown"));
        }
    }

    @Override // p149l.b3u0
    public final void zzj() {
        if (m162098q()) {
            this.f141259h.mo124429a(m162099b("adapter_impression"));
        }
    }
}
