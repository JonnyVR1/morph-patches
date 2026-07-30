package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class hye {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, fye> f112108a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m137717a(String str, fye fyeVar) {
        f112108a.put(str, fyeVar);
    }

    /* JADX INFO: renamed from: b */
    public static fye m137718b(String str) {
        return f112108a.get(str);
    }
}
