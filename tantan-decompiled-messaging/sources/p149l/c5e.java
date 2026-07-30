package p149l;

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
public class c5e implements ypl {

    /* JADX INFO: renamed from: b */
    private mpl f79364b;

    /* JADX INFO: renamed from: a */
    private final Map<String, Integer> f79363a = new ConcurrentHashMap(6);

    /* JADX INFO: renamed from: c */
    private h0c f79365c = null;

    /* JADX INFO: renamed from: d */
    private final Object f79366d = new Object();

    /* JADX INFO: renamed from: e */
    private final Map<String, Boolean> f79367e = new HashMap();

    /* JADX INFO: renamed from: l.c5e$a */
    public class RunnableC16074a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f79368a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f79369b;

        public RunnableC16074a(String str, String str2) {
            this.f79368a = str;
            this.f79369b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c5e.this.m105298m(this.f79368a, this.f79369b);
            } catch (Exception e) {
                e5e.m114786c("CosmosSdkDns", e);
            }
            synchronized (c5e.this.f79367e) {
                c5e.this.f79367e.remove(this.f79368a);
                e5e.m114784a("CosmosSdkDns", "checking map:" + c5e.this.f79367e);
            }
        }
    }

    /* JADX INFO: renamed from: l.c5e$b */
    public class C16075b implements Comparator<String> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f79371a;

        public C16075b(String str) {
            this.f79371a = str;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int iM105297l = c5e.this.m105297l(this.f79371a, str);
            int iM105297l2 = c5e.this.m105297l(this.f79371a, str2);
            if (iM105297l > iM105297l2) {
                return 1;
            }
            return iM105297l < iM105297l2 ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m105296k(rel relVar, String str) {
        String str2 = relVar == null ? "" : relVar.f159065c;
        if (relVar == null || Math.abs((System.currentTimeMillis() / 1000) - relVar.f159067e) > relVar.f159066d) {
            synchronized (this.f79367e) {
                try {
                    Boolean bool = this.f79367e.get(str);
                    if (bool != null && bool.booleanValue()) {
                        e5e.m114785b("CosmosSdkDns", "checking：%s", str);
                    } else {
                        this.f79367e.put(str, Boolean.TRUE);
                        ipi0.m137483a(new RunnableC16074a(str, str2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public int m105297l(String str, String str2) {
        Integer num = this.f79363a.get(str + str2);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public rel m105298m(String str, String str2) throws Exception {
        String strM128949a = this.f79365c.m128949a(this.f79364b.getAppId(), str, str2);
        if ("304".equals(strM128949a)) {
            wel.m202908d(str);
            return null;
        }
        JSONObject jSONObject = new JSONObject(strM128949a).getJSONObject("data").getJSONArray("dns").getJSONObject(0);
        rel relVar = new rel();
        relVar.f159063a = jSONObject.getString("domain");
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
        relVar.f159064b = arrayList;
        relVar.f159066d = jSONObject.optInt("ttl", 120);
        relVar.f159065c = jSONObject.optString("etag");
        relVar.f159067e = System.currentTimeMillis() / 1000;
        if (relVar.m179051a()) {
            wel.m202907c(relVar);
        }
        return relVar;
    }

    /* JADX INFO: renamed from: n */
    private List<String> m105299n(String str, rel relVar) {
        List<String> list;
        if (relVar == null || (list = relVar.f159064b) == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(relVar.f159064b);
        Collections.sort(arrayList, new C16075b(str));
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    private void m105300p(mpl mplVar) {
        try {
            String preHost = mplVar.getPreHost();
            if (TextUtils.isEmpty(preHost)) {
                return;
            }
            for (String str : preHost.split(Constants.SEPARATOR_COMMA)) {
                m105296k(wel.m202905a(str), str);
            }
        } catch (Exception e) {
            e5e.m114786c("CosmosSdkDns", e);
        }
    }

    @Override // p149l.ypl
    /* JADX INFO: renamed from: a */
    public synchronized void mo105301a() {
        try {
            this.f79363a.clear();
        } catch (Exception e) {
            e5e.m114786c("CosmosSdkDns", e);
        }
    }

    @Override // p149l.ypl
    /* JADX INFO: renamed from: b */
    public List<String> mo105302b(String str) {
        rel relVarM202905a = wel.m202905a(str);
        synchronized (this.f79366d) {
            try {
                try {
                    m105296k(relVarM202905a, str);
                    List<String> listM105299n = m105299n(str, relVarM202905a);
                    if (listM105299n != null && listM105299n.size() > 0) {
                        return listM105299n;
                    }
                } catch (Exception e) {
                    e5e.m114786c("CosmosSdkDns", e);
                }
                return Collections.singletonList(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ypl
    /* JADX INFO: renamed from: c */
    public String mo105303c() {
        return this.f79364b.getKeyStoreSha1();
    }

    @Override // p149l.ypl
    /* JADX INFO: renamed from: d */
    public synchronized void mo105304d(String str, String str2) {
        try {
            this.f79363a.remove(str + str2);
        } catch (Exception e) {
            e5e.m114786c("CosmosSdkDns", e);
        }
    }

    @Override // p149l.ypl
    /* JADX INFO: renamed from: e */
    public List<String> mo105305e(String str) {
        rel relVarM202905a = wel.m202905a(str);
        if (relVarM202905a == null) {
            try {
                relVarM202905a = m105298m(str, "");
            } catch (Exception e) {
                e5e.m114786c("CosmosSdkDns", e);
            }
        } else {
            m105296k(relVarM202905a, str);
        }
        List<String> listM105299n = m105299n(str, relVarM202905a);
        return (listM105299n == null || listM105299n.size() <= 0) ? Collections.singletonList(str) : listM105299n;
    }

    @Override // p149l.ypl
    /* JADX INFO: renamed from: f */
    public synchronized void mo105306f(String str, String str2) {
        try {
            this.f79363a.put(str + str2, Integer.valueOf(m105297l(str, str2) + 1));
        } catch (Exception e) {
            e5e.m114786c("CosmosSdkDns", e);
        }
    }

    @Override // p149l.ypl
    /* JADX INFO: renamed from: g */
    public String mo105307g(String str) {
        List<String> listMo105302b = mo105302b(str);
        return (listMo105302b == null || listMo105302b.size() <= 0) ? str : listMo105302b.get(0);
    }

    @Override // p149l.ypl
    public String getUserAgent() {
        return this.f79364b.getUserAgent();
    }

    /* JADX INFO: renamed from: o */
    public void m105308o(mpl mplVar) {
        this.f79364b = mplVar;
        this.f79365c = new h0c(mplVar.getAppId());
        m105300p(mplVar);
    }
}
