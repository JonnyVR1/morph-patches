package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeParameter, DefinitelyNotNullTypeMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SimpleType f66883b;

    /* JADX INFO: renamed from: c */
    public final boolean f66884c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ DefinitelyNotNullType m93465c(Companion companion, UnwrappedType unwrappedType, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return companion.m93467b(unwrappedType, z, z2);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m93466a(UnwrappedType unwrappedType) {
            return (unwrappedType.mo92781G0() instanceof NewTypeVariableConstructor) || (unwrappedType.mo92781G0().mo89207e() instanceof TypeParameterDescriptor) || (unwrappedType instanceof NewCapturedType) || (unwrappedType instanceof StubTypeForBuilderInference);
        }

        @JvmOverloads
        @Nullable
        /* JADX INFO: renamed from: b */
        public final DefinitelyNotNullType m93467b(@NotNull UnwrappedType unwrappedType, boolean z, boolean z2) {
            unwrappedType.getClass();
            if (unwrappedType instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) unwrappedType;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z2 && !m93468d(unwrappedType, z)) {
                return null;
            }
            if (unwrappedType instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedType;
                Intrinsics.m88377d(flexibleType.m93488O0().mo92781G0(), flexibleType.m93489P0().mo92781G0());
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.m93498c(unwrappedType).mo90858N0(false), z, defaultConstructorMarker);
        }

        /* JADX INFO: renamed from: d */
        public final boolean m93468d(UnwrappedType unwrappedType, boolean z) {
            if (!m93466a(unwrappedType)) {
                return false;
            }
            if (unwrappedType instanceof StubTypeForBuilderInference) {
                return TypeUtils.m93692l(unwrappedType);
            }
            ClassifierDescriptor classifierDescriptorMo89207e = unwrappedType.mo92781G0().mo89207e();
            TypeParameterDescriptorImpl typeParameterDescriptorImpl = classifierDescriptorMo89207e instanceof TypeParameterDescriptorImpl ? (TypeParameterDescriptorImpl) classifierDescriptorMo89207e : null;
            if (typeParameterDescriptorImpl == null || typeParameterDescriptorImpl.m89815M0()) {
                return (z && (unwrappedType.mo92781G0().mo89207e() instanceof TypeParameterDescriptor)) ? TypeUtils.m93692l(unwrappedType) : !NullabilityChecker.INSTANCE.m93836a(unwrappedType);
            }
            return true;
        }

        private Companion() {
        }
    }

    public DefinitelyNotNullType(SimpleType simpleType, boolean z) {
        this.f66883b = simpleType;
        this.f66884c = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    /* JADX INFO: renamed from: B0 */
    public boolean mo90856B0() {
        return (mo90860P0().mo92781G0() instanceof NewTypeVariableConstructor) || (mo90860P0().mo92781G0().mo89207e() instanceof TypeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo90857H0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo90858N0(boolean z) {
        return z ? mo90860P0().mo90858N0(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new DefinitelyNotNullType(mo90860P0().mo90785M0(typeAttributes), this.f66884c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public SimpleType mo90860P0() {
        return this.f66883b;
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public final SimpleType m93463S0() {
        return this.f66883b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public DefinitelyNotNullType mo90861R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new DefinitelyNotNullType(simpleType, this.f66884c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public KotlinType mo90865m0(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return SpecialTypesKt.m93549e(kotlinType.mo93516J0(), this.f66884c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return mo90860P0() + " & Any";
    }

    public /* synthetic */ DefinitelyNotNullType(SimpleType simpleType, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType, z);
    }
}
