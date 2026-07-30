package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzdkv;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class t8v0 implements hcu0, har0, j7u0, t6u0 {

    /* JADX INFO: renamed from: a */
    public final Context f172575a;

    /* JADX INFO: renamed from: b */
    public final f8w0 f172576b;

    /* JADX INFO: renamed from: c */
    public final b7w0 f172577c;

    /* JADX INFO: renamed from: d */
    public final q6w0 f172578d;

    /* JADX INFO: renamed from: e */
    public final fbv0 f172579e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Boolean f172580f;

    /* JADX INFO: renamed from: g */
    public final boolean f172581g = ((Boolean) jas0.m144075c().m176505a(sgs0.f168126R6)).booleanValue();

    /* JADX INFO: renamed from: h */
    @NonNull
    public final vcw0 f172582h;

    /* JADX INFO: renamed from: i */
    public final String f172583i;

    public t8v0(Context context, f8w0 f8w0Var, b7w0 b7w0Var, q6w0 q6w0Var, fbv0 fbv0Var, @NonNull vcw0 vcw0Var, String str) {
        this.f172575a = context;
        this.f172576b = f8w0Var;
        this.f172577c = b7w0Var;
        this.f172578d = q6w0Var;
        this.f172579e = fbv0Var;
        this.f172582h = vcw0Var;
        this.f172583i = str;
    }

    /* JADX INFO: renamed from: q */
    private final boolean m189707q() {
        String strM12351R;
        if (this.f172580f == null) {
            synchronized (this) {
                if (this.f172580f == null) {
                    String str = (String) jas0.m144075c().m176505a(sgs0.f168475t1);
                    bxy0.m106934r();
                    try {
                        strM12351R = C2098b.m12351R(this.f172575a);
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
                    this.f172580f = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f172580f.booleanValue();
    }

    @Override // p153l.t6u0
    /* JADX INFO: renamed from: Z */
    public final void mo102875Z(zzdkv zzdkvVar) {
        if (this.f172581g) {
            ucw0 ucw0VarM189708b = m189708b("ifts");
            ucw0VarM189708b.m195445a(Reason.TYPE, "exception");
            if (!TextUtils.isEmpty(zzdkvVar.getMessage())) {
                ucw0VarM189708b.m195445a("msg", zzdkvVar.getMessage());
            }
            this.f172582h.mo125151a(ucw0VarM189708b);
        }
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final void mo106809a() {
        if (m189707q() || this.f172578d.f155892j0) {
            m189709k(m189708b("impression"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final ucw0 m189708b(String str) {
        ucw0 ucw0VarM195443b = ucw0.m195443b(str);
        ucw0VarM195443b.m195450h(this.f172577c, null);
        ucw0VarM195443b.m195448f(this.f172578d);
        ucw0VarM195443b.m195445a("request_id", this.f172583i);
        if (!this.f172578d.f155913u.isEmpty()) {
            ucw0VarM195443b.m195445a("ancn", (String) this.f172578d.f155913u.get(0));
        }
        if (this.f172578d.f155892j0) {
            ucw0VarM195443b.m195445a("device_connectivity", true != bxy0.m106933q().m120278z(this.f172575a) ? UserBanAppealSwitch.offline : "online");
            ucw0VarM195443b.m195445a("event_timestamp", String.valueOf(bxy0.m106918b().currentTimeMillis()));
            ucw0VarM195443b.m195445a("offline_ad", "1");
        }
        return ucw0VarM195443b;
    }

    @Override // p153l.t6u0
    /* JADX INFO: renamed from: i */
    public final void mo102876i(zze zzeVar) {
        zze zzeVar2;
        if (this.f172581g) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals("com.google.android.gms.ads") && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals("com.google.android.gms.ads")) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String strM124572a = this.f172576b.m124572a(str);
            ucw0 ucw0VarM189708b = m189708b("ifts");
            ucw0VarM189708b.m195445a(Reason.TYPE, "adapter");
            if (i >= 0) {
                ucw0VarM189708b.m195445a("arec", String.valueOf(i));
            }
            if (strM124572a != null) {
                ucw0VarM189708b.m195445a("areec", strM124572a);
            }
            this.f172582h.mo125151a(ucw0VarM189708b);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m189709k(ucw0 ucw0Var) {
        boolean z = this.f172578d.f155892j0;
        vcw0 vcw0Var = this.f172582h;
        if (!z) {
            vcw0Var.mo125151a(ucw0Var);
            return;
        }
        this.f172579e.m124959g(new hbv0(bxy0.m106918b().currentTimeMillis(), this.f172577c.f75343b.f68854b.f172368b, vcw0Var.mo125152b(ucw0Var), 2));
    }

    @Override // p153l.har0
    public final void onAdClicked() {
        if (this.f172578d.f155892j0) {
            m189709k(m189708b("click"));
        }
    }

    @Override // p153l.t6u0
    public final void zzb() {
        if (this.f172581g) {
            vcw0 vcw0Var = this.f172582h;
            ucw0 ucw0VarM189708b = m189708b("ifts");
            ucw0VarM189708b.m195445a(Reason.TYPE, "blocked");
            vcw0Var.mo125151a(ucw0VarM189708b);
        }
    }

    @Override // p153l.hcu0
    public final void zzi() {
        if (m189707q()) {
            this.f172582h.mo125151a(m189708b("adapter_shown"));
        }
    }

    @Override // p153l.hcu0
    public final void zzj() {
        if (m189707q()) {
            this.f172582h.mo125151a(m189708b("adapter_impression"));
        }
    }
}
