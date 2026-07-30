package p149l;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class re2 {
    /* JADX INFO: renamed from: a */
    public static String m179022a(String str) {
        try {
            String strM184286f = shw.m184286f(str);
            if (str != null && (str.startsWith("https") || str.startsWith("http"))) {
                if (!TextUtils.isEmpty(strM184286f) && liw.m149947h(strM184286f)) {
                    return str;
                }
            }
            if (str == null || str.startsWith("https://api.immomo.com/")) {
                return str;
            }
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            return "https://api.immomo.com/".concat(str);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m179023b(String str, HashMap<String, String> map, HashMap<String, String> map2) throws Exception {
        mxv.m156926a("BaseAPI", "tang-----doPost params " + map);
        String strMo87143a = phw.m169153b().m169154a().mo87143a(str, map, map2);
        mxv.m156926a("BaseAPI", "tang-----doPost result " + str + "  \n" + strMo87143a);
        JSONObject jSONObject = new JSONObject(strMo87143a);
        if (jSONObject.optInt("ec") == 0 && jSONObject.has("data")) {
            return jSONObject;
        }
        whq0.m203241a(jSONObject.optString("em"));
        return null;
    }
}
