package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DelegatingSimpleType extends SimpleType {
    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo91888E0() {
        return mo89969P0().mo91888E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo91889F0() {
        return mo89969P0().mo91889F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo91890G0() {
        return mo89969P0().mo91890G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return mo89969P0().mo89966H0();
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public abstract SimpleType mo89969P0();

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public SimpleType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo92559a = kotlinTypeRefiner.mo92559a(mo89969P0());
        kotlinTypeMo92559a.getClass();
        return mo89970R0((SimpleType) kotlinTypeMo92559a);
    }

    @NotNull
    /* JADX INFO: renamed from: R0 */
    public abstract DelegatingSimpleType mo89970R0(@NotNull SimpleType simpleType);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89900n() {
        return mo89969P0().mo89900n();
    }
}
