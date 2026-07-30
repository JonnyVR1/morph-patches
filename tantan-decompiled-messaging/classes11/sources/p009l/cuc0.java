package p009l;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import l.e2m;
import l.mt0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cuc0 implements e2m {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f10772a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public void m12845a(String str, String str2) {
        this.f10772a.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public void m12846b() {
        this.f10772a.clear();
    }

    /* JADX INFO: renamed from: c */
    public mt0[] m12847c() {
        Set<Map.Entry<String, String>> setEntrySet = this.f10772a.entrySet();
        mt0[] mt0VarArr = new mt0[setEntrySet.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : setEntrySet) {
            mt0VarArr[i] = new mt0(entry.getKey(), entry.getValue());
            i++;
        }
        return mt0VarArr;
    }

    public Map<String, String> getHeader() {
        return this.f10772a;
    }
}
