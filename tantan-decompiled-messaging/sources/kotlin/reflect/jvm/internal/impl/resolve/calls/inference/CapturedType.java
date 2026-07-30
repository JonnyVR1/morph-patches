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
    public final TypeProjection f65839b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final CapturedTypeConstructor f65840c;

    /* JADX INFO: renamed from: d */
    public final boolean f65841d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TypeAttributes f65842e;

    public /* synthetic */ CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z, TypeAttributes typeAttributes, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? new CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructor, (i & 4) != 0 ? false : z, (i & 8) != 0 ? TypeAttributes.Companion.m92709k() : typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo91888E0() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo91889F0() {
        return this.f65842e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return this.f65841d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new CapturedType(this.f65839b, mo91890G0(), mo89966H0(), typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public CapturedTypeConstructor mo91890G0() {
        return this.f65840c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public CapturedType mo89967N0(boolean z) {
        return z == mo89966H0() ? this : new CapturedType(this.f65839b, mo91890G0(), z, mo91889F0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public CapturedType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        TypeProjection typeProjectionMo92665a = this.f65839b.mo92665a(kotlinTypeRefiner);
        typeProjectionMo92665a.getClass();
        return new CapturedType(typeProjectionMo92665a, mo91890G0(), mo89966H0(), mo91889F0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89900n() {
        return ErrorUtils.m93000a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f65839b);
        sb.append(')');
        sb.append(mo89966H0() ? "?" : "");
        return sb.toString();
    }

    public CapturedType(@NotNull TypeProjection typeProjection, @NotNull CapturedTypeConstructor capturedTypeConstructor, boolean z, @NotNull TypeAttributes typeAttributes) {
        typeProjection.getClass();
        capturedTypeConstructor.getClass();
        typeAttributes.getClass();
        this.f65839b = typeProjection;
        this.f65840c = capturedTypeConstructor;
        this.f65841d = z;
        this.f65842e = typeAttributes;
    }
}
