package p149l;

import android.os.RemoteException;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.ads.internal.client.zze;
import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class jbv0 extends dqs0 {

    /* JADX INFO: renamed from: a */
    public final String f117215a;

    /* JADX INFO: renamed from: b */
    public final bqs0 f117216b;

    /* JADX INFO: renamed from: c */
    public final n3t0 f117217c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f117218d;

    /* JADX INFO: renamed from: e */
    public final long f117219e;

    /* JADX INFO: renamed from: f */
    public boolean f117220f;

    public jbv0(String str, bqs0 bqs0Var, n3t0 n3t0Var, long j) {
        JSONObject jSONObject = new JSONObject();
        this.f117218d = jSONObject;
        this.f117220f = false;
        this.f117217c = n3t0Var;
        this.f117215a = str;
        this.f117216b = bqs0Var;
        this.f117219e = j;
        try {
            jSONObject.put("adapter_version", bqs0Var.zzf().toString());
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, bqs0Var.zzg().toString());
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: o8 */
    public static synchronized void m140820o8(String str, n3t0 n3t0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131846A1)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                n3t0Var.m157774b(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.eqs0
    /* JADX INFO: renamed from: C4 */
    public final synchronized void mo117794C4(zze zzeVar) throws RemoteException {
        m140821p8(zzeVar.zzb, 2);
    }

    @Override // p149l.eqs0
    /* JADX INFO: renamed from: c */
    public final synchronized void mo117795c(String str) throws RemoteException {
        if (this.f117220f) {
            return;
        }
        if (str == null) {
            mo117796i("Adapter returned null signals");
            return;
        }
        try {
            this.f117218d.put("signals", str);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131858B1)).booleanValue()) {
                this.f117218d.put("latency", vny0.m199064b().elapsedRealtime() - this.f117219e);
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131846A1)).booleanValue()) {
                this.f117218d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f117217c.m157774b(this.f117218d);
        this.f117220f = true;
    }

    @Override // p149l.eqs0
    /* JADX INFO: renamed from: i */
    public final synchronized void mo117796i(String str) throws RemoteException {
        m140821p8(str, 2);
    }

    /* JADX INFO: renamed from: p8 */
    public final synchronized void m140821p8(String str, int i) {
        try {
            if (this.f117220f) {
                return;
            }
            try {
                this.f117218d.put("signal_error", str);
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131858B1)).booleanValue()) {
                    this.f117218d.put("latency", vny0.m199064b().elapsedRealtime() - this.f117219e);
                }
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131846A1)).booleanValue()) {
                    this.f117218d.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f117217c.m157774b(this.f117218d);
            this.f117220f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        m140821p8("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.f117220f) {
            return;
        }
        try {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131846A1)).booleanValue()) {
                this.f117218d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f117217c.m157774b(this.f117218d);
        this.f117220f = true;
    }
}
