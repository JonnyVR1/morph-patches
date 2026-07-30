package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeAttribute<T extends TypeAttribute<? extends T>> {
    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract T mo93451a(@Nullable T t);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract KClass<? extends T> mo93452b();

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract T mo93453c(@Nullable T t);
}
