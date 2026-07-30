package com.tencent.liteav.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p094d.C14188c;
import com.tencent.liteav.basic.util.C14215f;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.network.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14316i {

    /* JADX INFO: renamed from: a */
    protected static C14316i f60421a = new C14316i();

    /* JADX INFO: renamed from: b */
    private Context f60422b = null;

    /* JADX INFO: renamed from: c */
    private long f60423c = 3;

    /* JADX INFO: renamed from: com.tencent.liteav.network.i$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public float f60424a = 0.0f;

        /* JADX INFO: renamed from: b */
        public float f60425b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f60426c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f60427d = 0.0f;

        /* JADX INFO: renamed from: e */
        public long f60428e = 0;

        public a() {
        }
    }

    /* JADX INFO: renamed from: a */
    private a m84917a(String str, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        String str2 = "avgAudioQue";
        if (m84919b(str)) {
            return null;
        }
        try {
            String string = this.f60422b.getSharedPreferences("com.tencent.liteav.network", 0).getString("34238512-C08C-4931-A000-40E1D8B5BA5B", "");
            if (m84919b(string) || (jSONObjectOptJSONObject = new JSONObject(string).optJSONObject(str)) == null) {
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
            aVar.f60424a = f4;
            aVar.f60425b = f5;
            aVar.f60426c = f6;
            aVar.f60427d = f7;
            aVar.f60428e = length;
            return aVar;
        } catch (Exception e2) {
            e = e2;
        }
        TXCLog.m84150e("UploadQualityData", "get quality data failed.", e);
        return 0;
    }

    /* JADX INFO: renamed from: d */
    private void m84921d() {
        long jM84061a = C14188c.m84036a().m84061a("Network", "QualityDataCacheCount");
        this.f60423c = jM84061a;
        if (jM84061a == -1 || jM84061a < 3) {
            this.f60423c = 3L;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m84926b() {
        int iM84236e;
        try {
            Context context = this.f60422b;
            if (context == null || (iM84236e = C14215f.m84236e(context)) == 0) {
                return "";
            }
            if (iM84236e == 1) {
                return "wifi:";
            }
            if (iM84236e == 2) {
                return "4g:";
            }
            if (iM84236e == 3) {
                return "3g:";
            }
            if (iM84236e == 4) {
                return "2g:";
            }
            return iM84236e == 5 ? "ethernet:" : "xg:";
        } catch (Exception e) {
            TXCLog.m84149e("UploadQualityData", "get network type failed." + e.getMessage());
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public boolean m84927c() {
        m84921d();
        String strM84926b = m84926b();
        String str = "isDomainAddressBetter: accessID = " + strM84926b + " minQualityDataCount = " + this.f60423c;
        a aVarM84917a = m84917a(strM84926b, true);
        a aVarM84917a2 = m84917a(strM84926b, false);
        if (aVarM84917a != null) {
            str = String.format("%s \n isDomainAddressBetter：domainQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str, Long.valueOf(aVarM84917a.f60428e), Float.valueOf(aVarM84917a.f60424a), Float.valueOf(aVarM84917a.f60425b), Float.valueOf(aVarM84917a.f60426c), Float.valueOf(aVarM84917a.f60427d));
        }
        String str2 = str;
        if (aVarM84917a2 != null) {
            str2 = String.format("%s \n isDomainAddressBetter：originQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str2, Long.valueOf(aVarM84917a2.f60428e), Float.valueOf(aVarM84917a2.f60424a), Float.valueOf(aVarM84917a2.f60425b), Float.valueOf(aVarM84917a2.f60426c), Float.valueOf(aVarM84917a2.f60427d));
        }
        TXCLog.m84149e("UploadQualityData", str2);
        if (aVarM84917a != null) {
            long j = aVarM84917a.f60428e;
            long j2 = this.f60423c;
            if (j >= j2 && aVarM84917a2 != null && aVarM84917a2.f60428e >= j2 && aVarM84917a.f60425b < aVarM84917a2.f60425b && aVarM84917a.f60426c < aVarM84917a2.f60426c && aVarM84917a.f60427d < aVarM84917a2.f60427d) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private boolean m84919b(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m84920c(String str) {
        if (!m84919b(str)) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                TXCLog.m84150e("UploadQualityData", "failed to parse json string", e);
            }
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: a */
    public void m84923a(Context context) {
        if (this.f60422b == null) {
            this.f60422b = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84925a(String str, long j, long j2, long j3, float f, float f2, float f3) {
        if (C14188c.m84036a().m84061a("Network", "QualityDataCacheCount") > 0) {
            TXCLog.m84149e("UploadQualityData", String.format("updateQualityData: accessID = %s serverType = %d totalTime = %d networkRTT = %d avgBlockCnt = %f avgVideoQue = %f avgAudioQue = %f", str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
            if (m84919b(str)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f60422b.getSharedPreferences("com.tencent.liteav.network", 0);
                JSONObject jSONObjectM84920c = m84920c(sharedPreferences.getString("34238512-C08C-4931-A000-40E1D8B5BA5B", ""));
                JSONObject jSONObjectOptJSONObject = jSONObjectM84920c.optJSONObject(str);
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
                if (j4 > this.f60423c) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = (int) (j4 - this.f60423c); i < length; i++) {
                        jSONArray.put(jSONArrayOptJSONArray.get(i));
                    }
                    jSONArrayOptJSONArray = jSONArray;
                }
                jSONObjectOptJSONObject.put(str2, jSONArrayOptJSONArray);
                jSONObjectM84920c.put(str, jSONObjectOptJSONObject);
                sharedPreferences.edit().putString("34238512-C08C-4931-A000-40E1D8B5BA5B", jSONObjectM84920c.toString()).commit();
            } catch (Exception e) {
                TXCLog.m84150e("UploadQualityData", "build json object failed.", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14316i m84918a() {
        return f60421a;
    }

    /* JADX INFO: renamed from: a */
    public long m84922a(String str) {
        Context context = this.f60422b;
        if (context != null) {
            return context.getSharedPreferences("com.tencent.liteav.network", 0).getLong(str, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public void m84924a(String str, long j) {
        Context context = this.f60422b;
        if (context != null) {
            context.getSharedPreferences("com.tencent.liteav.network", 0).edit().putLong(str, j).commit();
        }
    }
}
