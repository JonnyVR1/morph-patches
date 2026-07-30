package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorType extends SimpleType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeConstructor f67002b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final MemberScope f67003c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ErrorTypeKind f67004d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<TypeProjection> f67005e;

    /* JADX INFO: renamed from: f */
    public final boolean f67006f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final String[] f67007g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final String f67008h;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ErrorType(@NotNull TypeConstructor typeConstructor, @NotNull MemberScope memberScope, @NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull String... strArr) {
        typeConstructor.getClass();
        memberScope.getClass();
        errorTypeKind.getClass();
        list.getClass();
        strArr.getClass();
        this.f67002b = typeConstructor;
        this.f67003c = memberScope;
        this.f67004d = errorTypeKind;
        this.f67005e = list;
        this.f67006f = z;
        this.f67007g = strArr;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f67008h = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo92779E0() {
        return this.f67005e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo92780F0() {
        return TypeAttributes.Companion.m93600k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo92781G0() {
        return this.f67002b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo90857H0() {
        return this.f67006f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo90858N0(boolean z) {
        TypeConstructor typeConstructorMo92781G0 = mo92781G0();
        MemberScope memberScopeMo90791n = mo90791n();
        ErrorTypeKind errorTypeKind = this.f67004d;
        List<TypeProjection> listMo92779E0 = mo92779E0();
        String[] strArr = this.f67007g;
        return new ErrorType(typeConstructorMo92781G0, memberScopeMo90791n, errorTypeKind, listMo92779E0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final String m93885P0() {
        return this.f67008h;
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public final ErrorTypeKind m93886Q0() {
        return this.f67004d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public ErrorType mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public final ErrorType m93888S0(@NotNull List<? extends TypeProjection> list) {
        list.getClass();
        TypeConstructor typeConstructorMo92781G0 = mo92781G0();
        MemberScope memberScopeMo90791n = mo90791n();
        ErrorTypeKind errorTypeKind = this.f67004d;
        boolean zMo90857H0 = mo90857H0();
        String[] strArr = this.f67007g;
        return new ErrorType(typeConstructorMo92781G0, memberScopeMo90791n, errorTypeKind, list, zMo90857H0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo90791n() {
        return this.f67003c;
    }

    public /* synthetic */ ErrorType(TypeConstructor typeConstructor, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeConstructor, memberScope, errorTypeKind, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? false : z, strArr);
    }
}
