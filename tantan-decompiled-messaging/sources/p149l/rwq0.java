package p149l;

import android.text.TextUtils;
import com.apm.lite.CrashType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rwq0 {
    /* JADX INFO: renamed from: a */
    public static void m181442a(bjq0 bjq0Var, bnq0 bnq0Var, CrashType crashType) {
        if (bjq0Var != null) {
            m181443b(bjq0Var.m102206G(), bnq0Var, crashType);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m181443b(JSONObject jSONObject, bnq0 bnq0Var, CrashType crashType) {
        if (jSONObject == null || crashType == null) {
            return;
        }
        long jOptLong = jSONObject.optLong("crash_time");
        String strM138758a = hrq0.m132696e().m138758a();
        if (jOptLong <= 0 || TextUtils.isEmpty(crashType.getName())) {
            return;
        }
        try {
            String str = "android__" + strM138758a + "_" + jOptLong + "_" + crashType;
            if (bnq0Var == null || (jSONObject = bnq0Var.m102857s()) != null) {
                jSONObject.put("unique_key", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
