package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.resdownloader.log.MLog;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class yhe {
    /* JADX INFO: renamed from: a */
    public static String m214798a(String str, String str2) {
        if (str == null) {
            return null;
        }
        return "http://img.momocdn.com/resource/" + str.substring(0, 2) + "/" + str.substring(2, 4) + "/" + str + "." + str2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m214799b(String str, long j) {
        if (m214805h(str)) {
            return true;
        }
        return j > 0 && j / 2048 < 1024;
    }

    /* JADX INFO: renamed from: c */
    public static void m214800c(whe wheVar) {
        try {
            m214815r(m214811n(new JSONObject(ivc0.m138542c(m214803f(wheVar)))), wheVar);
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
            m214801d(wheVar);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m214801d(whe wheVar) {
        try {
            m214815r(m214811n(new JSONObject(ivc0.m138541b(m214803f(wheVar)))), wheVar);
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m214802e(String str) {
        return str + "_dy_guid";
    }

    /* JADX INFO: renamed from: f */
    public static String m214803f(whe... wheVarArr) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (whe wheVar : wheVarArr) {
                if (!m214807j(wheVar)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, wheVar.m203126b());
                    jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, wheVar.m203130f());
                    jSONObject.put("guid", wheVar.m203125a());
                    jSONArray.put(jSONObject);
                }
            }
        } catch (JSONException e) {
            MLog.printErrStackTrace("SDKResource", e);
        }
        String string = jSONArray.toString();
        MLog.m19459d("SDKResource", "getResourceParams: \n%s", string);
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static String m214804g(String str) {
        return str + "_dy_version";
    }

    /* JADX INFO: renamed from: h */
    private static boolean m214805h(String str) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m214806i(whe wheVar) {
        String strM112029d;
        File fileM198446e;
        dje0 dje0VarM203128d = wheVar.m203128d();
        if (dje0VarM203128d == null || (strM112029d = dje0VarM203128d.m112029d()) == null || (fileM198446e = vhe.m198446e(wheVar)) == null || fileM198446e.length() <= 0) {
            return false;
        }
        return strM112029d.equalsIgnoreCase(ngw.m159358e(fileM198446e));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m214807j(@NonNull whe wheVar) {
        return m214808k(wheVar.m203128d());
    }

    /* JADX INFO: renamed from: k */
    public static boolean m214808k(dje0 dje0Var) {
        return dje0Var instanceof svf0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m214809l(egh0 egh0Var) {
        return !egh0Var.f90945a;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m214810m(dje0 dje0Var) {
        if (dje0Var == null) {
            return false;
        }
        String strM122289a = fn5.m122289a(dje0Var);
        if (TextUtils.isEmpty(strM122289a)) {
            return false;
        }
        return strM122289a.endsWith(".zip");
    }

    /* JADX INFO: renamed from: n */
    public static JSONObject m214811n(JSONObject jSONObject) {
        return jSONObject.optJSONObject("cur");
    }

    /* JADX INFO: renamed from: o */
    public static dje0 m214812o(JSONObject jSONObject) throws JSONException {
        return new dje0(jSONObject.getString("sign"), jSONObject.getString("md5"), jSONObject.getString("guid"), jSONObject.getString("suffix"), jSONObject.optInt(WBConstants.AUTH_PARAMS_VERSION, 0), jSONObject.optString("patch", null), jSONObject.optLong("size", -1L), jSONObject.optLong("patch_size", -1L), jSONObject.optString("local_md5", null));
    }

    /* JADX INFO: renamed from: p */
    public static void m214813p(@NonNull whe wheVar) {
        vhe.m198442a(vhe.m198445d(wheVar));
        vhe.m198442a(vhe.m198443b(wheVar));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m214814q(@NonNull whe wheVar) {
        wheVar.m203137m(wheVar.m203128d().m112033h());
        wheVar.m203134j(wheVar.m203128d().m112027b());
        wheVar.m203133i(true);
        return yh80.m214793e(wheVar.m203126b(), ivc0.f115117f) && yh80.m214793e(m214804g(wheVar.m203126b()), wheVar.m203130f()) && yh80.m214795g(m214802e(wheVar.m203126b()), wheVar.m203125a());
    }

    @WorkerThread
    /* JADX INFO: renamed from: r */
    public static synchronized void m214815r(JSONObject jSONObject, whe wheVar) {
        try {
            try {
                if (wheVar.m203128d() != null) {
                    return;
                }
                dje0 dje0VarM214812o = m214812o(jSONObject.getJSONObject(wheVar.m203126b()));
                wheVar.m203136l(dje0VarM214812o);
                if (dje0VarM214812o.m112033h() == wheVar.m203130f() && (TextUtils.equals(wheVar.m203125a(), dje0VarM214812o.m112027b()) || m214806i(wheVar))) {
                    m214814q(wheVar);
                } else {
                    wheVar.m203133i(false);
                    if (dje0VarM214812o.m112034i() && dje0VarM214812o.m112028c() != null && !TextUtils.equals(dje0VarM214812o.m112028c(), ngw.m159358e(vhe.m198446e(wheVar)))) {
                        dje0VarM214812o.m112035j(false);
                    }
                }
            } catch (JSONException e) {
                MLog.printErrStackTrace("SDKResource", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
