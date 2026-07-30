package p149l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class lqv {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, String> f129437a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final List<String> f129438b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public String m151093a(String str) {
        return this.f129437a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public boolean m151094b(String str) {
        return this.f129438b.contains(str);
    }

    /* JADX INFO: renamed from: c */
    public void m151095c(String str, String str2) {
        if (this.f129438b.contains(str)) {
            return;
        }
        this.f129438b.add(str);
        this.f129437a.put(str, str2);
    }
}
