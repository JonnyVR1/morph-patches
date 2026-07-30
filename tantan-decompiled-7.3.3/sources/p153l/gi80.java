package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class gi80 {

    /* JADX INFO: renamed from: b */
    public static volatile gi80 f104207b;

    /* JADX INFO: renamed from: a */
    public List<InterfaceC17215a> f104208a = new ArrayList();

    /* JADX INFO: renamed from: l.gi80$a */
    public interface InterfaceC17215a {
        /* JADX INFO: renamed from: o */
        void mo126629o(g90 g90Var);
    }

    /* JADX INFO: renamed from: b */
    public static gi80 m130297b() {
        if (f104207b == null) {
            synchronized (gi80.class) {
                try {
                    if (f104207b == null) {
                        f104207b = new gi80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f104207b;
    }

    /* JADX INFO: renamed from: a */
    public void m130298a(InterfaceC17215a interfaceC17215a) {
        if (interfaceC17215a == null) {
            return;
        }
        this.f104208a.add(interfaceC17215a);
    }

    /* JADX INFO: renamed from: c */
    public void m130299c(g90 g90Var) {
        Iterator<InterfaceC17215a> it = this.f104208a.iterator();
        while (it.hasNext()) {
            it.next().mo126629o(g90Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m130300d(InterfaceC17215a interfaceC17215a) {
        if (interfaceC17215a == null) {
            return;
        }
        this.f104208a.remove(interfaceC17215a);
    }
}
