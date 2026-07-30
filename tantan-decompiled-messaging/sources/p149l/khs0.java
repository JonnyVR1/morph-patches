package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class khs0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final Object f123206a = new Object();

    /* JADX INFO: renamed from: b */
    public final Map f123207b = new HashMap();

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get(LovePlanetStage.result);
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : SignParameters.NEW_LINE.concat(String.valueOf(str4));
        synchronized (this.f123206a) {
            try {
                jhs0 jhs0Var = (jhs0) this.f123207b.remove(str);
                if (jhs0Var == null) {
                    x2t0.m206869g("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    jhs0Var.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    jhs0Var.mo102859a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (xsu0.m210836m()) {
                        xsu0.m210834k("Result GMSG: " + jSONObject.toString(2));
                    }
                    jhs0Var.mo102859a(jSONObject);
                } catch (JSONException e) {
                    jhs0Var.zza(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final gnr m145993b(rks0 rks0Var, String str, JSONObject jSONObject) {
        n3t0 n3t0Var = new n3t0();
        vny0.m199080r();
        String string = UUID.randomUUID().toString();
        m145994c(string, new ihs0(this, n3t0Var));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            rks0Var.mo13723z0(str, jSONObject2);
            return n3t0Var;
        } catch (Exception e) {
            n3t0Var.m157775c(e);
            return n3t0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m145994c(String str, jhs0 jhs0Var) {
        synchronized (this.f123206a) {
            this.f123207b.put(str, jhs0Var);
        }
    }
}
