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
    public final CaptureStatus f66974b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NewCapturedTypeConstructor f66975c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final UnwrappedType f66976d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TypeAttributes f66977e;

    /* JADX INFO: renamed from: f */
    public final boolean f66978f;

    /* JADX INFO: renamed from: g */
    public final boolean f66979g;

    public /* synthetic */ NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, TypeAttributes typeAttributes, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, (i & 8) != 0 ? TypeAttributes.Companion.m93600k() : typeAttributes, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
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
        return this.f66977e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo90857H0() {
        return this.f66978f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new NewCapturedType(this.f66974b, mo92781G0(), this.f66976d, typeAttributes, mo90857H0(), this.f66979g);
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final CaptureStatus m93808P0() {
        return this.f66974b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor mo92781G0() {
        return this.f66975c;
    }

    @Nullable
    /* JADX INFO: renamed from: R0 */
    public final UnwrappedType m93810R0() {
        return this.f66976d;
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m93811S0() {
        return this.f66979g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public NewCapturedType mo90858N0(boolean z) {
        return new NewCapturedType(this.f66974b, mo92781G0(), this.f66976d, mo92780F0(), z, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public NewCapturedType mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        CaptureStatus captureStatus = this.f66974b;
        NewCapturedTypeConstructor newCapturedTypeConstructorMo89568a = mo92781G0().mo89568a(kotlinTypeRefiner);
        UnwrappedType unwrappedType = this.f66976d;
        return new NewCapturedType(captureStatus, newCapturedTypeConstructorMo89568a, unwrappedType != null ? kotlinTypeRefiner.mo93450a(unwrappedType).mo93516J0() : null, mo92780F0(), mo90857H0(), false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo90791n() {
        return ErrorUtils.m93891a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public NewCapturedType(@NotNull CaptureStatus captureStatus, @NotNull NewCapturedTypeConstructor newCapturedTypeConstructor, @Nullable UnwrappedType unwrappedType, @NotNull TypeAttributes typeAttributes, boolean z, boolean z2) {
        captureStatus.getClass();
        newCapturedTypeConstructor.getClass();
        typeAttributes.getClass();
        this.f66974b = captureStatus;
        this.f66975c = newCapturedTypeConstructor;
        this.f66976d = unwrappedType;
        this.f66977e = typeAttributes;
        this.f66978f = z;
        this.f66979g = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedType(@NotNull CaptureStatus captureStatus, @Nullable UnwrappedType unwrappedType, @NotNull TypeProjection typeProjection, @NotNull TypeParameterDescriptor typeParameterDescriptor) {
        this(captureStatus, new NewCapturedTypeConstructor(typeProjection, null, null, typeParameterDescriptor, 6, null), unwrappedType, null, false, false, 56, null);
        captureStatus.getClass();
        typeProjection.getClass();
        typeParameterDescriptor.getClass();
    }
}
