package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p149l.shf0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SimpleType f66212b;

    public DelegatingSimpleTypeImpl(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        this.f66212b = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo89967N0(boolean z) {
        return z == mo89966H0() ? this : mo89969P0().mo89967N0(z).mo89894M0(mo91889F0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return typeAttributes != mo91889F0() ? new shf0(this, typeAttributes) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public SimpleType mo89969P0() {
        return this.f66212b;
    }
}
