package p002l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xqd implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public int f22403a;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder("okim---");
        int i = this.f22403a;
        this.f22403a = i + 1;
        sb.append(i);
        return new Thread(runnable, sb.toString());
    }
}
