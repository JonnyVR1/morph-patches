package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTypeKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m93535a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        if (unwrappedTypeMo93516J0 instanceof ErrorType) {
            return true;
        }
        return (unwrappedTypeMo93516J0 instanceof FlexibleType) && (((FlexibleType) unwrappedTypeMo93516J0).mo90786N0() instanceof ErrorType);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m93536b(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeUtils.m93692l(kotlinType);
    }
}
