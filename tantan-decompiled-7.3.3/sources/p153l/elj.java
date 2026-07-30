package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class elj {

    /* JADX INFO: renamed from: a */
    public String f94558a;

    /* JADX INFO: renamed from: b */
    public String f94559b;

    /* JADX INFO: renamed from: c */
    public String f94560c;

    /* JADX INFO: renamed from: d */
    public String f94561d;

    /* JADX INFO: renamed from: e */
    public boolean f94562e = false;

    /* JADX INFO: renamed from: f */
    public boolean f94563f = false;

    /* JADX INFO: renamed from: b */
    public static elj m121227b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        elj eljVar = new elj();
        eljVar.f94558a = jSONObject.optString(RequestParameters.PREFIX);
        eljVar.f94559b = jSONObject.optString("uri");
        eljVar.f94560c = jSONObject.optString("type");
        eljVar.f94561d = jSONObject.optString("md5");
        eljVar.f94562e = jSONObject.optInt("bp") == 1;
        eljVar.f94563f = jSONObject.optInt("ap") == 1;
        return eljVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m121228a() {
        return !TextUtils.isEmpty(this.f94559b);
    }

    public String toString() {
        return "GameResource{prefix='" + this.f94558a + "', url='" + this.f94559b + "', type='" + this.f94560c + "'}";
    }
}
