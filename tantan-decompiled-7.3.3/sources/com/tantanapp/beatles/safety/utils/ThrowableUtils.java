package com.tantanapp.beatles.safety.utils;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p153l.m6f;

/* JADX INFO: loaded from: classes11.dex */
public class ThrowableUtils {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f56834a = new HashSet<String>() { // from class: com.tantanapp.beatles.safety.utils.ThrowableUtils.1
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
    public static boolean m82369a(Throwable th, Class<?> cls) {
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
    public static Throwable m82370b(Throwable th) {
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
    public static boolean m82371c(@NonNull Throwable th) {
        for (StackTraceElement stackTraceElement : m82370b(th).getStackTrace()) {
            if (!m82372d(stackTraceElement)) {
                if (!m6f.m157216b(stackTraceElement)) {
                    m6f.m157218d(stackTraceElement);
                    break;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m82372d(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Iterator<String> it = f56834a.iterator();
        while (it.hasNext()) {
            if (className.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }
}
