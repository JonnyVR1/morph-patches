package p149l;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzfho;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class blu0 {

    /* JADX INFO: renamed from: a */
    public final jzv0 f76219a;

    /* JADX INFO: renamed from: b */
    public final rku0 f76220b;

    public blu0(jzv0 jzv0Var, rku0 rku0Var) {
        this.f76219a = jzv0Var;
        this.f76220b = rku0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public final ons0 m102561a() throws RemoteException {
        ons0 ons0VarM143954b = this.f76219a.m143954b();
        if (ons0VarM143954b != null) {
            return ons0VarM143954b;
        }
        x2t0.m206869g("Unexpected call to adapter creator.");
        jhy0.m141614a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final bqs0 m102562b(String str) throws RemoteException {
        bqs0 bqs0VarZzc = m102561a().zzc(str);
        this.f76220b.m179769e(str, bqs0VarZzc);
        return bqs0VarZzc;
    }

    /* JADX INFO: renamed from: c */
    public final lzv0 m102563c(String str, JSONObject jSONObject) throws zzfho {
        rns0 rns0VarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                rns0VarZzb = new vos0(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                rns0VarZzb = new vos0(new zzbvk());
            } else {
                ons0 ons0VarM102561a = m102561a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (ons0VarM102561a.mo146589c(string)) {
                            rns0VarZzb = ons0VarM102561a.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            rns0VarZzb = ons0VarM102561a.mo146590z(string) ? ons0VarM102561a.zzb(string) : ons0VarM102561a.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        x2t0.m206867e("Invalid custom event.", e);
                        rns0VarZzb = ons0VarM102561a.zzb(str);
                    }
                } else {
                    rns0VarZzb = ons0VarM102561a.zzb(str);
                }
            }
            lzv0 lzv0Var = new lzv0(rns0VarZzb);
            this.f76220b.m179768d(str, lzv0Var);
            return lzv0Var;
        } catch (Throwable th) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132296k9)).booleanValue()) {
                this.f76220b.m179768d(str, null);
            }
            alu0.m97454a(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m102564d() {
        return this.f76219a.m143954b() != null;
    }
}
