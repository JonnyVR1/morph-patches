package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class zt10 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f204665a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m220087a(String str) {
        return this.f204665a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public void m220088b(String str) {
        boolean zContainsKey = this.f204665a.containsKey(str);
        HashMap<String, Integer> map = this.f204665a;
        if (!zContainsKey) {
            map.put(str, 1);
        } else {
            this.f204665a.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        }
    }
}
