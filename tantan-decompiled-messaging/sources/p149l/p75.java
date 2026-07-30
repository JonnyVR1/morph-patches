package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class p75 {
    /* JADX INFO: renamed from: a */
    public static byte[] m167701a(byte[] bArr) {
        return vck0.f180948a >= 27 ? bArr : vck0.m197887r0(m167703c(vck0.m197795E(bArr)));
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m167702b(byte[] bArr) {
        if (vck0.f180948a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(vck0.m197795E(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(m167704d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m167704d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return vck0.m197887r0(sb.toString());
        } catch (JSONException e) {
            jwv.m143684d("ClearKeyUtil", "Failed to adjust response data: " + vck0.m197795E(bArr), e);
            return bArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m167703c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* JADX INFO: renamed from: d */
    public static String m167704d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
