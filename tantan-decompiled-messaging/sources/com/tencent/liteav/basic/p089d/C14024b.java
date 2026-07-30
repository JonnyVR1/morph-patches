package com.tencent.liteav.basic.p089d;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.basic.d.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14024b {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f58236a = new HashMap();

    /* JADX INFO: renamed from: b */
    private JSONObject f58237b = null;

    /* JADX INFO: renamed from: a */
    private int m82844a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(Build.MANUFACTURER, jSONObject.optString("MANUFACTURER")));
        arrayList.add(new Pair(Build.MODEL, jSONObject.optString("MODEL")));
        arrayList.add(new Pair(String.valueOf(Build.VERSION.SDK_INT), jSONObject.optString("VERSION")));
        arrayList.add(new Pair(Build.VERSION.INCREMENTAL, jSONObject.optString("VERSION_INCREMENTAL")));
        arrayList.add(new Pair(Build.DISPLAY, jSONObject.optString("DISPLAY")));
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            if (TextUtils.isEmpty((CharSequence) pair.second)) {
                return i;
            }
            if (!((String) pair.first).equalsIgnoreCase((String) pair.second)) {
                return 0;
            }
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: b */
    private JSONObject m82846b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject = null;
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                int iM82844a = m82844a(jSONObject2.optJSONObject("deviceinfo"));
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("deviceconfig");
                if (iM82844a > i && jSONObjectOptJSONObject != null) {
                    jSONObject = jSONObjectOptJSONObject;
                    i = iM82844a;
                }
            } catch (JSONException e) {
                TXCLog.m82967e("CompatibleConfig", "Find best match value failed.", e);
            }
        }
        TXCLog.m82970i("CompatibleConfig", "bestMatchLevel: %d", Integer.valueOf(i));
        if (i > 0) {
            return jSONObject;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private void m82847b() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f58236a.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" : ");
            sb.append(entry.getValue());
            sb.append(SignParameters.NEW_LINE);
        }
        TXCLog.m82969i("CompatibleConfig", sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82849a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f58236a.clear();
            JSONObject jSONObject = new JSONObject(str);
            this.f58237b = jSONObject;
            m82845a(this.f58236a, "", jSONObject);
            m82847b();
        } catch (JSONException e) {
            TXCLog.m82967e("CompatibleConfig", "parse best match value failed.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized JSONObject m82848a() {
        return this.f58237b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82850a(JSONArray jSONArray) {
        this.f58236a.clear();
        JSONObject jSONObjectM82846b = m82846b(jSONArray);
        this.f58237b = jSONObjectM82846b;
        if (jSONObjectM82846b == null) {
            TXCLog.m82969i("CompatibleConfig", "can't find best match value");
        } else {
            m82845a(this.f58236a, "", jSONObjectM82846b);
            m82847b();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m82845a(Map<String, String> map, String str, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                m82845a(map, str + "." + next, (JSONObject) objOpt);
            } else if (objOpt != null) {
                map.put(str + "." + next, objOpt.toString());
            }
        }
    }
}
