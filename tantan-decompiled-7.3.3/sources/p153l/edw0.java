package p153l;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class edw0 {

    /* JADX INFO: renamed from: a */
    public final Clock f93583a;

    /* JADX INFO: renamed from: b */
    public final Map f93584b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map f93585c = new HashMap();

    public edw0(Clock clock) {
        this.f93583a = clock;
    }

    /* JADX INFO: renamed from: a */
    public final List m120521a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f93584b.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    i++;
                    arrayList.add(new ddw0(((String) entry.getKey()) + "." + i, (String) it.next()));
                }
            } else {
                arrayList.add(new ddw0((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final void m120522b(String str) {
        if (!this.f93585c.containsKey(str)) {
            this.f93585c.put(str, Long.valueOf(this.f93583a.elapsedRealtime()));
            return;
        }
        long jElapsedRealtime = this.f93583a.elapsedRealtime() - ((Long) this.f93585c.remove(str)).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(jElapsedRealtime);
        m120524d(str, sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public final void m120523c(String str, String str2) {
        if (!this.f93585c.containsKey(str)) {
            this.f93585c.put(str, Long.valueOf(this.f93583a.elapsedRealtime()));
            return;
        }
        m120524d(str, str2 + (this.f93583a.elapsedRealtime() - ((Long) this.f93585c.remove(str)).longValue()));
    }

    /* JADX INFO: renamed from: d */
    public final void m120524d(String str, String str2) {
        if (!this.f93584b.containsKey(str)) {
            this.f93584b.put(str, new ArrayList());
        }
        ((List) this.f93584b.get(str)).add(str2);
    }
}
