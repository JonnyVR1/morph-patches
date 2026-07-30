package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final FlexibleType f66898d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final KotlinType f66899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeWithEnhancement(@NotNull FlexibleType flexibleType, @NotNull KotlinType kotlinType) {
        super(flexibleType.m93488O0(), flexibleType.m93489P0());
        flexibleType.getClass();
        kotlinType.getClass();
        this.f66898d = flexibleType;
        this.f66899e = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: K0 */
    public UnwrappedType mo90858N0(boolean z) {
        return TypeWithEnhancementKt.m93709d(mo93492P().mo90858N0(z), mo93495l0().mo93516J0().mo90858N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public UnwrappedType mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return TypeWithEnhancementKt.m93709d(mo93492P().mo90785M0(typeAttributes), mo93495l0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo90786N0() {
        return mo93492P().mo90786N0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public String mo90787Q0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRenderer.getClass();
        descriptorRendererOptions.getClass();
        return descriptorRendererOptions.mo92446b() ? descriptorRenderer.mo92343U(mo93495l0()) : mo93492P().mo90787Q0(descriptorRenderer, descriptorRendererOptions);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public FlexibleType mo93492P() {
        return this.f66898d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public FlexibleTypeWithEnhancement mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo93450a = kotlinTypeRefiner.mo93450a(mo93492P());
        kotlinTypeMo93450a.getClass();
        return new FlexibleTypeWithEnhancement((FlexibleType) kotlinTypeMo93450a, kotlinTypeRefiner.mo93450a(mo93495l0()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public KotlinType mo93495l0() {
        return this.f66899e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String toString() {
        return "[@EnhancedForWarnings(" + mo93495l0() + ")] " + mo93492P();
    }
}
