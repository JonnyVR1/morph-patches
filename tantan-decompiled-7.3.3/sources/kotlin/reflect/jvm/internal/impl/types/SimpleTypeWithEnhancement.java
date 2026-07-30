package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SimpleType f66914b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinType f66915c;

    public SimpleTypeWithEnhancement(@NotNull SimpleType simpleType, @NotNull KotlinType kotlinType) {
        simpleType.getClass();
        kotlinType.getClass();
        this.f66914b = simpleType;
        this.f66915c = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo90858N0(boolean z) {
        UnwrappedType unwrappedTypeM93709d = TypeWithEnhancementKt.m93709d(mo93492P().mo90858N0(z), mo93495l0().mo93516J0().mo90858N0(z));
        unwrappedTypeM93709d.getClass();
        return (SimpleType) unwrappedTypeM93709d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        UnwrappedType unwrappedTypeM93709d = TypeWithEnhancementKt.m93709d(mo93492P().mo90785M0(typeAttributes), mo93495l0());
        unwrappedTypeM93709d.getClass();
        return (SimpleType) unwrappedTypeM93709d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public SimpleType mo90860P0() {
        return this.f66914b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public SimpleType mo93492P() {
        return mo90860P0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public SimpleTypeWithEnhancement mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo93450a = kotlinTypeRefiner.mo93450a(mo90860P0());
        kotlinTypeMo93450a.getClass();
        return new SimpleTypeWithEnhancement((SimpleType) kotlinTypeMo93450a, kotlinTypeRefiner.mo93450a(mo93495l0()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public SimpleTypeWithEnhancement mo90861R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new SimpleTypeWithEnhancement(simpleType, mo93495l0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public KotlinType mo93495l0() {
        return this.f66915c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return "[@EnhancedForWarnings(" + mo93495l0() + ")] " + mo93492P();
    }
}
