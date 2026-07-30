package p149l;

import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public class igj0 {
    /* JADX INFO: renamed from: a */
    public static boolean m136050a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
