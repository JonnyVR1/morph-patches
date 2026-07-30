package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FlexibleTypesKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final FlexibleType m92605a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        unwrappedTypeMo92625J0.getClass();
        return (FlexibleType) unwrappedTypeMo92625J0;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m92606b(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.mo92625J0() instanceof FlexibleType;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final SimpleType m92607c(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeMo92625J0).m92597O0();
        }
        if (unwrappedTypeMo92625J0 instanceof SimpleType) {
            return (SimpleType) unwrappedTypeMo92625J0;
        }
        l9r.m149037a();
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final SimpleType m92608d(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeMo92625J0).m92598P0();
        }
        if (unwrappedTypeMo92625J0 instanceof SimpleType) {
            return (SimpleType) unwrappedTypeMo92625J0;
        }
        l9r.m149037a();
        return null;
    }
}
