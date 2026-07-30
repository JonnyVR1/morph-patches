package p149l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class e4u0 {

    /* JADX INFO: renamed from: a */
    public final Map f89322a = new HashMap();

    public e4u0(Set set) {
        m114711s0(set);
    }

    /* JADX INFO: renamed from: o0 */
    public final synchronized void m114709o0(s6u0 s6u0Var) {
        m114710q0(s6u0Var.f162854a, s6u0Var.f162855b);
    }

    /* JADX INFO: renamed from: q0 */
    public final synchronized void m114710q0(Object obj, Executor executor) {
        this.f89322a.put(obj, executor);
    }

    /* JADX INFO: renamed from: s0 */
    public final synchronized void m114711s0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m114709o0((s6u0) it.next());
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final synchronized void m114712v0(final d4u0 d4u0Var) {
        for (Map.Entry entry : this.f89322a.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: l.c4u0
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        d4u0Var.zza(key);
                    } catch (Throwable th) {
                        vny0.m199079q().m212289v(th, "EventEmitter.notify");
                        xsu0.m210835l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
