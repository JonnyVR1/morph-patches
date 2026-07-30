package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SimpleType f65642b;

    public NotNullTypeParameterImpl(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        this.f65642b = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    /* JADX INFO: renamed from: B0 */
    public boolean mo90856B0() {
        return true;
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
        return z ? mo90860P0().mo90858N0(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public SimpleType mo90860P0() {
        return this.f65642b;
    }

    /* JADX INFO: renamed from: S0 */
    public final SimpleType m90862S0(SimpleType simpleType) {
        SimpleType simpleTypeMo90858N0 = simpleType.mo90858N0(false);
        return !TypeUtilsKt.m93996y(simpleType) ? simpleTypeMo90858N0 : new NotNullTypeParameterImpl(simpleTypeMo90858N0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public NotNullTypeParameterImpl mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new NotNullTypeParameterImpl(mo90860P0().mo90785M0(typeAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public NotNullTypeParameterImpl mo90861R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new NotNullTypeParameterImpl(simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public KotlinType mo90865m0(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        if (!TypeUtilsKt.m93996y(unwrappedTypeMo93516J0) && !TypeUtils.m93692l(unwrappedTypeMo93516J0)) {
            return unwrappedTypeMo93516J0;
        }
        if (unwrappedTypeMo93516J0 instanceof SimpleType) {
            return m90862S0((SimpleType) unwrappedTypeMo93516J0);
        }
        if (unwrappedTypeMo93516J0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeMo93516J0;
            return TypeWithEnhancementKt.m93709d(KotlinTypeFactory.m93520e(m90862S0(flexibleType.m93488O0()), m90862S0(flexibleType.m93489P0())), TypeWithEnhancementKt.m93706a(unwrappedTypeMo93516J0));
        }
        nbr.m162172a();
        return null;
    }
}
