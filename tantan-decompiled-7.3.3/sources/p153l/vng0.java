package p153l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class vng0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f184879a;

    public vng0(String str) {
        this.f184879a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f184879a);
        thread.setDaemon(false);
        return thread;
    }
}
