package p153l;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class f2d0 implements x4m {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f96868a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public void m123607a(String str, String str2) {
        this.f96868a.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public void m123608b() {
        this.f96868a.clear();
    }

    /* JADX INFO: renamed from: c */
    public st0[] m123609c() {
        Set<Map.Entry<String, String>> setEntrySet = this.f96868a.entrySet();
        st0[] st0VarArr = new st0[setEntrySet.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : setEntrySet) {
            st0VarArr[i] = new st0(entry.getKey(), entry.getValue());
            i++;
        }
        return st0VarArr;
    }

    @Override // p153l.x4m
    public Map<String, String> getHeader() {
        return this.f96868a;
    }
}
