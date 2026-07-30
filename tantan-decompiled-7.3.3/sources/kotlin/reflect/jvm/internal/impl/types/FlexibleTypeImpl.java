package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeParameter {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    @JvmField
    public static boolean f66896e;

    /* JADX INFO: renamed from: d */
    public boolean f66897d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeImpl(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        super(simpleType, simpleType2);
        simpleType.getClass();
        simpleType2.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    /* JADX INFO: renamed from: B0 */
    public boolean mo90856B0() {
        return (m93488O0().mo92781G0().mo89207e() instanceof TypeParameterDescriptor) && Intrinsics.m88377d(m93488O0().mo92781G0(), m93489P0().mo92781G0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: K0 */
    public UnwrappedType mo90858N0(boolean z) {
        return KotlinTypeFactory.m93520e(m93488O0().mo90858N0(z), m93489P0().mo90858N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public UnwrappedType mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return KotlinTypeFactory.m93520e(m93488O0().mo90785M0(typeAttributes), m93489P0().mo90785M0(typeAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo90786N0() {
        m93491S0();
        return m93488O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public String mo90787Q0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRenderer.getClass();
        descriptorRendererOptions.getClass();
        if (!descriptorRendererOptions.mo92452d()) {
            return descriptorRenderer.mo92340R(descriptorRenderer.mo92343U(m93488O0()), descriptorRenderer.mo92343U(m93489P0()), TypeUtilsKt.m93985n(this));
        }
        return "(" + descriptorRenderer.mo92343U(m93488O0()) + ".." + descriptorRenderer.mo92343U(m93489P0()) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public FlexibleType mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo93450a = kotlinTypeRefiner.mo93450a(m93488O0());
        kotlinTypeMo93450a.getClass();
        KotlinType kotlinTypeMo93450a2 = kotlinTypeRefiner.mo93450a(m93489P0());
        kotlinTypeMo93450a2.getClass();
        return new FlexibleTypeImpl((SimpleType) kotlinTypeMo93450a, (SimpleType) kotlinTypeMo93450a2);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m93491S0() {
        if (!f66896e || this.f66897d) {
            return;
        }
        this.f66897d = true;
        FlexibleTypesKt.m93497b(m93488O0());
        FlexibleTypesKt.m93497b(m93489P0());
        Intrinsics.m88377d(m93488O0(), m93489P0());
        KotlinTypeChecker.f66972a.mo93795d(m93488O0(), m93489P0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public KotlinType mo90865m0(@NotNull KotlinType kotlinType) {
        UnwrappedType unwrappedTypeM93520e;
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        if (unwrappedTypeMo93516J0 instanceof FlexibleType) {
            unwrappedTypeM93520e = unwrappedTypeMo93516J0;
        } else {
            if (!(unwrappedTypeMo93516J0 instanceof SimpleType)) {
                nbr.m162172a();
                return null;
            }
            SimpleType simpleType = (SimpleType) unwrappedTypeMo93516J0;
            unwrappedTypeM93520e = KotlinTypeFactory.m93520e(simpleType, simpleType.mo90858N0(true));
        }
        return TypeWithEnhancementKt.m93707b(unwrappedTypeM93520e, unwrappedTypeMo93516J0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String toString() {
        return "(" + m93488O0() + ".." + m93489P0() + ')';
    }
}
