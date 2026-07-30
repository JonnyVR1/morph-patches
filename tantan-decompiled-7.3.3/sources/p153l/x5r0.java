package p153l;

import android.text.TextUtils;
import com.apm.lite.CrashType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class x5r0 {
    /* JADX INFO: renamed from: a */
    public static void m209428a(gsq0 gsq0Var, hwq0 hwq0Var, CrashType crashType) {
        if (gsq0Var != null) {
            m209429b(gsq0Var.m132125G(), hwq0Var, crashType);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m209429b(JSONObject jSONObject, hwq0 hwq0Var, CrashType crashType) {
        if (jSONObject == null || crashType == null) {
            return;
        }
        long jOptLong = jSONObject.optLong("crash_time");
        String strM166169a = n0r0.m161018e().m166169a();
        if (jOptLong <= 0 || TextUtils.isEmpty(crashType.getName())) {
            return;
        }
        try {
            String str = "android__" + strM166169a + "_" + jOptLong + "_" + crashType;
            if (hwq0Var == null || (jSONObject = hwq0Var.m137501s()) != null) {
                jSONObject.put("unique_key", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
