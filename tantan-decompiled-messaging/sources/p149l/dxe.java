package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class dxe {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, bxe> f88279a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m114003a(String str, bxe bxeVar) {
        f88279a.put(str, bxeVar);
    }

    /* JADX INFO: renamed from: b */
    public static bxe m114004b(String str) {
        return f88279a.get(str);
    }
}
