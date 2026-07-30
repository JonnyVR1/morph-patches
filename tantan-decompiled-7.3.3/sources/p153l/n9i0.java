package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class n9i0 extends wc00 {
    public n9i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: K */
    public final String m161980K() {
        return ABManager.m30345h();
    }

    /* JADX INFO: renamed from: L */
    public final void m161981L(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("configKey");
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("code", 100);
                jSONObject2.put("configValue", "configKey is null");
                m205740H(jSONObject, jSONObject2.toString());
                return;
            }
            try {
                jSONObject2.put("code", 200);
                jSONObject2.put("configValue", RemoteConfig.m80481x().m80486G(strOptString).asString());
                m205740H(jSONObject, jSONObject2.toString());
            } catch (Throwable unused) {
                jSONObject2.put("code", 100);
                jSONObject2.put("configValue", "get configValue error");
                m205740H(jSONObject, jSONObject2.toString());
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        if (str2.equals("getAbHeader")) {
            m205740H(jSONObject, m161980K());
            return true;
        }
        if (!str2.equals("getRemoteConfigs")) {
            return false;
        }
        m161981L(jSONObject);
        return true;
    }
}
