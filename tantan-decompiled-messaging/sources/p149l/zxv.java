package p149l;

import android.os.Looper;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes13.dex */
public interface zxv {

    /* JADX INFO: renamed from: l.zxv$a */
    public static class C21811a {
        /* JADX INFO: renamed from: a */
        public static zxv m220851a() {
            return (!do0.m112697c() || m220852b() == null) ? new C21812b() : new do0("EventBus");
        }

        /* JADX INFO: renamed from: b */
        public static Object m220852b() {
            try {
                return Looper.getMainLooper();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: l.zxv$b */
    public static class C21812b implements zxv {
        @Override // p149l.zxv
        /* JADX INFO: renamed from: a */
        public void mo112699a(Level level, String str) {
            System.out.println("[" + String.valueOf(level) + "] " + str);
        }

        @Override // p149l.zxv
        /* JADX INFO: renamed from: b */
        public void mo112700b(Level level, String str, Throwable th) {
            System.out.println("[" + String.valueOf(level) + "] " + str + " error = " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    void mo112699a(Level level, String str);

    /* JADX INFO: renamed from: b */
    void mo112700b(Level level, String str, Throwable th);
}
