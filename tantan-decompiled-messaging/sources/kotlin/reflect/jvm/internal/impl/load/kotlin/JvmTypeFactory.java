package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface JvmTypeFactory<T> {
    @NotNull
    /* JADX INFO: renamed from: a */
    T mo90351a(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: b */
    T mo90352b();

    @NotNull
    /* JADX INFO: renamed from: c */
    T mo90353c(@NotNull T t);

    @NotNull
    /* JADX INFO: renamed from: d */
    T mo90354d(@NotNull PrimitiveType primitiveType);

    @NotNull
    /* JADX INFO: renamed from: e */
    String mo90355e(@NotNull T t);

    @NotNull
    /* JADX INFO: renamed from: f */
    T mo90356f(@NotNull String str);
}
