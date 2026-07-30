package p003l;

import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rdm {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f7170a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m9131a(String str) {
        return this.f7170a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public void m9132b(String str) {
        boolean zContainsKey = this.f7170a.containsKey(str);
        HashMap<String, Integer> map = this.f7170a;
        if (!zContainsKey) {
            map.put(str, 1);
        } else {
            this.f7170a.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        }
    }
}
