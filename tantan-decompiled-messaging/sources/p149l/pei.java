package p149l;

import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.sina.weibo.sdk.constant.WBConstants;
import immomo.com.mklibrary.fep.FepStrategyInfo;
import immomo.com.mklibrary.fep.FepVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class pei {

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, AbstractC17922k4> f148440a;

    /* JADX INFO: renamed from: b */
    private String f148441b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f148442c;

    /* JADX INFO: renamed from: d */
    private Map<String, Object> f148443d;

    /* JADX INFO: renamed from: e */
    private boolean f148444e = false;

    /* JADX INFO: renamed from: f */
    private long f148445f;

    /* JADX INFO: renamed from: c */
    public static pei m168514c(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            pei peiVar = new pei();
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
            peiVar.f148445f = jSONObject.optLong("timesec");
            peiVar.f148444e = jSONObjectOptJSONObject2.optBoolean("need_update");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("bids");
            if (jSONObjectOptJSONObject3 != null) {
                peiVar.f148440a = new ConcurrentHashMap<>();
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(next);
                    if (jSONObjectOptJSONObject4 != null) {
                        String next2 = jSONObjectOptJSONObject4.keys().next();
                        long jOptLong = jSONObjectOptJSONObject4.optLong(next2);
                        if (!TextUtils.isEmpty(next2)) {
                            if ("forceUpdate".equalsIgnoreCase(next2)) {
                                peiVar.f148440a.put(next, new jyi(next, jOptLong));
                            } else if ("grey".equalsIgnoreCase(next2)) {
                                peiVar.f148440a.put(next, new yak(next, jOptLong));
                            }
                        }
                    }
                }
            }
            try {
                if (!mei.m154220z()) {
                    MDLog.m7395i("FepPublishManager", "mkOpenMultiGreyDisable=false");
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject2.optJSONObject("rules");
                    if (jSONObjectOptJSONObject5 != null) {
                        if (peiVar.f148440a == null) {
                            peiVar.f148440a = new ConcurrentHashMap<>();
                        }
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject5.keys();
                        while (itKeys2.hasNext()) {
                            String next3 = itKeys2.next();
                            JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(next3);
                            if (jSONObjectOptJSONObject6 != null) {
                                try {
                                    String strOptString = jSONObjectOptJSONObject6.optString("project");
                                    if (b0g0.m99771d(strOptString)) {
                                        FepStrategyInfo fepStrategyInfo = new FepStrategyInfo();
                                        fepStrategyInfo.setProject(strOptString);
                                        ConcurrentHashMap<String, FepVersion> concurrentHashMap = new ConcurrentHashMap<>();
                                        fepStrategyInfo.setVersionInfos(concurrentHashMap);
                                        JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject6.optJSONObject("versions");
                                        if (jSONObjectOptJSONObject7 != null) {
                                            Iterator<String> itKeys3 = jSONObjectOptJSONObject7.keys();
                                            while (itKeys3.hasNext()) {
                                                String next4 = itKeys3.next();
                                                if (b0g0.m99771d(next4) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject(next4)) != null) {
                                                    FepVersion fepVersion = new FepVersion();
                                                    fepVersion.setTag(jSONObjectOptJSONObject.optString("versionStr"));
                                                    fepVersion.setType(jSONObjectOptJSONObject.optInt("type"));
                                                    fepVersion.setVersion(jSONObjectOptJSONObject.optLong(WBConstants.AUTH_PARAMS_VERSION));
                                                    if (fepVersion.isSafe()) {
                                                        concurrentHashMap.put(next4, fepVersion);
                                                    }
                                                }
                                            }
                                        }
                                        peiVar.f148440a.put(next3, new am10(next3, fepStrategyInfo));
                                    }
                                } catch (Throwable th) {
                                    MDLog.printErrStackTrace("FepPublishManager", th);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                MDLog.printErrStackTrace("FepPublishManager", th2);
            }
            JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject2.optJSONObject("switch");
            if (jSONObjectOptJSONObject8 != null) {
                Iterator<String> itKeys4 = jSONObjectOptJSONObject8.keys();
                if (peiVar.f148442c == null) {
                    peiVar.f148442c = new HashMap();
                }
                while (itKeys4.hasNext()) {
                    String next5 = itKeys4.next();
                    peiVar.f148442c.put(next5, jSONObjectOptJSONObject8.optString(next5));
                }
            }
            peiVar.f148441b = jSONObjectOptJSONObject2.optString("hash");
            JSONObject jSONObjectOptJSONObject9 = jSONObjectOptJSONObject2.optJSONObject("mk_config");
            if (jSONObjectOptJSONObject9 != null) {
                Iterator<String> itKeys5 = jSONObjectOptJSONObject9.keys();
                if (peiVar.f148443d == null) {
                    peiVar.f148443d = new HashMap();
                }
                while (itKeys5.hasNext()) {
                    String next6 = itKeys5.next();
                    Object objOpt = jSONObjectOptJSONObject9.opt(next6);
                    gow.m127293i(next6, objOpt);
                    peiVar.f148443d.put(next6, objOpt);
                }
            }
            return peiVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Map<String, AbstractC17922k4> m168515a() {
        return this.f148440a;
    }

    /* JADX INFO: renamed from: b */
    public String m168516b() {
        return this.f148441b;
    }
}
