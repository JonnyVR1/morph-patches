package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class n100 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f139702a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m161054a(String str) {
        return this.f139702a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public void m161055b(String str) {
        boolean zContainsKey = this.f139702a.containsKey(str);
        HashMap<String, Integer> map = this.f139702a;
        if (!zContainsKey) {
            map.put(str, 1);
        } else {
            this.f139702a.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        }
    }
}
