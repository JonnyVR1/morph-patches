package p149l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class r1k {
    /* JADX INFO: renamed from: a */
    public static void m177465a(mpl mplVar) {
        if (wel.m202905a("httpdns.immomo.com") == null) {
            try {
                m177466b(mplVar.getDefaultLocalDNSConfigs());
            } catch (Exception e) {
                e5e.m114786c("CosmosSdkDns", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m177466b(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.getInt("ec") == 200) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject2.getJSONArray("dns").getJSONObject(0);
            String string = jSONObject3.getString("domain");
            String string2 = jSONObject3.getJSONObject("ips").getString("master");
            ArrayList arrayList = new ArrayList();
            arrayList.add(string2);
            JSONArray jSONArray = jSONObject3.getJSONObject("ips").getJSONArray("slaves");
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            rel relVar = new rel();
            relVar.f159063a = string;
            Collections.shuffle(arrayList);
            relVar.f159064b = arrayList;
            relVar.f159066d = jSONObject2.optInt("g_ttl", 900);
            relVar.f159065c = jSONObject2.optString("etag");
            wel.m202907c(relVar);
        }
    }
}
