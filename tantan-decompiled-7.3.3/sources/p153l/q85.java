package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class q85 {
    /* JADX INFO: renamed from: a */
    public static byte[] m175763a(byte[] bArr) {
        return bmk0.f77313a >= 27 ? bArr : bmk0.m105165r0(m175765c(bmk0.m105073E(bArr)));
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m175764b(byte[] bArr) {
        if (bmk0.f77313a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(bmk0.m105073E(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(m175766d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m175766d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return bmk0.m105165r0(sb.toString());
        } catch (JSONException e) {
            kyv.m152146d("ClearKeyUtil", "Failed to adjust response data: " + bmk0.m105073E(bArr), e);
            return bArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m175765c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* JADX INFO: renamed from: d */
    public static String m175766d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
