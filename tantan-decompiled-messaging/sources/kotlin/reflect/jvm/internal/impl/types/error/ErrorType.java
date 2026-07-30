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
    public final TypeConstructor f66328b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final MemberScope f66329c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ErrorTypeKind f66330d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<TypeProjection> f66331e;

    /* JADX INFO: renamed from: f */
    public final boolean f66332f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final String[] f66333g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final String f66334h;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ErrorType(@NotNull TypeConstructor typeConstructor, @NotNull MemberScope memberScope, @NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull String... strArr) {
        typeConstructor.getClass();
        memberScope.getClass();
        errorTypeKind.getClass();
        list.getClass();
        strArr.getClass();
        this.f66328b = typeConstructor;
        this.f66329c = memberScope;
        this.f66330d = errorTypeKind;
        this.f66331e = list;
        this.f66332f = z;
        this.f66333g = strArr;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f66334h = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo91888E0() {
        return this.f66331e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo91889F0() {
        return TypeAttributes.Companion.m92709k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo91890G0() {
        return this.f66328b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return this.f66332f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo89967N0(boolean z) {
        TypeConstructor typeConstructorMo91890G0 = mo91890G0();
        MemberScope memberScopeMo89900n = mo89900n();
        ErrorTypeKind errorTypeKind = this.f66330d;
        List<TypeProjection> listMo91888E0 = mo91888E0();
        String[] strArr = this.f66333g;
        return new ErrorType(typeConstructorMo91890G0, memberScopeMo89900n, errorTypeKind, listMo91888E0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final String m92994P0() {
        return this.f66334h;
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public final ErrorTypeKind m92995Q0() {
        return this.f66330d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public ErrorType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public final ErrorType m92997S0(@NotNull List<? extends TypeProjection> list) {
        list.getClass();
        TypeConstructor typeConstructorMo91890G0 = mo91890G0();
        MemberScope memberScopeMo89900n = mo89900n();
        ErrorTypeKind errorTypeKind = this.f66330d;
        boolean zMo89966H0 = mo89966H0();
        String[] strArr = this.f66333g;
        return new ErrorType(typeConstructorMo91890G0, memberScopeMo89900n, errorTypeKind, list, zMo89966H0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89900n() {
        return this.f66329c;
    }

    public /* synthetic */ ErrorType(TypeConstructor typeConstructor, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeConstructor, memberScope, errorTypeKind, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? false : z, strArr);
    }
}
