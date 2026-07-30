package p149l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ve3 {

    /* JADX INFO: renamed from: a */
    private String f181146a;

    /* JADX INFO: renamed from: b */
    private String f181147b;

    /* JADX INFO: renamed from: c */
    private String f181148c;

    /* JADX INFO: renamed from: d */
    private String f181149d;

    /* JADX INFO: renamed from: e */
    private String f181150e;

    /* JADX INFO: renamed from: f */
    private String f181151f;

    /* JADX INFO: renamed from: g */
    private String f181152g;

    /* JADX INFO: renamed from: h */
    private String f181153h;

    /* JADX INFO: renamed from: i */
    private TreeSet<String> f181154i;

    /* JADX INFO: renamed from: j */
    private long f181155j = System.currentTimeMillis();

    public ve3(String str, String str2, JSONObject jSONObject) {
        this.f181148c = str;
        this.f181149d = str2;
        if (jSONObject != null) {
            this.f181150e = jSONObject.toString();
            this.f181152g = jSONObject.optString("callback");
            this.f181154i = new TreeSet<>();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                this.f181154i.add(itKeys.next());
            }
            if (this.f181154i.isEmpty()) {
                return;
            }
            this.f181151f = m198144d();
        }
    }

    /* JADX INFO: renamed from: d */
    private String m198144d() {
        TreeSet<String> treeSet;
        if (TextUtils.isEmpty(this.f181148c) || TextUtils.isEmpty(this.f181149d) || TextUtils.isEmpty(this.f181150e) || (treeSet = this.f181154i) == null || treeSet.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f181148c);
        sb.append(this.f181149d);
        Iterator<String> itDescendingIterator = this.f181154i.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            sb.append(itDescendingIterator.next());
        }
        return pgw.m168920d(sb.toString().getBytes());
    }

    /* JADX INFO: renamed from: a */
    public String m198145a() {
        return this.f181152g;
    }

    /* JADX INFO: renamed from: b */
    public String m198146b() {
        String str = this.f181150e;
        return (str == null || str.length() > 300) ? this.f181154i.toString() : this.f181150e;
    }

    /* JADX INFO: renamed from: c */
    public String m198147c() {
        String str = this.f181153h;
        return (str == null || str.length() > 500) ? "" : this.f181153h;
    }

    /* JADX INFO: renamed from: e */
    public boolean m198148e() {
        return this.f181151f != null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m198149f() {
        return System.currentTimeMillis() - this.f181155j >= 3000;
    }

    /* JADX INFO: renamed from: g */
    public void m198150g(String str) {
        this.f181147b = str;
    }

    /* JADX INFO: renamed from: h */
    public void m198151h(String str) {
        this.f181153h = str;
    }

    /* JADX INFO: renamed from: i */
    public void m198152i(String str) {
        this.f181146a = str;
    }

    /* JADX INFO: renamed from: j */
    public ghw m198153j() {
        ghw ghwVar = new ghw();
        ghwVar.m126239p(this.f181146a);
        ghwVar.m126232i(this.f181147b);
        ghwVar.m126236m(this.f181148c);
        ghwVar.m126235l(this.f181149d);
        ghwVar.m126234k(this.f181151f);
        ghwVar.m126237n(m198146b());
        ghwVar.m126238o(m198147c());
        return ghwVar;
    }

    public String toString() {
        return "BridgeCallModel{url='" + this.f181146a + "', bid='" + this.f181147b + "', namespace='" + this.f181148c + "', method='" + this.f181149d + "', params='" + this.f181150e + "', keyInDb='" + this.f181151f + "', callback='" + this.f181152g + "', result='" + this.f181153h + "', paramsKeySet=" + this.f181154i + '}';
    }
}
