package p153l;

import com.sina.weibo.sdk.constant.WBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rlg0 {
    /* JADX INFO: renamed from: a */
    public static uug0 m181992a(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                uug0 uug0Var = new uug0();
                uug0Var.f181073a = jSONObject.getLong("mgId");
                uug0Var.f181074b = jSONObject.getString(WBConstants.AUTH_PARAMS_VERSION);
                uug0Var.f181075c = jSONObject.getString("url");
                uug0Var.f181076d = jSONObject.getString("fNameMd5");
                uug0Var.f181077e = jSONObject.getInt("fTotalSize");
                uug0Var.f181078f = jSONObject.getLong("lastUseTimestamp");
                return uug0Var;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static psg0 m181993b(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                psg0 psg0Var = new psg0();
                psg0Var.f153902a = jSONObject.getLong("mgId");
                psg0Var.f153903b = jSONObject.getString("fGamePackageMd5");
                return psg0Var;
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
