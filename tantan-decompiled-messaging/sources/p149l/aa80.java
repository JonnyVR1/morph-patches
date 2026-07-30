package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class aa80 {

    /* JADX INFO: renamed from: b */
    public static volatile aa80 f68280b;

    /* JADX INFO: renamed from: a */
    public List<InterfaceC15555a> f68281a = new ArrayList();

    /* JADX INFO: renamed from: l.aa80$a */
    public interface InterfaceC15555a {
        /* JADX INFO: renamed from: o */
        void mo95536o(k90 k90Var);
    }

    /* JADX INFO: renamed from: b */
    public static aa80 m95532b() {
        if (f68280b == null) {
            synchronized (aa80.class) {
                try {
                    if (f68280b == null) {
                        f68280b = new aa80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f68280b;
    }

    /* JADX INFO: renamed from: a */
    public void m95533a(InterfaceC15555a interfaceC15555a) {
        if (interfaceC15555a == null) {
            return;
        }
        this.f68281a.add(interfaceC15555a);
    }

    /* JADX INFO: renamed from: c */
    public void m95534c(k90 k90Var) {
        Iterator<InterfaceC15555a> it = this.f68281a.iterator();
        while (it.hasNext()) {
            it.next().mo95536o(k90Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m95535d(InterfaceC15555a interfaceC15555a) {
        if (interfaceC15555a == null) {
            return;
        }
        this.f68281a.remove(interfaceC15555a);
    }
}
