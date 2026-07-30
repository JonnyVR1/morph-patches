package p003l;

import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dxe {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, bxe> f3167a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m3767a(String str, bxe bxeVar) {
        f3167a.put(str, bxeVar);
    }

    /* JADX INFO: renamed from: b */
    public static bxe m3768b(String str) {
        return f3167a.get(str);
    }
}
