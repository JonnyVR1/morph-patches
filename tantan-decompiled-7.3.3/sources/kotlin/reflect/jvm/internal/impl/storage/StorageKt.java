package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class StorageKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> T m93375a(@NotNull NotNullLazyValue<? extends T> notNullLazyValue, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        notNullLazyValue.getClass();
        kProperty.getClass();
        return notNullLazyValue.invoke();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> T m93376b(@NotNull NullableLazyValue<? extends T> nullableLazyValue, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        nullableLazyValue.getClass();
        kProperty.getClass();
        return nullableLazyValue.invoke();
    }
}
