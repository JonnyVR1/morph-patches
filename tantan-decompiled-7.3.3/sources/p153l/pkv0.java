package p153l;

import android.os.RemoteException;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.ads.internal.client.zze;
import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class pkv0 extends jzs0 {

    /* JADX INFO: renamed from: a */
    public final String f152959a;

    /* JADX INFO: renamed from: b */
    public final hzs0 f152960b;

    /* JADX INFO: renamed from: c */
    public final tct0 f152961c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f152962d;

    /* JADX INFO: renamed from: e */
    public final long f152963e;

    /* JADX INFO: renamed from: f */
    public boolean f152964f;

    public pkv0(String str, hzs0 hzs0Var, tct0 tct0Var, long j) {
        JSONObject jSONObject = new JSONObject();
        this.f152962d = jSONObject;
        this.f152964f = false;
        this.f152961c = tct0Var;
        this.f152959a = str;
        this.f152960b = hzs0Var;
        this.f152963e = j;
        try {
            jSONObject.put("adapter_version", hzs0Var.zzf().toString());
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, hzs0Var.zzg().toString());
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: o8 */
    public static synchronized void m172766o8(String str, tct0 tct0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167917A1)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                tct0Var.m190494b(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.kzs0
    /* JADX INFO: renamed from: C4 */
    public final synchronized void mo152225C4(zze zzeVar) throws RemoteException {
        m172767p8(zzeVar.zzb, 2);
    }

    @Override // p153l.kzs0
    /* JADX INFO: renamed from: c */
    public final synchronized void mo152226c(String str) throws RemoteException {
        if (this.f152964f) {
            return;
        }
        if (str == null) {
            mo152227i("Adapter returned null signals");
            return;
        }
        try {
            this.f152962d.put("signals", str);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167929B1)).booleanValue()) {
                this.f152962d.put("latency", bxy0.m106918b().elapsedRealtime() - this.f152963e);
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167917A1)).booleanValue()) {
                this.f152962d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f152961c.m190494b(this.f152962d);
        this.f152964f = true;
    }

    @Override // p153l.kzs0
    /* JADX INFO: renamed from: i */
    public final synchronized void mo152227i(String str) throws RemoteException {
        m172767p8(str, 2);
    }

    /* JADX INFO: renamed from: p8 */
    public final synchronized void m172767p8(String str, int i) {
        try {
            if (this.f152964f) {
                return;
            }
            try {
                this.f152962d.put("signal_error", str);
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167929B1)).booleanValue()) {
                    this.f152962d.put("latency", bxy0.m106918b().elapsedRealtime() - this.f152963e);
                }
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167917A1)).booleanValue()) {
                    this.f152962d.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f152961c.m190494b(this.f152962d);
            this.f152964f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        m172767p8("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.f152964f) {
            return;
        }
        try {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167917A1)).booleanValue()) {
                this.f152962d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f152961c.m190494b(this.f152962d);
        this.f152964f = true;
    }
}
