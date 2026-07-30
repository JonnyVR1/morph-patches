package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class f1i0 extends e400 {
    public f1i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public final String m119114C() {
        return ABManager.m29347h();
    }

    /* JADX INFO: renamed from: D */
    public final void m119115D(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("configKey");
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("code", 100);
                jSONObject2.put("configValue", "configKey is null");
                m114661z(jSONObject, jSONObject2.toString());
                return;
            }
            try {
                jSONObject2.put("code", 200);
                jSONObject2.put("configValue", RemoteConfig.m79298x().m79303G(strOptString).asString());
                m114661z(jSONObject, jSONObject2.toString());
            } catch (Throwable unused) {
                jSONObject2.put("code", 100);
                jSONObject2.put("configValue", "get configValue error");
                m114661z(jSONObject, jSONObject2.toString());
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        if (str2.equals("getAbHeader")) {
            m114661z(jSONObject, m119114C());
            return true;
        }
        if (!str2.equals("getRemoteConfigs")) {
            return false;
        }
        m119115D(jSONObject);
        return true;
    }
}
