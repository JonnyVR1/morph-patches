package p153l;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzfho;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class huu0 {

    /* JADX INFO: renamed from: a */
    public final p8w0 f111704a;

    /* JADX INFO: renamed from: b */
    public final xtu0 f111705b;

    public huu0(p8w0 p8w0Var, xtu0 xtu0Var) {
        this.f111704a = p8w0Var;
        this.f111705b = xtu0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public final uws0 m137253a() throws RemoteException {
        uws0 uws0VarM171282b = this.f111704a.m171282b();
        if (uws0VarM171282b != null) {
            return uws0VarM171282b;
        }
        dct0.m115298g("Unexpected call to adapter creator.");
        pqy0.m173422a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final hzs0 m137254b(String str) throws RemoteException {
        hzs0 hzs0VarZzc = m137253a().zzc(str);
        this.f111705b.m213108e(str, hzs0VarZzc);
        return hzs0VarZzc;
    }

    /* JADX INFO: renamed from: c */
    public final r8w0 m137255c(String str, JSONObject jSONObject) throws zzfho {
        xws0 xws0VarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                xws0VarZzb = new bys0(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                xws0VarZzb = new bys0(new zzbvk());
            } else {
                uws0 uws0VarM137253a = m137253a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (uws0VarM137253a.mo178536c(string)) {
                            xws0VarZzb = uws0VarM137253a.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            xws0VarZzb = uws0VarM137253a.mo178537z(string) ? uws0VarM137253a.zzb(string) : uws0VarM137253a.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        dct0.m115296e("Invalid custom event.", e);
                        xws0VarZzb = uws0VarM137253a.zzb(str);
                    }
                } else {
                    xws0VarZzb = uws0VarM137253a.zzb(str);
                }
            }
            r8w0 r8w0Var = new r8w0(xws0VarZzb);
            this.f111705b.m213107d(str, r8w0Var);
            return r8w0Var;
        } catch (Throwable th) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168367k9)).booleanValue()) {
                this.f111705b.m213107d(str, null);
            }
            guu0.m132414a(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m137256d() {
        return this.f111704a.m171282b() != null;
    }
}
