package p009l;

import android.text.TextUtils;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import l.b0f;
import l.cll;
import l.exc0;
import l.hyx;
import l.qib0;
import l.stc0;
import l.utc0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pxb {

    /* JADX INFO: renamed from: a */
    public static final hyx f18949a = hyx.c("application/json; charset=utf-8");

    /* JADX INFO: renamed from: a */
    public String m20752a(String str, String str2, HashMap<String, String> map, JSONObject jSONObject, HashMap<String, String> map2) throws Exception {
        String strString;
        stc0.a aVarAuth = qib0.c0.signedIn_() ? qib0.H.auth() : qib0.H.common();
        cll cllVarL = cll.l(str);
        if (map != null) {
            cll.a aVarP = cllVarL.p();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().contains("%") || entry.getValue().contains("%")) {
                    CrashHelper.c(new RuntimeException("jsbridge http params already encoded url=" + str + ", key=" + entry.getKey() + ", value=" + entry.getValue()));
                }
                aVarP.t(entry.getKey());
                aVarP.c(entry.getKey(), entry.getValue());
            }
            cllVarL = aVarP.d();
        }
        str2.getClass();
        stc0.a aVarJ = (str2.equals("get") || str2.equals("head")) ? aVarAuth.s(cllVarL).j(str2.toUpperCase(Locale.ROOT), (utc0) null) : aVarAuth.s(cllVarL).j(str2.toUpperCase(Locale.ROOT), utc0.create(f18949a, jSONObject == null ? "{}" : jSONObject.toString()));
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                aVarJ.h(entry2.getKey(), entry2.getValue());
            }
        }
        exc0 exc0VarExecute = qib0.D.a(qib0.H.maybeUpdateRequestBeforeCall(aVarJ.b())).execute();
        if (exc0VarExecute.k() == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("status", exc0VarExecute.q());
        try {
            strString = b0f.h(exc0VarExecute).string();
        } catch (Exception unused) {
            strString = exc0VarExecute.k().string();
        }
        if (TextUtils.isEmpty(strString)) {
            jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, strString);
        } else {
            jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, new JSONObject(strString));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("status", 0);
        jSONObject3.put("response", jSONObject2);
        return jSONObject3.toString();
    }
}
