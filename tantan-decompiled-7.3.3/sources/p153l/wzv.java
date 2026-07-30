package p153l;

import android.os.Looper;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes11.dex */
public interface wzv {

    /* JADX INFO: renamed from: l.wzv$a */
    public static class C21217a {
        /* JADX INFO: renamed from: a */
        public static wzv m208769a() {
            return (!zn0.m220572c() || m208770b() == null) ? new C21218b() : new zn0("EventBus");
        }

        /* JADX INFO: renamed from: b */
        public static Object m208770b() {
            try {
                return Looper.getMainLooper();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: l.wzv$b */
    public static class C21218b implements wzv {
        @Override // p153l.wzv
        /* JADX INFO: renamed from: a */
        public void mo208767a(Level level, String str) {
            System.out.println("[" + String.valueOf(level) + "] " + str);
        }

        @Override // p153l.wzv
        /* JADX INFO: renamed from: b */
        public void mo208768b(Level level, String str, Throwable th) {
            System.out.println("[" + String.valueOf(level) + "] " + str + " error = " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    void mo208767a(Level level, String str);

    /* JADX INFO: renamed from: b */
    void mo208768b(Level level, String str, Throwable th);
}
