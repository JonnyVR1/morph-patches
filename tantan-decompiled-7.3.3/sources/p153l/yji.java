package p153l;

import android.text.TextUtils;
import com.immomo.momosec.Coded;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class yji {

    /* JADX INFO: renamed from: a */
    private static String f200303a;

    /* JADX INFO: renamed from: a */
    public static JSONArray m216407a() {
        if (f200303a == null) {
            try {
                try {
                    f200303a = new String(Coded.doCommand("".getBytes(), 107));
                } catch (Throwable unused) {
                    return new JSONArray();
                }
            } catch (Throwable unused2) {
                f200303a = new String(Coded.doCommand("".getBytes(), 107));
            }
        }
        try {
            return TextUtils.isEmpty(f200303a) ? new JSONArray() : new JSONArray(f200303a);
        } catch (JSONException unused3) {
            return new JSONArray();
        }
    }
}
