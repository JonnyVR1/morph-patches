package p149l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class n80 {

    /* JADX INFO: renamed from: a */
    public boolean f137569a = false;

    /* JADX INFO: renamed from: a */
    public Map<String, String> m158173a() {
        HashMap map = new HashMap();
        map.put("is_return_search", m158174b(this.f137569a));
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final String m158174b(boolean z) {
        return z ? "1" : "0";
    }

    /* JADX INFO: renamed from: c */
    public boolean m158175c() {
        return this.f137569a;
    }

    /* JADX INFO: renamed from: d */
    public void m158176d(boolean z) {
        this.f137569a = z;
    }
}
