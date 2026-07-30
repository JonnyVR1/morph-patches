package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class f9g0 {
    /* JADX INFO: renamed from: a */
    public static String m120080a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", str);
            jSONObject.put("ret_code", i);
            jSONObject.put("ret_msg", str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m120081b(String str, ilg0 ilg0Var) {
        String strOptString;
        String strOptString2;
        ymg0 ymg0Var;
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString("request_id");
            try {
                strOptString2 = jSONObject.optString(NotificationCompat.CATEGORY_EVENT);
            } catch (Exception e) {
                e = e;
                LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
                strOptString2 = null;
            }
        } catch (Exception e2) {
            e = e2;
            strOptString = null;
        }
        rrg0 rrg0Var = new rrg0(new WeakReference(ilg0Var), strOptString, strOptString2);
        if (!mlg0.f134427b.f135224a) {
            rrg0Var.onFailure(-10103, "Please call initSDK first successfully");
            return;
        }
        asg0 asg0Var = mlg0.f134430e;
        l7g0 l7g0Var = (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null) ? null : ymg0Var.f199011m;
        String str2 = l7g0Var != null ? l7g0Var.f126719a : null;
        if (TextUtils.isEmpty(str2)) {
            rrg0Var.onFailure(-1, "model_api_cfg ai_normal url is null");
            return;
        }
        stc0.C20027a c20027aM185893l = mqg0.m155897e(yog0.m215499b(UUID.randomUUID().toString()), new tog0(), null).m185898q(str2).m185893l(utc0.create(hyx.m133627c("application/json; charset=utf-8"), str));
        lkg0.m150267a(c20027aM185893l);
        lkg0.f128531b.mo144849a(c20027aM185893l.m185883b()).mo96077h(new mdg0(rrg0Var));
    }

    /* JADX INFO: renamed from: c */
    public static void m120082c(String str, ung0 ung0Var) {
        String strOptString;
        String strOptString2;
        ymg0 ymg0Var;
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString("request_id");
            try {
                strOptString2 = jSONObject.optString(NotificationCompat.CATEGORY_EVENT);
            } catch (Exception e) {
                e = e;
                LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
                strOptString2 = null;
            }
        } catch (Exception e2) {
            e = e2;
            strOptString = null;
        }
        WeakReference weakReference = new WeakReference(ung0Var);
        k7g0 k7g0Var = new k7g0(weakReference, strOptString, strOptString2);
        if (!mlg0.f134427b.f135224a) {
            ung0 ung0Var2 = (ung0) weakReference.get();
            if (ung0Var2 != null) {
                ung0Var2.mo136200a(m120080a(-10103, strOptString, "Please call initSDK first successfully"));
                return;
            }
            return;
        }
        asg0 asg0Var = mlg0.f134430e;
        l7g0 l7g0Var = (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null) ? null : ymg0Var.f199011m;
        String str2 = l7g0Var != null ? l7g0Var.f126720b : null;
        if (TextUtils.isEmpty(str2)) {
            ung0 ung0Var3 = (ung0) weakReference.get();
            if (ung0Var3 != null) {
                ung0Var3.mo136200a(m120080a(-1, strOptString, "model_api_cfg sse url is null"));
                return;
            }
            return;
        }
        stc0.C20027a c20027aM185893l = mqg0.m155897e(yog0.m215499b(UUID.randomUUID().toString()), new tog0(), null).m185898q(str2).m185893l(utc0.create(hyx.m133627c("application/json; charset=utf-8"), str));
        c20027aM185893l.m185882a("sud_log_level_key", "sud_log_level_value_headers");
        lkg0.m150267a(c20027aM185893l);
        lkg0.f128531b.mo144849a(c20027aM185893l.m185883b()).mo96077h(new mkg0(k7g0Var));
    }
}
