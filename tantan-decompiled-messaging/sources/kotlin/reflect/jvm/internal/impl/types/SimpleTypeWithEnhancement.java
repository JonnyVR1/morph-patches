package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SimpleType f66240b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinType f66241c;

    public SimpleTypeWithEnhancement(@NotNull SimpleType simpleType, @NotNull KotlinType kotlinType) {
        simpleType.getClass();
        kotlinType.getClass();
        this.f66240b = simpleType;
        this.f66241c = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo89967N0(boolean z) {
        UnwrappedType unwrappedTypeM92818d = TypeWithEnhancementKt.m92818d(mo92601P().mo89967N0(z), mo92604l0().mo92625J0().mo89967N0(z));
        unwrappedTypeM92818d.getClass();
        return (SimpleType) unwrappedTypeM92818d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        UnwrappedType unwrappedTypeM92818d = TypeWithEnhancementKt.m92818d(mo92601P().mo89894M0(typeAttributes), mo92604l0());
        unwrappedTypeM92818d.getClass();
        return (SimpleType) unwrappedTypeM92818d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public SimpleType mo89969P0() {
        return this.f66240b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public SimpleType mo92601P() {
        return mo89969P0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public SimpleTypeWithEnhancement mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo92559a = kotlinTypeRefiner.mo92559a(mo89969P0());
        kotlinTypeMo92559a.getClass();
        return new SimpleTypeWithEnhancement((SimpleType) kotlinTypeMo92559a, kotlinTypeRefiner.mo92559a(mo92604l0()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public SimpleTypeWithEnhancement mo89970R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new SimpleTypeWithEnhancement(simpleType, mo92604l0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public KotlinType mo92604l0() {
        return this.f66241c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return "[@EnhancedForWarnings(" + mo92604l0() + ")] " + mo92601P();
    }
}
