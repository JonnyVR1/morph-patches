package com.tencent.open.p110b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p109a.C14518f;
import com.tencent.open.utils.C14552g;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14558m;
import com.tencent.open.utils.C14559n;
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
public class C14523b {

    /* JADX INFO: renamed from: a */
    private static C14523b f61045a;

    /* JADX INFO: renamed from: b */
    private String f61046b = "";

    /* JADX INFO: renamed from: c */
    private String f61047c = "";

    /* JADX INFO: renamed from: d */
    private String f61048d = "";

    /* JADX INFO: renamed from: e */
    private String f61049e = "";

    /* JADX INFO: renamed from: f */
    private String f61050f = "";

    /* JADX INFO: renamed from: g */
    private String f61051g = "";

    /* JADX INFO: renamed from: h */
    private String f61052h = "";

    /* JADX INFO: renamed from: i */
    private List<Serializable> f61053i = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j */
    private List<Serializable> f61054j = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: k */
    private Executor f61055k = C14558m.m85638b();

    /* JADX INFO: renamed from: l */
    private boolean f61056l;

    private C14523b() {
    }

    /* JADX INFO: renamed from: b */
    private C14524c m85434b(String str, String str2, Object obj, Map<String, Object> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map2 = new HashMap();
        map2.put("attaid", "09400051119");
        map2.put("token", "9389887874");
        map2.put("time_appid_openid", jCurrentTimeMillis + "_" + this.f61046b + "_" + this.f61048d);
        map2.put("time", String.valueOf(jCurrentTimeMillis));
        map2.put("openid", this.f61048d);
        map2.put("appid", this.f61046b);
        map2.put("app_name", this.f61047c);
        map2.put(Constants.PARAM_APP_VER, this.f61049e);
        map2.put(Constants.PARAM_PKG_NAME, this.f61050f);
        map2.put("os", "AND");
        map2.put("os_ver", Build.VERSION.RELEASE);
        map2.put(Constants.PARAM_SDK_VER, Constants.SDK_VERSION);
        map2.put(Constants.PARAM_MN, C14552g.m85580a().m85585c());
        map2.put("interface_name", str);
        map2.put("interface_data", str2);
        map2.put("interface_result", obj == null ? "" : obj.toString());
        map2.put("qq_install", this.f61051g);
        map2.put(Constants.PARAM_QQ_VER, this.f61052h);
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
        return new C14524c((HashMap<String, String>) map2);
    }

