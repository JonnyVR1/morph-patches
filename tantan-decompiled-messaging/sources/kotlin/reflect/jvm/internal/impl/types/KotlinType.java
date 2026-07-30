package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KotlinType implements Annotated, KotlinTypeMarker {

    /* JADX INFO: renamed from: a */
    public int f66233a;

    public /* synthetic */ KotlinType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: D0 */
    public final int m92624D0() {
        return KotlinTypeKt.m92644a(this) ? super.hashCode() : (((mo91890G0().hashCode() * 31) + mo91888E0().hashCode()) * 31) + (mo89966H0() ? 1 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public abstract List<TypeProjection> mo91888E0();

    @NotNull
    /* JADX INFO: renamed from: F0 */
    public abstract TypeAttributes mo91889F0();

    @NotNull
    /* JADX INFO: renamed from: G0 */
    public abstract TypeConstructor mo91890G0();

    /* JADX INFO: renamed from: H0 */
    public abstract boolean mo89966H0();

    @NotNull
    /* JADX INFO: renamed from: I0 */
    public abstract KotlinType mo89891I0(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public abstract UnwrappedType mo92625J0();

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        return mo89966H0() == kotlinType.mo89966H0() && StrictEqualityTypeChecker.INSTANCE.m92969a(mo92625J0(), kotlinType.mo92625J0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.m92566a(mo91889F0());
    }

    public final int hashCode() {
        int i = this.f66233a;
        if (i != 0) {
            return i;
        }
        int iM92624D0 = m92624D0();
        this.f66233a = iM92624D0;
        return iM92624D0;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public abstract MemberScope mo89900n();

    private KotlinType() {
    }
}
