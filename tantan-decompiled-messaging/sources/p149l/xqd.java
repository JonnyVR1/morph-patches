package p149l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public class xqd implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public int f193996a;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder("okim---");
        int i = this.f193996a;
        this.f193996a = i + 1;
        sb.append(i);
        return new Thread(runnable, sb.toString());
    }
}
