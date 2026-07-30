package p003l;

import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class qsz {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f6695a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m7030a(String str) {
        return this.f6695a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public void m7031b(String str) {
        boolean zContainsKey = this.f6695a.containsKey(str);
        HashMap<String, Integer> map = this.f6695a;
        if (!zContainsKey) {
            map.put(str, 1);
        } else {
            this.f6695a.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        }
    }
}
