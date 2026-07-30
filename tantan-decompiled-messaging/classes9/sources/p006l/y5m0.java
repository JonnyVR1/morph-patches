package p006l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p1.mobile.putong.data.Visitor;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class y5m0 {

    /* JADX INFO: renamed from: a */
    public int f28033a;

    /* JADX INFO: renamed from: b */
    public Visitor f28034b;

    /* JADX INFO: renamed from: c */
    public String f28035c;

    /* JADX INFO: renamed from: d */
    public UnPrivilegedVisitor f28036d;

    /* JADX INFO: renamed from: e */
    public boolean f28037e;

    /* JADX INFO: renamed from: f */
    public String f28038f;

    /* JADX INFO: renamed from: g */
    public boolean f28039g;

    public y5m0(String str, boolean z) {
        this.f28033a = -1;
        this.f28037e = false;
        this.f28038f = str;
        this.f28039g = z;
    }

    /* JADX INFO: renamed from: a */
    public String m28086a() {
        int i = this.f28033a;
        if (i == -1) {
            return "new";
        }
        return i == -2 ? "recommend" : "all";
    }

    /* JADX INFO: renamed from: b */
    public boolean m28087b() {
        return this.f28036d != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m28088c() {
        return this.f28034b != null && TextUtils.isEmpty(this.f28035c);
    }

    public y5m0(UnPrivilegedVisitor unPrivilegedVisitor, boolean z) {
        this.f28033a = -1;
        this.f28036d = unPrivilegedVisitor;
        this.f28037e = z;
    }

    public y5m0(Visitor visitor, String str, int i) {
        this.f28037e = false;
        this.f28034b = visitor;
        this.f28035c = str;
        this.f28033a = i;
    }
}
