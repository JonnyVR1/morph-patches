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
    public final SimpleType f66209b;

    /* JADX INFO: renamed from: c */
    public final boolean f66210c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ DefinitelyNotNullType m92574c(Companion companion, UnwrappedType unwrappedType, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return companion.m92576b(unwrappedType, z, z2);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m92575a(UnwrappedType unwrappedType) {
            return (unwrappedType.mo91890G0() instanceof NewTypeVariableConstructor) || (unwrappedType.mo91890G0().mo88316e() instanceof TypeParameterDescriptor) || (unwrappedType instanceof NewCapturedType) || (unwrappedType instanceof StubTypeForBuilderInference);
        }

        @JvmOverloads
        @Nullable
        /* JADX INFO: renamed from: b */
        public final DefinitelyNotNullType m92576b(@NotNull UnwrappedType unwrappedType, boolean z, boolean z2) {
            unwrappedType.getClass();
            if (unwrappedType instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) unwrappedType;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z2 && !m92577d(unwrappedType, z)) {
                return null;
            }
            if (unwrappedType instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedType;
                Intrinsics.m87488d(flexibleType.m92597O0().mo91890G0(), flexibleType.m92598P0().mo91890G0());
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.m92607c(unwrappedType).mo89967N0(false), z, defaultConstructorMarker);
        }

        /* JADX INFO: renamed from: d */
        public final boolean m92577d(UnwrappedType unwrappedType, boolean z) {
            if (!m92575a(unwrappedType)) {
                return false;
            }
            if (unwrappedType instanceof StubTypeForBuilderInference) {
                return TypeUtils.m92801l(unwrappedType);
            }
            ClassifierDescriptor classifierDescriptorMo88316e = unwrappedType.mo91890G0().mo88316e();
            TypeParameterDescriptorImpl typeParameterDescriptorImpl = classifierDescriptorMo88316e instanceof TypeParameterDescriptorImpl ? (TypeParameterDescriptorImpl) classifierDescriptorMo88316e : null;
            if (typeParameterDescriptorImpl == null || typeParameterDescriptorImpl.m88924M0()) {
                return (z && (unwrappedType.mo91890G0().mo88316e() instanceof TypeParameterDescriptor)) ? TypeUtils.m92801l(unwrappedType) : !NullabilityChecker.INSTANCE.m92945a(unwrappedType);
            }
            return true;
        }

        private Companion() {
        }
    }

    public DefinitelyNotNullType(SimpleType simpleType, boolean z) {
        this.f66209b = simpleType;
        this.f66210c = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    /* JADX INFO: renamed from: B0 */
    public boolean mo89965B0() {
        return (mo89969P0().mo91890G0() instanceof NewTypeVariableConstructor) || (mo89969P0().mo91890G0().mo88316e() instanceof TypeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo89967N0(boolean z) {
        return z ? mo89969P0().mo89967N0(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new DefinitelyNotNullType(mo89969P0().mo89894M0(typeAttributes), this.f66210c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public SimpleType mo89969P0() {
        return this.f66209b;
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public final SimpleType m92572S0() {
        return this.f66209b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public DefinitelyNotNullType mo89970R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new DefinitelyNotNullType(simpleType, this.f66210c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public KotlinType mo89974m0(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return SpecialTypesKt.m92658e(kotlinType.mo92625J0(), this.f66210c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return mo89969P0() + " & Any";
    }

    public /* synthetic */ DefinitelyNotNullType(SimpleType simpleType, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType, z);
    }
}
