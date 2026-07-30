package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeCapabilitiesKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final CustomTypeParameter m93603a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        Object objMo93516J0 = kotlinType.mo93516J0();
        CustomTypeParameter customTypeParameter = objMo93516J0 instanceof CustomTypeParameter ? (CustomTypeParameter) objMo93516J0 : null;
        if (customTypeParameter == null || !customTypeParameter.mo90856B0()) {
            return null;
        }
        return customTypeParameter;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m93604b(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        Object objMo93516J0 = kotlinType.mo93516J0();
        CustomTypeParameter customTypeParameter = objMo93516J0 instanceof CustomTypeParameter ? (CustomTypeParameter) objMo93516J0 : null;
        if (customTypeParameter != null) {
            return customTypeParameter.mo90856B0();
        }
        return false;
    }
}
