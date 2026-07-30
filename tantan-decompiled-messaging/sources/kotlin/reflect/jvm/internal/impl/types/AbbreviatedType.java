package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AbbreviatedType extends DelegatingSimpleType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SimpleType f66187b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final SimpleType f66188c;

    public AbbreviatedType(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        this.f66187b = simpleType;
        this.f66188c = simpleType2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public SimpleType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new AbbreviatedType(mo89969P0().mo89894M0(typeAttributes), this.f66188c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public SimpleType mo89969P0() {
        return this.f66187b;
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public final SimpleType m92487S0() {
        return this.f66188c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbbreviatedType mo89967N0(boolean z) {
        return new AbbreviatedType(mo89969P0().mo89967N0(z), this.f66188c.mo89967N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbbreviatedType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo92559a = kotlinTypeRefiner.mo92559a(mo89969P0());
        kotlinTypeMo92559a.getClass();
        KotlinType kotlinTypeMo92559a2 = kotlinTypeRefiner.mo92559a(this.f66188c);
        kotlinTypeMo92559a2.getClass();
        return new AbbreviatedType((SimpleType) kotlinTypeMo92559a, (SimpleType) kotlinTypeMo92559a2);
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final SimpleType m92490V() {
        return mo89969P0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public AbbreviatedType mo89970R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new AbbreviatedType(simpleType, this.f66188c);
    }
}
