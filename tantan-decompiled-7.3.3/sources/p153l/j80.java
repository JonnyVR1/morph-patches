package p153l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class j80 {

    /* JADX INFO: renamed from: a */
    public boolean f118743a = false;

    /* JADX INFO: renamed from: a */
    public Map<String, String> m143819a() {
        HashMap map = new HashMap();
        map.put("is_return_search", m143820b(this.f118743a));
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final String m143820b(boolean z) {
        return z ? "1" : "0";
    }

    /* JADX INFO: renamed from: c */
    public boolean m143821c() {
        return this.f118743a;
    }

    /* JADX INFO: renamed from: d */
    public void m143822d(boolean z) {
        this.f118743a = z;
    }
}
