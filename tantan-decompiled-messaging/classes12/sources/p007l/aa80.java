package p007l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class aa80 {

    /* JADX INFO: renamed from: b */
    public static volatile aa80 f5678b;

    /* JADX INFO: renamed from: a */
    public List<InterfaceC2319a> f5679a = new ArrayList();

    /* JADX INFO: renamed from: l.aa80$a */
    public interface InterfaceC2319a {
        /* JADX INFO: renamed from: o */
        void mo8472o(k90 k90Var);
    }

    /* JADX INFO: renamed from: b */
    public static aa80 m8468b() {
        if (f5678b == null) {
            synchronized (aa80.class) {
                try {
                    if (f5678b == null) {
                        f5678b = new aa80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5678b;
    }

    /* JADX INFO: renamed from: a */
    public void m8469a(InterfaceC2319a interfaceC2319a) {
        if (interfaceC2319a == null) {
            return;
        }
        this.f5679a.add(interfaceC2319a);
    }

    /* JADX INFO: renamed from: c */
    public void m8470c(k90 k90Var) {
        Iterator<InterfaceC2319a> it = this.f5679a.iterator();
        while (it.hasNext()) {
            it.next().mo8472o(k90Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m8471d(InterfaceC2319a interfaceC2319a) {
        if (interfaceC2319a == null) {
            return;
        }
        this.f5679a.remove(interfaceC2319a);
    }
}
