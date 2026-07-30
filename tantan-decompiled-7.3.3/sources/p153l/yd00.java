package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.immomo.resdownloader.log.MLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class yd00 {

    /* JADX INFO: renamed from: a */
    private static final rg50 f198562a;

    static {
        rg50.C19837b c19837bM181372j = new rg50.C19837b().m181372j(x1c.m209015a());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f198562a = c19837bM181372j.m181387y(15L, timeUnit).m181383u(5L, timeUnit).m181365c();
    }

    /* JADX INFO: renamed from: a */
    public static String m215184a(String str) throws Exception {
        HashMap map = new HashMap(5);
        map.put(Constants.DEVICE_ID_TAG, l3d0.f129867i);
        map.put(RemoteConfigConstants.RequestFieldKey.APP_ID, l3d0.f129860b);
        map.put("keystoreSha1", atd0.m100175a());
        map.put("curResource", str);
        if (!TextUtils.isEmpty(l3d0.f129861c)) {
            map.put("businessType", l3d0.f129861c);
        }
        String strM215185b = m215185b("resourceForCv", map);
        MLog.m20458d("CVCENTER_-API", "getConfig result: %s", strM215185b);
        JSONObject jSONObject = new JSONObject(strM215185b);
        return (jSONObject.has("ec") && jSONObject.optInt("ec") == 0) ? jSONObject.getJSONObject("data").optString(Constants.KEY_CONFIG) : "";
    }

    /* JADX INFO: renamed from: b */
    private static String m215185b(String str, Map<String, String> map) throws Exception {
        MLog.m20458d("CVCENTER_-API", " action: %s request params：%s", str, map);
        JSONObject jSONObject = new JSONObject();
        for (String str2 : map.keySet()) {
            jSONObject.put(str2, map.get(str2));
        }
        l1j.C18332a c18332a = new l1j.C18332a();
        String strM219973g = zje.m219973g(12);
        c18332a.m152497a("msc", qe2.m176219b(zje.m219969a(strM219973g.getBytes())));
        c18332a.m152497a("mzip", zje.m219970d().m219975c(qe2.m176219b(jSONObject.toString().getBytes()), strM219973g));
        String str3 = new String(f198562a.mo181341a(new x1d0.C21228a().m209043q("https://cosmos-video-api.immomo.com/video/index/" + str).m209038l(c18332a.m152498b()).m209027a("User-Agent", atd0.m100179e()).m209028b()).execute().m138670k().bytes(), "UTF-8");
        MLog.m20458d("CVCENTER_-API", "action: %s response：%s", str, str3);
        if ("reg".equals(str) || "resourceForCv".equals(str)) {
            JSONObject jSONObject2 = new JSONObject(str3);
            if (jSONObject2.optInt("ec", -1) == 0) {
                String strM219974b = zje.m219970d().m219974b(jSONObject2.getJSONObject("data").optString("mzip"), strM219973g);
                MLog.m20458d("CVCENTER_-API", "action: %s response asekey %s ,明文：%s", str, strM219973g, strM219974b);
                jSONObject2.put("data", new JSONObject(strM219974b));
                return jSONObject2.toString();
            }
        }
        return str3;
    }
}
