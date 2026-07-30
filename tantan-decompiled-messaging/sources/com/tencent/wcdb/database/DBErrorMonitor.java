package com.tencent.wcdb.database;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DBErrorMonitor {
    public static boolean DEBUG = false;
    private static LongSparseArray<StackTraceElement[]> map = new LongSparseArray<>();
    private static ExceptionCallback sExceptionCallback;

    public interface ExceptionCallback {
        void onErrorStack(StackTraceElement[] stackTraceElementArr);

        void onException(Exception exc);
    }

    public static synchronized List<StackTraceElement[]> get() {
        ArrayList arrayList;
        arrayList = new ArrayList(map.size());
        for (int i = 0; i < map.size(); i++) {
            arrayList.add(map.valueAt(i));
        }
        return arrayList;
    }

    public static void setExceptionCallback(ExceptionCallback exceptionCallback) {
        sExceptionCallback = exceptionCallback;
    }

    public static synchronized void trackAcquireConnection() {
        try {
            if (DEBUG) {
                Thread threadCurrentThread = Thread.currentThread();
                StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
                if (map.indexOfKey(threadCurrentThread.getId()) >= 0) {
                    ExceptionCallback exceptionCallback = sExceptionCallback;
                    if (exceptionCallback != null) {
                        exceptionCallback.onErrorStack(map.get(threadCurrentThread.getId()));
                    }
                } else {
                    map.put(threadCurrentThread.getId(), stackTrace);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void trackReleaseConnection() {
        if (DEBUG) {
            map.remove(Thread.currentThread().getId());
        }
    }
}
