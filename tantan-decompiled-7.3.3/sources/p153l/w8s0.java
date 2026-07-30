package p153l;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class w8s0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    public static ClassLoader f187929a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    public static Thread f187930b;

    /* JADX WARN: Code duplicated, block: B:52:0x0092 A[Catch: all -> 0x008e, PHI: r1
      0x0092: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v14 java.lang.Thread) binds: [B:7:0x000a, B:46:0x008b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x0089, B:60:0x00a1, B:12:0x001f, B:51:0x0091, B:52:0x0092, B:63:0x00a5, B:64:0x00a6, B:53:0x0093, B:59:0x00a0, B:58:0x009d, B:13:0x0020, B:15:0x002d, B:25:0x0046, B:26:0x004d, B:28:0x0058, B:34:0x006d, B:35:0x0074, B:42:0x0084, B:43:0x0087, B:18:0x003c), top: B:78:0x0003, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static synchronized ClassLoader m205523a() {
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        if (f187929a == null) {
            Thread thread2 = f187930b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f187930b.getContextClassLoader();
                    } catch (SecurityException e2) {
                        e2.getMessage();
                    }
                }
                f187929a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        e9r0 e9r0Var = new e9r0(threadGroup, "GmsDynamite");
                                        try {
                                            e9r0Var.setContextClassLoader(null);
                                            e9r0Var.start();
                                            thread = e9r0Var;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = e9r0Var;
                                            e.getMessage();
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (SecurityException e5) {
                                e = e5;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f187930b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f187930b.getContextClassLoader();
                    }
                }
                f187929a = contextClassLoader;
            }
        }
        return f187929a;
    }
}
