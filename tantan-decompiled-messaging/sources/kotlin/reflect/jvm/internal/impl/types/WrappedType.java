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
    public List<TypeProjection> mo91888E0() {
        return mo92648K0().mo91888E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo91889F0() {
        return mo92648K0().mo91889F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo91890G0() {
        return mo92648K0().mo91890G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return mo92648K0().mo89966H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final UnwrappedType mo92625J0() {
        KotlinType kotlinTypeMo92648K0 = mo92648K0();
        while (kotlinTypeMo92648K0 instanceof WrappedType) {
            kotlinTypeMo92648K0 = ((WrappedType) kotlinTypeMo92648K0).mo92648K0();
        }
        kotlinTypeMo92648K0.getClass();
        return (UnwrappedType) kotlinTypeMo92648K0;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public abstract KotlinType mo92648K0();

    /* JADX INFO: renamed from: L0 */
    public boolean mo92649L0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89900n() {
        return mo92648K0().mo89900n();
    }

    @NotNull
    public String toString() {
        return mo92649L0() ? mo92648K0().toString() : "<Not computed yet>";
    }
}
