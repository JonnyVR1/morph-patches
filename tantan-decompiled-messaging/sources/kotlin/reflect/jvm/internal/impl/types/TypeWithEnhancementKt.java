package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final KotlinType m92815a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        if (kotlinType instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) kotlinType).mo92604l0();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final UnwrappedType m92816b(@NotNull UnwrappedType unwrappedType, @NotNull KotlinType kotlinType) {
        unwrappedType.getClass();
        kotlinType.getClass();
        return m92818d(unwrappedType, m92815a(kotlinType));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final UnwrappedType m92817c(@NotNull UnwrappedType unwrappedType, @NotNull KotlinType kotlinType, @NotNull Function1<? super KotlinType, ? extends KotlinType> function1) {
        unwrappedType.getClass();
        kotlinType.getClass();
        function1.getClass();
        KotlinType kotlinTypeM92815a = m92815a(kotlinType);
        return m92818d(unwrappedType, kotlinTypeM92815a != null ? function1.invoke(kotlinTypeM92815a) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final UnwrappedType m92818d(@NotNull UnwrappedType unwrappedType, @Nullable KotlinType kotlinType) {
        unwrappedType.getClass();
        if (unwrappedType instanceof TypeWithEnhancement) {
            return m92818d(((TypeWithEnhancement) unwrappedType).mo92601P(), kotlinType);
        }
        if (kotlinType == null || Intrinsics.m87488d(kotlinType, unwrappedType)) {
            return unwrappedType;
        }
        if (unwrappedType instanceof SimpleType) {
            return new SimpleTypeWithEnhancement((SimpleType) unwrappedType, kotlinType);
        }
        if (unwrappedType instanceof FlexibleType) {
            return new FlexibleTypeWithEnhancement((FlexibleType) unwrappedType, kotlinType);
        }
        l9r.m149037a();
        return null;
    }
}
