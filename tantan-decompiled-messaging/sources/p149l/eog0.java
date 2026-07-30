package p149l;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class eog0 implements ulg0 {

    /* JADX INFO: renamed from: a */
    public final TreeMap f92442a = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* JADX INFO: renamed from: a */
    public final String m117339a(String str) {
        String str2 = (String) this.f92442a.get(str);
        return str2 == null ? "" : str2;
    }
}
