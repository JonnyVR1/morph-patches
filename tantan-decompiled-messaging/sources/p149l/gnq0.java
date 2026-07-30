package p149l;

import android.annotation.TargetApi;
import android.os.Debug;

/* JADX INFO: loaded from: classes.dex */
public class gnq0 {

    /* JADX INFO: renamed from: a */
    static final C17129b f103614a = new C17130c();

    /* JADX INFO: renamed from: l.gnq0$b */
    public static class C17129b {
        private C17129b() {
        }

        /* JADX INFO: renamed from: a */
        public int mo127178a(Debug.MemoryInfo memoryInfo) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public int mo127179b(Debug.MemoryInfo memoryInfo) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public int mo127180c(Debug.MemoryInfo memoryInfo) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.gnq0$c */
    @TargetApi(19)
    public static class C17130c extends C17129b {
        private C17130c() {
            super();
        }

        @Override // p149l.gnq0.C17129b
        /* JADX INFO: renamed from: a */
        public int mo127178a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // p149l.gnq0.C17129b
        /* JADX INFO: renamed from: b */
        public int mo127179b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // p149l.gnq0.C17129b
        /* JADX INFO: renamed from: c */
        public int mo127180c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m127175a(Debug.MemoryInfo memoryInfo) {
        return f103614a.mo127178a(memoryInfo);
    }

    /* JADX INFO: renamed from: b */
    public static int m127176b(Debug.MemoryInfo memoryInfo) {
        return f103614a.mo127179b(memoryInfo);
    }

    /* JADX INFO: renamed from: c */
    public static int m127177c(Debug.MemoryInfo memoryInfo) {
        return f103614a.mo127180c(memoryInfo);
    }
}
