package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class qsz {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f156289a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m176377a(String str) {
        return this.f156289a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public void m176378b(String str) {
        boolean zContainsKey = this.f156289a.containsKey(str);
        HashMap<String, Integer> map = this.f156289a;
        if (!zContainsKey) {
            map.put(str, 1);
        } else {
            this.f156289a.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        }
    }
}
