package p003l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wfe {

    /* JADX INFO: renamed from: a */
    public static Map<String, AbstractC3363l4> f8178a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static AbstractC3363l4 m10495a(String str) {
        if (str == null) {
            return new bl40();
        }
        return !str.equals("video") ? new bl40() : new z5l0();
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC3363l4 m10496b(String str) {
        if (f8178a.containsKey(str)) {
            return f8178a.get(str);
        }
        AbstractC3363l4 abstractC3363l4M10495a = m10495a(str);
        f8178a.put(str, abstractC3363l4M10495a);
        return abstractC3363l4M10495a;
    }
}
