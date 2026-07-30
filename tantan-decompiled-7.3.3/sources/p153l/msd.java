package p153l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes5.dex */
public class msd implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public int f138472a;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder("okim---");
        int i = this.f138472a;
        this.f138472a = i + 1;
        sb.append(i);
        return new Thread(runnable, sb.toString());
    }
}
