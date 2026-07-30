package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class h220 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f107519a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m133360a(String str) {
        return this.f107519a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public void m133361b(String str) {
        boolean zContainsKey = this.f107519a.containsKey(str);
        HashMap<String, Integer> map = this.f107519a;
        if (!zContainsKey) {
            map.put(str, 1);
        } else {
            this.f107519a.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        }
    }
}
