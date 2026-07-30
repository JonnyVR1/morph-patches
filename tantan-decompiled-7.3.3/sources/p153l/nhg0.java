package p153l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class nhg0 {
    /* JADX INFO: renamed from: a */
    public static String m163092a(int i, String str, String str2) {
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
    public static void m163093b(String str, qtg0 qtg0Var) {
        String strOptString;
        String strOptString2;
        gvg0 gvg0Var;
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
        zzg0 zzg0Var = new zzg0(new WeakReference(qtg0Var), strOptString, strOptString2);
        if (!utg0.f180947b.f181601a) {
            zzg0Var.onFailure(-10103, "Please call initSDK first successfully");
            return;
        }
        i0h0 i0h0Var = utg0.f180950e;
        tfg0 tfg0Var = (i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null) ? null : gvg0Var.f106642m;
        String str2 = tfg0Var != null ? tfg0Var.f173958a : null;
        if (TextUtils.isEmpty(str2)) {
            zzg0Var.onFailure(-1, "model_api_cfg ai_normal url is null");
            return;
        }
        x1d0.C21228a c21228aM209038l = uyg0.m198630e(gxg0.m132863b(UUID.randomUUID().toString()), new bxg0(), null).m209043q(str2).m209038l(z1d0.create(e7y.m119772c("application/json; charset=utf-8"), str));
        tsg0.m192607a(c21228aM209038l);
        tsg0.f175996b.mo181341a(c21228aM209038l.m209028b()).mo135840h(new ulg0(zzg0Var));
    }

    /* JADX INFO: renamed from: c */
    public static void m163094c(String str, cwg0 cwg0Var) {
        String strOptString;
        String strOptString2;
        gvg0 gvg0Var;
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
        WeakReference weakReference = new WeakReference(cwg0Var);
        sfg0 sfg0Var = new sfg0(weakReference, strOptString, strOptString2);
        if (!utg0.f180947b.f181601a) {
            cwg0 cwg0Var2 = (cwg0) weakReference.get();
            if (cwg0Var2 != null) {
                cwg0Var2.mo112901a(m163092a(-10103, strOptString, "Please call initSDK first successfully"));
                return;
            }
            return;
        }
        i0h0 i0h0Var = utg0.f180950e;
        tfg0 tfg0Var = (i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null) ? null : gvg0Var.f106642m;
        String str2 = tfg0Var != null ? tfg0Var.f173959b : null;
        if (TextUtils.isEmpty(str2)) {
            cwg0 cwg0Var3 = (cwg0) weakReference.get();
            if (cwg0Var3 != null) {
                cwg0Var3.mo112901a(m163092a(-1, strOptString, "model_api_cfg sse url is null"));
                return;
            }
            return;
        }
        x1d0.C21228a c21228aM209038l = uyg0.m198630e(gxg0.m132863b(UUID.randomUUID().toString()), new bxg0(), null).m209043q(str2).m209038l(z1d0.create(e7y.m119772c("application/json; charset=utf-8"), str));
        c21228aM209038l.m209027a("sud_log_level_key", "sud_log_level_value_headers");
        tsg0.m192607a(c21228aM209038l);
        tsg0.f175996b.mo181341a(c21228aM209038l.m209028b()).mo135840h(new usg0(sfg0Var));
    }
}
