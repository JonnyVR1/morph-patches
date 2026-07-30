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
    public int f66907a;

    public /* synthetic */ KotlinType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: D0 */
    public final int m93515D0() {
        return KotlinTypeKt.m93535a(this) ? super.hashCode() : (((mo92781G0().hashCode() * 31) + mo92779E0().hashCode()) * 31) + (mo90857H0() ? 1 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public abstract List<TypeProjection> mo92779E0();

    @NotNull
    /* JADX INFO: renamed from: F0 */
    public abstract TypeAttributes mo92780F0();

    @NotNull
    /* JADX INFO: renamed from: G0 */
    public abstract TypeConstructor mo92781G0();

    /* JADX INFO: renamed from: H0 */
    public abstract boolean mo90857H0();

    @NotNull
    /* JADX INFO: renamed from: I0 */
    public abstract KotlinType mo90782I0(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public abstract UnwrappedType mo93516J0();

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        return mo90857H0() == kotlinType.mo90857H0() && StrictEqualityTypeChecker.INSTANCE.m93860a(mo93516J0(), kotlinType.mo93516J0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.m93457a(mo92780F0());
    }

    public final int hashCode() {
        int i = this.f66907a;
        if (i != 0) {
            return i;
        }
        int iM93515D0 = m93515D0();
        this.f66907a = iM93515D0;
        return iM93515D0;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public abstract MemberScope mo90791n();

    private KotlinType() {
    }
}
