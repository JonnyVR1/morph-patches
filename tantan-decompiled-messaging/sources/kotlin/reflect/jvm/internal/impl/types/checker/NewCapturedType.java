package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CaptureStatus f66300b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NewCapturedTypeConstructor f66301c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final UnwrappedType f66302d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TypeAttributes f66303e;

    /* JADX INFO: renamed from: f */
    public final boolean f66304f;

    /* JADX INFO: renamed from: g */
    public final boolean f66305g;

    public /* synthetic */ NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, TypeAttributes typeAttributes, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, (i & 8) != 0 ? TypeAttributes.Companion.m92709k() : typeAttributes, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
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
        return this.f66303e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return this.f66304f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new NewCapturedType(this.f66300b, mo91890G0(), this.f66302d, typeAttributes, mo89966H0(), this.f66305g);
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final CaptureStatus m92917P0() {
        return this.f66300b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor mo91890G0() {
        return this.f66301c;
    }

    @Nullable
    /* JADX INFO: renamed from: R0 */
    public final UnwrappedType m92919R0() {
        return this.f66302d;
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m92920S0() {
        return this.f66305g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public NewCapturedType mo89967N0(boolean z) {
        return new NewCapturedType(this.f66300b, mo91890G0(), this.f66302d, mo91889F0(), z, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public NewCapturedType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        CaptureStatus captureStatus = this.f66300b;
        NewCapturedTypeConstructor newCapturedTypeConstructorMo88677a = mo91890G0().mo88677a(kotlinTypeRefiner);
        UnwrappedType unwrappedType = this.f66302d;
        return new NewCapturedType(captureStatus, newCapturedTypeConstructorMo88677a, unwrappedType != null ? kotlinTypeRefiner.mo92559a(unwrappedType).mo92625J0() : null, mo91889F0(), mo89966H0(), false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89900n() {
        return ErrorUtils.m93000a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public NewCapturedType(@NotNull CaptureStatus captureStatus, @NotNull NewCapturedTypeConstructor newCapturedTypeConstructor, @Nullable UnwrappedType unwrappedType, @NotNull TypeAttributes typeAttributes, boolean z, boolean z2) {
        captureStatus.getClass();
        newCapturedTypeConstructor.getClass();
        typeAttributes.getClass();
        this.f66300b = captureStatus;
        this.f66301c = newCapturedTypeConstructor;
        this.f66302d = unwrappedType;
        this.f66303e = typeAttributes;
        this.f66304f = z;
        this.f66305g = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedType(@NotNull CaptureStatus captureStatus, @Nullable UnwrappedType unwrappedType, @NotNull TypeProjection typeProjection, @NotNull TypeParameterDescriptor typeParameterDescriptor) {
        this(captureStatus, new NewCapturedTypeConstructor(typeProjection, null, null, typeParameterDescriptor, 6, null), unwrappedType, null, false, false, 56, null);
        captureStatus.getClass();
        typeProjection.getClass();
        typeParameterDescriptor.getClass();
    }
}
