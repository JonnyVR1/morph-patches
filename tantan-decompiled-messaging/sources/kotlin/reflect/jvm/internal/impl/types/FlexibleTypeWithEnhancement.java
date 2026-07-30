package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final FlexibleType f66224d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final KotlinType f66225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeWithEnhancement(@NotNull FlexibleType flexibleType, @NotNull KotlinType kotlinType) {
        super(flexibleType.m92597O0(), flexibleType.m92598P0());
        flexibleType.getClass();
        kotlinType.getClass();
        this.f66224d = flexibleType;
        this.f66225e = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: K0 */
    public UnwrappedType mo89967N0(boolean z) {
        return TypeWithEnhancementKt.m92818d(mo92601P().mo89967N0(z), mo92604l0().mo92625J0().mo89967N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public UnwrappedType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return TypeWithEnhancementKt.m92818d(mo92601P().mo89894M0(typeAttributes), mo92604l0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo89895N0() {
        return mo92601P().mo89895N0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public String mo89896Q0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRenderer.getClass();
        descriptorRendererOptions.getClass();
        return descriptorRendererOptions.mo91555b() ? descriptorRenderer.mo91452U(mo92604l0()) : mo92601P().mo89896Q0(descriptorRenderer, descriptorRendererOptions);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public FlexibleType mo92601P() {
        return this.f66224d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public FlexibleTypeWithEnhancement mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo92559a = kotlinTypeRefiner.mo92559a(mo92601P());
        kotlinTypeMo92559a.getClass();
        return new FlexibleTypeWithEnhancement((FlexibleType) kotlinTypeMo92559a, kotlinTypeRefiner.mo92559a(mo92604l0()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public KotlinType mo92604l0() {
        return this.f66225e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String toString() {
        return "[@EnhancedForWarnings(" + mo92604l0() + ")] " + mo92601P();
    }
}
