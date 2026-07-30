package p007l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class lqv {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, String> f10105a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final List<String> f10106b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public String m11696a(String str) {
        return this.f10105a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public boolean m11697b(String str) {
        return this.f10106b.contains(str);
    }

    /* JADX INFO: renamed from: c */
    public void m11698c(String str, String str2) {
        if (this.f10106b.contains(str)) {
            return;
        }
        this.f10106b.add(str);
        this.f10105a.put(str, str2);
    }
}
