package p149l;

import android.annotation.TargetApi;
import android.app.ActivityManager;

/* JADX INFO: loaded from: classes.dex */
public class xvq0 {

    /* JADX INFO: renamed from: a */
    static final C21243b f194665a = new C21244c();

    /* JADX INFO: renamed from: l.xvq0$b */
    public static class C21243b {
        private C21243b() {
        }

        /* JADX INFO: renamed from: a */
        public long mo211304a(ActivityManager.MemoryInfo memoryInfo) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.xvq0$c */
    @TargetApi(16)
    public static class C21244c extends C21243b {
        private C21244c() {
            super();
        }

        @Override // p149l.xvq0.C21243b
        /* JADX INFO: renamed from: a */
        public long mo211304a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m211303a(ActivityManager.MemoryInfo memoryInfo) {
        return f194665a.mo211304a(memoryInfo);
    }
}
