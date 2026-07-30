package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WrappedType extends KotlinType {
    public WrappedType() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo92779E0() {
        return mo93539K0().mo92779E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo92780F0() {
        return mo93539K0().mo92780F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo92781G0() {
        return mo93539K0().mo92781G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo90857H0() {
        return mo93539K0().mo90857H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final UnwrappedType mo93516J0() {
        KotlinType kotlinTypeMo93539K0 = mo93539K0();
        while (kotlinTypeMo93539K0 instanceof WrappedType) {
            kotlinTypeMo93539K0 = ((WrappedType) kotlinTypeMo93539K0).mo93539K0();
        }
        kotlinTypeMo93539K0.getClass();
        return (UnwrappedType) kotlinTypeMo93539K0;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public abstract KotlinType mo93539K0();

    /* JADX INFO: renamed from: L0 */
    public boolean mo93540L0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo90791n() {
        return mo93539K0().mo90791n();
    }

    @NotNull
    public String toString() {
        return mo93540L0() ? mo93539K0().toString() : "<Not computed yet>";
    }
}
