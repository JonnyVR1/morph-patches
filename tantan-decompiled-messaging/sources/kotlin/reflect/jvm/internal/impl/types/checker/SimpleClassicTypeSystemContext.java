package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
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
import p149l.jz50;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleClassicTypeSystemContext implements ClassicTypeSystemContext {

    @NotNull
    public static final SimpleClassicTypeSystemContext INSTANCE = new SimpleClassicTypeSystemContext();

    private SimpleClassicTypeSystemContext() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: A */
    public /* bridge */ boolean mo90197A(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92837P(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: A0 */
    public /* bridge */ boolean mo90198A0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92859f0(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: B */
    public /* bridge */ boolean mo90199B(@NotNull RigidTypeMarker rigidTypeMarker) {
        return m92954a1(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: B0 */
    public /* bridge */ boolean mo90200B0(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92845X(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: C */
    public /* bridge */ boolean mo90201C(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92958e1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: C0 */
    public /* bridge */ int mo90202C0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92875n0(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: D */
    public /* bridge */ List<KotlinTypeMarker> mo90203D(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92823B(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    /* JADX INFO: renamed from: D0 */
    public /* bridge */ PrimitiveType mo90204D0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92886t(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: E */
    public /* bridge */ KotlinTypeMarker mo90205E(@NotNull TypeSubstitutorMarker typeSubstitutorMarker, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92881q0(this, typeSubstitutorMarker, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public /* bridge */ SimpleTypeMarker mo90206E0() {
        return ClassicTypeSystemContext.DefaultImpls.m92871l0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: F */
    public /* bridge */ TypeConstructorMarker mo90207F(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92894x(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public /* bridge */ Collection<KotlinTypeMarker> mo90208F0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92885s0(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: G */
    public /* bridge */ SimpleTypeMarker mo90209G(@NotNull RigidTypeMarker rigidTypeMarker) {
        return m92965l1(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: G0 */
    public /* bridge */ boolean mo90210G0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92952Y0(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: H */
    public /* bridge */ CapturedTypeMarker mo90211H(@NotNull RigidTypeMarker rigidTypeMarker) {
        return m92948U0(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: H0 */
    public /* bridge */ FqNameUnsafe mo90212H0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92880q(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: I */
    public /* bridge */ KotlinTypeMarker mo90213I(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.m92872m(this, rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: I0 */
    public /* bridge */ KotlinTypeMarker mo90214I0(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
        return ClassicTypeSystemContext.DefaultImpls.m92867j0(this, kotlinTypeMarker, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: J */
    public /* bridge */ KotlinTypeMarker mo90215J(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92890v(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public /* bridge */ KotlinTypeMarker mo90216J0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92963j1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: K */
    public /* bridge */ boolean mo90217K(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92842U(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: K0 */
    public /* bridge */ List<SimpleTypeMarker> mo90218K0(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker) {
        return m92949V0(rigidTypeMarker, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: L */
    public /* bridge */ Collection<KotlinTypeMarker> mo90219L(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92877o0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    /* JADX INFO: renamed from: L0 */
    public /* bridge */ KotlinTypeMarker mo90220L0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92822A(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: M */
    public /* bridge */ boolean mo90221M(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92844W(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public /* bridge */ List<TypeParameterMarker> mo90222M0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92884s(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: N */
    public /* bridge */ boolean mo90223N(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92957d1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: N0 */
    public /* bridge */ boolean mo90224N0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92961h1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: O */
    public /* bridge */ TypeConstructorMarker mo90225O(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92967n1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: O0 */
    public /* bridge */ TypeParameterMarker mo90226O0(@NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92896y(this, typeVariableTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: P */
    public /* bridge */ boolean mo90227P(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92834M(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: P0 */
    public /* bridge */ boolean mo90228P0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92840S(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: Q */
    public /* bridge */ TypeCheckerState.SupertypesPolicy mo90229Q(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92883r0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: Q0 */
    public /* bridge */ boolean mo90230Q0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92833L(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: R */
    public /* bridge */ boolean mo90231R(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92955b1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: R0 */
    public /* bridge */ DynamicTypeMarker mo90232R0(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92860g(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: S */
    public /* bridge */ boolean mo90233S(@NotNull RigidTypeMarker rigidTypeMarker) {
        return m92960g1(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: S0 */
    public /* bridge */ boolean mo90234S0(@NotNull TypeConstructorMarker typeConstructorMarker, @NotNull TypeConstructorMarker typeConstructorMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.m92848a(this, typeConstructorMarker, typeConstructorMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: T */
    public /* bridge */ FlexibleTypeMarker mo90235T(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92862h(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public /* bridge */ SimpleType mo90260i0(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull CaptureStatus captureStatus) {
        return ClassicTypeSystemContext.DefaultImpls.m92868k(this, rigidTypeMarker, captureStatus);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: U */
    public /* bridge */ CaptureStatus mo90237U(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92870l(this, capturedTypeMarker);
    }

    @Nullable
    /* JADX INFO: renamed from: U0 */
    public CapturedTypeMarker m92948U0(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return mo90247c(mo90209G(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: V */
    public /* bridge */ TypeArgumentMarker mo90238V(@NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92879p0(this, capturedTypeConstructorMarker);
    }

    @Nullable
    /* JADX INFO: renamed from: V0 */
    public List<SimpleTypeMarker> m92949V0(RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: W */
    public /* bridge */ KotlinTypeMarker mo90239W(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92865i0(this, capturedTypeMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public TypeArgumentMarker m92950W0(TypeArgumentListMarker typeArgumentListMarker, int i) {
        typeArgumentListMarker.getClass();
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return mo90286v0((KotlinTypeMarker) typeArgumentListMarker, i);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i);
            typeArgumentMarker.getClass();
            return typeArgumentMarker;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(typeArgumentListMarker);
        jz50.m143888a(sb, Reflection.m87507b(typeArgumentListMarker.getClass()));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: X */
    public /* bridge */ boolean mo90240X(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92832K(this, typeConstructorMarker);
    }

    @Nullable
    /* JADX INFO: renamed from: X0 */
    public TypeArgumentMarker m92951X0(RigidTypeMarker rigidTypeMarker, int i) {
        rigidTypeMarker.getClass();
        if (i < 0 || i >= mo90263k(rigidTypeMarker)) {
            return null;
        }
        return mo90286v0(rigidTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: Y */
    public /* bridge */ boolean mo90241Y(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92838Q(this, typeConstructorMarker);
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m92952Y0(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return mo90228P0(mo90244a0(kotlinTypeMarker)) != mo90228P0(mo90283u(kotlinTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: Z */
    public /* bridge */ SimpleTypeMarker mo90242Z(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92852c(this, kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m92953Z0(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
        return (rigidTypeMarkerMo90251e != null ? mo90211H(rigidTypeMarkerMo90251e) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: a */
    public /* bridge */ boolean mo90243a(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92853c0(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public /* bridge */ RigidTypeMarker mo90244a0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92962i1(kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m92954a1(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return mo90240X(mo90245b(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: b */
    public /* bridge */ TypeConstructorMarker mo90245b(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92889u0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: b0 */
    public /* bridge */ TypeVariance mo90246b0(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92824C(this, typeArgumentMarker);
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m92955b1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
        return (rigidTypeMarkerMo90251e != null ? mo90250d0(rigidTypeMarkerMo90251e) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: c */
    public /* bridge */ CapturedTypeMarker mo90247c(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92856e(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ boolean mo90248c0(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName) {
        return ClassicTypeSystemContext.DefaultImpls.m92826E(this, kotlinTypeMarker, fqName);
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m92956c1(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return mo90250d0(rigidTypeMarker) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: d0 */
    public /* bridge */ DefinitelyNotNullTypeMarker mo90250d0(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92858f(this, rigidTypeMarker);
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m92957d1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        FlexibleTypeMarker flexibleTypeMarkerMo90235T = mo90235T(kotlinTypeMarker);
        return (flexibleTypeMarkerMo90235T != null ? mo90232R0(flexibleTypeMarkerMo90235T) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext
    @NotNull
    /* JADX INFO: renamed from: e0 */
    public /* bridge */ TypeCheckerState mo90252e0(boolean z, boolean z2, boolean z3) {
        return ClassicTypeSystemContext.DefaultImpls.m92869k0(this, z, z2, z3);
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m92958e1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return mo90235T(kotlinTypeMarker) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: f */
    public /* bridge */ KotlinBuiltIns mo90253f() {
        return ClassicTypeSystemContext.DefaultImpls.m92878p(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: f0 */
    public /* bridge */ KotlinTypeMarker mo90254f0(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92892w(this, typeArgumentMarker);
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m92959f1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return !Intrinsics.m87488d(mo90245b(mo90244a0(kotlinTypeMarker)), mo90245b(mo90283u(kotlinTypeMarker)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: g */
    public /* bridge */ boolean mo90255g(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92849a0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: g0 */
    public /* bridge */ KotlinTypeMarker mo90256g0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92964k1(kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m92960g1(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return mo90197A(mo90245b(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: h0 */
    public /* bridge */ boolean mo90258h0(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92846Y(this, capturedTypeMarker);
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m92961h1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return mo90217K(mo90225O(kotlinTypeMarker)) && !mo90292y0(kotlinTypeMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: i1 */
    public RigidTypeMarker m92962i1(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerMo90257h;
        kotlinTypeMarker.getClass();
        FlexibleTypeMarker flexibleTypeMarkerMo90235T = mo90235T(kotlinTypeMarker);
        if (flexibleTypeMarkerMo90235T != null && (rigidTypeMarkerMo90257h = mo90257h(flexibleTypeMarkerMo90235T)) != null) {
            return rigidTypeMarkerMo90257h;
        }
        RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
        rigidTypeMarkerMo90251e.getClass();
        return rigidTypeMarkerMo90251e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    /* JADX INFO: renamed from: j */
    public /* bridge */ boolean mo90261j(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92861g0(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: j0 */
    public /* bridge */ boolean mo90262j0(@NotNull TypeParameterMarker typeParameterMarker, @Nullable TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92827F(this, typeParameterMarker, typeConstructorMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: j1 */
    public KotlinTypeMarker m92963j1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return mo90214I0(kotlinTypeMarker, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: k */
    public /* bridge */ int mo90263k(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92850b(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: k0 */
    public /* bridge */ TypeArgumentListMarker mo90264k0(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92854d(this, rigidTypeMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: k1 */
    public KotlinTypeMarker m92964k1(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerMo90249d;
        kotlinTypeMarker.getClass();
        RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
        return (rigidTypeMarkerMo90251e == null || (rigidTypeMarkerMo90249d = mo90249d(rigidTypeMarkerMo90251e, true)) == null) ? kotlinTypeMarker : rigidTypeMarkerMo90249d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: l */
    public /* bridge */ boolean mo90265l(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92959f1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: l0 */
    public /* bridge */ boolean mo90266l0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92953Z0(kotlinTypeMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: l1 */
    public SimpleTypeMarker m92965l1(RigidTypeMarker rigidTypeMarker) {
        SimpleTypeMarker simpleTypeMarkerMo90275q;
        rigidTypeMarker.getClass();
        DefinitelyNotNullTypeMarker definitelyNotNullTypeMarkerMo90250d0 = mo90250d0(rigidTypeMarker);
        return (definitelyNotNullTypeMarkerMo90250d0 == null || (simpleTypeMarkerMo90275q = mo90275q(definitelyNotNullTypeMarkerMo90250d0)) == null) ? (SimpleTypeMarker) rigidTypeMarker : simpleTypeMarkerMo90275q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: m */
    public /* bridge */ boolean mo90267m(@NotNull RigidTypeMarker rigidTypeMarker) {
        return m92956c1(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public /* bridge */ TypeParameterMarker mo90268m0(@NotNull TypeConstructorMarker typeConstructorMarker, int i) {
        return ClassicTypeSystemContext.DefaultImpls.m92882r(this, typeConstructorMarker, i);
    }

    /* JADX INFO: renamed from: m1 */
    public int m92966m1(TypeArgumentListMarker typeArgumentListMarker) {
        typeArgumentListMarker.getClass();
        if (typeArgumentListMarker instanceof RigidTypeMarker) {
            return mo90263k((KotlinTypeMarker) typeArgumentListMarker);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            return ((ArgumentList) typeArgumentListMarker).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(typeArgumentListMarker);
        jz50.m143888a(sb, Reflection.m87507b(typeArgumentListMarker.getClass()));
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: n */
    public /* bridge */ TypeArgumentMarker mo90269n(@NotNull RigidTypeMarker rigidTypeMarker, int i) {
        return m92951X0(rigidTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public /* bridge */ TypeParameterMarker mo90270n0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92898z(this, typeConstructorMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public TypeConstructorMarker m92967n1(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
        if (rigidTypeMarkerMo90251e == null) {
            rigidTypeMarkerMo90251e = mo90244a0(kotlinTypeMarker);
        }
        return mo90245b(rigidTypeMarkerMo90251e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: o */
    public /* bridge */ TypeArgumentMarker mo90271o(@NotNull TypeArgumentListMarker typeArgumentListMarker, int i) {
        return m92950W0(typeArgumentListMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: o0 */
    public /* bridge */ boolean mo90272o0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92841T(this, kotlinTypeMarker);
    }

    @NotNull
    /* JADX INFO: renamed from: o1 */
    public RigidTypeMarker m92968o1(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerMo90259i;
        kotlinTypeMarker.getClass();
        FlexibleTypeMarker flexibleTypeMarkerMo90235T = mo90235T(kotlinTypeMarker);
        if (flexibleTypeMarkerMo90235T != null && (rigidTypeMarkerMo90259i = mo90259i(flexibleTypeMarkerMo90235T)) != null) {
            return rigidTypeMarkerMo90259i;
        }
        RigidTypeMarker rigidTypeMarkerMo90251e = mo90251e(kotlinTypeMarker);
        rigidTypeMarkerMo90251e.getClass();
        return rigidTypeMarkerMo90251e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: p */
    public /* bridge */ KotlinTypeMarker mo90273p(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
        return ClassicTypeSystemContext.DefaultImpls.m92895x0(this, kotlinTypeMarker, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: p0 */
    public /* bridge */ TypeVariance mo90274p0(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92825D(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: q */
    public /* bridge */ SimpleTypeMarker mo90275q(@NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92873m0(this, definitelyNotNullTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: q0 */
    public /* bridge */ int mo90276q0(@NotNull TypeArgumentListMarker typeArgumentListMarker) {
        return m92966m1(typeArgumentListMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: r */
    public /* bridge */ boolean mo90277r(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92847Z(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: r0 */
    public /* bridge */ List<TypeArgumentMarker> mo90278r0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92876o(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    /* JADX INFO: renamed from: s */
    public /* bridge */ boolean mo90279s(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92831J(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    /* JADX INFO: renamed from: s0 */
    public /* bridge */ boolean mo90280s0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92836O(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: t */
    public /* bridge */ KotlinTypeMarker mo90281t(@NotNull Collection<? extends KotlinTypeMarker> collection) {
        return ClassicTypeSystemContext.DefaultImpls.m92829H(this, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: t0 */
    public /* bridge */ TypeArgumentMarker mo90282t0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92866j(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: u */
    public /* bridge */ RigidTypeMarker mo90283u(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return m92968o1(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: u0 */
    public /* bridge */ CapturedTypeConstructorMarker mo90284u0(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92887t0(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: v */
    public /* bridge */ boolean mo90285v(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92835N(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: v0 */
    public /* bridge */ TypeArgumentMarker mo90286v0(@NotNull KotlinTypeMarker kotlinTypeMarker, int i) {
        return ClassicTypeSystemContext.DefaultImpls.m92874n(this, kotlinTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext
    /* JADX INFO: renamed from: w */
    public /* bridge */ boolean mo90287w() {
        return ClassicTypeSystemContext.DefaultImpls.m92839R(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    /* JADX INFO: renamed from: w0 */
    public /* bridge */ TypeSubstitutorMarker mo90288w0(@NotNull Map<TypeConstructorMarker, ? extends KotlinTypeMarker> map) {
        return ClassicTypeSystemContext.DefaultImpls.m92891v0(this, map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: x */
    public /* bridge */ boolean mo90289x(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92855d0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    /* JADX INFO: renamed from: x0 */
    public /* bridge */ PrimitiveType mo90290x0(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92888u(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: y */
    public /* bridge */ boolean mo90291y(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92857e0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: y0 */
    public /* bridge */ boolean mo90292y0(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92843V(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* JADX INFO: renamed from: z */
    public /* bridge */ boolean mo90293z(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92830I(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    /* JADX INFO: renamed from: z0 */
    public /* bridge */ boolean mo90294z0(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.m92828G(this, rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: d */
    public /* bridge */ SimpleTypeMarker mo90249d(@NotNull RigidTypeMarker rigidTypeMarker, boolean z) {
        return ClassicTypeSystemContext.DefaultImpls.m92897y0(this, rigidTypeMarker, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    /* JADX INFO: renamed from: e */
    public /* bridge */ SimpleTypeMarker mo90251e(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92864i(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: h */
    public /* bridge */ SimpleTypeMarker mo90257h(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92863h0(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    /* JADX INFO: renamed from: i */
    public /* bridge */ SimpleTypeMarker mo90259i(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m92893w0(this, flexibleTypeMarker);
    }
}
