package p149l;

import com.facebook.cache.disk.C1587c;
import com.facebook.cache.disk.InterfaceC1586b;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class n3e implements nfi {

    /* JADX INFO: renamed from: a */
    public o3e f136989a;

    public n3e(o3e o3eVar) {
        this.f136989a = o3eVar;
    }

    /* JADX INFO: renamed from: b */
    public static C1587c m157754b(n2e n2eVar, InterfaceC1586b interfaceC1586b) {
        return m157755c(n2eVar, interfaceC1586b, Executors.newSingleThreadExecutor());
    }

    /* JADX INFO: renamed from: c */
    public static C1587c m157755c(n2e n2eVar, InterfaceC1586b interfaceC1586b, Executor executor) {
        return new C1587c(interfaceC1586b, n2eVar.m157573h(), new C1587c.c(n2eVar.m157576k(), n2eVar.m157575j(), n2eVar.m157571f()), n2eVar.m157570e(), n2eVar.m157569d(), n2eVar.m157572g(), executor, n2eVar.m157574i());
    }

    @Override // p149l.nfi
    /* JADX INFO: renamed from: a */
    public mfi mo157756a(n2e n2eVar) {
        return m157754b(n2eVar, this.f136989a.mo162417a(n2eVar));
    }
}
