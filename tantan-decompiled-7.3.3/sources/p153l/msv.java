package p153l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class msv {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, String> f138526a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final List<String> f138527b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public String m159937a(String str) {
        return this.f138526a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public boolean m159938b(String str) {
        return this.f138527b.contains(str);
    }

    /* JADX INFO: renamed from: c */
    public void m159939c(String str, String str2) {
        if (this.f138527b.contains(str)) {
            return;
        }
        this.f138527b.add(str);
        this.f138526a.put(str, str2);
    }
}
