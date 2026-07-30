package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jht0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f121009a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public long f121010b;

    /* JADX INFO: renamed from: a */
    public final long m144933a() {
        Iterator it = this.f121009a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((wqx0) it.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.f121010b = Math.max(this.f121010b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f121010b;
    }

    /* JADX INFO: renamed from: b */
    public final void m144934b(wqx0 wqx0Var) {
        this.f121009a.add(wqx0Var);
    }
}
