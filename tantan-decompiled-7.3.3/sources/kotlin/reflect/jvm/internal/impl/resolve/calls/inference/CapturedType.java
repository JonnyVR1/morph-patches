package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CapturedType extends SimpleType implements CapturedTypeMarker {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeProjection f66513b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final CapturedTypeConstructor f66514c;

    /* JADX INFO: renamed from: d */
    public final boolean f66515d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TypeAttributes f66516e;

    public /* synthetic */ CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z, TypeAttributes typeAttributes, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? new CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructor, (i & 4) != 0 ? false : z, (i & 8) != 0 ? TypeAttributes.Companion.m93600k() : typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo92779E0() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo92780F0() {
        return this.f66516e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo90857H0() {
        return this.f66515d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new CapturedType(this.f66513b, mo92781G0(), mo90857H0(), typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public CapturedTypeConstructor mo92781G0() {
        return this.f66514c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public CapturedType mo90858N0(boolean z) {
        return z == mo90857H0() ? this : new CapturedType(this.f66513b, mo92781G0(), z, mo92780F0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public CapturedType mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        TypeProjection typeProjectionMo93556a = this.f66513b.mo93556a(kotlinTypeRefiner);
        typeProjectionMo93556a.getClass();
        return new CapturedType(typeProjectionMo93556a, mo92781G0(), mo90857H0(), mo92780F0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo90791n() {
        return ErrorUtils.m93891a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f66513b);
        sb.append(')');
        sb.append(mo90857H0() ? "?" : "");
        return sb.toString();
    }

    public CapturedType(@NotNull TypeProjection typeProjection, @NotNull CapturedTypeConstructor capturedTypeConstructor, boolean z, @NotNull TypeAttributes typeAttributes) {
        typeProjection.getClass();
        capturedTypeConstructor.getClass();
        typeAttributes.getClass();
        this.f66513b = typeProjection;
        this.f66514c = capturedTypeConstructor;
        this.f66515d = z;
        this.f66516e = typeAttributes;
    }
}
