package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeSystemContext extends TypeSystemOptimizationContext {
    /* JADX INFO: renamed from: A */
    boolean mo91088A(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: A0 */
    boolean mo91089A0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: B */
    boolean mo91090B(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: B0 */
    boolean mo91091B0(@NotNull SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: C */
    boolean mo91092C(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: C0 */
    int mo91093C0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: D */
    List<KotlinTypeMarker> mo91094D(@NotNull TypeParameterMarker typeParameterMarker);

    @NotNull
    /* JADX INFO: renamed from: E */
    KotlinTypeMarker mo91096E(@NotNull TypeSubstitutorMarker typeSubstitutorMarker, @NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: F */
    TypeConstructorMarker mo91098F(@NotNull TypeParameterMarker typeParameterMarker);

    @NotNull
    /* JADX INFO: renamed from: F0 */
    Collection<KotlinTypeMarker> mo91099F0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: G */
    SimpleTypeMarker mo91100G(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: G0 */
    boolean mo91101G0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: H */
    CapturedTypeMarker mo91102H(@NotNull RigidTypeMarker rigidTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: I0 */
    KotlinTypeMarker mo91105I0(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z);

    @NotNull
    /* JADX INFO: renamed from: J0 */
    KotlinTypeMarker mo91107J0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: K */
    boolean mo91108K(@NotNull TypeConstructorMarker typeConstructorMarker);

    @Nullable
    /* JADX INFO: renamed from: K0 */
    List<SimpleTypeMarker> mo91109K0(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: L */
    Collection<KotlinTypeMarker> mo91110L(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: M */
    boolean mo91112M(@NotNull CapturedTypeMarker capturedTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: M0 */
    List<TypeParameterMarker> mo91113M0(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: N */
    boolean mo91114N(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: N0 */
    boolean mo91115N0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: O */
    TypeConstructorMarker mo91116O(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: O0 */
    TypeParameterMarker mo91117O0(@NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker);

    /* JADX INFO: renamed from: P */
    boolean mo91118P(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: P0 */
    boolean mo91119P0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: Q */
    TypeCheckerState.SupertypesPolicy mo91120Q(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: Q0 */
    boolean mo91121Q0(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: R */
    boolean mo91122R(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: R0 */
    DynamicTypeMarker mo91123R0(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    /* JADX INFO: renamed from: S */
    boolean mo91124S(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: S0 */
    boolean mo91125S0(@NotNull TypeConstructorMarker typeConstructorMarker, @NotNull TypeConstructorMarker typeConstructorMarker2);

    @Nullable
    /* JADX INFO: renamed from: T */
    FlexibleTypeMarker mo91126T(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: U */
    CaptureStatus mo91128U(@NotNull CapturedTypeMarker capturedTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: V */
    TypeArgumentMarker mo91129V(@NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker);

    @Nullable
    /* JADX INFO: renamed from: W */
    KotlinTypeMarker mo91130W(@NotNull CapturedTypeMarker capturedTypeMarker);

    /* JADX INFO: renamed from: X */
    boolean mo91131X(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: Y */
    boolean mo91132Y(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: a */
    boolean mo91134a(@NotNull TypeArgumentMarker typeArgumentMarker);

    @NotNull
    /* JADX INFO: renamed from: a0 */
    RigidTypeMarker mo91135a0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: b */
    TypeConstructorMarker mo91136b(@NotNull RigidTypeMarker rigidTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: b0 */
    TypeVariance mo91137b0(@NotNull TypeArgumentMarker typeArgumentMarker);

    @Nullable
    /* JADX INFO: renamed from: c */
    CapturedTypeMarker mo91138c(@NotNull SimpleTypeMarker simpleTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: d */
    RigidTypeMarker mo91140d(@NotNull RigidTypeMarker rigidTypeMarker, boolean z);

    @Nullable
    /* JADX INFO: renamed from: d0 */
    DefinitelyNotNullTypeMarker mo91141d0(@NotNull RigidTypeMarker rigidTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: e */
    RigidTypeMarker mo91142e(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: f0 */
    KotlinTypeMarker mo91145f0(@NotNull TypeArgumentMarker typeArgumentMarker);

    /* JADX INFO: renamed from: g */
    boolean mo91146g(@NotNull RigidTypeMarker rigidTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: h */
    RigidTypeMarker mo91148h(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    /* JADX INFO: renamed from: h0 */
    boolean mo91149h0(@NotNull CapturedTypeMarker capturedTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: i */
    RigidTypeMarker mo91150i(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Nullable
    /* JADX INFO: renamed from: i0 */
    RigidTypeMarker mo91151i0(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull CaptureStatus captureStatus);

    /* JADX INFO: renamed from: j0 */
    boolean mo91153j0(@NotNull TypeParameterMarker typeParameterMarker, @Nullable TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: k */
    int mo91154k(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: k0 */
    TypeArgumentListMarker mo91155k0(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: l */
    boolean mo91156l(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: l0 */
    boolean mo91157l0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: m */
    boolean mo91158m(@NotNull RigidTypeMarker rigidTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: m0 */
    TypeParameterMarker mo91159m0(@NotNull TypeConstructorMarker typeConstructorMarker, int i);

    @Nullable
    /* JADX INFO: renamed from: n */
    TypeArgumentMarker mo91160n(@NotNull RigidTypeMarker rigidTypeMarker, int i);

    @Nullable
    /* JADX INFO: renamed from: n0 */
    TypeParameterMarker mo91161n0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: o */
    TypeArgumentMarker mo91162o(@NotNull TypeArgumentListMarker typeArgumentListMarker, int i);

    /* JADX INFO: renamed from: o0 */
    boolean mo91163o0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: p */
    KotlinTypeMarker mo91164p(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z);

    @NotNull
    /* JADX INFO: renamed from: p0 */
    TypeVariance mo91165p0(@NotNull TypeParameterMarker typeParameterMarker);

    @NotNull
    /* JADX INFO: renamed from: q */
    SimpleTypeMarker mo91166q(@NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker);

    /* JADX INFO: renamed from: q0 */
    int mo91167q0(@NotNull TypeArgumentListMarker typeArgumentListMarker);

    /* JADX INFO: renamed from: r */
    boolean mo91168r(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: r0 */
    List<TypeArgumentMarker> mo91169r0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: t */
    KotlinTypeMarker mo91172t(@NotNull Collection<? extends KotlinTypeMarker> collection);

    @NotNull
    /* JADX INFO: renamed from: t0 */
    TypeArgumentMarker mo91173t0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: u */
    RigidTypeMarker mo91174u(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: u0 */
    CapturedTypeConstructorMarker mo91175u0(@NotNull CapturedTypeMarker capturedTypeMarker);

    /* JADX INFO: renamed from: v */
    boolean mo91176v(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: v0 */
    TypeArgumentMarker mo91177v0(@NotNull KotlinTypeMarker kotlinTypeMarker, int i);

    /* JADX INFO: renamed from: x */
    boolean mo91180x(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: y */
    boolean mo91182y(@NotNull RigidTypeMarker rigidTypeMarker);

    /* JADX INFO: renamed from: y0 */
    boolean mo91183y0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: z */
    boolean mo91184z(@NotNull TypeConstructorMarker typeConstructorMarker);
}
