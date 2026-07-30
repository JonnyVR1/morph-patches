package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaClassFinderKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Class<?> m89835a(@NotNull ClassLoader classLoader, @NotNull String str) {
        classLoader.getClass();
        str.getClass();
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
