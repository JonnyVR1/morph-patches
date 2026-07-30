package p149l;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class y3w0 {

    /* JADX INFO: renamed from: a */
    public final Clock f195857a;

    /* JADX INFO: renamed from: b */
    public final Map f195858b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map f195859c = new HashMap();

    public y3w0(Clock clock) {
        this.f195857a = clock;
    }

    /* JADX INFO: renamed from: a */
    public final List m212857a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f195858b.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    i++;
                    arrayList.add(new x3w0(((String) entry.getKey()) + "." + i, (String) it.next()));
                }
            } else {
                arrayList.add(new x3w0((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final void m212858b(String str) {
        if (!this.f195859c.containsKey(str)) {
            this.f195859c.put(str, Long.valueOf(this.f195857a.elapsedRealtime()));
            return;
        }
        long jElapsedRealtime = this.f195857a.elapsedRealtime() - ((Long) this.f195859c.remove(str)).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(jElapsedRealtime);
        m212860d(str, sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public final void m212859c(String str, String str2) {
        if (!this.f195859c.containsKey(str)) {
            this.f195859c.put(str, Long.valueOf(this.f195857a.elapsedRealtime()));
            return;
        }
        m212860d(str, str2 + (this.f195857a.elapsedRealtime() - ((Long) this.f195859c.remove(str)).longValue()));
    }

    /* JADX INFO: renamed from: d */
    public final void m212860d(String str, String str2) {
        if (!this.f195858b.containsKey(str)) {
            this.f195858b.put(str, new ArrayList());
        }
        ((List) this.f195858b.get(str)).add(str2);
    }
}
