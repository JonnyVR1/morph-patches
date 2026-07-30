package p153l;

import com.immomo.momosec.Coded;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class rh3 {

    /* JADX INFO: renamed from: a */
    private static String f163073a;

    /* JADX INFO: renamed from: a */
    public static JSONObject m181513a() {
        if (f163073a == null) {
            try {
                f163073a = new String(Coded.doCommand("".getBytes(), 101));
            } catch (Throwable unused) {
                f163073a = new String(Coded.doCommand("".getBytes(), 101));
            }
        }
        try {
            return new JSONObject(f163073a);
        } catch (JSONException unused2) {
            return new JSONObject();
        }
    }
}
