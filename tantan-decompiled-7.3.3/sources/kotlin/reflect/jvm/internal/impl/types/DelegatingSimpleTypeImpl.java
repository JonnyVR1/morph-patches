package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p153l.bqf0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SimpleType f66886b;

    public DelegatingSimpleTypeImpl(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        this.f66886b = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo90858N0(boolean z) {
        return z == mo90857H0() ? this : mo90860P0().mo90858N0(z).mo90785M0(mo92780F0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return typeAttributes != mo92780F0() ? new bqf0(this, typeAttributes) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public SimpleType mo90860P0() {
        return this.f66886b;
    }
}
