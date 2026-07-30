package p153l;

import android.annotation.TargetApi;
import android.app.ActivityManager;

/* JADX INFO: loaded from: classes.dex */
public class d5r0 {

    /* JADX INFO: renamed from: a */
    static final C16456b f85186a = new C16457c();

    /* JADX INFO: renamed from: l.d5r0$b */
    public static class C16456b {
        private C16456b() {
        }

        /* JADX INFO: renamed from: a */
        public long mo114318a(ActivityManager.MemoryInfo memoryInfo) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.d5r0$c */
    @TargetApi(16)
    public static class C16457c extends C16456b {
        private C16457c() {
            super();
        }

        @Override // p153l.d5r0.C16456b
        /* JADX INFO: renamed from: a */
        public long mo114318a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m114317a(ActivityManager.MemoryInfo memoryInfo) {
        return f85186a.mo114318a(memoryInfo);
    }
}
