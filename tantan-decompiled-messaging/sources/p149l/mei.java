package p149l;

import android.content.ContentValues;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.immomo.framework.storage.p039kv.C3750KV;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mei implements lei {

    /* JADX INFO: renamed from: a */
    private volatile boolean f133421a = false;

    /* JADX INFO: renamed from: b */
    private final Object f133422b = new Object();

    /* JADX INFO: renamed from: l.mei$a */
    public class C18442a extends ax00.AbstractRunnableC15743b<Void, Void, String> {

        /* JADX INFO: renamed from: g */
        private String f133423g;

        /* JADX INFO: renamed from: h */
        private int f133424h;

        /* JADX INFO: renamed from: i */
        private sei f133425i;

        public C18442a(String str, int i, sei seiVar) {
            this.f133423g = str == null ? "" : str;
            this.f133424h = i;
            this.f133425i = seiVar;
        }

        /* JADX INFO: renamed from: r */
        private void m154221r(Exception exc) {
            nei neiVarM163954e;
            sei seiVar = this.f133425i;
            if (seiVar != null) {
                if ((seiVar instanceof oei) && (neiVarM163954e = ((oei) seiVar).getOfflineDownloadListener()) != null) {
                    neiVarM163954e.mo87192a(exc);
                }
                nei customResultListener = this.f133425i.getCustomResultListener();
                if (customResultListener != null) {
                    customResultListener.mo87192a(exc);
                }
            }
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: n */
        public void mo87096n(Exception exc) {
            exc.printStackTrace();
            MDLog.m7389d("FepPublishManager", "fetch webConfig fail --> " + exc.getMessage());
            mei.this.f133421a = false;
            m154221r(exc);
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: o */
        public void mo99349o() {
            super.mo99349o();
            mei.this.f133421a = false;
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String mo87095f(Void[] voidArr) throws Exception {
            nei neiVarM163954e;
            boolean z = true;
            mei.this.f133421a = true;
            String strM145782a = kei.m145782a(this.f133425i, this.f133423g, String.valueOf(this.f133424h));
            try {
                if (!TextUtils.isEmpty(strM145782a)) {
                    JSONObject jSONObject = new JSONObject(strM145782a);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject.optInt("need_update") != 1) {
                        z = false;
                    }
                    mei.m154219y(jSONObjectOptJSONObject, strM145782a);
                    if (TextUtils.isEmpty(nhw.m159461d()) || z) {
                        nhw.m159462e(strM145782a);
                        vei.m198186e().m198197n();
                    } else {
                        MDLog.m7389d("FepPublishManager", "no need to update local");
                    }
                    sei seiVar = this.f133425i;
                    if (seiVar != null) {
                        if ((seiVar instanceof oei) && (neiVarM163954e = ((oei) seiVar).getOfflineDownloadListener()) != null) {
                            neiVarM163954e.mo87193b(strM145782a, jSONObject);
                        }
                        nei customResultListener = this.f133425i.getCustomResultListener();
                        if (customResultListener != null) {
                            customResultListener.mo87193b(strM145782a, jSONObject);
                        }
                    }
                }
                return strM145782a;
            } catch (Exception e) {
                e.printStackTrace();
                m154221r(e);
                return strM145782a;
            }
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo87097p(String str) {
            MDLog.m7389d("FepPublishManager", "fetch webConfig suc --> \n" + str);
            C3750KV.m18343j("fep_last_fetch_config_time", Long.valueOf(System.currentTimeMillis()));
            mei.this.f133421a = false;
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m154191A() {
        return C3750KV.m18337d("key_mk_web_pool_cache_timeout", 30);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m154192B() {
        return C3750KV.m18336c("key_mk_web_monitor_enable", false);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m154193C() {
        return C3750KV.m18336c("key_mk_screenshot_enable", false);
    }

    /* JADX INFO: renamed from: D */
    public static int m154194D() {
        return C3750KV.m18337d("key_mk_screenshot_cache_count", 50);
    }

    /* JADX INFO: renamed from: E */
    public static int m154195E() {
        return C3750KV.m18337d("key_mk_screenshot_cache_size", 500);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m154197c() {
        if (m154198d()) {
            return C3750KV.m18336c("key_mk_allow_file_access", false);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m154198d() {
        return C3750KV.m18336c("key_mk_allow_safe_checker", true);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m154199e() {
        return C3750KV.m18336c("key_mk_boost_enable", false);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m154200f() {
        return C3750KV.m18336c("key_fep_config_regular", false);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m154201g() {
        return C3750KV.m18336c("key_fep_publish_enable", shw.m184301u());
    }

    /* JADX INFO: renamed from: h */
    public static boolean m154202h() {
        return C3750KV.m18336c("key_mk_enhance_quality_log_bridge_call", false);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m154203i() {
        return C3750KV.m18336c("key_mk_enhance_quality_allow_all_switch", false);
    }

    /* JADX INFO: renamed from: j */
    public static String m154204j(boolean z) {
        return C3750KV.m18339f(z ? "key_mk_enhance_quality_ui_black_hosts" : "key_mk_enhance_quality_log_black_hosts", WeJson.EMPTY_ARR);
    }

    /* JADX INFO: renamed from: k */
    public static String m154205k(boolean z) {
        return C3750KV.m18339f(z ? "key_mk_enhance_quality_ui_black_urls" : "key_mk_enhance_quality_log_black_urls", WeJson.EMPTY_ARR);
    }

    /* JADX INFO: renamed from: l */
    public static String m154206l() {
        return C3750KV.m18339f("key_mk_boost_bid", "0");
    }

    /* JADX INFO: renamed from: m */
    public static long m154207m() {
        return C3750KV.m18338e("key_mk_boost_version", 0L);
    }

    /* JADX INFO: renamed from: n */
    public static String m154208n() {
        return C3750KV.m18339f("key_fep_black_bids", WeJson.EMPTY_ARR);
    }

    /* JADX INFO: renamed from: o */
    public static String m154209o() {
        return C3750KV.m18339f("key_fep_black_hosts", WeJson.EMPTY_ARR);
    }

    /* JADX INFO: renamed from: p */
    public static long m154210p() {
        return C3750KV.m18337d("key_fep_fetch_request_interval", 30);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m154211q() {
        return C3750KV.m18336c("key_mk_enhance_quality_log_switch", false);
    }

    /* JADX INFO: renamed from: r */
    public static Set<String> m154212r() {
        try {
            String strM18339f = C3750KV.m18339f("key_mk_safe_protocols_config", WeJson.EMPTY_ARR);
            if (b0g0.m99771d(strM18339f) && strM18339f.trim().startsWith("[")) {
                JSONArray jSONArray = new JSONArray(strM18339f);
                HashSet hashSet = new HashSet(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.optString(i));
                }
                return hashSet;
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace("FepPublishManager", th);
        }
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: s */
    public static long m154213s() {
        return C3750KV.m18337d("key_fep_polling_interval", 120);
    }

    /* JADX INFO: renamed from: t */
    public static String m154214t() {
        return C3750KV.m18339f("key_mk_pool_preload_url", "");
    }

    /* JADX INFO: renamed from: u */
    public static boolean m154215u() {
        return C3750KV.m18336c("key_mk_pool_preload_enable", false);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m154216v() {
        return C3750KV.m18336c("key_request_dispatch_enable", false);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m154217w() {
        return C3750KV.m18336c("key_mk_enhance_quality_enable", false);
    }

    /* JADX INFO: renamed from: x */
    public static int m154218x() {
        return C3750KV.m18337d("key_mk_pool_webview_max_size", 0);
    }

    /* JADX INFO: renamed from: y */
    public static void m154219y(JSONObject jSONObject, String str) {
        int iOptInt;
        int iOptInt2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        int i2;
        int i3;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        tei teiVarM198189d;
        JSONObject jSONObjectOptJSONObject;
        long jOptLong;
        boolean z15;
        if (jSONObject != null) {
            try {
                boolean zHas = jSONObject.has("mk_config");
                String strOptString = "";
                String strOptString2 = "0";
                int iOptInt3 = 120;
                String str8 = WeJson.EMPTY_ARR;
                if (!zHas || (jSONObjectOptJSONObject = jSONObject.optJSONObject("mk_config")) == null) {
                    iOptInt = 30;
                    iOptInt2 = 500;
                    str2 = WeJson.EMPTY_ARR;
                    str3 = str2;
                    str4 = str3;
                    str5 = str4;
                    str6 = str5;
                    str7 = str6;
                    i = 5;
                    i2 = 50;
                    i3 = 30;
                    j = 0;
                    z = true;
                    z2 = false;
                    z3 = false;
                    i4 = 0;
                    z4 = false;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    z9 = false;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                    z14 = false;
                } else {
                    boolean z16 = jSONObjectOptJSONObject.optInt("fepWebConfigEnable", 0) == 1;
                    boolean z17 = jSONObjectOptJSONObject.optInt("fepWebConfigRegularEnable", 0) == 1;
                    iOptInt3 = jSONObjectOptJSONObject.optInt("fepWebConfigPollTime", 120);
                    int iOptInt4 = jSONObjectOptJSONObject.optInt("fepWebConfigRequestInterval", 30);
                    String strOptString3 = jSONObjectOptJSONObject.optString("fepBlackBids", WeJson.EMPTY_ARR);
                    String strOptString4 = jSONObjectOptJSONObject.optString("fepBlackHosts", WeJson.EMPTY_ARR);
                    boolean z18 = jSONObjectOptJSONObject.optInt("requestDispatchEnable", 0) == 1;
                    int iOptInt5 = jSONObjectOptJSONObject.optInt("mkReusePoolMaxSize", 0);
                    boolean z19 = jSONObjectOptJSONObject.optInt("mkReusePoolPlaceholderEnable", 0) == 1;
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("boost");
                    if (jSONObjectOptJSONObject2 != null) {
                        strOptString = jSONObjectOptJSONObject2.optString("url", "");
                        boolean z20 = jSONObjectOptJSONObject2.optInt("enable", 0) == 1;
                        strOptString2 = jSONObjectOptJSONObject2.optString("bid", "0");
                        jOptLong = jSONObjectOptJSONObject2.optLong(WBConstants.AUTH_PARAMS_VERSION, 0L);
                        z15 = z20;
                    } else {
                        jOptLong = 0;
                        z15 = false;
                    }
                    boolean z21 = z15;
                    boolean z22 = jSONObjectOptJSONObject.optInt("mkInjectJsMonitorAndroidSwitch", 0) == 1;
                    iOptInt = jSONObjectOptJSONObject.optInt("mkWebPoolCacheTimeout", 30);
                    boolean z23 = jSONObjectOptJSONObject.optInt("mkScreenShotEnable", 0) == 1;
                    int iOptInt6 = jSONObjectOptJSONObject.optInt("mkScreenShotCacheCount", 50);
                    iOptInt2 = jSONObjectOptJSONObject.optInt("mkScreenShotCacheSize", 500);
                    boolean z24 = jSONObjectOptJSONObject.optInt("mkMutiGreyAndroidDisable", 0) == 1;
                    boolean z25 = jSONObjectOptJSONObject.optInt("MKUIEnhanceEnable", 0) == 1;
                    int iOptInt7 = jSONObjectOptJSONObject.optInt("MKUIEnhanceWaitTime", 5);
                    boolean z26 = jSONObjectOptJSONObject.optInt("MKLogEnhanceEnable", 0) == 1;
                    boolean z27 = jSONObjectOptJSONObject.optInt("MKLogBridgeCallEnable", 0) == 1;
                    boolean z28 = jSONObjectOptJSONObject.optInt("MKAllowAllLogs", 0) == 1;
                    String strOptString5 = jSONObjectOptJSONObject.optString("MKUIBlackHosts", WeJson.EMPTY_ARR);
                    z12 = z28;
                    String strOptString6 = jSONObjectOptJSONObject.optString("MKUIBlackUrls", WeJson.EMPTY_ARR);
                    String strOptString7 = jSONObjectOptJSONObject.optString("MKLogBlackHosts", WeJson.EMPTY_ARR);
                    String strOptString8 = jSONObjectOptJSONObject.optString("MKLogBlackUrls", WeJson.EMPTY_ARR);
                    String strOptString9 = jSONObjectOptJSONObject.optString("mkSafeProtocols", WeJson.EMPTY_ARR);
                    z14 = jSONObjectOptJSONObject.optInt("mkAllowFileAccess", 0) == 1;
                    boolean z29 = jSONObjectOptJSONObject.optInt("mkAllowSafeChecker", 1) == 1;
                    str2 = strOptString4;
                    str3 = strOptString7;
                    str4 = strOptString8;
                    i2 = iOptInt6;
                    z2 = z17;
                    str7 = strOptString6;
                    z13 = z27;
                    z11 = z26;
                    z10 = z25;
                    z9 = z24;
                    z8 = z23;
                    z7 = z22;
                    i4 = iOptInt5;
                    z5 = z19;
                    j = jOptLong;
                    str6 = strOptString5;
                    str5 = strOptString9;
                    str8 = strOptString3;
                    z6 = z21;
                    z3 = z18;
                    i3 = iOptInt4;
                    i = iOptInt7;
                    z = z29;
                    z4 = z16;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("key_fep_publish_enable", Boolean.valueOf(z4));
                contentValues.put("key_fep_config_regular", Boolean.valueOf(z2));
                contentValues.put("key_fep_polling_interval", Integer.valueOf(iOptInt3));
                contentValues.put("key_fep_fetch_request_interval", Integer.valueOf(i3));
                contentValues.put("key_fep_black_bids", str8);
                contentValues.put("key_fep_black_hosts", str2);
                contentValues.put("key_request_dispatch_enable", Boolean.valueOf(z3));
                contentValues.put("key_mk_pool_webview_max_size", Integer.valueOf(i4));
                contentValues.put("key_mk_pool_preload_enable", Boolean.valueOf(z5));
                contentValues.put("key_mk_web_pool_cache_timeout", Integer.valueOf(iOptInt));
                contentValues.put("key_mk_pool_preload_url", strOptString);
                contentValues.put("key_mk_boost_enable", Boolean.valueOf(z6));
                contentValues.put("key_mk_boost_bid", strOptString2);
                contentValues.put("key_mk_boost_version", Long.valueOf(j));
                contentValues.put("key_mk_allow_safe_checker", Boolean.valueOf(z));
                contentValues.put("key_mk_allow_file_access", Boolean.valueOf(z14));
                contentValues.put("key_mk_safe_protocols_config", str5);
                contentValues.put("key_mk_web_monitor_enable", Boolean.valueOf(z7));
                contentValues.put("key_mk_screenshot_enable", Boolean.valueOf(z8));
                contentValues.put("key_mk_screenshot_cache_count", Integer.valueOf(i2));
                contentValues.put("key_mk_screenshot_cache_size", Integer.valueOf(iOptInt2));
                contentValues.put("key_mk_multi_grey_disable", Boolean.valueOf(z9));
                C3750KV.m18344k(contentValues);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("key_mk_enhance_quality_enable", Boolean.valueOf(z10));
                contentValues2.put("key_mk_enhance_quality_wait_time", Integer.valueOf(i));
                contentValues2.put("key_mk_enhance_quality_log_switch", Boolean.valueOf(z11));
                contentValues2.put("key_mk_enhance_quality_allow_all_switch", Boolean.valueOf(z12));
                contentValues2.put("key_mk_enhance_quality_log_bridge_call", Boolean.valueOf(z13));
                contentValues2.put("key_mk_enhance_quality_ui_black_hosts", str6);
                contentValues2.put("key_mk_enhance_quality_ui_black_urls", str7);
                contentValues2.put("key_mk_enhance_quality_log_black_hosts", str3);
                contentValues2.put("key_mk_enhance_quality_log_black_urls", str4);
                C3750KV.m18344k(contentValues2);
                if (jSONObject.optInt("need_update") == 1 || (teiVarM198189d = vei.m198186e().m198189d()) == null) {
                    return;
                }
                teiVarM198189d.mo179046c(str);
            } catch (Exception e) {
                MDLog.printErrStackTrace("FepPublishManager", e);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m154220z() {
        return C3750KV.m18336c("key_mk_multi_grey_disable", false);
    }

    @Override // p149l.lei
    /* JADX INFO: renamed from: a */
    public synchronized void mo149546a(String str, sei seiVar) {
        try {
            boolean zEqualsIgnoreCase = "launch".equalsIgnoreCase(str);
            if (m154201g() || zEqualsIgnoreCase) {
                long jM18338e = C3750KV.m18338e("fep_last_fetch_config_time", 0L);
                int i = 0;
                int i2 = 1;
                boolean z = jM18338e == 0;
                long jCeil = (long) Math.ceil((System.currentTimeMillis() - jM18338e) / Constants.ONE_MIN_IN_MILLIS);
                MDLog.m7399w("FepPublishManager", "pollingInterval : " + m154213s() + " fetchInterval : " + m154210p() + " take period : " + jCeil);
                if ("polling".equalsIgnoreCase(str)) {
                    if (!z && m154213s() > 0) {
                        i = 1;
                    }
                    i2 = i;
                    i = 2;
                } else if (!"launch".equalsIgnoreCase(str)) {
                    i2 = jCeil >= m154210p() ? 1 : 0;
                    i = 1;
                }
                if (i2 == 0) {
                    MDLog.m7389d("FepPublishManager", "needFetch false");
                } else if (this.f133421a) {
                    MDLog.m7389d("FepPublishManager", "already has a fetch task");
                } else {
                    tei teiVarM198189d = vei.m198186e().m198189d();
                    if (teiVarM198189d != null || zEqualsIgnoreCase) {
                        ax00.m99334c(this.f133422b, new C18442a(teiVarM198189d != null ? teiVarM198189d.mo179044a() : "", i, seiVar));
                    } else {
                        MDLog.m7389d("FepPublishManager", "signature error");
                    }
                }
            } else {
                MDLog.m7389d("FepPublishManager", "enableFepStrategy false");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
