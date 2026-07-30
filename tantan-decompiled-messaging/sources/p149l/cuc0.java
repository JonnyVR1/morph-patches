package p149l;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class cuc0 implements e2m {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f82553a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public void m108745a(String str, String str2) {
        this.f82553a.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public void m108746b() {
        this.f82553a.clear();
    }

    /* JADX INFO: renamed from: c */
    public mt0[] m108747c() {
        Set<Map.Entry<String, String>> setEntrySet = this.f82553a.entrySet();
        mt0[] mt0VarArr = new mt0[setEntrySet.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : setEntrySet) {
            mt0VarArr[i] = new mt0(entry.getKey(), entry.getValue());
            i++;
        }
        return mt0VarArr;
    }

    @Override // p149l.e2m
    public Map<String, String> getHeader() {
        return this.f82553a;
    }
}
