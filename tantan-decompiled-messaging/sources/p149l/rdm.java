package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class rdm {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f158950a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m178976a(String str) {
        return this.f158950a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public void m178977b(String str) {
        boolean zContainsKey = this.f158950a.containsKey(str);
        HashMap<String, Integer> map = this.f158950a;
        if (!zContainsKey) {
            map.put(str, 1);
        } else {
            this.f158950a.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        }
    }
}
