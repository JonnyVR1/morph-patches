package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d8t0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f84895a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public long f84896b;

    /* JADX INFO: renamed from: a */
    public final long m110392a() {
        Iterator it = this.f84895a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((qhx0) it.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.f84896b = Math.max(this.f84896b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f84896b;
    }

    /* JADX INFO: renamed from: b */
    public final void m110393b(qhx0 qhx0Var) {
        this.f84895a.add(qhx0Var);
    }
}
