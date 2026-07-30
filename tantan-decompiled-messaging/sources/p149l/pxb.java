package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class pxb {

    /* JADX INFO: renamed from: a */
    public static final hyx f151653a = hyx.m133627c("application/json; charset=utf-8");

    /* JADX INFO: renamed from: a */
    public String m171827a(String str, String str2, HashMap<String, String> map, JSONObject jSONObject, HashMap<String, String> map2) throws Exception {
        String strString;
        stc0.C20027a c20027aAuth = qib0.f154714c0.signedIn_() ? qib0.f154693H.auth() : qib0.f154693H.common();
        cll cllVarM107499l = cll.m107499l(str);
        if (map != null) {
            cll.C16188a c16188aM107524p = cllVarM107499l.m107524p();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().contains("%") || entry.getValue().contains("%")) {
                    CrashHelper.m81296c(new RuntimeException("jsbridge http params already encoded url=" + str + ", key=" + entry.getKey() + ", value=" + entry.getValue()));
                }
                c16188aM107524p.m107550t(entry.getKey());
                c16188aM107524p.m107536c(entry.getKey(), entry.getValue());
            }
            cllVarM107499l = c16188aM107524p.m107537d();
        }
        str2.getClass();
        stc0.C20027a c20027aM185891j = (str2.equals("get") || str2.equals("head")) ? c20027aAuth.m185900s(cllVarM107499l).m185891j(str2.toUpperCase(Locale.ROOT), null) : c20027aAuth.m185900s(cllVarM107499l).m185891j(str2.toUpperCase(Locale.ROOT), utc0.create(f151653a, jSONObject == null ? WeJson.EMPTY_MAP : jSONObject.toString()));
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                c20027aM185891j.m185889h(entry2.getKey(), entry2.getValue());
            }
        }
        exc0 exc0VarExecute = qib0.f154685D.mo144849a(qib0.f154693H.maybeUpdateRequestBeforeCall(c20027aM185891j.m185883b())).execute();
        if (exc0VarExecute.m118606k() == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(NotificationCompat.CATEGORY_STATUS, exc0VarExecute.m118609q());
        try {
            strString = b0f.m99758h(exc0VarExecute).string();
        } catch (Exception unused) {
            strString = exc0VarExecute.m118606k().string();
        }
        if (TextUtils.isEmpty(strString)) {
            jSONObject2.put("data", strString);
        } else {
            jSONObject2.put("data", new JSONObject(strString));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(NotificationCompat.CATEGORY_STATUS, 0);
        jSONObject3.put("response", jSONObject2);
        return jSONObject3.toString();
    }
}
