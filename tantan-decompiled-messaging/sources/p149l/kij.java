package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.heytap.mcssdk.mode.Message;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class kij {

    /* JADX INFO: renamed from: a */
    public String f123345a;

    /* JADX INFO: renamed from: b */
    public String f123346b;

    /* JADX INFO: renamed from: c */
    public String f123347c;

    /* JADX INFO: renamed from: d */
    public String f123348d;

    /* JADX INFO: renamed from: e */
    public String f123349e;

    /* JADX INFO: renamed from: f */
    public boolean f123350f = false;

    /* JADX INFO: renamed from: g */
    public boolean f123351g = false;

    /* JADX INFO: renamed from: c */
    public static kij m146091c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        kij kijVar = new kij();
        kijVar.f123345a = jSONObject.optString(RequestParameters.PREFIX);
        kijVar.f123346b = jSONObject.optString("uri");
        kijVar.f123347c = jSONObject.optString("type");
        kijVar.f123348d = jSONObject.optString(Message.RULE);
        kijVar.f123349e = jSONObject.optString("md5");
        kijVar.f123350f = jSONObject.optInt("bp") == 1;
        kijVar.f123351g = jSONObject.optInt("ap") == 1;
        return kijVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m146092a() {
        return "1".equals(this.f123348d);
    }

    /* JADX INFO: renamed from: b */
    public boolean m146093b() {
        return (TextUtils.isEmpty(this.f123346b) || TextUtils.isEmpty(this.f123348d)) ? false : true;
    }

    public String toString() {
        return "GameResource{prefix='" + this.f123345a + "', url='" + this.f123346b + "', type='" + this.f123347c + "', rule='" + this.f123348d + "'}";
    }
}
