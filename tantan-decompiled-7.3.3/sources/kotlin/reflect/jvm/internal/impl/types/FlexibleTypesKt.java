package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FlexibleTypesKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final FlexibleType m93496a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        unwrappedTypeMo93516J0.getClass();
        return (FlexibleType) unwrappedTypeMo93516J0;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m93497b(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.mo93516J0() instanceof FlexibleType;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final SimpleType m93498c(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        if (unwrappedTypeMo93516J0 instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeMo93516J0).m93488O0();
        }
        if (unwrappedTypeMo93516J0 instanceof SimpleType) {
            return (SimpleType) unwrappedTypeMo93516J0;
        }
        nbr.m162172a();
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final SimpleType m93499d(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        if (unwrappedTypeMo93516J0 instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeMo93516J0).m93489P0();
        }
        if (unwrappedTypeMo93516J0 instanceof SimpleType) {
            return (SimpleType) unwrappedTypeMo93516J0;
        }
        nbr.m162172a();
        return null;
    }
}
