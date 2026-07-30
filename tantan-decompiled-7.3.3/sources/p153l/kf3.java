package p153l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class kf3 {

    /* JADX INFO: renamed from: a */
    private String f126236a;

    /* JADX INFO: renamed from: b */
    private String f126237b;

    /* JADX INFO: renamed from: c */
    private String f126238c;

    /* JADX INFO: renamed from: d */
    private String f126239d;

    /* JADX INFO: renamed from: e */
    private String f126240e;

    /* JADX INFO: renamed from: f */
    private String f126241f;

    /* JADX INFO: renamed from: g */
    private String f126242g;

    /* JADX INFO: renamed from: h */
    private String f126243h;

    /* JADX INFO: renamed from: i */
    private TreeSet<String> f126244i;

    /* JADX INFO: renamed from: j */
    private long f126245j = System.currentTimeMillis();

    public kf3(String str, String str2, JSONObject jSONObject) {
        this.f126238c = str;
        this.f126239d = str2;
        if (jSONObject != null) {
            this.f126240e = jSONObject.toString();
            this.f126242g = jSONObject.optString("callback");
            this.f126244i = new TreeSet<>();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                this.f126244i.add(itKeys.next());
            }
            if (this.f126244i.isEmpty()) {
                return;
            }
            this.f126241f = m149352h();
        }
    }

    /* JADX INFO: renamed from: h */
    private String m149352h() {
        TreeSet<String> treeSet;
        if (TextUtils.isEmpty(this.f126238c) || TextUtils.isEmpty(this.f126239d) || TextUtils.isEmpty(this.f126240e) || (treeSet = this.f126244i) == null || treeSet.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f126238c);
        sb.append(this.f126239d);
        Iterator<String> itDescendingIterator = this.f126244i.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            sb.append(itDescendingIterator.next());
        }
        return oiw.m167801d(sb.toString().getBytes());
    }

    /* JADX INFO: renamed from: a */
    public String m149353a() {
        return this.f126237b;
    }

    /* JADX INFO: renamed from: b */
    public String m149354b() {
        return this.f126242g;
    }

    /* JADX INFO: renamed from: c */
    public String m149355c() {
        return this.f126239d;
    }

    /* JADX INFO: renamed from: d */
    public String m149356d() {
        return this.f126238c;
    }

    /* JADX INFO: renamed from: e */
    public String m149357e() {
        return this.f126240e;
    }

    /* JADX INFO: renamed from: f */
    public String m149358f() {
        return this.f126243h;
    }

    /* JADX INFO: renamed from: g */
    public String m149359g() {
        return this.f126236a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m149360i() {
        return this.f126241f != null;
    }

    /* JADX INFO: renamed from: j */
    public void m149361j(String str) {
        this.f126237b = str;
    }

    /* JADX INFO: renamed from: k */
    public void m149362k(String str) {
        this.f126243h = str;
    }

    /* JADX INFO: renamed from: l */
    public void m149363l(String str) {
        this.f126236a = str;
    }

    public String toString() {
        return "BridgeCallModel{url='" + this.f126236a + "', bid='" + this.f126237b + "', namespace='" + this.f126238c + "', method='" + this.f126239d + "', params='" + this.f126240e + "', keyInDb='" + this.f126241f + "', callback='" + this.f126242g + "', result='" + this.f126243h + "', paramsKeySet=" + this.f126244i + '}';
    }
}
