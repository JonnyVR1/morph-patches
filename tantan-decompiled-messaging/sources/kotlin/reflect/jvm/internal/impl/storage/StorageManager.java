package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface StorageManager {
    @NotNull
    /* JADX INFO: renamed from: a */
    <T> NotNullLazyValue<T> mo92442a(@NotNull Function0<? extends T> function0, @NotNull T t);

    @NotNull
    /* JADX INFO: renamed from: b */
    <T> NotNullLazyValue<T> mo92443b(@NotNull Function0<? extends T> function0, @Nullable Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function2);

    @NotNull
    /* JADX INFO: renamed from: c */
    <K, V> MemoizedFunctionToNullable<K, V> mo92444c(@NotNull Function1<? super K, ? extends V> function1);

    @NotNull
    /* JADX INFO: renamed from: d */
    <K, V> CacheWithNotNullValues<K, V> mo92445d();

    @NotNull
    /* JADX INFO: renamed from: e */
    <T> NotNullLazyValue<T> mo92446e(@NotNull Function0<? extends T> function0);

    /* JADX INFO: renamed from: f */
    <T> T mo92447f(@NotNull Function0<? extends T> function0);

    @NotNull
    /* JADX INFO: renamed from: g */
    <T> NullableLazyValue<T> mo92448g(@NotNull Function0<? extends T> function0);

    @NotNull
    /* JADX INFO: renamed from: h */
    <K, V> CacheWithNullableValues<K, V> mo92449h();

    @NotNull
    /* JADX INFO: renamed from: i */
    <K, V> MemoizedFunctionToNotNull<K, V> mo92450i(@NotNull Function1<? super K, ? extends V> function1);
}
