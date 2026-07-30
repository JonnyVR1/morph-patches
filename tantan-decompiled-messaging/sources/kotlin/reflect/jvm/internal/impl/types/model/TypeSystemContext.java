package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeSystemContext extends TypeSystemOptimizationContext {
    /* JADX INFO: renamed from: A */
    boolean mo90197A(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: A0 */
    boolean mo90198A0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: B */
    boolean mo90199B(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: B0 */
    boolean mo90200B0(@NotNull SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: C */
    boolean mo90201C(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: C0 */
    int mo90202C0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: D */
    List<KotlinTypeMarker> mo90203D(@NotNull TypeParameterMarker typeParameterMarker);

    @NotNull
    /* JADX INFO: renamed from: E */
    KotlinTypeMarker mo90205E(@NotNull TypeSubstitutorMarker typeSubstitutorMarker, @NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: F */
    TypeConstructorMarker mo90207F(@NotNull TypeParameterMarker typeParameterMarker);

    @NotNull
    /* JADX INFO: renamed from: F0 */
    Collection<KotlinTypeMarker> mo90208F0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: G */
    SimpleTypeMarker mo90209G(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: G0 */
    boolean mo90210G0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: H */
    CapturedTypeMarker mo90211H(@NotNull RigidTypeMarker rigidTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: I0 */
    KotlinTypeMarker mo90214I0(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z);

    @NotNull
    /* JADX INFO: renamed from: J0 */
    KotlinTypeMarker mo90216J0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: K */
    boolean mo90217K(@NotNull TypeConstructorMarker typeConstructorMarker);

    @Nullable
    /* JADX INFO: renamed from: K0 */
    List<SimpleTypeMarker> mo90218K0(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: L */
    Collection<KotlinTypeMarker> mo90219L(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: M */
    boolean mo90221M(@NotNull CapturedTypeMarker capturedTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: M0 */
    List<TypeParameterMarker> mo90222M0(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: N */
    boolean mo90223N(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: N0 */
    boolean mo90224N0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: O */
    TypeConstructorMarker mo90225O(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: O0 */
    TypeParameterMarker mo90226O0(@NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker);

    /* JADX INFO: renamed from: P */
    boolean mo90227P(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: P0 */
    boolean mo90228P0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: Q */
    TypeCheckerState.SupertypesPolicy mo90229Q(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: Q0 */
    boolean mo90230Q0(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: R */
    boolean mo90231R(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: R0 */
    DynamicTypeMarker mo90232R0(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    /* JADX INFO: renamed from: S */
    boolean mo90233S(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: S0 */
    boolean mo90234S0(@NotNull TypeConstructorMarker typeConstructorMarker, @NotNull TypeConstructorMarker typeConstructorMarker2);

    @Nullable
    /* JADX INFO: renamed from: T */
    FlexibleTypeMarker mo90235T(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: U */
    CaptureStatus mo90237U(@NotNull CapturedTypeMarker capturedTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: V */
    TypeArgumentMarker mo90238V(@NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker);

    @Nullable
    /* JADX INFO: renamed from: W */
    KotlinTypeMarker mo90239W(@NotNull CapturedTypeMarker capturedTypeMarker);

    /* JADX INFO: renamed from: X */
    boolean mo90240X(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: Y */
    boolean mo90241Y(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: a */
    boolean mo90243a(@NotNull TypeArgumentMarker typeArgumentMarker);

    @NotNull
    /* JADX INFO: renamed from: a0 */
    RigidTypeMarker mo90244a0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: b */
    TypeConstructorMarker mo90245b(@NotNull RigidTypeMarker rigidTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: b0 */
    TypeVariance mo90246b0(@NotNull TypeArgumentMarker typeArgumentMarker);

    @Nullable
    /* JADX INFO: renamed from: c */
    CapturedTypeMarker mo90247c(@NotNull SimpleTypeMarker simpleTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: d */
    RigidTypeMarker mo90249d(@NotNull RigidTypeMarker rigidTypeMarker, boolean z);

    @Nullable
    /* JADX INFO: renamed from: d0 */
    DefinitelyNotNullTypeMarker mo90250d0(@NotNull RigidTypeMarker rigidTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: e */
    RigidTypeMarker mo90251e(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: f0 */
    KotlinTypeMarker mo90254f0(@NotNull TypeArgumentMarker typeArgumentMarker);

    /* JADX INFO: renamed from: g */
    boolean mo90255g(@NotNull RigidTypeMarker rigidTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: h */
    RigidTypeMarker mo90257h(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    /* JADX INFO: renamed from: h0 */
    boolean mo90258h0(@NotNull CapturedTypeMarker capturedTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: i */
    RigidTypeMarker mo90259i(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: i0 */
    RigidTypeMarker mo90260i0(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull CaptureStatus captureStatus);

    /* JADX INFO: renamed from: j0 */
    boolean mo90262j0(@NotNull TypeParameterMarker typeParameterMarker, @Nullable TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: k */
    int mo90263k(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: k0 */
    TypeArgumentListMarker mo90264k0(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: l */
    boolean mo90265l(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: l0 */
    boolean mo90266l0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: m */
    boolean mo90267m(@NotNull RigidTypeMarker rigidTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: m0 */
    TypeParameterMarker mo90268m0(@NotNull TypeConstructorMarker typeConstructorMarker, int i);

    @Nullable
    /* JADX INFO: renamed from: n */
    TypeArgumentMarker mo90269n(@NotNull RigidTypeMarker rigidTypeMarker, int i);

    @Nullable
    /* JADX INFO: renamed from: n0 */
    TypeParameterMarker mo90270n0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: o */
    TypeArgumentMarker mo90271o(@NotNull TypeArgumentListMarker typeArgumentListMarker, int i);

    /* JADX INFO: renamed from: o0 */
    boolean mo90272o0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: p */
    KotlinTypeMarker mo90273p(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z);

    @NotNull
    /* JADX INFO: renamed from: p0 */
    TypeVariance mo90274p0(@NotNull TypeParameterMarker typeParameterMarker);

    @NotNull
    /* JADX INFO: renamed from: q */
    SimpleTypeMarker mo90275q(@NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker);

    /* JADX INFO: renamed from: q0 */
    int mo90276q0(@NotNull TypeArgumentListMarker typeArgumentListMarker);

    /* JADX INFO: renamed from: r */
    boolean mo90277r(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: r0 */
    List<TypeArgumentMarker> mo90278r0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: t */
    KotlinTypeMarker mo90281t(@NotNull Collection<? extends KotlinTypeMarker> collection);

    @NotNull
    /* JADX INFO: renamed from: t0 */
    TypeArgumentMarker mo90282t0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: u */
    RigidTypeMarker mo90283u(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: u0 */
    CapturedTypeConstructorMarker mo90284u0(@NotNull CapturedTypeMarker capturedTypeMarker);

    /* JADX INFO: renamed from: v */
    boolean mo90285v(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: v0 */
    TypeArgumentMarker mo90286v0(@NotNull KotlinTypeMarker kotlinTypeMarker, int i);

    /* JADX INFO: renamed from: x */
    boolean mo90289x(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: y */
    boolean mo90291y(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: y0 */
    boolean mo90292y0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: z */
    boolean mo90293z(@NotNull TypeConstructorMarker typeConstructorMarker);
}
