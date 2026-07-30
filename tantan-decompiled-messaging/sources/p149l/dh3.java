package p149l;

import com.immomo.momosec.Coded;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dh3 {

    /* JADX INFO: renamed from: a */
    private static String f86231a;

    /* JADX INFO: renamed from: a */
    public static JSONObject m111779a() {
        if (f86231a == null) {
            try {
                f86231a = new String(Coded.doCommand("".getBytes(), 101));
            } catch (Throwable unused) {
                f86231a = new String(Coded.doCommand("".getBytes(), 101));
            }
        }
        try {
            return new JSONObject(f86231a);
        } catch (JSONException unused2) {
            return new JSONObject();
        }
    }
}
