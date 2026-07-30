package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerStateKt;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.o760;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public final class OverridingUtilTypeSystemContext implements ClassicTypeSystemContext {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Map<TypeConstructor, TypeConstructor> f66505a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KotlinTypeChecker.TypeConstructorEquality f66506b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinTypeRefiner f66507c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final KotlinTypePreparator f66508d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Function2<KotlinType, KotlinType, Boolean> f66509e;

    /* JADX WARN: Multi-variable type inference failed */
    public OverridingUtilTypeSystemContext(@Nullable Map<TypeConstructor, ? extends TypeConstructor> map, @NotNull KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, @NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypePreparator kotlinTypePreparator, @Nullable Function2<? super KotlinType, ? super KotlinType, Boolean> function2) {
        typeConstructorEquality.getClass();
        kotlinTypeRefiner.getClass();
        kotlinTypePreparator.getClass();
        this.f66505a = map;
        this.f66506b = typeConstructorEquality;
        this.f66507c = kotlinTypeRefiner;
        this.f66508d = kotlinTypePreparator;
        this.f66509e = function2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: A */
    public /* bridge */ boolean mo91088A(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93728P(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: A0 */
    public /* bridge */ boolean mo91089A0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93750f0(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: B */
    public /* bridge */ boolean mo91090B(@NotNull RigidTypeMarker rigidTypeMarker) {
        return m92755c1(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: B0 */
    public /* bridge */ boolean mo91091B0(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93736X(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: C */
    public /* bridge */ boolean mo91092C(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92759g1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: C0 */
    public /* bridge */ int mo91093C0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93766n0(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: D */
    public /* bridge */ List<KotlinTypeMarker> mo91094D(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93714B(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    /* JADX INFO: renamed from: D0 */
    public /* bridge */ PrimitiveType mo91095D0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93777t(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: E */
    public /* bridge */ KotlinTypeMarker mo91096E(@NotNull TypeSubstitutorMarker typeSubstitutorMarker, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93772q0(this, typeSubstitutorMarker, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public /* bridge */ SimpleTypeMarker mo91097E0() {
        return ClassicTypeSystemContext.DefaultImpls.m93762l0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: F */
    public /* bridge */ TypeConstructorMarker mo91098F(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93785x(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public /* bridge */ Collection<KotlinTypeMarker> mo91099F0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93776s0(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: G */
    public /* bridge */ SimpleTypeMarker mo91100G(@NotNull RigidTypeMarker rigidTypeMarker) {
        return m92766n1(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: G0 */
    public /* bridge */ boolean mo91101G0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92753a1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: H */
    public /* bridge */ CapturedTypeMarker mo91102H(@NotNull RigidTypeMarker rigidTypeMarker) {
        return m92749W0(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: H0 */
    public /* bridge */ FqNameUnsafe mo91103H0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93771q(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: I */
    public /* bridge */ KotlinTypeMarker mo91104I(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.m93763m(this, rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: I0 */
    public /* bridge */ KotlinTypeMarker mo91105I0(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
        return ClassicTypeSystemContext.DefaultImpls.m93758j0(this, kotlinTypeMarker, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: J */
    public /* bridge */ KotlinTypeMarker mo91106J(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93781v(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public /* bridge */ KotlinTypeMarker mo91107J0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92764l1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: K */
    public /* bridge */ boolean mo91108K(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93733U(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: K0 */
    public /* bridge */ List<SimpleTypeMarker> mo91109K0(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker) {
        return m92750X0(rigidTypeMarker, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: L */
    public /* bridge */ Collection<KotlinTypeMarker> mo91110L(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93768o0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    /* JADX INFO: renamed from: L0 */
    public /* bridge */ KotlinTypeMarker mo91111L0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93713A(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: M */
    public /* bridge */ boolean mo91112M(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93735W(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public /* bridge */ List<TypeParameterMarker> mo91113M0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93775s(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: N */
    public /* bridge */ boolean mo91114N(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92758f1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: N0 */
    public /* bridge */ boolean mo91115N0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92762j1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: O */
    public /* bridge */ TypeConstructorMarker mo91116O(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92768p1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: O0 */
    public /* bridge */ TypeParameterMarker mo91117O0(@NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93787y(this, typeVariableTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: P */
    public /* bridge */ boolean mo91118P(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93725M(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: P0 */
    public /* bridge */ boolean mo91119P0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93731S(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: Q */
    public /* bridge */ TypeCheckerState.SupertypesPolicy mo91120Q(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93774r0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: Q0 */
    public /* bridge */ boolean mo91121Q0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93724L(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: R */
    public /* bridge */ boolean mo91122R(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92756d1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: R0 */
    public /* bridge */ DynamicTypeMarker mo91123R0(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93751g(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: S */
    public /* bridge */ boolean mo91124S(@NotNull RigidTypeMarker rigidTypeMarker) {
        return m92761i1(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: S0 */
    public boolean mo91125S0(@NotNull TypeConstructorMarker typeConstructorMarker, @NotNull TypeConstructorMarker typeConstructorMarker2) {
        typeConstructorMarker.getClass();
        typeConstructorMarker2.getClass();
        if (!(typeConstructorMarker instanceof TypeConstructor)) {
            wg3.m206174a("Failed requirement.");
            return false;
        }
        if (typeConstructorMarker2 instanceof TypeConstructor) {
            return ClassicTypeSystemContext.DefaultImpls.m93739a(this, typeConstructorMarker, typeConstructorMarker2) || m92747U0((TypeConstructor) typeConstructorMarker, (TypeConstructor) typeConstructorMarker2);
        }
        wg3.m206174a("Failed requirement.");
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: T */
    public /* bridge */ FlexibleTypeMarker mo91126T(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93753h(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: U */
    public /* bridge */ CaptureStatus mo91128U(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93761l(this, capturedTypeMarker);
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m92747U0(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        if (this.f66506b.mo92739a(typeConstructor, typeConstructor2)) {
            return true;
        }
        Map<TypeConstructor, TypeConstructor> map = this.f66505a;
        if (map == null) {
            return false;
        }
        TypeConstructor typeConstructor3 = map.get(typeConstructor);
        TypeConstructor typeConstructor4 = this.f66505a.get(typeConstructor2);
        return (typeConstructor3 != null && Intrinsics.m88377d(typeConstructor3, typeConstructor2)) || (typeConstructor4 != null && Intrinsics.m88377d(typeConstructor4, typeConstructor));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: V */
    public /* bridge */ TypeArgumentMarker mo91129V(@NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93770p0(this, capturedTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public /* bridge */ SimpleType mo91151i0(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull CaptureStatus captureStatus) {
        return ClassicTypeSystemContext.DefaultImpls.m93759k(this, rigidTypeMarker, captureStatus);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: W */
    public /* bridge */ KotlinTypeMarker mo91130W(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93756i0(this, capturedTypeMarker);
    }

    @Nullable
    /* JADX INFO: renamed from: W0 */
    public CapturedTypeMarker m92749W0(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return mo91138c(mo91100G(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: X */
    public /* bridge */ boolean mo91131X(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93723K(this, typeConstructorMarker);
    }

    @Nullable
    /* JADX INFO: renamed from: X0 */
    public List<SimpleTypeMarker> m92750X0(RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: Y */
    public /* bridge */ boolean mo91132Y(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93729Q(this, typeConstructorMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: Y0 */
    public TypeArgumentMarker m92751Y0(TypeArgumentListMarker typeArgumentListMarker, int i) {
        typeArgumentListMarker.getClass();
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return mo91177v0((KotlinTypeMarker) typeArgumentListMarker, i);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i);
            typeArgumentMarker.getClass();
            return typeArgumentMarker;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(typeArgumentListMarker);
        o760.m166301a(sb, Reflection.m88396b(typeArgumentListMarker.getClass()));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: Z */
    public /* bridge */ SimpleTypeMarker mo91133Z(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93743c(this, kotlinTypeMarker);
    }

    @Nullable
    /* JADX INFO: renamed from: Z0 */
    public TypeArgumentMarker m92752Z0(RigidTypeMarker rigidTypeMarker, int i) {
        rigidTypeMarker.getClass();
        if (i < 0 || i >= mo91154k(rigidTypeMarker)) {
            return null;
        }
        return mo91177v0(rigidTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: a */
    public /* bridge */ boolean mo91134a(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93744c0(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public /* bridge */ RigidTypeMarker mo91135a0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92763k1(kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m92753a1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return mo91119P0(mo91135a0(kotlinTypeMarker)) != mo91119P0(mo91174u(kotlinTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: b */
    public /* bridge */ TypeConstructorMarker mo91136b(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93780u0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: b0 */
    public /* bridge */ TypeVariance mo91137b0(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93715C(this, typeArgumentMarker);
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m92754b1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
        return (rigidTypeMarkerMo91142e != null ? mo91102H(rigidTypeMarkerMo91142e) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: c */
    public /* bridge */ CapturedTypeMarker mo91138c(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93747e(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ boolean mo91139c0(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName) {
        return ClassicTypeSystemContext.DefaultImpls.m93717E(this, kotlinTypeMarker, fqName);
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m92755c1(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return mo91131X(mo91136b(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: d0 */
    public /* bridge */ DefinitelyNotNullTypeMarker mo91141d0(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93749f(this, rigidTypeMarker);
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m92756d1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
        return (rigidTypeMarkerMo91142e != null ? mo91141d0(rigidTypeMarkerMo91142e) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext
    @NotNull
    /* JADX INFO: renamed from: e0 */
    public TypeCheckerState mo91143e0(final boolean z, final boolean z2, final boolean z3) {
        if (this.f66509e == null) {
            return ClassicTypeCheckerStateKt.m93711a(z, z2, this, this.f66508d, this.f66507c);
        }
        final KotlinTypePreparator kotlinTypePreparator = this.f66508d;
        final KotlinTypeRefiner kotlinTypeRefiner = this.f66507c;
        return new TypeCheckerState(z, z2, z3, this, kotlinTypePreparator, kotlinTypeRefiner) { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilTypeSystemContext$newTypeCheckerState$1

            /* JADX INFO: renamed from: l */
            public final /* synthetic */ OverridingUtilTypeSystemContext f66510l;

            {
                this.f66510l = this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
            /* JADX INFO: renamed from: f */
            public boolean mo92770f(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
                kotlinTypeMarker.getClass();
                kotlinTypeMarker2.getClass();
                if (!(kotlinTypeMarker instanceof KotlinType)) {
                    wg3.m206174a("Failed requirement.");
                    return false;
                }
                if (kotlinTypeMarker2 instanceof KotlinType) {
                    return ((Boolean) this.f66510l.f66509e.invoke(kotlinTypeMarker, kotlinTypeMarker2)).booleanValue();
                }
                wg3.m206174a("Failed requirement.");
                return false;
            }
        };
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m92757e1(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return mo91141d0(rigidTypeMarker) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: f */
    public /* bridge */ KotlinBuiltIns mo91144f() {
        return ClassicTypeSystemContext.DefaultImpls.m93769p(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: f0 */
    public /* bridge */ KotlinTypeMarker mo91145f0(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93783w(this, typeArgumentMarker);
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m92758f1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        FlexibleTypeMarker flexibleTypeMarkerMo91126T = mo91126T(kotlinTypeMarker);
        return (flexibleTypeMarkerMo91126T != null ? mo91123R0(flexibleTypeMarkerMo91126T) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: g */
    public /* bridge */ boolean mo91146g(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93740a0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: g0 */
    public /* bridge */ KotlinTypeMarker mo91147g0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92765m1(kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m92759g1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return mo91126T(kotlinTypeMarker) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: h0 */
    public /* bridge */ boolean mo91149h0(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93737Y(this, capturedTypeMarker);
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m92760h1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return !Intrinsics.m88377d(mo91136b(mo91135a0(kotlinTypeMarker)), mo91136b(mo91174u(kotlinTypeMarker)));
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m92761i1(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return mo91088A(mo91136b(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    /* JADX INFO: renamed from: j */
    public /* bridge */ boolean mo91152j(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93752g0(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: j0 */
    public /* bridge */ boolean mo91153j0(@NotNull TypeParameterMarker typeParameterMarker, @Nullable TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93718F(this, typeParameterMarker, typeConstructorMarker);
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m92762j1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return mo91108K(mo91116O(kotlinTypeMarker)) && !mo91183y0(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: k */
    public /* bridge */ int mo91154k(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93741b(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: k0 */
    public /* bridge */ TypeArgumentListMarker mo91155k0(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93745d(this, rigidTypeMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: k1 */
    public RigidTypeMarker m92763k1(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerMo91148h;
        kotlinTypeMarker.getClass();
        FlexibleTypeMarker flexibleTypeMarkerMo91126T = mo91126T(kotlinTypeMarker);
        if (flexibleTypeMarkerMo91126T != null && (rigidTypeMarkerMo91148h = mo91148h(flexibleTypeMarkerMo91126T)) != null) {
            return rigidTypeMarkerMo91148h;
        }
        RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
        rigidTypeMarkerMo91142e.getClass();
        return rigidTypeMarkerMo91142e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: l */
    public /* bridge */ boolean mo91156l(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92760h1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: l0 */
    public /* bridge */ boolean mo91157l0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92754b1(kotlinTypeMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: l1 */
    public KotlinTypeMarker m92764l1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return mo91105I0(kotlinTypeMarker, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: m */
    public /* bridge */ boolean mo91158m(@NotNull RigidTypeMarker rigidTypeMarker) {
        return m92757e1(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public /* bridge */ TypeParameterMarker mo91159m0(@NotNull TypeConstructorMarker typeConstructorMarker, int i) {
        return ClassicTypeSystemContext.DefaultImpls.m93773r(this, typeConstructorMarker, i);
    }

    @NotNull
    /* JADX INFO: renamed from: m1 */
    public KotlinTypeMarker m92765m1(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerMo91140d;
        kotlinTypeMarker.getClass();
        RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
        return (rigidTypeMarkerMo91142e == null || (rigidTypeMarkerMo91140d = mo91140d(rigidTypeMarkerMo91142e, true)) == null) ? kotlinTypeMarker : rigidTypeMarkerMo91140d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: n */
    public /* bridge */ TypeArgumentMarker mo91160n(@NotNull RigidTypeMarker rigidTypeMarker, int i) {
        return m92752Z0(rigidTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public /* bridge */ TypeParameterMarker mo91161n0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93789z(this, typeConstructorMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public SimpleTypeMarker m92766n1(RigidTypeMarker rigidTypeMarker) {
        SimpleTypeMarker simpleTypeMarkerMo91166q;
        rigidTypeMarker.getClass();
        DefinitelyNotNullTypeMarker definitelyNotNullTypeMarkerMo91141d0 = mo91141d0(rigidTypeMarker);
        return (definitelyNotNullTypeMarkerMo91141d0 == null || (simpleTypeMarkerMo91166q = mo91166q(definitelyNotNullTypeMarkerMo91141d0)) == null) ? (SimpleTypeMarker) rigidTypeMarker : simpleTypeMarkerMo91166q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: o */
    public /* bridge */ TypeArgumentMarker mo91162o(@NotNull TypeArgumentListMarker typeArgumentListMarker, int i) {
        return m92751Y0(typeArgumentListMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: o0 */
    public /* bridge */ boolean mo91163o0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93732T(this, kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: o1 */
    public int m92767o1(TypeArgumentListMarker typeArgumentListMarker) {
        typeArgumentListMarker.getClass();
        if (typeArgumentListMarker instanceof RigidTypeMarker) {
            return mo91154k((KotlinTypeMarker) typeArgumentListMarker);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            return ((ArgumentList) typeArgumentListMarker).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(typeArgumentListMarker);
        o760.m166301a(sb, Reflection.m88396b(typeArgumentListMarker.getClass()));
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: p */
    public /* bridge */ KotlinTypeMarker mo91164p(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
        return ClassicTypeSystemContext.DefaultImpls.m93786x0(this, kotlinTypeMarker, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: p0 */
    public /* bridge */ TypeVariance mo91165p0(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93716D(this, typeParameterMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: p1 */
    public TypeConstructorMarker m92768p1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
        if (rigidTypeMarkerMo91142e == null) {
            rigidTypeMarkerMo91142e = mo91135a0(kotlinTypeMarker);
        }
        return mo91136b(rigidTypeMarkerMo91142e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: q */
    public /* bridge */ SimpleTypeMarker mo91166q(@NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93764m0(this, definitelyNotNullTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: q0 */
    public /* bridge */ int mo91167q0(@NotNull TypeArgumentListMarker typeArgumentListMarker) {
        return m92767o1(typeArgumentListMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: q1 */
    public RigidTypeMarker m92769q1(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerMo91150i;
        kotlinTypeMarker.getClass();
        FlexibleTypeMarker flexibleTypeMarkerMo91126T = mo91126T(kotlinTypeMarker);
        if (flexibleTypeMarkerMo91126T != null && (rigidTypeMarkerMo91150i = mo91150i(flexibleTypeMarkerMo91126T)) != null) {
            return rigidTypeMarkerMo91150i;
        }
        RigidTypeMarker rigidTypeMarkerMo91142e = mo91142e(kotlinTypeMarker);
        rigidTypeMarkerMo91142e.getClass();
        return rigidTypeMarkerMo91142e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: r */
    public /* bridge */ boolean mo91168r(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93738Z(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: r0 */
    public /* bridge */ List<TypeArgumentMarker> mo91169r0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93767o(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    /* JADX INFO: renamed from: s */
    public /* bridge */ boolean mo91170s(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93722J(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    /* JADX INFO: renamed from: s0 */
    public /* bridge */ boolean mo91171s0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93727O(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: t */
    public /* bridge */ KotlinTypeMarker mo91172t(@NotNull Collection<? extends KotlinTypeMarker> collection) {
        return ClassicTypeSystemContext.DefaultImpls.m93720H(this, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: t0 */
    public /* bridge */ TypeArgumentMarker mo91173t0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93757j(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: u */
    public /* bridge */ RigidTypeMarker mo91174u(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92769q1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: u0 */
    public /* bridge */ CapturedTypeConstructorMarker mo91175u0(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93778t0(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: v */
    public /* bridge */ boolean mo91176v(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93726N(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: v0 */
    public /* bridge */ TypeArgumentMarker mo91177v0(@NotNull KotlinTypeMarker kotlinTypeMarker, int i) {
        return ClassicTypeSystemContext.DefaultImpls.m93765n(this, kotlinTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext
    /* JADX INFO: renamed from: w */
    public /* bridge */ boolean mo91178w() {
        return ClassicTypeSystemContext.DefaultImpls.m93730R(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: w0 */
    public /* bridge */ TypeSubstitutorMarker mo91179w0(@NotNull Map<TypeConstructorMarker, ? extends KotlinTypeMarker> map) {
        return ClassicTypeSystemContext.DefaultImpls.m93782v0(this, map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: x */
    public /* bridge */ boolean mo91180x(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93746d0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    /* JADX INFO: renamed from: x0 */
    public /* bridge */ PrimitiveType mo91181x0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93779u(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: y */
    public /* bridge */ boolean mo91182y(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93748e0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: y0 */
    public /* bridge */ boolean mo91183y0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93734V(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: z */
    public /* bridge */ boolean mo91184z(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93721I(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    /* JADX INFO: renamed from: z0 */
    public /* bridge */ boolean mo91185z0(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.m93719G(this, rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: d */
    public /* bridge */ SimpleTypeMarker mo91140d(@NotNull RigidTypeMarker rigidTypeMarker, boolean z) {
        return ClassicTypeSystemContext.DefaultImpls.m93788y0(this, rigidTypeMarker, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: e */
    public /* bridge */ SimpleTypeMarker mo91142e(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93755i(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: h */
    public /* bridge */ SimpleTypeMarker mo91148h(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93754h0(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: i */
    public /* bridge */ SimpleTypeMarker mo91150i(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m93784w0(this, flexibleTypeMarker);
    }
}
