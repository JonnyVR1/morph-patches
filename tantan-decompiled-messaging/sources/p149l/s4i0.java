package p149l;

import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class s4i0 implements rjl {
    @Override // p149l.rjl
    /* JADX INFO: renamed from: a */
    public String mo117332a(@Nullable String str, String str2, String str3, JSONObject jSONObject, String str4) throws Exception {
        if (!NullChecker.m81303a(jSONObject)) {
            return null;
        }
        return r4i0.m177809F(str2, jSONObject.optString(FirebaseAnalytics.Param.METHOD, "get"), jSONObject, jSONObject.optJSONObject("body"), null, jSONObject.optJSONObject("header"), -1L);
    }
}
