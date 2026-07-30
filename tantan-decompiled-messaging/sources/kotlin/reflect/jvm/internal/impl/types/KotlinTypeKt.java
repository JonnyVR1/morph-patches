package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTypeKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m92644a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        if (unwrappedTypeMo92625J0 instanceof ErrorType) {
            return true;
        }
        return (unwrappedTypeMo92625J0 instanceof FlexibleType) && (((FlexibleType) unwrappedTypeMo92625J0).mo89895N0() instanceof ErrorType);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m92645b(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeUtils.m92801l(kotlinType);
    }
}
