package com.tencent.liteav.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p089d.C14025c;
import com.tencent.liteav.basic.util.C14052f;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.network.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14153i {

    /* JADX INFO: renamed from: a */
    protected static C14153i f59573a = new C14153i();

    /* JADX INFO: renamed from: b */
    private Context f59574b = null;

    /* JADX INFO: renamed from: c */
    private long f59575c = 3;

    /* JADX INFO: renamed from: com.tencent.liteav.network.i$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public float f59576a = 0.0f;

        /* JADX INFO: renamed from: b */
        public float f59577b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f59578c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f59579d = 0.0f;

        /* JADX INFO: renamed from: e */
        public long f59580e = 0;

        public a() {
        }
    }

    /* JADX INFO: renamed from: a */
    private a m83734a(String str, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        String str2 = "avgAudioQue";
        if (m83736b(str)) {
            return null;
        }
        try {
            String string = this.f59574b.getSharedPreferences("com.tencent.liteav.network", 0).getString("34238512-C08C-4931-A000-40E1D8B5BA5B", "");
            if (m83736b(string) || (jSONObjectOptJSONObject = new JSONObject(string).optJSONObject(str)) == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(z ? "DomainArrayData" : "OriginArrayData");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            long length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                return null;
            }
            String str3 = "";
            float f = 0.0f;
            float fOptDouble = 0.0f;
            float f2 = 0.0f;
            int i = 0;
            float fOptDouble2 = 0.0f;
            while (i < length) {
                try {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    float fOptLong = f + jSONObject.optLong("networkRTT");
                    fOptDouble = (float) (((double) fOptDouble) + jSONObject.optDouble("avgBlockCnt"));
                    fOptDouble2 = (float) (((double) fOptDouble2) + jSONObject.optDouble("avgVideoQue"));
                    float fOptDouble3 = (float) (((double) f2) + jSONObject.optDouble(str2));
                    str3 = String.format("%s \n isDomainAddressBetter：itemData domain = %b NetworkRTT = %d avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str3, Boolean.valueOf(z), Long.valueOf(jSONObject.optLong("networkRTT")), Double.valueOf(jSONObject.optDouble("avgBlockCnt")), Double.valueOf(jSONObject.optDouble("avgVideoQue")), Double.valueOf(jSONObject.optDouble(str2)));
                    i++;
                    f2 = fOptDouble3;
                    f = fOptLong;
                    str2 = str2;
                } catch (Exception e) {
                    e = e;
                }
            }
            float f3 = length;
            float f4 = f / f3;
            float f5 = fOptDouble / f3;
            float f6 = fOptDouble2 / f3;
            float f7 = f2 / f3;
            a aVar = new a();
            aVar.f59576a = f4;
            aVar.f59577b = f5;
            aVar.f59578c = f6;
            aVar.f59579d = f7;
            aVar.f59580e = length;
            return aVar;
        } catch (Exception e2) {
            e = e2;
        }
        TXCLog.m82967e("UploadQualityData", "get quality data failed.", e);
        return 0;
    }

    /* JADX INFO: renamed from: d */
    private void m83738d() {
        long jM82878a = C14025c.m82853a().m82878a("Network", "QualityDataCacheCount");
        this.f59575c = jM82878a;
        if (jM82878a == -1 || jM82878a < 3) {
            this.f59575c = 3L;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m83743b() {
        int iM83053e;
        try {
            Context context = this.f59574b;
            if (context == null || (iM83053e = C14052f.m83053e(context)) == 0) {
                return "";
            }
            if (iM83053e == 1) {
                return "wifi:";
            }
            if (iM83053e == 2) {
                return "4g:";
            }
            if (iM83053e == 3) {
                return "3g:";
            }
            if (iM83053e == 4) {
                return "2g:";
            }
            return iM83053e == 5 ? "ethernet:" : "xg:";
        } catch (Exception e) {
            TXCLog.m82966e("UploadQualityData", "get network type failed." + e.getMessage());
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public boolean m83744c() {
        m83738d();
        String strM83743b = m83743b();
        String str = "isDomainAddressBetter: accessID = " + strM83743b + " minQualityDataCount = " + this.f59575c;
        a aVarM83734a = m83734a(strM83743b, true);
        a aVarM83734a2 = m83734a(strM83743b, false);
        if (aVarM83734a != null) {
            str = String.format("%s \n isDomainAddressBetter：domainQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str, Long.valueOf(aVarM83734a.f59580e), Float.valueOf(aVarM83734a.f59576a), Float.valueOf(aVarM83734a.f59577b), Float.valueOf(aVarM83734a.f59578c), Float.valueOf(aVarM83734a.f59579d));
        }
        String str2 = str;
        if (aVarM83734a2 != null) {
            str2 = String.format("%s \n isDomainAddressBetter：originQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str2, Long.valueOf(aVarM83734a2.f59580e), Float.valueOf(aVarM83734a2.f59576a), Float.valueOf(aVarM83734a2.f59577b), Float.valueOf(aVarM83734a2.f59578c), Float.valueOf(aVarM83734a2.f59579d));
        }
        TXCLog.m82966e("UploadQualityData", str2);
        if (aVarM83734a != null) {
            long j = aVarM83734a.f59580e;
            long j2 = this.f59575c;
            if (j >= j2 && aVarM83734a2 != null && aVarM83734a2.f59580e >= j2 && aVarM83734a.f59577b < aVarM83734a2.f59577b && aVarM83734a.f59578c < aVarM83734a2.f59578c && aVarM83734a.f59579d < aVarM83734a2.f59579d) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private boolean m83736b(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m83737c(String str) {
        if (!m83736b(str)) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                TXCLog.m82967e("UploadQualityData", "failed to parse json string", e);
            }
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: a */
    public void m83740a(Context context) {
        if (this.f59574b == null) {
            this.f59574b = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83742a(String str, long j, long j2, long j3, float f, float f2, float f3) {
        if (C14025c.m82853a().m82878a("Network", "QualityDataCacheCount") > 0) {
            TXCLog.m82966e("UploadQualityData", String.format("updateQualityData: accessID = %s serverType = %d totalTime = %d networkRTT = %d avgBlockCnt = %f avgVideoQue = %f avgAudioQue = %f", str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
            if (m83736b(str)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f59574b.getSharedPreferences("com.tencent.liteav.network", 0);
                JSONObject jSONObjectM83737c = m83737c(sharedPreferences.getString("34238512-C08C-4931-A000-40E1D8B5BA5B", ""));
                JSONObject jSONObjectOptJSONObject = jSONObjectM83737c.optJSONObject(str);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                String str2 = j == 3 ? "DomainArrayData" : "OriginArrayData";
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str2);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("totalTime", j2);
                jSONObject.put("networkRTT", j3);
                jSONObject.put("avgBlockCnt", f);
                jSONObject.put("avgVideoQue", f2);
                jSONObject.put("avgAudioQue", f3);
                jSONArrayOptJSONArray.put(jSONObject);
                int length = jSONArrayOptJSONArray.length();
                long j4 = length;
                if (j4 > this.f59575c) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = (int) (j4 - this.f59575c); i < length; i++) {
                        jSONArray.put(jSONArrayOptJSONArray.get(i));
                    }
                    jSONArrayOptJSONArray = jSONArray;
                }
                jSONObjectOptJSONObject.put(str2, jSONArrayOptJSONArray);
                jSONObjectM83737c.put(str, jSONObjectOptJSONObject);
                sharedPreferences.edit().putString("34238512-C08C-4931-A000-40E1D8B5BA5B", jSONObjectM83737c.toString()).commit();
            } catch (Exception e) {
                TXCLog.m82967e("UploadQualityData", "build json object failed.", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14153i m83735a() {
        return f59573a;
    }

    /* JADX INFO: renamed from: a */
    public long m83739a(String str) {
        Context context = this.f59574b;
        if (context != null) {
            return context.getSharedPreferences("com.tencent.liteav.network", 0).getLong(str, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public void m83741a(String str, long j) {
        Context context = this.f59574b;
        if (context != null) {
            context.getSharedPreferences("com.tencent.liteav.network", 0).edit().putLong(str, j).commit();
        }
    }
}
