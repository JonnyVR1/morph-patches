package p153l;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class ytd {

    /* JADX INFO: renamed from: a */
    public static ytd f201503a;

    /* JADX INFO: renamed from: l.ytd$a */
    public interface InterfaceC21682a {
        void release();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized ytd m217301b() {
        try {
            if (f201503a == null) {
                f201503a = new ztd();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f201503a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m217302c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo217303a(InterfaceC21682a interfaceC21682a);

    /* JADX INFO: renamed from: d */
    public abstract void mo217304d(InterfaceC21682a interfaceC21682a);
}
