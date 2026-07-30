package p153l;

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
public class cje {
    /* JADX INFO: renamed from: a */
    public static String m110113a(String str, String str2) {
        if (str == null) {
            return null;
        }
        return "http://img.momocdn.com/resource/" + str.substring(0, 2) + "/" + str.substring(2, 4) + "/" + str + "." + str2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m110114b(String str, long j) {
        if (m110120h(str)) {
            return true;
        }
        return j > 0 && j / 2048 < 1024;
    }

    /* JADX INFO: renamed from: c */
    public static void m110115c(aje ajeVar) {
        try {
            m110130r(m110126n(new JSONObject(l3d0.m152689c(m110118f(ajeVar)))), ajeVar);
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
            m110116d(ajeVar);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m110116d(aje ajeVar) {
        try {
            m110130r(m110126n(new JSONObject(l3d0.m152688b(m110118f(ajeVar)))), ajeVar);
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m110117e(String str) {
        return str + "_dy_guid";
    }

    /* JADX INFO: renamed from: f */
    public static String m110118f(aje... ajeVarArr) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (aje ajeVar : ajeVarArr) {
                if (!m110122j(ajeVar)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, ajeVar.m98367b());
                    jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, ajeVar.m98371f());
                    jSONObject.put("guid", ajeVar.m98366a());
                    jSONArray.put(jSONObject);
                }
            }
        } catch (JSONException e) {
            MLog.printErrStackTrace("SDKResource", e);
        }
        String string = jSONArray.toString();
        MLog.m20458d("SDKResource", "getResourceParams: \n%s", string);
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static String m110119g(String str) {
        return str + "_dy_version";
    }

    /* JADX INFO: renamed from: h */
    private static boolean m110120h(String str) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m110121i(aje ajeVar) {
        String strM141814d;
        File fileM219732e;
        ire0 ire0VarM98369d = ajeVar.m98369d();
        if (ire0VarM98369d == null || (strM141814d = ire0VarM98369d.m141814d()) == null || (fileM219732e = zie.m219732e(ajeVar)) == null || fileM219732e.length() <= 0) {
            return false;
        }
        return strM141814d.equalsIgnoreCase(miw.m158556e(fileM219732e));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m110122j(@NonNull aje ajeVar) {
        return m110123k(ajeVar.m98369d());
    }

    /* JADX INFO: renamed from: k */
    public static boolean m110123k(ire0 ire0Var) {
        return ire0Var instanceof b4g0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m110124l(loh0 loh0Var) {
        return !loh0Var.f132899a;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m110125m(ire0 ire0Var) {
        if (ire0Var == null) {
            return false;
        }
        String strM146330a = jo5.m146330a(ire0Var);
        if (TextUtils.isEmpty(strM146330a)) {
            return false;
        }
        return strM146330a.endsWith(".zip");
    }

    /* JADX INFO: renamed from: n */
    public static JSONObject m110126n(JSONObject jSONObject) {
        return jSONObject.optJSONObject("cur");
    }

    /* JADX INFO: renamed from: o */
    public static ire0 m110127o(JSONObject jSONObject) throws JSONException {
        return new ire0(jSONObject.getString("sign"), jSONObject.getString("md5"), jSONObject.getString("guid"), jSONObject.getString("suffix"), jSONObject.optInt(WBConstants.AUTH_PARAMS_VERSION, 0), jSONObject.optString("patch", null), jSONObject.optLong("size", -1L), jSONObject.optLong("patch_size", -1L), jSONObject.optString("local_md5", null));
    }

    /* JADX INFO: renamed from: p */
    public static void m110128p(@NonNull aje ajeVar) {
        zie.m219728a(zie.m219731d(ajeVar));
        zie.m219728a(zie.m219729b(ajeVar));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m110129q(@NonNull aje ajeVar) {
        ajeVar.m98378m(ajeVar.m98369d().m141818h());
        ajeVar.m98375j(ajeVar.m98369d().m141812b());
        ajeVar.m98374i(true);
        return dq80.m117495e(ajeVar.m98367b(), l3d0.f129864f) && dq80.m117495e(m110119g(ajeVar.m98367b()), ajeVar.m98371f()) && dq80.m117497g(m110117e(ajeVar.m98367b()), ajeVar.m98366a());
    }

    @WorkerThread
    /* JADX INFO: renamed from: r */
    public static synchronized void m110130r(JSONObject jSONObject, aje ajeVar) {
        try {
            try {
                if (ajeVar.m98369d() != null) {
                    return;
                }
                ire0 ire0VarM110127o = m110127o(jSONObject.getJSONObject(ajeVar.m98367b()));
                ajeVar.m98377l(ire0VarM110127o);
                if (ire0VarM110127o.m141818h() == ajeVar.m98371f() && (TextUtils.equals(ajeVar.m98366a(), ire0VarM110127o.m141812b()) || m110121i(ajeVar))) {
                    m110129q(ajeVar);
                } else {
                    ajeVar.m98374i(false);
                    if (ire0VarM110127o.m141819i() && ire0VarM110127o.m141813c() != null && !TextUtils.equals(ire0VarM110127o.m141813c(), miw.m158556e(zie.m219732e(ajeVar)))) {
                        ire0VarM110127o.m141820j(false);
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
