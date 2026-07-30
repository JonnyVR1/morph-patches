package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class k3e implements l2e.InterfaceC18139a {

    /* JADX INFO: renamed from: a */
    private final long f120817a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC17919a f120818b;

    /* JADX INFO: renamed from: l.k3e$a */
    public interface InterfaceC17919a {
        File getCacheDirectory();
    }

    public k3e(InterfaceC17919a interfaceC17919a, long j) {
        this.f120817a = j;
        this.f120818b = interfaceC17919a;
    }

    @Override // p149l.l2e.InterfaceC18139a
    public l2e build() {
        File cacheDirectory = this.f120818b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.mkdirs() || (cacheDirectory.exists() && cacheDirectory.isDirectory())) {
            return l3e.m148389c(cacheDirectory, this.f120817a);
        }
        return null;
    }
}
