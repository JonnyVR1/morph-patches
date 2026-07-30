package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class NameResolverUtilKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ClassId m93123a(@NotNull NameResolver nameResolver, int i) {
        nameResolver.getClass();
        return ClassId.Companion.m91935a(nameResolver.mo91783a(i), nameResolver.mo91784b(i));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Name m93124b(@NotNull NameResolver nameResolver, int i) {
        nameResolver.getClass();
        Name nameM91969h = Name.m91969h(nameResolver.getString(i));
        nameM91969h.getClass();
        return nameM91969h;
    }
}
