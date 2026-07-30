package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzccx;
import com.p051p1.mobile.putong.data.User;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class p1z0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpr f150227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzccx f150228b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bat0 f150229c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rdw0 f150230d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f150231e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tar0 f150232f;

    public p1z0(tar0 tar0Var, hpr hprVar, zzccx zzccxVar, bat0 bat0Var, rdw0 rdw0Var, long j) {
        this.f150227a = hprVar;
        this.f150228b = zzccxVar;
        this.f150229c = bat0Var;
        this.f150230d = rdw0Var;
        this.f150231e = j;
        this.f150232f = tar0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis() - this.f150231e;
        String message = th.getMessage();
        bxy0.m106933q().m120275w(th, "SignalGeneratorImpl.generateSignals");
        tar0 tar0Var = this.f150232f;
        qyv0.m178752c(tar0Var.f172785n, tar0Var.f172777f, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(jCurrentTimeMillis)));
        cew0 cew0VarM189930Z8 = tar0.m189930Z8(this.f150227a, this.f150228b);
        if (((Boolean) ris0.f163393e.m149974e()).booleanValue() && cew0VarM189930Z8 != null) {
            rdw0 rdw0Var = this.f150230d;
            rdw0Var.mo162912b(th);
            rdw0Var.mo162910S(false);
            cew0VarM189930Z8.m109461a(rdw0Var);
            cew0VarM189930Z8.m109467g();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.f150229c.zzb(message);
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        rqr0 rqr0Var = (rqr0) obj;
        cew0 cew0VarM189930Z8 = tar0.m189930Z8(this.f150227a, this.f150228b);
        this.f150232f.f172769E.set(true);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f167959D7)).booleanValue()) {
            try {
                this.f150229c.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                dct0.m115295d("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) ris0.f163393e.m149974e()).booleanValue() || cew0VarM189930Z8 == null) {
                return;
            }
            rdw0 rdw0Var = this.f150230d;
            rdw0Var.zzc("QueryInfo generation has been disabled.");
            rdw0Var.mo162910S(false);
            cew0VarM189930Z8.m109461a(rdw0Var);
            cew0VarM189930Z8.m109467g();
            return;
        }
        long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis() - this.f150231e;
        try {
            if (rqr0Var == null) {
                this.f150229c.mo103232R4(null, null, null);
                tar0 tar0Var = this.f150232f;
                qyv0.m178752c(tar0Var.f172785n, tar0Var.f172777f, "sgs", new Pair("rid", User.ID_TEAM_ACCOUNT));
                this.f150230d.mo162910S(true);
                if (!((Boolean) ris0.f163393e.m149974e()).booleanValue() || cew0VarM189930Z8 == null) {
                    return;
                }
                cew0VarM189930Z8.m109461a(this.f150230d);
                cew0VarM189930Z8.m109467g();
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(rqr0Var.f164515b);
                String strOptString = jSONObject.optString("request_id", "");
                if (TextUtils.isEmpty(strOptString)) {
                    dct0.m115298g("The request ID is empty in request JSON.");
                    this.f150229c.zzb("Internal error: request ID is empty in request JSON.");
                    tar0 tar0Var2 = this.f150232f;
                    qyv0.m178752c(tar0Var2.f172785n, tar0Var2.f172777f, "sgf", new Pair("sgf_reason", "rid_missing"));
                    rdw0 rdw0Var2 = this.f150230d;
                    rdw0Var2.zzc("Request ID empty");
                    rdw0Var2.mo162910S(false);
                    if (!((Boolean) ris0.f163393e.m149974e()).booleanValue() || cew0VarM189930Z8 == null) {
                        return;
                    }
                    cew0VarM189930Z8.m109461a(this.f150230d);
                    cew0VarM189930Z8.m109467g();
                    return;
                }
                tar0 tar0Var3 = this.f150232f;
                tar0.m189943z8(tar0Var3, strOptString, rqr0Var.f164515b, tar0Var3.f172777f);
                Bundle bundle = rqr0Var.f164516c;
                tar0 tar0Var4 = this.f150232f;
                if (tar0Var4.f172790s && bundle != null && bundle.getInt(tar0Var4.f172792u, -1) == -1) {
                    tar0 tar0Var5 = this.f150232f;
                    bundle.putInt(tar0Var5.f172792u, tar0Var5.f172793v.get());
                }
                tar0 tar0Var6 = this.f150232f;
                if (tar0Var6.f172789r && bundle != null && TextUtils.isEmpty(bundle.getString(tar0Var6.f172791t))) {
                    if (TextUtils.isEmpty(this.f150232f.f172795x)) {
                        tar0 tar0Var7 = this.f150232f;
                        C2098b c2098bM106934r = bxy0.m106934r();
                        tar0 tar0Var8 = this.f150232f;
                        tar0Var7.f172795x = c2098bM106934r.m12389E(tar0Var8.f172773b, tar0Var8.f172794w.zza);
                    }
                    tar0 tar0Var9 = this.f150232f;
                    bundle.putString(tar0Var9.f172791t, tar0Var9.f172795x);
                }
                this.f150229c.mo103232R4(rqr0Var.f164514a, rqr0Var.f164515b, bundle);
                tar0 tar0Var10 = this.f150232f;
                cxu0 cxu0Var = tar0Var10.f172785n;
                swu0 swu0Var = tar0Var10.f172777f;
                Pair pair = new Pair("tqgt", String.valueOf(jCurrentTimeMillis));
                String str = "na";
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168495u9)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e2) {
                        dct0.m115296e("Error retrieving JSONObject from the requestJson, ", e2);
                    }
                }
                qyv0.m178752c(cxu0Var, swu0Var, "sgs", pair, new Pair("tpc", str));
                this.f150230d.mo162910S(true);
                if (!((Boolean) ris0.f163393e.m149974e()).booleanValue() || cew0VarM189930Z8 == null) {
                    return;
                }
                cew0VarM189930Z8.m109461a(this.f150230d);
                cew0VarM189930Z8.m109467g();
            } catch (JSONException e3) {
                dct0.m115298g("Failed to create JSON object from the request string.");
                this.f150229c.zzb("Internal error for request JSON: " + e3.toString());
                tar0 tar0Var11 = this.f150232f;
                qyv0.m178752c(tar0Var11.f172785n, tar0Var11.f172777f, "sgf", new Pair("sgf_reason", "request_invalid"));
                rdw0 rdw0Var3 = this.f150230d;
                rdw0Var3.mo162912b(e3);
                rdw0Var3.mo162910S(false);
                bxy0.m106933q().m120275w(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) ris0.f163393e.m149974e()).booleanValue() || cew0VarM189930Z8 == null) {
                    return;
                }
                cew0VarM189930Z8.m109461a(this.f150230d);
                cew0VarM189930Z8.m109467g();
            }
        } catch (RemoteException e4) {
            rdw0 rdw0Var4 = this.f150230d;
            rdw0Var4.mo162912b(e4);
            rdw0Var4.mo162910S(false);
            dct0.m115296e("", e4);
            bxy0.m106933q().m120275w(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((Boolean) ris0.f163393e.m149974e()).booleanValue() && cew0VarM189930Z8 != null) {
                cew0VarM189930Z8.m109461a(this.f150230d);
                cew0VarM189930Z8.m109467g();
            }
        }
    }
}
