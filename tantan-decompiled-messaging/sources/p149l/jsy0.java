package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzccx;
import com.p046p1.mobile.putong.data.User;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class jsy0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnr f119552a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzccx f119553b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v0t0 f119554c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ l4w0 f119555d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f119556e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ n1r0 f119557f;

    public jsy0(n1r0 n1r0Var, gnr gnrVar, zzccx zzccxVar, v0t0 v0t0Var, l4w0 l4w0Var, long j) {
        this.f119552a = gnrVar;
        this.f119553b = zzccxVar;
        this.f119554c = v0t0Var;
        this.f119555d = l4w0Var;
        this.f119556e = j;
        this.f119557f = n1r0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis() - this.f119556e;
        String message = th.getMessage();
        vny0.m199079q().m212290w(th, "SignalGeneratorImpl.generateSignals");
        n1r0 n1r0Var = this.f119557f;
        kpv0.m146889c(n1r0Var.f136708n, n1r0Var.f136700f, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(jCurrentTimeMillis)));
        w4w0 w4w0VarM157473Z8 = n1r0.m157473Z8(this.f119552a, this.f119553b);
        if (((Boolean) l9s0.f127144e.m115379e()).booleanValue() && w4w0VarM157473Z8 != null) {
            l4w0 l4w0Var = this.f119555d;
            l4w0Var.mo129463b(th);
            l4w0Var.mo129461S(false);
            w4w0VarM157473Z8.m201583a(l4w0Var);
            w4w0VarM157473Z8.m201589g();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.f119554c.zzb(message);
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        lhr0 lhr0Var = (lhr0) obj;
        w4w0 w4w0VarM157473Z8 = n1r0.m157473Z8(this.f119552a, this.f119553b);
        this.f119557f.f136692E.set(true);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131888D7)).booleanValue()) {
            try {
                this.f119554c.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                x2t0.m206866d("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) l9s0.f127144e.m115379e()).booleanValue() || w4w0VarM157473Z8 == null) {
                return;
            }
            l4w0 l4w0Var = this.f119555d;
            l4w0Var.zzc("QueryInfo generation has been disabled.");
            l4w0Var.mo129461S(false);
            w4w0VarM157473Z8.m201583a(l4w0Var);
            w4w0VarM157473Z8.m201589g();
            return;
        }
        long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis() - this.f119556e;
        try {
            if (lhr0Var == null) {
                this.f119554c.mo147220R4(null, null, null);
                n1r0 n1r0Var = this.f119557f;
                kpv0.m146889c(n1r0Var.f136708n, n1r0Var.f136700f, "sgs", new Pair("rid", User.ID_TEAM_ACCOUNT));
                this.f119555d.mo129461S(true);
                if (!((Boolean) l9s0.f127144e.m115379e()).booleanValue() || w4w0VarM157473Z8 == null) {
                    return;
                }
                w4w0VarM157473Z8.m201583a(this.f119555d);
                w4w0VarM157473Z8.m201589g();
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(lhr0Var.f128134b);
                String strOptString = jSONObject.optString("request_id", "");
                if (TextUtils.isEmpty(strOptString)) {
                    x2t0.m206869g("The request ID is empty in request JSON.");
                    this.f119554c.zzb("Internal error: request ID is empty in request JSON.");
                    n1r0 n1r0Var2 = this.f119557f;
                    kpv0.m146889c(n1r0Var2.f136708n, n1r0Var2.f136700f, "sgf", new Pair("sgf_reason", "rid_missing"));
                    l4w0 l4w0Var2 = this.f119555d;
                    l4w0Var2.zzc("Request ID empty");
                    l4w0Var2.mo129461S(false);
                    if (!((Boolean) l9s0.f127144e.m115379e()).booleanValue() || w4w0VarM157473Z8 == null) {
                        return;
                    }
                    w4w0VarM157473Z8.m201583a(this.f119555d);
                    w4w0VarM157473Z8.m201589g();
                    return;
                }
                n1r0 n1r0Var3 = this.f119557f;
                n1r0.m157486z8(n1r0Var3, strOptString, lhr0Var.f128134b, n1r0Var3.f136700f);
                Bundle bundle = lhr0Var.f128135c;
                n1r0 n1r0Var4 = this.f119557f;
                if (n1r0Var4.f136713s && bundle != null && bundle.getInt(n1r0Var4.f136715u, -1) == -1) {
                    n1r0 n1r0Var5 = this.f119557f;
                    bundle.putInt(n1r0Var5.f136715u, n1r0Var5.f136716v.get());
                }
                n1r0 n1r0Var6 = this.f119557f;
                if (n1r0Var6.f136712r && bundle != null && TextUtils.isEmpty(bundle.getString(n1r0Var6.f136714t))) {
                    if (TextUtils.isEmpty(this.f119557f.f136718x)) {
                        n1r0 n1r0Var7 = this.f119557f;
                        C2075b c2075bM199080r = vny0.m199080r();
                        n1r0 n1r0Var8 = this.f119557f;
                        n1r0Var7.f136718x = c2075bM199080r.m12335E(n1r0Var8.f136696b, n1r0Var8.f136717w.zza);
                    }
                    n1r0 n1r0Var9 = this.f119557f;
                    bundle.putString(n1r0Var9.f136714t, n1r0Var9.f136718x);
                }
                this.f119554c.mo147220R4(lhr0Var.f128133a, lhr0Var.f128134b, bundle);
                n1r0 n1r0Var10 = this.f119557f;
                wnu0 wnu0Var = n1r0Var10.f136708n;
                mnu0 mnu0Var = n1r0Var10.f136700f;
                Pair pair = new Pair("tqgt", String.valueOf(jCurrentTimeMillis));
                String str = "na";
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132424u9)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e2) {
                        x2t0.m206867e("Error retrieving JSONObject from the requestJson, ", e2);
                    }
                }
                kpv0.m146889c(wnu0Var, mnu0Var, "sgs", pair, new Pair("tpc", str));
                this.f119555d.mo129461S(true);
                if (!((Boolean) l9s0.f127144e.m115379e()).booleanValue() || w4w0VarM157473Z8 == null) {
                    return;
                }
                w4w0VarM157473Z8.m201583a(this.f119555d);
                w4w0VarM157473Z8.m201589g();
            } catch (JSONException e3) {
                x2t0.m206869g("Failed to create JSON object from the request string.");
                this.f119554c.zzb("Internal error for request JSON: " + e3.toString());
                n1r0 n1r0Var11 = this.f119557f;
                kpv0.m146889c(n1r0Var11.f136708n, n1r0Var11.f136700f, "sgf", new Pair("sgf_reason", "request_invalid"));
                l4w0 l4w0Var3 = this.f119555d;
                l4w0Var3.mo129463b(e3);
                l4w0Var3.mo129461S(false);
                vny0.m199079q().m212290w(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) l9s0.f127144e.m115379e()).booleanValue() || w4w0VarM157473Z8 == null) {
                    return;
                }
                w4w0VarM157473Z8.m201583a(this.f119555d);
                w4w0VarM157473Z8.m201589g();
            }
        } catch (RemoteException e4) {
            l4w0 l4w0Var4 = this.f119555d;
            l4w0Var4.mo129463b(e4);
            l4w0Var4.mo129461S(false);
            x2t0.m206867e("", e4);
            vny0.m199079q().m212290w(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((Boolean) l9s0.f127144e.m115379e()).booleanValue() && w4w0VarM157473Z8 != null) {
                w4w0VarM157473Z8.m201583a(this.f119555d);
                w4w0VarM157473Z8.m201589g();
            }
        }
    }
}
