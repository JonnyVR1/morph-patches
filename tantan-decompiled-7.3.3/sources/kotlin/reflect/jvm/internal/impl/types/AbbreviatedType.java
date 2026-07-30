package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AbbreviatedType extends DelegatingSimpleType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SimpleType f66861b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final SimpleType f66862c;

    public AbbreviatedType(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        this.f66861b = simpleType;
        this.f66862c = simpleType2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public SimpleType mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new AbbreviatedType(mo90860P0().mo90785M0(typeAttributes), this.f66862c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public SimpleType mo90860P0() {
        return this.f66861b;
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public final SimpleType m93378S0() {
        return this.f66862c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbbreviatedType mo90858N0(boolean z) {
        return new AbbreviatedType(mo90860P0().mo90858N0(z), this.f66862c.mo90858N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbbreviatedType mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo93450a = kotlinTypeRefiner.mo93450a(mo90860P0());
        kotlinTypeMo93450a.getClass();
        KotlinType kotlinTypeMo93450a2 = kotlinTypeRefiner.mo93450a(this.f66862c);
        kotlinTypeMo93450a2.getClass();
        return new AbbreviatedType((SimpleType) kotlinTypeMo93450a, (SimpleType) kotlinTypeMo93450a2);
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final SimpleType m93381V() {
        return mo90860P0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public AbbreviatedType mo90861R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new AbbreviatedType(simpleType, this.f66862c);
    }
}
