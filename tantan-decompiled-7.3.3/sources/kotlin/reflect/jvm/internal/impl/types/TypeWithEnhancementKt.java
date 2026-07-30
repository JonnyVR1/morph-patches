package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final KotlinType m93706a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        if (kotlinType instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) kotlinType).mo93495l0();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final UnwrappedType m93707b(@NotNull UnwrappedType unwrappedType, @NotNull KotlinType kotlinType) {
        unwrappedType.getClass();
        kotlinType.getClass();
        return m93709d(unwrappedType, m93706a(kotlinType));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final UnwrappedType m93708c(@NotNull UnwrappedType unwrappedType, @NotNull KotlinType kotlinType, @NotNull Function1<? super KotlinType, ? extends KotlinType> function1) {
        unwrappedType.getClass();
        kotlinType.getClass();
        function1.getClass();
        KotlinType kotlinTypeM93706a = m93706a(kotlinType);
        return m93709d(unwrappedType, kotlinTypeM93706a != null ? function1.invoke(kotlinTypeM93706a) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final UnwrappedType m93709d(@NotNull UnwrappedType unwrappedType, @Nullable KotlinType kotlinType) {
        unwrappedType.getClass();
        if (unwrappedType instanceof TypeWithEnhancement) {
            return m93709d(((TypeWithEnhancement) unwrappedType).mo93492P(), kotlinType);
        }
        if (kotlinType == null || Intrinsics.m88377d(kotlinType, unwrappedType)) {
            return unwrappedType;
        }
        if (unwrappedType instanceof SimpleType) {
            return new SimpleTypeWithEnhancement((SimpleType) unwrappedType, kotlinType);
        }
        if (unwrappedType instanceof FlexibleType) {
            return new FlexibleTypeWithEnhancement((FlexibleType) unwrappedType, kotlinType);
        }
        nbr.m162172a();
        return null;
    }
}
