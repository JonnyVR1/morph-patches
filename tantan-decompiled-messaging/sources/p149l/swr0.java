package p149l;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class swr0 {

    /* JADX INFO: renamed from: a */
    public final Map f166719a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final AtomicReference m186355a(String str) {
        synchronized (this) {
            try {
                if (!this.f166719a.containsKey(str)) {
                    this.f166719a.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.f166719a.get(str);
    }
}
