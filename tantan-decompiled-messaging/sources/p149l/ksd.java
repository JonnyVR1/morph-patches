package p149l;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class ksd {

    /* JADX INFO: renamed from: a */
    public static ksd f124441a;

    /* JADX INFO: renamed from: l.ksd$a */
    public interface InterfaceC18070a {
        void release();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized ksd m147051b() {
        try {
            if (f124441a == null) {
                f124441a = new lsd();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f124441a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m147052c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo147053a(InterfaceC18070a interfaceC18070a);

    /* JADX INFO: renamed from: d */
    public abstract void mo147054d(InterfaceC18070a interfaceC18070a);
}
