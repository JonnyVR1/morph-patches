package p149l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class nfg0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f138773a;

    public nfg0(String str) {
        this.f138773a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f138773a);
        thread.setDaemon(false);
        return thread;
    }
}