    /* JADX INFO: renamed from: c */
    private void m85438c() {
        while (!this.f61054j.isEmpty()) {
            C14524c c14524c = (C14524c) this.f61054j.remove(0);
            c14524c.f61059a.put("appid", this.f61046b);
            c14524c.f61059a.put("app_name", this.f61047c);
            c14524c.f61059a.put(Constants.PARAM_APP_VER, this.f61049e);
            c14524c.f61059a.put(Constants.PARAM_PKG_NAME, this.f61050f);
            c14524c.f61059a.put("qq_install", this.f61051g);
            c14524c.f61059a.put(Constants.PARAM_QQ_VER, this.f61052h);
            c14524c.f61059a.put("openid", this.f61048d);
            c14524c.f61059a.put("time_appid_openid", c14524c.f61059a.get("time") + "_" + this.f61046b + "_" + this.f61048d);
            StringBuilder sb = new StringBuilder("fixDirtyData--------------------------");
            sb.append(c14524c);
            SLog.m85492i("AttaReporter", sb.toString());
            this.f61053i.add(c14524c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m85439d() {
        SLog.m85492i("AttaReporter", "attaReportAtSubThread");
        if (!this.f61056l) {
            List<Serializable> listM85458b = C14528g.m85458b("report_atta");
            this.f61056l = listM85458b.isEmpty();
            this.f61053i.addAll(listM85458b);
            Iterator<Serializable> it = listM85458b.iterator();
            while (it.hasNext()) {
                SLog.m85492i("AttaReporter", "attaReportAtSubThread from db = " + it.next());
            }
        }
        ArrayList arrayList = new ArrayList();
        while (!this.f61053i.isEmpty()) {
            C14524c c14524c = (C14524c) this.f61053i.remove(0);
            if (!m85437b(c14524c)) {
                arrayList.add(c14524c);
            }
        }
        if (arrayList.isEmpty()) {
            if (this.f61056l) {
                return;
            }
            SLog.m85492i("AttaReporter", "attaReportAtSubThread clear db");
            C14528g.m85456a("report_atta");
            this.f61056l = true;
            return;
        }
        SLog.m85492i("AttaReporter", "attaReportAtSubThread fail size=" + arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SLog.m85492i("AttaReporter", "attaReportAtSubThread fail cache to db, " + ((C14524c) ((Serializable) it2.next())));
        }
        C14528g.m85457a("report_atta", arrayList);
        this.f61056l = false;
    }

    /* JADX INFO: renamed from: a */
    public void m85444a(String str, String str2, Object obj, Map<String, Object> map) {
        C14524c c14524cM85434b = m85434b(str, str2, obj, map);
        if (!TextUtils.isEmpty(this.f61046b) && !TextUtils.isEmpty(this.f61047c) && C14553h.m85587a() != null) {
            m85433a(c14524cM85434b);
            return;
        }
        SLog.m85492i("AttaReporter", "attaReport cancel appid=" + this.f61046b + ", mAppName=" + this.f61047c + ", context=" + C14553h.m85587a() + ", " + c14524cM85434b);
        this.f61054j.add(c14524cM85434b);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14523b m85431a() {
        try {
            if (f61045a == null) {
                f61045a = new C14523b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61045a;
    }

    /* JADX INFO: renamed from: a */
    public void m85441a(String str, Context context) {
        SLog.m85492i("AttaReporter", "init");
        this.f61046b = str;
        this.f61047c = C14557l.m85616a(context);
        this.f61049e = C14559n.m85677d(context, C14553h.m85590b());
        this.f61050f = C14553h.m85590b();
        this.f61051g = C14557l.m85626b(context) ? "1" : "0";
        this.f61052h = C14559n.m85674c(context, "com.tencent.mobileqq");
        m85438c();
        C14528g.m85455a();
    }

    /* JADX INFO: renamed from: a */
    public void m85440a(String str) {
        SLog.m85492i("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.f61048d = str;
    }

    /* JADX INFO: renamed from: a */
    public void m85443a(String str, String str2) {
        m85445a(str, str2, null);
    }

    /* JADX INFO: renamed from: a */
    public void m85445a(String str, String str2, Map<String, Object> map) {
        m85444a(str, str2, "", map);
    }

    /* JADX INFO: renamed from: a */
    public void m85442a(String str, Object obj) {
        m85444a(str, "", obj, null);
    }

    /* JADX INFO: renamed from: a */
    private void m85433a(final C14524c c14524c) {
        this.f61055k.execute(new Runnable() { // from class: com.tencent.open.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                C14523b.this.f61053i.add(c14524c);
                if (!C14559n.m85671b(C14553h.m85587a())) {
                    SLog.m85492i("AttaReporter", "attaReport net disconnect, " + c14524c);
                } else {
                    try {
                        C14523b.this.m85439d();
                    } catch (Exception e) {
                        SLog.m85491e("AttaReporter", "Exception", e);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private boolean m85437b(C14524c c14524c) {
        String str = "AttaReporter";
        int i = 0;
        do {
            i++;
            try {
                SLog.m85492i(str, "doAttaReportItem post " + c14524c);
                return C14518f.m85410a().m85418b("https://h.trace.qq.com/kv", c14524c.f61059a).mo85407d() == 200;
            } catch (Exception e) {
                SLog.m85493i(str, "Exception", e);
            }
        } while (i < 2);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static String m85435b() {
        return m85431a().f61046b;
    }
}
