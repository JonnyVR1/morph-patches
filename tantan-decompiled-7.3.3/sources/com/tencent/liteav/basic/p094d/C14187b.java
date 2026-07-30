package com.tencent.liteav.basic.p094d;

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
public class C14187b {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f59084a = new HashMap();

    /* JADX INFO: renamed from: b */
    private JSONObject f59085b = null;

    /* JADX INFO: renamed from: a */
    private int m84027a(JSONObject jSONObject) {
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
    private JSONObject m84029b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject = null;
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                int iM84027a = m84027a(jSONObject2.optJSONObject("deviceinfo"));
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("deviceconfig");
                if (iM84027a > i && jSONObjectOptJSONObject != null) {
                    jSONObject = jSONObjectOptJSONObject;
                    i = iM84027a;
                }
            } catch (JSONException e) {
                TXCLog.m84150e("CompatibleConfig", "Find best match value failed.", e);
            }
        }
        TXCLog.m84153i("CompatibleConfig", "bestMatchLevel: %d", Integer.valueOf(i));
        if (i > 0) {
            return jSONObject;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private void m84030b() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f59084a.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" : ");
            sb.append(entry.getValue());
            sb.append(SignParameters.NEW_LINE);
        }
        TXCLog.m84152i("CompatibleConfig", sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84032a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                this.f59084a.clear();
                JSONObject jSONObject = new JSONObject(str);
                this.f59085b = jSONObject;
                m84028a(this.f59084a, "", jSONObject);
                m84030b();
            } catch (JSONException e) {
                TXCLog.m84150e("CompatibleConfig", "parse best match value failed.", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized JSONObject m84031a() {
        return this.f59085b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84033a(JSONArray jSONArray) {
        this.f59084a.clear();
        JSONObject jSONObjectM84029b = m84029b(jSONArray);
        this.f59085b = jSONObjectM84029b;
        if (jSONObjectM84029b == null) {
            TXCLog.m84152i("CompatibleConfig", "can't find best match value");
        } else {
            m84028a(this.f59084a, "", jSONObjectM84029b);
            m84030b();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84028a(Map<String, String> map, String str, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                m84028a(map, str + "." + next, (JSONObject) objOpt);
            } else if (objOpt != null) {
                map.put(str + "." + next, objOpt.toString());
            }
        }
    }
}
