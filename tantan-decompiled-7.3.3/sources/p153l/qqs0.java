package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class qqs0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final Object f159038a = new Object();

    /* JADX INFO: renamed from: b */
    public final Map f159039b = new HashMap();

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get(LovePlanetStage.result);
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : SignParameters.NEW_LINE.concat(String.valueOf(str4));
        synchronized (this.f159038a) {
            try {
                pqs0 pqs0Var = (pqs0) this.f159039b.remove(str);
                if (pqs0Var == null) {
                    dct0.m115298g("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    pqs0Var.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    pqs0Var.mo137504a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (d2v0.m113739m()) {
                        d2v0.m113737k("Result GMSG: " + jSONObject.toString(2));
                    }
                    pqs0Var.mo137504a(jSONObject);
                } catch (JSONException e) {
                    pqs0Var.zza(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final hpr m177511b(xts0 xts0Var, String str, JSONObject jSONObject) {
        tct0 tct0Var = new tct0();
        bxy0.m106934r();
        String string = UUID.randomUUID().toString();
        m177512c(string, new oqs0(this, tct0Var));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            xts0Var.mo13777z0(str, jSONObject2);
            return tct0Var;
        } catch (Exception e) {
            tct0Var.m190495c(e);
            return tct0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m177512c(String str, pqs0 pqs0Var) {
        synchronized (this.f159038a) {
            this.f159039b.put(str, pqs0Var);
        }
    }
}
