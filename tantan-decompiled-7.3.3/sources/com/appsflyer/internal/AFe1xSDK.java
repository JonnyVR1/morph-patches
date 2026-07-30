package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1xSDK {
    @NotNull
    public static final List<StackTraceElement> getMediationNetwork(@NotNull Throwable th) {
        th.getClass();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            if (!C15493d.m94374J(className, "com.appsflyer", false, 2, null)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return arrayList;
    }
}
