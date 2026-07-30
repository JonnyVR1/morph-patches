package p006l;

import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.r4i0;
import l.rjl;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class s4i0 implements rjl {
    /* JADX INFO: renamed from: a */
    public String m23492a(@Nullable String str, String str2, String str3, JSONObject jSONObject, String str4) throws Exception {
        if (!NullChecker.a(jSONObject)) {
            return null;
        }
        return r4i0.F(str2, jSONObject.optString("method", "get"), jSONObject, jSONObject.optJSONObject("body"), (JSONObject) null, jSONObject.optJSONObject("header"), -1L);
    }
}
