package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.immomo.resdownloader.log.MLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class k500 {

    /* JADX INFO: renamed from: a */
    private static final k850 f121137a;

    static {
        k850.C17954b c17954bM144889j = new k850.C17954b().m144889j(k0c.m144028a());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f121137a = c17954bM144889j.m144903x(15L, timeUnit).m144899t(5L, timeUnit).m144882c();
    }

    /* JADX INFO: renamed from: a */
    public static String m144518a(String str) throws Exception {
        HashMap map = new HashMap(5);
        map.put(Constants.DEVICE_ID_TAG, ivc0.f115120i);
        map.put(RemoteConfigConstants.RequestFieldKey.APP_ID, ivc0.f115113b);
        map.put("keystoreSha1", xkd0.m209768a());
        map.put("curResource", str);
        if (!TextUtils.isEmpty(ivc0.f115114c)) {
            map.put("businessType", ivc0.f115114c);
        }
        String strM144519b = m144519b("resourceForCv", map);
        MLog.m19459d("CVCENTER_-API", "getConfig result: %s", strM144519b);
        JSONObject jSONObject = new JSONObject(strM144519b);
        return (jSONObject.has("ec") && jSONObject.optInt("ec") == 0) ? jSONObject.getJSONObject("data").optString(Constants.KEY_CONFIG) : "";
    }

    /* JADX INFO: renamed from: b */
    private static String m144519b(String str, Map<String, String> map) throws Exception {
        MLog.m19459d("CVCENTER_-API", " action: %s request params：%s", str, map);
        JSONObject jSONObject = new JSONObject();
        for (String str2 : map.keySet()) {
            jSONObject.put(str2, map.get(str2));
        }
        qyi.C19606a c19606a = new qyi.C19606a();
        String strM198558g = vie.m198558g(12);
        c19606a.m177040a("msc", ie2.m135655b(vie.m198554a(strM198558g.getBytes())));
        c19606a.m177040a("mzip", vie.m198555d().m198560c(ie2.m135655b(jSONObject.toString().getBytes()), strM198558g));
        String str3 = new String(f121137a.mo144849a(new stc0.C20027a().m185898q("https://cosmos-video-api.immomo.com/video/index/" + str).m185893l(c19606a.m177041b()).m185882a("User-Agent", xkd0.m209772e()).m185883b()).execute().m118606k().bytes(), "UTF-8");
        MLog.m19459d("CVCENTER_-API", "action: %s response：%s", str, str3);
        if ("reg".equals(str) || "resourceForCv".equals(str)) {
            JSONObject jSONObject2 = new JSONObject(str3);
            if (jSONObject2.optInt("ec", -1) == 0) {
                String strM198559b = vie.m198555d().m198559b(jSONObject2.getJSONObject("data").optString("mzip"), strM198558g);
                MLog.m19459d("CVCENTER_-API", "action: %s response asekey %s ,明文：%s", str, strM198558g, strM198559b);
                jSONObject2.put("data", new JSONObject(strM198559b));
                return jSONObject2.toString();
            }
        }
        return str3;
    }
}
