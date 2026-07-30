package p153l;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class y4e implements z3e.InterfaceC21755a {

    /* JADX INFO: renamed from: a */
    private final long f197449a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC21513a f197450b;

    /* JADX INFO: renamed from: l.y4e$a */
    public interface InterfaceC21513a {
        File getCacheDirectory();
    }

    public y4e(InterfaceC21513a interfaceC21513a, long j) {
        this.f197449a = j;
        this.f197450b = interfaceC21513a;
    }

    @Override // p153l.z3e.InterfaceC21755a
    public z3e build() {
        File cacheDirectory = this.f197450b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.isDirectory() || cacheDirectory.mkdirs()) {
            return z4e.m218578c(cacheDirectory, this.f197449a);
        }
        return null;
    }
}
