package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class NameResolverUtilKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ClassId m92232a(@NotNull NameResolver nameResolver, int i) {
        nameResolver.getClass();
        return ClassId.Companion.m91044a(nameResolver.mo90892a(i), nameResolver.mo90893b(i));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Name m92233b(@NotNull NameResolver nameResolver, int i) {
        nameResolver.getClass();
        Name nameM91078h = Name.m91078h(nameResolver.getString(i));
        nameM91078h.getClass();
        return nameM91078h;
    }
}
