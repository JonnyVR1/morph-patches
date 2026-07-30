package p149l;

import android.text.TextUtils;
import com.immomo.momosec.Coded;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class bhi {

    /* JADX INFO: renamed from: a */
    private static String f75616a;

    /* JADX INFO: renamed from: a */
    public static JSONArray m101844a() {
        if (f75616a == null) {
            try {
                try {
                    f75616a = new String(Coded.doCommand("".getBytes(), 107));
                } catch (Throwable unused) {
                    return new JSONArray();
                }
            } catch (Throwable unused2) {
                f75616a = new String(Coded.doCommand("".getBytes(), 107));
            }
        }
        try {
            return TextUtils.isEmpty(f75616a) ? new JSONArray() : new JSONArray(f75616a);
        } catch (JSONException unused3) {
            return new JSONArray();
        }
    }
}
