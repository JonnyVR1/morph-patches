package p153l;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ouu0 {
    /* JADX INFO: renamed from: a */
    public static String m169407a(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (m169408b(jSONArrayOptJSONArray2, str) && !m169408b(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m169408b(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                try {
                    if ((((Boolean) jas0.m144075c().m176505a(sgs0.f168472sa)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                        return true;
                    }
                } catch (PatternSyntaxException e) {
                    bxy0.m106933q().m120275w(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }
}
