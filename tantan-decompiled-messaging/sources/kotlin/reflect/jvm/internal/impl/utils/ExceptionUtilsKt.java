package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ExceptionUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m93196a(@NotNull Throwable th) {
        th.getClass();
        Class<?> superclass = th.getClass();
        while (!Intrinsics.m87488d(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final RuntimeException m93197b(@NotNull Throwable th) throws Throwable {
        th.getClass();
        throw th;
    }
}
