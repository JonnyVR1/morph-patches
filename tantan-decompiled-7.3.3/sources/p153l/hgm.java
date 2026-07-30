package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class hgm {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f109418a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m134950a(String str) {
        return this.f109418a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public void m134951b(String str) {
        boolean zContainsKey = this.f109418a.containsKey(str);
        HashMap<String, Integer> map = this.f109418a;
        if (!zContainsKey) {
            map.put(str, 1);
        } else {
            this.f109418a.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        }
    }
}
