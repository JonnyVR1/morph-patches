package p009l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.app.PutongAct;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class f1i0 extends e400 {
    public f1i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public final String m14199C() {
        return ABManager.h();
    }

    /* JADX INFO: renamed from: D */
    public final void m14200D(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("configKey");
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 100);
                jSONObject2.put("configValue", "configKey is null");
                m13720z(jSONObject, jSONObject2.toString());
                return;
            }
            try {
                jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 200);
                jSONObject2.put("configValue", RemoteConfig.m9619x().m9624G(strOptString).asString());
                m13720z(jSONObject, jSONObject2.toString());
            } catch (Throwable unused) {
                jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 100);
                jSONObject2.put("configValue", "get configValue error");
                m13720z(jSONObject, jSONObject2.toString());
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        if (str2.equals("getAbHeader")) {
            m13720z(jSONObject, m14199C());
            return true;
        }
        if (!str2.equals("getRemoteConfigs")) {
            return false;
        }
        m14200D(jSONObject);
        return true;
    }
}
