package com.tantanapp.beatles.safety.utils;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p149l.i5f;

/* JADX INFO: loaded from: classes13.dex */
public class ThrowableUtils {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f55986a = new HashSet<String>() { // from class: com.tantanapp.beatles.safety.utils.ThrowableUtils.1
        {
            add("android.");
            add("androidx.");
            add("com.android.");
            add("java.");
            add("javax.");
            add("dalvik.");
            add("org.");
        }
    };

    /* JADX INFO: renamed from: a */
    public static boolean m81186a(Throwable th, Class<?> cls) {
        int i = 0;
        while (th != null && i <= 10) {
            if (th.getClass() == cls) {
                return true;
            }
            i++;
            th = th.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static Throwable m81187b(Throwable th) {
        while (true) {
            Throwable th2 = th;
            while (th.getCause() != null) {
                th = th.getCause();
                if (th.getStackTrace() == null || th.getStackTrace().length <= 0) {
                }
            }
            return th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m81188c(@NonNull Throwable th) {
        for (StackTraceElement stackTraceElement : m81187b(th).getStackTrace()) {
            if (!m81189d(stackTraceElement)) {
                if (!i5f.m134476b(stackTraceElement)) {
                    i5f.m134478d(stackTraceElement);
                    break;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m81189d(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Iterator<String> it = f55986a.iterator();
        while (it.hasNext()) {
            if (className.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }
}
