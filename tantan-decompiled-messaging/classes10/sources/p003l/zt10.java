package p003l;

import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zt10 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f9323a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m11452a(String str) {
        return this.f9323a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public void m11453b(String str) {
        boolean zContainsKey = this.f9323a.containsKey(str);
        HashMap<String, Integer> map = this.f9323a;
        if (!zContainsKey) {
            map.put(str, 1);
        } else {
            this.f9323a.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        }
    }
}
