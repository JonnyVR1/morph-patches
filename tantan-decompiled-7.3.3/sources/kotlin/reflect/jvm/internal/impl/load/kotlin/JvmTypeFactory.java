package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface JvmTypeFactory<T> {
    @NotNull
    /* JADX INFO: renamed from: a */
    T mo91242a(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: b */
    T mo91243b();

    @NotNull
    /* JADX INFO: renamed from: c */
    T mo91244c(@NotNull T t);

    @NotNull
    /* JADX INFO: renamed from: d */
    T mo91245d(@NotNull PrimitiveType primitiveType);

    @NotNull
    /* JADX INFO: renamed from: e */
    String mo91246e(@NotNull T t);

    @NotNull
    /* JADX INFO: renamed from: f */
    T mo91247f(@NotNull String str);
}
