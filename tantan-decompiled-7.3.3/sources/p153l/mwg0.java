package p153l;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class mwg0 implements cug0 {

    /* JADX INFO: renamed from: a */
    public final TreeMap f139094a = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* JADX INFO: renamed from: a */
    public final String m160551a(String str) {
        String str2 = (String) this.f139094a.get(str);
        return str2 == null ? "" : str2;
    }
}
