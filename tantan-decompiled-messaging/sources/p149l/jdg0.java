package p149l;

import com.sina.weibo.sdk.constant.WBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jdg0 {
    /* JADX INFO: renamed from: a */
    public static mmg0 m141028a(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                mmg0 mmg0Var = new mmg0();
                mmg0Var.f134663a = jSONObject.getLong("mgId");
                mmg0Var.f134664b = jSONObject.getString(WBConstants.AUTH_PARAMS_VERSION);
                mmg0Var.f134665c = jSONObject.getString("url");
                mmg0Var.f134666d = jSONObject.getString("fNameMd5");
                mmg0Var.f134667e = jSONObject.getInt("fTotalSize");
                mmg0Var.f134668f = jSONObject.getLong("lastUseTimestamp");
                return mmg0Var;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static hkg0 m141029b(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hkg0 hkg0Var = new hkg0();
                hkg0Var.f108192a = jSONObject.getLong("mgId");
                hkg0Var.f108193b = jSONObject.getString("fGamePackageMd5");
                return hkg0Var;
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
