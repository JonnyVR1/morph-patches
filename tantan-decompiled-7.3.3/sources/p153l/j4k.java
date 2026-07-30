package p153l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class j4k {
    /* JADX INFO: renamed from: a */
    public static void m143428a(zrl zrlVar) {
        if (nhl.m163109a("httpdns.immomo.com") == null) {
            try {
                m143429b(zrlVar.getDefaultLocalDNSConfigs());
            } catch (Exception e) {
                s6e.m184884c("CosmosSdkDns", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m143429b(String str) throws Exception {
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
            hhl hhlVar = new hhl();
            hhlVar.f109900a = string;
            Collections.shuffle(arrayList);
            hhlVar.f109901b = arrayList;
            hhlVar.f109903d = jSONObject2.optInt("g_ttl", 900);
            hhlVar.f109902c = jSONObject2.optString("etag");
            nhl.m163111c(hhlVar);
        }
    }
}
