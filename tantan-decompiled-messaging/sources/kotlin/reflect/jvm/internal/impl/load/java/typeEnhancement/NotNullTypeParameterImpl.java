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
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SimpleType f64968b;

    public NotNullTypeParameterImpl(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        this.f64968b = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    /* JADX INFO: renamed from: B0 */
    public boolean mo89965B0() {
        return true;
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
        return z ? mo89969P0().mo89967N0(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public SimpleType mo89969P0() {
        return this.f64968b;
    }

    /* JADX INFO: renamed from: S0 */
    public final SimpleType m89971S0(SimpleType simpleType) {
        SimpleType simpleTypeMo89967N0 = simpleType.mo89967N0(false);
        return !TypeUtilsKt.m93105y(simpleType) ? simpleTypeMo89967N0 : new NotNullTypeParameterImpl(simpleTypeMo89967N0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public NotNullTypeParameterImpl mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new NotNullTypeParameterImpl(mo89969P0().mo89894M0(typeAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public NotNullTypeParameterImpl mo89970R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new NotNullTypeParameterImpl(simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public KotlinType mo89974m0(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        if (!TypeUtilsKt.m93105y(unwrappedTypeMo92625J0) && !TypeUtils.m92801l(unwrappedTypeMo92625J0)) {
            return unwrappedTypeMo92625J0;
        }
        if (unwrappedTypeMo92625J0 instanceof SimpleType) {
            return m89971S0((SimpleType) unwrappedTypeMo92625J0);
        }
        if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeMo92625J0;
            return TypeWithEnhancementKt.m92818d(KotlinTypeFactory.m92629e(m89971S0(flexibleType.m92597O0()), m89971S0(flexibleType.m92598P0())), TypeWithEnhancementKt.m92815a(unwrappedTypeMo92625J0));
        }
        l9r.m149037a();
        return null;
    }
}
