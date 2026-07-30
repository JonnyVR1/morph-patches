package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeCapabilitiesKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final CustomTypeParameter m92712a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        Object objMo92625J0 = kotlinType.mo92625J0();
        CustomTypeParameter customTypeParameter = objMo92625J0 instanceof CustomTypeParameter ? (CustomTypeParameter) objMo92625J0 : null;
        if (customTypeParameter == null || !customTypeParameter.mo89965B0()) {
            return null;
        }
        return customTypeParameter;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m92713b(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        Object objMo92625J0 = kotlinType.mo92625J0();
        CustomTypeParameter customTypeParameter = objMo92625J0 instanceof CustomTypeParameter ? (CustomTypeParameter) objMo92625J0 : null;
        if (customTypeParameter != null) {
            return customTypeParameter.mo89965B0();
        }
        return false;
    }
}
