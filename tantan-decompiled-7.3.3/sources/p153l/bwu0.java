package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzdkv;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class bwu0 implements hcu0, har0, j7u0, t6u0 {

    /* JADX INFO: renamed from: a */
    public final Context f78784a;

    /* JADX INFO: renamed from: b */
    public final f8w0 f78785b;

    /* JADX INFO: renamed from: c */
    public final xwu0 f78786c;

    /* JADX INFO: renamed from: d */
    public final b7w0 f78787d;

    /* JADX INFO: renamed from: e */
    public final q6w0 f78788e;

    /* JADX INFO: renamed from: f */
    public final fbv0 f78789f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Boolean f78790g;

    /* JADX INFO: renamed from: h */
    public final boolean f78791h = ((Boolean) jas0.m144075c().m176505a(sgs0.f168126R6)).booleanValue();

    public bwu0(Context context, f8w0 f8w0Var, xwu0 xwu0Var, b7w0 b7w0Var, q6w0 q6w0Var, fbv0 fbv0Var) {
        this.f78784a = context;
        this.f78785b = f8w0Var;
        this.f78786c = xwu0Var;
        this.f78787d = b7w0Var;
        this.f78788e = q6w0Var;
        this.f78789f = fbv0Var;
    }

    /* JADX INFO: renamed from: q */
    private final boolean m106808q() {
        String strM12351R;
        if (this.f78790g == null) {
            synchronized (this) {
                if (this.f78790g == null) {
                    String str = (String) jas0.m144075c().m176505a(sgs0.f168475t1);
                    bxy0.m106934r();
                    try {
                        strM12351R = C2098b.m12351R(this.f78784a);
                    } catch (RemoteException unused) {
                        strM12351R = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strM12351R != null) {
                        try {
                            zMatches = Pattern.matches(str, strM12351R);
                        } catch (RuntimeException e) {
                            bxy0.m106933q().m120275w(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f78790g = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f78790g.booleanValue();
    }

    @Override // p153l.t6u0
    /* JADX INFO: renamed from: Z */
    public final void mo102875Z(zzdkv zzdkvVar) {
        if (this.f78791h) {
            wwu0 wwu0VarM106810b = m106810b("ifts");
            wwu0VarM106810b.m208307b(Reason.TYPE, "exception");
            if (!TextUtils.isEmpty(zzdkvVar.getMessage())) {
                wwu0VarM106810b.m208307b("msg", zzdkvVar.getMessage());
            }
            wwu0VarM106810b.m208312g();
        }
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final void mo106809a() {
        if (m106808q() || this.f78788e.f155892j0) {
            m106811k(m106810b("impression"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final wwu0 m106810b(String str) {
        wwu0 wwu0VarM213443a = this.f78786c.m213443a();
        wwu0VarM213443a.m208310e(this.f78787d.f75343b.f68854b);
        wwu0VarM213443a.m208309d(this.f78788e);
        wwu0VarM213443a.m208307b("action", str);
        if (!this.f78788e.f155913u.isEmpty()) {
            wwu0VarM213443a.m208307b("ancn", (String) this.f78788e.f155913u.get(0));
        }
        if (this.f78788e.f155892j0) {
            wwu0VarM213443a.m208307b("device_connectivity", true != bxy0.m106933q().m120278z(this.f78784a) ? UserBanAppealSwitch.offline : "online");
            wwu0VarM213443a.m208307b("event_timestamp", String.valueOf(bxy0.m106918b().currentTimeMillis()));
            wwu0VarM213443a.m208307b("offline_ad", "1");
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168235a7)).booleanValue()) {
            boolean z = qyv0.m178754e(this.f78787d.f75342a.f197721a) != 1;
            wwu0VarM213443a.m208307b("scar", String.valueOf(z));
            if (z) {
                zzl zzlVar = this.f78787d.f75342a.f197721a.f145318d;
                wwu0VarM213443a.m208308c("ragent", zzlVar.zzp);
                wwu0VarM213443a.m208308c("rtype", qyv0.m178750a(qyv0.m178751b(zzlVar)));
            }
        }
        return wwu0VarM213443a;
    }

    @Override // p153l.t6u0
    /* JADX INFO: renamed from: i */
    public final void mo102876i(zze zzeVar) {
        zze zzeVar2;
        if (this.f78791h) {
            wwu0 wwu0VarM106810b = m106810b("ifts");
            wwu0VarM106810b.m208307b(Reason.TYPE, "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals("com.google.android.gms.ads") && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals("com.google.android.gms.ads")) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                wwu0VarM106810b.m208307b("arec", String.valueOf(i));
            }
            String strM124572a = this.f78785b.m124572a(str);
            if (strM124572a != null) {
                wwu0VarM106810b.m208307b("areec", strM124572a);
            }
            wwu0VarM106810b.m208312g();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m106811k(wwu0 wwu0Var) {
        if (!this.f78788e.f155892j0) {
            wwu0Var.m208312g();
            return;
        }
        this.f78789f.m124959g(new hbv0(bxy0.m106918b().currentTimeMillis(), this.f78787d.f75343b.f68854b.f172368b, wwu0Var.m208311f(), 2));
    }

    @Override // p153l.har0
    public final void onAdClicked() {
        if (this.f78788e.f155892j0) {
            m106811k(m106810b("click"));
        }
    }

    @Override // p153l.t6u0
    public final void zzb() {
        if (this.f78791h) {
            wwu0 wwu0VarM106810b = m106810b("ifts");
            wwu0VarM106810b.m208307b(Reason.TYPE, "blocked");
            wwu0VarM106810b.m208312g();
        }
    }

    @Override // p153l.hcu0
    public final void zzi() {
        if (m106808q()) {
            m106810b("adapter_shown").m208312g();
        }
    }

    @Override // p153l.hcu0
    public final void zzj() {
        if (m106808q()) {
            m106810b("adapter_impression").m208312g();
        }
    }
}
