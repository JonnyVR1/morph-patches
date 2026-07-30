package p153l;

import android.annotation.TargetApi;
import android.os.Debug;

/* JADX INFO: loaded from: classes.dex */
public class mwq0 {

    /* JADX INFO: renamed from: a */
    static final C18725b f139142a = new C18726c();

    /* JADX INFO: renamed from: l.mwq0$b */
    public static class C18725b {
        private C18725b() {
        }

        /* JADX INFO: renamed from: a */
        public int mo160587a(Debug.MemoryInfo memoryInfo) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public int mo160588b(Debug.MemoryInfo memoryInfo) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public int mo160589c(Debug.MemoryInfo memoryInfo) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.mwq0$c */
    @TargetApi(19)
    public static class C18726c extends C18725b {
        private C18726c() {
            super();
        }

        @Override // p153l.mwq0.C18725b
        /* JADX INFO: renamed from: a */
        public int mo160587a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // p153l.mwq0.C18725b
        /* JADX INFO: renamed from: b */
        public int mo160588b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // p153l.mwq0.C18725b
        /* JADX INFO: renamed from: c */
        public int mo160589c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m160584a(Debug.MemoryInfo memoryInfo) {
        return f139142a.mo160587a(memoryInfo);
    }

    /* JADX INFO: renamed from: b */
    public static int m160585b(Debug.MemoryInfo memoryInfo) {
        return f139142a.mo160588b(memoryInfo);
    }

    /* JADX INFO: renamed from: c */
    public static int m160586c(Debug.MemoryInfo memoryInfo) {
        return f139142a.mo160589c(memoryInfo);
    }
}
