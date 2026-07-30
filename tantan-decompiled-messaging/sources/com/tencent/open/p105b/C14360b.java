package com.tencent.open.p105b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p104a.C14355f;
import com.tencent.open.utils.C14389g;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14394l;
import com.tencent.open.utils.C14395m;
import com.tencent.open.utils.C14396n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.tencent.open.b.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14360b {

    /* JADX INFO: renamed from: a */
    private static C14360b f60197a;

    /* JADX INFO: renamed from: b */
    private String f60198b = "";

    /* JADX INFO: renamed from: c */
    private String f60199c = "";

    /* JADX INFO: renamed from: d */
    private String f60200d = "";

    /* JADX INFO: renamed from: e */
    private String f60201e = "";

    /* JADX INFO: renamed from: f */
    private String f60202f = "";

    /* JADX INFO: renamed from: g */
    private String f60203g = "";

    /* JADX INFO: renamed from: h */
    private String f60204h = "";

    /* JADX INFO: renamed from: i */
    private List<Serializable> f60205i = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j */
    private List<Serializable> f60206j = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: k */
    private Executor f60207k = C14395m.m84455b();

    /* JADX INFO: renamed from: l */
    private boolean f60208l;

    private C14360b() {
    }

    /* JADX INFO: renamed from: b */
    private C14361c m84251b(String str, String str2, Object obj, Map<String, Object> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map2 = new HashMap();
        map2.put("attaid", "09400051119");
        map2.put("token", "9389887874");
        map2.put("time_appid_openid", jCurrentTimeMillis + "_" + this.f60198b + "_" + this.f60200d);
        map2.put("time", String.valueOf(jCurrentTimeMillis));
        map2.put("openid", this.f60200d);
        map2.put("appid", this.f60198b);
        map2.put("app_name", this.f60199c);
        map2.put(Constants.PARAM_APP_VER, this.f60201e);
        map2.put(Constants.PARAM_PKG_NAME, this.f60202f);
        map2.put("os", "AND");
        map2.put("os_ver", Build.VERSION.RELEASE);
        map2.put(Constants.PARAM_SDK_VER, Constants.SDK_VERSION);
        map2.put(Constants.PARAM_MN, C14389g.m84397a().m84402c());
        map2.put("interface_name", str);
        map2.put("interface_data", str2);
        map2.put("interface_result", obj == null ? "" : obj.toString());
        map2.put("qq_install", this.f60203g);
        map2.put(Constants.PARAM_QQ_VER, this.f60204h);
        if (map != null && !map.isEmpty()) {
            Object obj2 = map.get("reserve1");
            map2.put("reserve1", obj2 == null ? "" : obj2.toString());
            Object obj3 = map.get("reserve2");
            map2.put("reserve2", obj3 == null ? "" : obj3.toString());
            Object obj4 = map.get("reserve3");
            map2.put("reserve3", obj4 == null ? "" : obj4.toString());
            Object obj5 = map.get("reserve4");
            map2.put("reserve4", obj5 != null ? obj5.toString() : "");
        }
        return new C14361c((HashMap<String, String>) map2);
    }

    /* JADX INFO: renamed from: c */
    private void m84255c() {
        while (!this.f60206j.isEmpty()) {
            C14361c c14361c = (C14361c) this.f60206j.remove(0);
            c14361c.f60211a.put("appid", this.f60198b);
            c14361c.f60211a.put("app_name", this.f60199c);
            c14361c.f60211a.put(Constants.PARAM_APP_VER, this.f60201e);
            c14361c.f60211a.put(Constants.PARAM_PKG_NAME, this.f60202f);
            c14361c.f60211a.put("qq_install", this.f60203g);
            c14361c.f60211a.put(Constants.PARAM_QQ_VER, this.f60204h);
            c14361c.f60211a.put("openid", this.f60200d);
            c14361c.f60211a.put("time_appid_openid", c14361c.f60211a.get("time") + "_" + this.f60198b + "_" + this.f60200d);
            StringBuilder sb = new StringBuilder("fixDirtyData--------------------------");
            sb.append(c14361c);
            SLog.m84309i("AttaReporter", sb.toString());
            this.f60205i.add(c14361c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m84256d() {
        SLog.m84309i("AttaReporter", "attaReportAtSubThread");
        if (!this.f60208l) {
            List<Serializable> listM84275b = C14365g.m84275b("report_atta");
            this.f60208l = listM84275b.isEmpty();
            this.f60205i.addAll(listM84275b);
            Iterator<Serializable> it = listM84275b.iterator();
            while (it.hasNext()) {
                SLog.m84309i("AttaReporter", "attaReportAtSubThread from db = " + it.next());
            }
        }
        ArrayList arrayList = new ArrayList();
        while (!this.f60205i.isEmpty()) {
            C14361c c14361c = (C14361c) this.f60205i.remove(0);
            if (!m84254b(c14361c)) {
                arrayList.add(c14361c);
            }
        }
        if (arrayList.isEmpty()) {
            if (this.f60208l) {
                return;
            }
            SLog.m84309i("AttaReporter", "attaReportAtSubThread clear db");
            C14365g.m84273a("report_atta");
            this.f60208l = true;
            return;
        }
        SLog.m84309i("AttaReporter", "attaReportAtSubThread fail size=" + arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SLog.m84309i("AttaReporter", "attaReportAtSubThread fail cache to db, " + ((C14361c) ((Serializable) it2.next())));
        }
        C14365g.m84274a("report_atta", arrayList);
        this.f60208l = false;
    }

    /* JADX INFO: renamed from: a */
    public void m84261a(String str, String str2, Object obj, Map<String, Object> map) {
        C14361c c14361cM84251b = m84251b(str, str2, obj, map);
        if (!TextUtils.isEmpty(this.f60198b) && !TextUtils.isEmpty(this.f60199c) && C14390h.m84404a() != null) {
            m84250a(c14361cM84251b);
            return;
        }
        SLog.m84309i("AttaReporter", "attaReport cancel appid=" + this.f60198b + ", mAppName=" + this.f60199c + ", context=" + C14390h.m84404a() + ", " + c14361cM84251b);
        this.f60206j.add(c14361cM84251b);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14360b m84248a() {
        try {
            if (f60197a == null) {
                f60197a = new C14360b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60197a;
    }

    /* JADX INFO: renamed from: a */
    public void m84258a(String str, Context context) {
        SLog.m84309i("AttaReporter", "init");
        this.f60198b = str;
        this.f60199c = C14394l.m84433a(context);
        this.f60201e = C14396n.m84494d(context, C14390h.m84407b());
        this.f60202f = C14390h.m84407b();
        this.f60203g = C14394l.m84443b(context) ? "1" : "0";
        this.f60204h = C14396n.m84491c(context, "com.tencent.mobileqq");
        m84255c();
        C14365g.m84272a();
    }

    /* JADX INFO: renamed from: a */
    public void m84257a(String str) {
        SLog.m84309i("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.f60200d = str;
    }

    /* JADX INFO: renamed from: a */
    public void m84260a(String str, String str2) {
        m84262a(str, str2, null);
    }

    /* JADX INFO: renamed from: a */
    public void m84262a(String str, String str2, Map<String, Object> map) {
        m84261a(str, str2, "", map);
    }

    /* JADX INFO: renamed from: a */
    public void m84259a(String str, Object obj) {
        m84261a(str, "", obj, null);
    }

    /* JADX INFO: renamed from: a */
    private void m84250a(final C14361c c14361c) {
        this.f60207k.execute(new Runnable() { // from class: com.tencent.open.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                C14360b.this.f60205i.add(c14361c);
                if (!C14396n.m84488b(C14390h.m84404a())) {
                    SLog.m84309i("AttaReporter", "attaReport net disconnect, " + c14361c);
                } else {
                    try {
                        C14360b.this.m84256d();
                    } catch (Exception e) {
                        SLog.m84308e("AttaReporter", "Exception", e);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private boolean m84254b(C14361c c14361c) {
        String str = "AttaReporter";
        int i = 0;
        do {
            i++;
            try {
                SLog.m84309i(str, "doAttaReportItem post " + c14361c);
                return C14355f.m84227a().m84235b("https://h.trace.qq.com/kv", c14361c.f60211a).mo84224d() == 200;
            } catch (Exception e) {
                SLog.m84310i(str, "Exception", e);
            }
        } while (i < 2);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static String m84252b() {
        return m84248a().f60198b;
    }
}
