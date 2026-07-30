package com.tantanapp.beatles.anrmonitor;

import android.os.Looper;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes11.dex */
class ANRError extends Error {
    public final long mDuration;

    /* JADX INFO: renamed from: com.tantanapp.beatles.anrmonitor.ANRError$a */
    public class C13703a implements Comparator<Thread> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Thread f56684a;

        public C13703a(Thread thread) {
            this.f56684a = thread;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Thread thread, Thread thread2) {
            if (thread == thread2) {
                return 0;
            }
            Thread thread3 = this.f56684a;
            if (thread == thread3) {
                return 1;
            }
            if (thread2 == thread3) {
                return -1;
            }
            return thread2.getName().compareTo(thread.getName());
        }
    }

    public ANRError(ErrorInfo._Thread _thread, long j) {
        super("Application Not Responding for at least " + j + " ms.", _thread);
        this.mDuration = j;
    }

    public static ANRError New(long j, String str, boolean z) {
        Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new C13703a(thread));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() == thread || (entry.getKey().getName().startsWith(str) && (z || entry.getValue().length > 0))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        C13703a c13703a = null;
        ErrorInfo._Thread _thread = null;
        for (Map.Entry entry2 : treeMap.entrySet()) {
            _thread = new ErrorInfo._Thread(new ErrorInfo(getThreadTitle((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue(), c13703a), _thread, c13703a);
        }
        return new ANRError(_thread, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ANRError NewMainOnly(long j) {
        Thread thread = Looper.getMainLooper().getThread();
        return new ANRError(new ErrorInfo._Thread(new ErrorInfo(getThreadTitle(thread), thread.getStackTrace(), null), 0 == true ? 1 : 0, 0 == true ? 1 : 0), j);
    }

    private static String getThreadTitle(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public static class ErrorInfo implements Serializable {
        private static final long serialVersionUID = 1;
        private final String mName;
        private final StackTraceElement[] mStackTrace;

        private ErrorInfo(String str, StackTraceElement[] stackTraceElementArr) {
            this.mName = str;
            this.mStackTrace = stackTraceElementArr;
        }

        public /* synthetic */ ErrorInfo(String str, StackTraceElement[] stackTraceElementArr, C13703a c13703a) {
            this(str, stackTraceElementArr);
        }

        public class _Thread extends Throwable {
            private _Thread(_Thread _thread) {
                super(ErrorInfo.this.mName, _thread);
            }

            @Override // java.lang.Throwable
            public Throwable fillInStackTrace() {
                setStackTrace(ErrorInfo.this.mStackTrace);
                return this;
            }

            public /* synthetic */ _Thread(ErrorInfo errorInfo, _Thread _thread, C13703a c13703a) {
                this(_thread);
            }
        }
    }
}
