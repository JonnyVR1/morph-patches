package p149l;

import com.facebook.AuthenticationTokenClaims;
import java.util.Iterator;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class zsi0 {

    /* JADX INFO: renamed from: l.zsi0$a */
    public static class C21759a extends JSONObject {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f204603a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f204604b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ JSONObject f204605c;

        public C21759a(String str, String str2, JSONObject jSONObject) throws Error, RuntimeException {
            this.f204603a = str;
            this.f204604b = str2;
            this.f204605c = jSONObject;
            try {
                put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
                put("workerId", str2);
                put("data", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m220034a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            TreeMap treeMap = new TreeMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                treeMap.put(next, "" + jSONObject.opt(next));
            }
            return new JSONObject(treeMap);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m220035b(String str, String str2, JSONObject jSONObject) {
        return new C21759a(str, str2, jSONObject).toString();
    }
}
