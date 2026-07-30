package p003l;

import l.mmg0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class jdg0 {
    /* JADX INFO: renamed from: a */
    public static mmg0 m5314a(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                mmg0 mmg0Var = new mmg0();
                mmg0Var.a = jSONObject.getLong("mgId");
                mmg0Var.b = jSONObject.getString("version");
                mmg0Var.c = jSONObject.getString("url");
                mmg0Var.d = jSONObject.getString("fNameMd5");
                mmg0Var.e = jSONObject.getInt("fTotalSize");
                mmg0Var.f = jSONObject.getLong("lastUseTimestamp");
                return mmg0Var;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static hkg0 m5315b(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hkg0 hkg0Var = new hkg0();
                hkg0Var.f4221a = jSONObject.getLong("mgId");
                hkg0Var.f4222b = jSONObject.getString("fGamePackageMd5");
                return hkg0Var;
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
