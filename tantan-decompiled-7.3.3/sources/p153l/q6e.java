package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class q6e implements lsl {

    /* JADX INFO: renamed from: b */
    private zrl f155798b;

    /* JADX INFO: renamed from: a */
    private final Map<String, Integer> f155797a = new ConcurrentHashMap(6);

    /* JADX INFO: renamed from: c */
    private u1c f155799c = null;

    /* JADX INFO: renamed from: d */
    private final Object f155800d = new Object();

    /* JADX INFO: renamed from: e */
    private final Map<String, Boolean> f155801e = new HashMap();

    /* JADX INFO: renamed from: l.q6e$a */
    public class RunnableC19529a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f155802a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f155803b;

        public RunnableC19529a(String str, String str2) {
            this.f155802a = str;
            this.f155803b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q6e.this.m175553m(this.f155802a, this.f155803b);
            } catch (Exception e) {
                s6e.m184884c("CosmosSdkDns", e);
            }
            synchronized (q6e.this.f155801e) {
                q6e.this.f155801e.remove(this.f155802a);
                s6e.m184882a("CosmosSdkDns", "checking map:" + q6e.this.f155801e);
            }
        }
    }

    /* JADX INFO: renamed from: l.q6e$b */
    public class C19530b implements Comparator<String> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f155805a;

        public C19530b(String str) {
            this.f155805a = str;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int iM175552l = q6e.this.m175552l(this.f155805a, str);
            int iM175552l2 = q6e.this.m175552l(this.f155805a, str2);
            if (iM175552l > iM175552l2) {
                return 1;
            }
            return iM175552l < iM175552l2 ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m175551k(hhl hhlVar, String str) {
        String str2 = hhlVar == null ? "" : hhlVar.f109902c;
        if (hhlVar == null || Math.abs((System.currentTimeMillis() / 1000) - hhlVar.f109904e) > hhlVar.f109903d) {
            synchronized (this.f155801e) {
                try {
                    Boolean bool = this.f155801e.get(str);
                    if (bool != null && bool.booleanValue()) {
                        s6e.m184883b("CosmosSdkDns", "checking：%s", str);
                    } else {
                        this.f155801e.put(str, Boolean.TRUE);
                        kyi0.m151974a(new RunnableC19529a(str, str2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public int m175552l(String str, String str2) {
        Integer num = this.f155797a.get(str + str2);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public hhl m175553m(String str, String str2) throws Exception {
        String strM193952a = this.f155799c.m193952a(this.f155798b.getAppId(), str, str2);
        if ("304".equals(strM193952a)) {
            nhl.m163112d(str);
            return null;
        }
        JSONObject jSONObject = new JSONObject(strM193952a).getJSONObject("data").getJSONArray("dns").getJSONObject(0);
        hhl hhlVar = new hhl();
        hhlVar.f109900a = jSONObject.getString("domain");
        String string = jSONObject.getJSONObject("ips").getString("master");
        ArrayList arrayList = new ArrayList();
        if (!string.isEmpty()) {
            arrayList.add(string);
        }
        JSONArray jSONArray = jSONObject.getJSONObject("ips").getJSONArray("slaves");
        for (int i = 0; i < jSONArray.length(); i++) {
            if (!jSONArray.getString(i).isEmpty()) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        hhlVar.f109901b = arrayList;
        hhlVar.f109903d = jSONObject.optInt("ttl", 120);
        hhlVar.f109902c = jSONObject.optString("etag");
        hhlVar.f109904e = System.currentTimeMillis() / 1000;
        if (hhlVar.m135071a()) {
            nhl.m163111c(hhlVar);
        }
        return hhlVar;
    }

    /* JADX INFO: renamed from: n */
    private List<String> m175554n(String str, hhl hhlVar) {
        List<String> list;
        if (hhlVar == null || (list = hhlVar.f109901b) == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(hhlVar.f109901b);
        Collections.sort(arrayList, new C19530b(str));
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    private void m175555p(zrl zrlVar) {
        try {
            String preHost = zrlVar.getPreHost();
            if (TextUtils.isEmpty(preHost)) {
                return;
            }
            for (String str : preHost.split(Constants.SEPARATOR_COMMA)) {
                m175551k(nhl.m163109a(str), str);
            }
        } catch (Exception e) {
            s6e.m184884c("CosmosSdkDns", e);
        }
    }

    @Override // p153l.lsl
    /* JADX INFO: renamed from: a */
    public synchronized void mo155714a() {
        try {
            this.f155797a.clear();
        } catch (Exception e) {
            s6e.m184884c("CosmosSdkDns", e);
        }
    }

    @Override // p153l.lsl
    /* JADX INFO: renamed from: b */
    public List<String> mo155715b(String str) {
        hhl hhlVarM163109a = nhl.m163109a(str);
        synchronized (this.f155800d) {
            try {
                try {
                    m175551k(hhlVarM163109a, str);
                    List<String> listM175554n = m175554n(str, hhlVarM163109a);
                    if (listM175554n != null && listM175554n.size() > 0) {
                        return listM175554n;
                    }
                } catch (Exception e) {
                    s6e.m184884c("CosmosSdkDns", e);
                }
                return Collections.singletonList(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.lsl
    /* JADX INFO: renamed from: c */
    public String mo155716c() {
        return this.f155798b.getKeyStoreSha1();
    }

    @Override // p153l.lsl
    /* JADX INFO: renamed from: d */
    public synchronized void mo155717d(String str, String str2) {
        try {
            this.f155797a.remove(str + str2);
        } catch (Exception e) {
            s6e.m184884c("CosmosSdkDns", e);
        }
    }

    @Override // p153l.lsl
    /* JADX INFO: renamed from: e */
    public List<String> mo155718e(String str) {
        hhl hhlVarM163109a = nhl.m163109a(str);
        if (hhlVarM163109a == null) {
            try {
                hhlVarM163109a = m175553m(str, "");
            } catch (Exception e) {
                s6e.m184884c("CosmosSdkDns", e);
            }
        } else {
            m175551k(hhlVarM163109a, str);
        }
        List<String> listM175554n = m175554n(str, hhlVarM163109a);
        return (listM175554n == null || listM175554n.size() <= 0) ? Collections.singletonList(str) : listM175554n;
    }

    @Override // p153l.lsl
    /* JADX INFO: renamed from: f */
    public synchronized void mo155719f(String str, String str2) {
        try {
            this.f155797a.put(str + str2, Integer.valueOf(m175552l(str, str2) + 1));
        } catch (Exception e) {
            s6e.m184884c("CosmosSdkDns", e);
        }
    }

    @Override // p153l.lsl
    /* JADX INFO: renamed from: g */
    public String mo155720g(String str) {
        List<String> listMo155715b = mo155715b(str);
        return (listMo155715b == null || listMo155715b.size() <= 0) ? str : listMo155715b.get(0);
    }

    @Override // p153l.lsl
    public String getUserAgent() {
        return this.f155798b.getUserAgent();
    }

    /* JADX INFO: renamed from: o */
    public void m175556o(zrl zrlVar) {
        this.f155798b = zrlVar;
        this.f155799c = new u1c(zrlVar.getAppId());
        m175555p(zrlVar);
    }
}
