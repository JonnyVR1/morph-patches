package p153l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class kdu0 {

    /* JADX INFO: renamed from: a */
    public final Map f125280a = new HashMap();

    public kdu0(Set set) {
        m149284s0(set);
    }

    /* JADX INFO: renamed from: o0 */
    public final synchronized void m149282o0(yfu0 yfu0Var) {
        m149283q0(yfu0Var.f199651a, yfu0Var.f199652b);
    }

    /* JADX INFO: renamed from: q0 */
    public final synchronized void m149283q0(Object obj, Executor executor) {
        this.f125280a.put(obj, executor);
    }

    /* JADX INFO: renamed from: s0 */
    public final synchronized void m149284s0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m149282o0((yfu0) it.next());
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final synchronized void m149285v0(final jdu0 jdu0Var) {
        for (Map.Entry entry : this.f125280a.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: l.idu0
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        jdu0Var.zza(key);
                    } catch (Throwable th) {
                        bxy0.m106933q().m120274v(th, "EventEmitter.notify");
                        d2v0.m113738l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
