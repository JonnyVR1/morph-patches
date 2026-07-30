package p153l;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class y5s0 {

    /* JADX INFO: renamed from: a */
    public final Map f197584a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final AtomicReference m214317a(String str) {
        synchronized (this) {
            try {
                if (!this.f197584a.containsKey(str)) {
                    this.f197584a.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.f197584a.get(str);
    }
}
