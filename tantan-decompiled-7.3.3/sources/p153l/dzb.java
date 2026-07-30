package p153l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class dzb {

    /* JADX INFO: renamed from: a */
    public static final e7y f91339a = e7y.m119772c("application/json; charset=utf-8");

    /* JADX INFO: renamed from: a */
    public String m118734a(String str, String str2, HashMap<String, String> map, JSONObject jSONObject, HashMap<String, String> map2) throws Exception {
        String strString;
        x1d0.C21228a c21228aAuth = uqb0.f180397c0.signedIn_() ? uqb0.f180376H.auth() : uqb0.f180376H.common();
        rnl rnlVarM182263l = rnl.m182263l(str);
        if (map != null) {
            rnl.C19886a c19886aM182288p = rnlVarM182263l.m182288p();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().contains("%") || entry.getValue().contains("%")) {
                    CrashHelper.m82479c(new RuntimeException("jsbridge http params already encoded url=" + str + ", key=" + entry.getKey() + ", value=" + entry.getValue()));
                }
                c19886aM182288p.m182314t(entry.getKey());
                c19886aM182288p.m182300c(entry.getKey(), entry.getValue());
            }
            rnlVarM182263l = c19886aM182288p.m182301d();
        }
        str2.getClass();
        x1d0.C21228a c21228aM209036j = (str2.equals("get") || str2.equals("head")) ? c21228aAuth.m209045s(rnlVarM182263l).m209036j(str2.toUpperCase(Locale.ROOT), null) : c21228aAuth.m209045s(rnlVarM182263l).m209036j(str2.toUpperCase(Locale.ROOT), z1d0.create(f91339a, jSONObject == null ? WeJson.EMPTY_MAP : jSONObject.toString()));
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                c21228aM209036j.m209034h(entry2.getKey(), entry2.getValue());
            }
        }
        i5d0 i5d0VarExecute = uqb0.f180368D.mo181341a(uqb0.f180376H.maybeUpdateRequestBeforeCall(c21228aM209036j.m209028b())).execute();
        if (i5d0VarExecute.m138670k() == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(NotificationCompat.CATEGORY_STATUS, i5d0VarExecute.m138673q());
        try {
            strString = f1f.m123565h(i5d0VarExecute).string();
        } catch (Exception unused) {
            strString = i5d0VarExecute.m138670k().string();
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
