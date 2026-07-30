package kotlin.reflect.jvm.internal.impl.builtins;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardNames {

    /* JADX INFO: renamed from: A */
    @JvmField
    @NotNull
    public static final FqName f63799A;

    /* JADX INFO: renamed from: B */
    @JvmField
    @NotNull
    public static final FqName f63800B;

    /* JADX INFO: renamed from: C */
    @JvmField
    @NotNull
    public static final FqName f63801C;

    /* JADX INFO: renamed from: D */
    @JvmField
    @NotNull
    public static final FqName f63802D;

    /* JADX INFO: renamed from: E */
    @JvmField
    @NotNull
    public static final FqName f63803E;

    /* JADX INFO: renamed from: F */
    @JvmField
    @NotNull
    public static final FqName f63804F;

    /* JADX INFO: renamed from: G */
    @JvmField
    @NotNull
    public static final FqName f63805G;

    /* JADX INFO: renamed from: H */
    @JvmField
    @NotNull
    public static final FqName f63806H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public static final FqName f63807I;

    @NotNull
    public static final StandardNames INSTANCE = new StandardNames();

    /* JADX INFO: renamed from: J */
    @JvmField
    @NotNull
    public static final Set<FqName> f63808J;

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final Name f63809a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final Name f63810b;

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final Name f63811c;

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final Name f63812d;

    /* JADX INFO: renamed from: e */
    @JvmField
    @NotNull
    public static final Name f63813e;

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static final Name f63814f;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final String f63815g;

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final Name f63816h;

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public static final Name f63817i;

    /* JADX INFO: renamed from: j */
    @JvmField
    @NotNull
    public static final Name f63818j;

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final Name f63819k;

    /* JADX INFO: renamed from: l */
    @JvmField
    @NotNull
    public static final Name f63820l;

    /* JADX INFO: renamed from: m */
    @JvmField
    @NotNull
    public static final Name f63821m;

    /* JADX INFO: renamed from: n */
    @JvmField
    @NotNull
    public static final Name f63822n;

    /* JADX INFO: renamed from: o */
    @JvmField
    @NotNull
    public static final Name f63823o;

    /* JADX INFO: renamed from: p */
    @JvmField
    @NotNull
    public static final Name f63824p;

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final FqName f63825q;

    /* JADX INFO: renamed from: r */
    @JvmField
    @NotNull
    public static final FqName f63826r;

    /* JADX INFO: renamed from: s */
    @JvmField
    @NotNull
    public static final FqName f63827s;

    /* JADX INFO: renamed from: t */
    @JvmField
    @NotNull
    public static final FqName f63828t;

    /* JADX INFO: renamed from: u */
    @JvmField
    @NotNull
    public static final Name f63829u;

    /* JADX INFO: renamed from: v */
    @JvmField
    @NotNull
    public static final FqName f63830v;

    /* JADX INFO: renamed from: w */
    @JvmField
    @NotNull
    public static final FqName f63831w;

    /* JADX INFO: renamed from: x */
    @JvmField
    @NotNull
    public static final FqName f63832x;

    /* JADX INFO: renamed from: y */
    @JvmField
    @NotNull
    public static final List<String> f63833y;

    /* JADX INFO: renamed from: z */
    @JvmField
    @NotNull
    public static final Name f63834z;

    @SourceDebugExtension
    public static final class FqNames {

        /* JADX INFO: renamed from: A */
        @JvmField
        @NotNull
        public static final FqName f63835A;

        /* JADX INFO: renamed from: A0 */
        @JvmField
        @NotNull
        public static final FqName f63836A0;

        /* JADX INFO: renamed from: B */
        @JvmField
        @NotNull
        public static final FqName f63837B;

        /* JADX INFO: renamed from: B0 */
        @JvmField
        @NotNull
        public static final FqName f63838B0;

        /* JADX INFO: renamed from: C */
        @JvmField
        @NotNull
        public static final FqName f63839C;

        /* JADX INFO: renamed from: C0 */
        @JvmField
        @NotNull
        public static final ClassId f63840C0;

        /* JADX INFO: renamed from: D */
        @JvmField
        @NotNull
        public static final FqName f63841D;

        /* JADX INFO: renamed from: D0 */
        @JvmField
        @NotNull
        public static final ClassId f63842D0;

        /* JADX INFO: renamed from: E */
        @JvmField
        @NotNull
        public static final ClassId f63843E;

        /* JADX INFO: renamed from: E0 */
        @JvmField
        @NotNull
        public static final ClassId f63844E0;

        /* JADX INFO: renamed from: F */
        @JvmField
        @NotNull
        public static final FqName f63845F;

        /* JADX INFO: renamed from: F0 */
        @JvmField
        @NotNull
        public static final ClassId f63846F0;

        /* JADX INFO: renamed from: G */
        @JvmField
        @NotNull
        public static final FqName f63847G;

        /* JADX INFO: renamed from: G0 */
        @JvmField
        @NotNull
        public static final FqName f63848G0;

        /* JADX INFO: renamed from: H */
        @JvmField
        @NotNull
        public static final ClassId f63849H;

        /* JADX INFO: renamed from: H0 */
        @JvmField
        @NotNull
        public static final FqName f63850H0;

        /* JADX INFO: renamed from: I */
        @JvmField
        @NotNull
        public static final FqName f63851I;

        /* JADX INFO: renamed from: I0 */
        @JvmField
        @NotNull
        public static final FqName f63852I0;

        @NotNull
        public static final FqNames INSTANCE;

        /* JADX INFO: renamed from: J */
        @JvmField
        @NotNull
        public static final FqName f63853J;

        /* JADX INFO: renamed from: J0 */
        @JvmField
        @NotNull
        public static final FqName f63854J0;

        /* JADX INFO: renamed from: K */
        @JvmField
        @NotNull
        public static final FqName f63855K;

        /* JADX INFO: renamed from: K0 */
        @JvmField
        @NotNull
        public static final FqName f63856K0;

        /* JADX INFO: renamed from: L */
        @JvmField
        @NotNull
        public static final ClassId f63857L;

        /* JADX INFO: renamed from: L0 */
        @JvmField
        @NotNull
        public static final FqName f63858L0;

        /* JADX INFO: renamed from: M */
        @JvmField
        @NotNull
        public static final FqName f63859M;

        /* JADX INFO: renamed from: M0 */
        @JvmField
        @NotNull
        public static final FqName f63860M0;

        /* JADX INFO: renamed from: N */
        @JvmField
        @NotNull
        public static final ClassId f63861N;

        /* JADX INFO: renamed from: N0 */
        @JvmField
        @NotNull
        public static final FqName f63862N0;

        /* JADX INFO: renamed from: O */
        @JvmField
        @NotNull
        public static final FqName f63863O;

        /* JADX INFO: renamed from: O0 */
        @JvmField
        @NotNull
        public static final FqName f63864O0;

        /* JADX INFO: renamed from: P */
        @JvmField
        @NotNull
        public static final FqName f63865P;

        /* JADX INFO: renamed from: P0 */
        @JvmField
        @NotNull
        public static final FqName f63866P0;

        /* JADX INFO: renamed from: Q */
        @JvmField
        @NotNull
        public static final FqName f63867Q;

        /* JADX INFO: renamed from: Q0 */
        @JvmField
        @NotNull
        public static final FqName f63868Q0;

        /* JADX INFO: renamed from: R */
        @JvmField
        @NotNull
        public static final FqName f63869R;

        /* JADX INFO: renamed from: R0 */
        @JvmField
        @NotNull
        public static final Set<Name> f63870R0;

        /* JADX INFO: renamed from: S */
        @JvmField
        @NotNull
        public static final FqName f63871S;

        /* JADX INFO: renamed from: S0 */
        @JvmField
        @NotNull
        public static final Set<Name> f63872S0;

        /* JADX INFO: renamed from: T */
        @JvmField
        @NotNull
        public static final ClassId f63873T;

        /* JADX INFO: renamed from: T0 */
        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> f63874T0;

        /* JADX INFO: renamed from: U */
        @JvmField
        @NotNull
        public static final FqName f63875U;

        /* JADX INFO: renamed from: U0 */
        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> f63876U0;

        /* JADX INFO: renamed from: V */
        @JvmField
        @NotNull
        public static final FqName f63877V;

        /* JADX INFO: renamed from: W */
        @JvmField
        @NotNull
        public static final FqName f63878W;

        /* JADX INFO: renamed from: X */
        @JvmField
        @NotNull
        public static final FqName f63879X;

        /* JADX INFO: renamed from: Y */
        @JvmField
        @NotNull
        public static final FqName f63880Y;

        /* JADX INFO: renamed from: Z */
        @JvmField
        @NotNull
        public static final FqName f63881Z;

        /* JADX INFO: renamed from: a */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63882a;

        /* JADX INFO: renamed from: a0 */
        @JvmField
        @NotNull
        public static final FqName f63883a0;

        /* JADX INFO: renamed from: b */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63884b;

        /* JADX INFO: renamed from: b0 */
        @JvmField
        @NotNull
        public static final FqName f63885b0;

        /* JADX INFO: renamed from: c */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63886c;

        /* JADX INFO: renamed from: c0 */
        @JvmField
        @NotNull
        public static final FqName f63887c0;

        /* JADX INFO: renamed from: d */
        @JvmField
        @NotNull
        public static final FqName f63888d;

        /* JADX INFO: renamed from: d0 */
        @JvmField
        @NotNull
        public static final FqName f63889d0;

        /* JADX INFO: renamed from: e */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63890e;

        /* JADX INFO: renamed from: e0 */
        @JvmField
        @NotNull
        public static final FqName f63891e0;

        /* JADX INFO: renamed from: f */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63892f;

        /* JADX INFO: renamed from: f0 */
        @JvmField
        @NotNull
        public static final FqName f63893f0;

        /* JADX INFO: renamed from: g */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63894g;

        /* JADX INFO: renamed from: g0 */
        @JvmField
        @NotNull
        public static final FqName f63895g0;

        /* JADX INFO: renamed from: h */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63896h;

        /* JADX INFO: renamed from: h0 */
        @JvmField
        @NotNull
        public static final FqName f63897h0;

        /* JADX INFO: renamed from: i */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63898i;

        /* JADX INFO: renamed from: i0 */
        @JvmField
        @NotNull
        public static final FqName f63899i0;

        /* JADX INFO: renamed from: j */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63900j;

        /* JADX INFO: renamed from: j0 */
        @JvmField
        @NotNull
        public static final FqName f63901j0;

        /* JADX INFO: renamed from: k */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63902k;

        /* JADX INFO: renamed from: k0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63903k0;

        /* JADX INFO: renamed from: l */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63904l;

        /* JADX INFO: renamed from: l0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63905l0;

        /* JADX INFO: renamed from: m */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63906m;

        /* JADX INFO: renamed from: m0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63907m0;

        /* JADX INFO: renamed from: n */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63908n;

        /* JADX INFO: renamed from: n0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63909n0;

        /* JADX INFO: renamed from: o */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63910o;

        /* JADX INFO: renamed from: o0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63911o0;

        /* JADX INFO: renamed from: p */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63912p;

        /* JADX INFO: renamed from: p0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63913p0;

        /* JADX INFO: renamed from: q */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63914q;

        /* JADX INFO: renamed from: q0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63915q0;

        /* JADX INFO: renamed from: r */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63916r;

        /* JADX INFO: renamed from: r0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63917r0;

        /* JADX INFO: renamed from: s */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63918s;

        /* JADX INFO: renamed from: s0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63919s0;

        /* JADX INFO: renamed from: t */
        @JvmField
        @NotNull
        public static final FqName f63920t;

        /* JADX INFO: renamed from: t0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63921t0;

        /* JADX INFO: renamed from: u */
        @JvmField
        @NotNull
        public static final FqName f63922u;

        /* JADX INFO: renamed from: u0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63923u0;

        /* JADX INFO: renamed from: v */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63924v;

        /* JADX INFO: renamed from: v0 */
        @JvmField
        @NotNull
        public static final ClassId f63925v0;

        /* JADX INFO: renamed from: w */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63926w;

        /* JADX INFO: renamed from: w0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63927w0;

        /* JADX INFO: renamed from: x */
        @JvmField
        @NotNull
        public static final FqName f63928x;

        /* JADX INFO: renamed from: x0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f63929x0;

        /* JADX INFO: renamed from: y */
        @JvmField
        @NotNull
        public static final FqName f63930y;

        /* JADX INFO: renamed from: y0 */
        @JvmField
        @NotNull
        public static final FqName f63931y0;

        /* JADX INFO: renamed from: z */
        @JvmField
        @NotNull
        public static final FqName f63932z;

        /* JADX INFO: renamed from: z0 */
        @JvmField
        @NotNull
        public static final FqName f63933z0;

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            f63882a = fqNames.m88273e("Any");
            f63884b = fqNames.m88273e("Nothing");
            f63886c = fqNames.m88273e("Cloneable");
            f63888d = fqNames.m88272d("Suppress");
            f63890e = fqNames.m88273e("Unit");
            f63892f = fqNames.m88273e("CharSequence");
            f63894g = fqNames.m88273e("String");
            f63896h = fqNames.m88273e("Array");
            f63898i = fqNames.m88273e("Boolean");
            f63900j = fqNames.m88273e("Char");
            f63902k = fqNames.m88273e("Byte");
            f63904l = fqNames.m88273e("Short");
            f63906m = fqNames.m88273e("Int");
            f63908n = fqNames.m88273e("Long");
            f63910o = fqNames.m88273e("Float");
            f63912p = fqNames.m88273e("Double");
            f63914q = fqNames.m88273e("Number");
            f63916r = fqNames.m88273e("Enum");
            f63918s = fqNames.m88273e("Function");
            f63920t = fqNames.m88272d("Throwable");
            f63922u = fqNames.m88272d("Comparable");
            f63924v = fqNames.m88275g("IntRange");
            f63926w = fqNames.m88275g("LongRange");
            f63928x = fqNames.m88272d("Deprecated");
            f63930y = fqNames.m88272d("DeprecatedSinceKotlin");
            f63932z = fqNames.m88272d("DeprecationLevel");
            f63835A = fqNames.m88272d("ReplaceWith");
            f63837B = fqNames.m88272d("ExtensionFunctionType");
            f63839C = fqNames.m88272d("ContextFunctionTypeParams");
            FqName fqNameM88272d = fqNames.m88272d("ParameterName");
            f63841D = fqNameM88272d;
            ClassId.Companion companion = ClassId.Companion;
            f63843E = companion.m91045c(fqNameM88272d);
            f63845F = fqNames.m88272d("Annotation");
            FqName fqNameM88269a = fqNames.m88269a("Target");
            f63847G = fqNameM88269a;
            f63849H = companion.m91045c(fqNameM88269a);
            f63851I = fqNames.m88269a("AnnotationTarget");
            f63853J = fqNames.m88269a("AnnotationRetention");
            FqName fqNameM88269a2 = fqNames.m88269a("Retention");
            f63855K = fqNameM88269a2;
            f63857L = companion.m91045c(fqNameM88269a2);
            FqName fqNameM88269a3 = fqNames.m88269a("Repeatable");
            f63859M = fqNameM88269a3;
            f63861N = companion.m91045c(fqNameM88269a3);
            f63863O = fqNames.m88269a("MustBeDocumented");
            f63865P = fqNames.m88272d("UnsafeVariance");
            f63867Q = fqNames.m88272d("PublishedApi");
            f63869R = fqNames.m88274f("AccessibleLateinitPropertyLiteral");
            FqName fqName = new FqName("kotlin.internal.PlatformDependent");
            f63871S = fqName;
            f63873T = companion.m91045c(fqName);
            f63875U = fqNames.m88270b("Iterator");
            f63877V = fqNames.m88270b("Iterable");
            f63878W = fqNames.m88270b("Collection");
            f63879X = fqNames.m88270b("List");
            f63880Y = fqNames.m88270b("ListIterator");
            f63881Z = fqNames.m88270b("Set");
            FqName fqNameM88270b = fqNames.m88270b("Map");
            f63883a0 = fqNameM88270b;
            Name nameM91079i = Name.m91079i("Entry");
            nameM91079i.getClass();
            f63885b0 = fqNameM88270b.m91047b(nameM91079i);
            f63887c0 = fqNames.m88270b("MutableIterator");
            f63889d0 = fqNames.m88270b("MutableIterable");
            f63891e0 = fqNames.m88270b("MutableCollection");
            f63893f0 = fqNames.m88270b("MutableList");
            f63895g0 = fqNames.m88270b("MutableListIterator");
            f63897h0 = fqNames.m88270b("MutableSet");
            FqName fqNameM88270b2 = fqNames.m88270b("MutableMap");
            f63899i0 = fqNameM88270b2;
            Name nameM91079i2 = Name.m91079i("MutableEntry");
            nameM91079i2.getClass();
            f63901j0 = fqNameM88270b2.m91047b(nameM91079i2);
            f63903k0 = m88268h("KClass");
            f63905l0 = m88268h("KType");
            f63907m0 = m88268h("KCallable");
            f63909n0 = m88268h("KProperty0");
            f63911o0 = m88268h("KProperty1");
            f63913p0 = m88268h("KProperty2");
            f63915q0 = m88268h("KMutableProperty0");
            f63917r0 = m88268h("KMutableProperty1");
            f63919s0 = m88268h("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeM88268h = m88268h("KProperty");
            f63921t0 = fqNameUnsafeM88268h;
            f63923u0 = m88268h("KMutableProperty");
            f63925v0 = companion.m91045c(fqNameUnsafeM88268h.m91068m());
            f63927w0 = m88268h("KDeclarationContainer");
            f63929x0 = m88268h("findAssociatedObject");
            FqName fqNameM88272d2 = fqNames.m88272d("UByte");
            f63931y0 = fqNameM88272d2;
            FqName fqNameM88272d3 = fqNames.m88272d("UShort");
            f63933z0 = fqNameM88272d3;
            FqName fqNameM88272d4 = fqNames.m88272d("UInt");
            f63836A0 = fqNameM88272d4;
            FqName fqNameM88272d5 = fqNames.m88272d("ULong");
            f63838B0 = fqNameM88272d5;
            f63840C0 = companion.m91045c(fqNameM88272d2);
            f63842D0 = companion.m91045c(fqNameM88272d3);
            f63844E0 = companion.m91045c(fqNameM88272d4);
            f63846F0 = companion.m91045c(fqNameM88272d5);
            f63848G0 = fqNames.m88272d("UByteArray");
            f63850H0 = fqNames.m88272d("UShortArray");
            f63852I0 = fqNames.m88272d("UIntArray");
            f63854J0 = fqNames.m88272d("ULongArray");
            f63856K0 = fqNames.m88271c("AtomicInt");
            f63858L0 = fqNames.m88271c("AtomicLong");
            f63860M0 = fqNames.m88271c("AtomicBoolean");
            f63862N0 = fqNames.m88271c("AtomicReference");
            f63864O0 = fqNames.m88271c("AtomicIntArray");
            f63866P0 = fqNames.m88271c("AtomicLongArray");
            f63868Q0 = fqNames.m88271c("AtomicArray");
            HashSet hashSetM93183f = CollectionsKt.m93183f(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetM93183f.add(primitiveType.getTypeName());
            }
            f63870R0 = hashSetM93183f;
            HashSet hashSetM93183f2 = CollectionsKt.m93183f(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetM93183f2.add(primitiveType2.getArrayTypeName());
            }
            f63872S0 = hashSetM93183f2;
            HashMap mapM93182e = CollectionsKt.m93182e(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String strM91082b = primitiveType3.getTypeName().m91082b();
                strM91082b.getClass();
                mapM93182e.put(fqNames2.m88273e(strM91082b), primitiveType3);
            }
            f63874T0 = mapM93182e;
            HashMap mapM93182e2 = CollectionsKt.m93182e(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames3 = INSTANCE;
                String strM91082b2 = primitiveType4.getArrayTypeName().m91082b();
                strM91082b2.getClass();
                mapM93182e2.put(fqNames3.m88273e(strM91082b2), primitiveType4);
            }
            f63876U0 = mapM93182e2;
        }

        private FqNames() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: h */
        public static final FqNameUnsafe m88268h(@NotNull String str) {
            str.getClass();
            FqName fqName = StandardNames.f63832x;
            Name nameM91079i = Name.m91079i(str);
            nameM91079i.getClass();
            return fqName.m91047b(nameM91079i).m91054i();
        }

        /* JADX INFO: renamed from: a */
        public final FqName m88269a(String str) {
            FqName fqName = StandardNames.f63800B;
            Name nameM91079i = Name.m91079i(str);
            nameM91079i.getClass();
            return fqName.m91047b(nameM91079i);
        }

        /* JADX INFO: renamed from: b */
        public final FqName m88270b(String str) {
            FqName fqName = StandardNames.f63801C;
            Name nameM91079i = Name.m91079i(str);
            nameM91079i.getClass();
            return fqName.m91047b(nameM91079i);
        }

        /* JADX INFO: renamed from: c */
        public final FqName m88271c(String str) {
            FqName fqName = StandardNames.f63806H;
            Name nameM91079i = Name.m91079i(str);
            nameM91079i.getClass();
            return fqName.m91047b(nameM91079i);
        }

        /* JADX INFO: renamed from: d */
        public final FqName m88272d(String str) {
            FqName fqName = StandardNames.f63799A;
            Name nameM91079i = Name.m91079i(str);
            nameM91079i.getClass();
            return fqName.m91047b(nameM91079i);
        }

        /* JADX INFO: renamed from: e */
        public final FqNameUnsafe m88273e(String str) {
            return m88272d(str).m91054i();
        }

        /* JADX INFO: renamed from: f */
        public final FqName m88274f(String str) {
            FqName fqName = StandardNames.f63804F;
            Name nameM91079i = Name.m91079i(str);
            nameM91079i.getClass();
            return fqName.m91047b(nameM91079i);
        }

        /* JADX INFO: renamed from: g */
        public final FqNameUnsafe m88275g(String str) {
            FqName fqName = StandardNames.f63802D;
            Name nameM91079i = Name.m91079i(str);
            nameM91079i.getClass();
            return fqName.m91047b(nameM91079i).m91054i();
        }
    }

    static {
        Name nameM91079i = Name.m91079i("field");
        nameM91079i.getClass();
        f63809a = nameM91079i;
        Name nameM91079i2 = Name.m91079i("value");
        nameM91079i2.getClass();
        f63810b = nameM91079i2;
        Name nameM91079i3 = Name.m91079i("values");
        nameM91079i3.getClass();
        f63811c = nameM91079i3;
        Name nameM91079i4 = Name.m91079i(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        nameM91079i4.getClass();
        f63812d = nameM91079i4;
        Name nameM91079i5 = Name.m91079i("valueOf");
        nameM91079i5.getClass();
        f63813e = nameM91079i5;
        Name nameM91079i6 = Name.m91079i(Constants.COPY_TYPE);
        nameM91079i6.getClass();
        f63814f = nameM91079i6;
        f63815g = "component";
        Name nameM91079i7 = Name.m91079i("hashCode");
        nameM91079i7.getClass();
        f63816h = nameM91079i7;
        Name nameM91079i8 = Name.m91079i("toString");
        nameM91079i8.getClass();
        f63817i = nameM91079i8;
        Name nameM91079i9 = Name.m91079i("equals");
        nameM91079i9.getClass();
        f63818j = nameM91079i9;
        Name nameM91079i10 = Name.m91079i("code");
        nameM91079i10.getClass();
        f63819k = nameM91079i10;
        Name nameM91079i11 = Name.m91079i(AuthenticationTokenClaims.JSON_KEY_NAME);
        nameM91079i11.getClass();
        f63820l = nameM91079i11;
        Name nameM91079i12 = Name.m91079i(BLiveTraceServerLocation.main);
        nameM91079i12.getClass();
        f63821m = nameM91079i12;
        Name nameM91079i13 = Name.m91079i("nextChar");
        nameM91079i13.getClass();
        f63822n = nameM91079i13;
        Name nameM91079i14 = Name.m91079i(Careers.f38732it);
        nameM91079i14.getClass();
        f63823o = nameM91079i14;
        Name nameM91079i15 = Name.m91079i("count");
        nameM91079i15.getClass();
        f63824p = nameM91079i15;
        f63825q = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        f63826r = fqName;
        f63827s = new FqName("kotlin.coroutines.jvm.internal");
        f63828t = new FqName("kotlin.coroutines.intrinsics");
        Name nameM91079i16 = Name.m91079i("COROUTINE_SUSPENDED");
        nameM91079i16.getClass();
        f63829u = nameM91079i16;
        Name nameM91079i17 = Name.m91079i("Continuation");
        nameM91079i17.getClass();
        f63830v = fqName.m91047b(nameM91079i17);
        f63831w = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        f63832x = fqName2;
        f63833y = kotlin.collections.CollectionsKt.listOf((Object[]) new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name nameM91079i18 = Name.m91079i("kotlin");
        nameM91079i18.getClass();
        f63834z = nameM91079i18;
        FqName fqNameM91055a = FqName.Companion.m91055a(nameM91079i18);
        f63799A = fqNameM91055a;
        Name nameM91079i19 = Name.m91079i("annotation");
        nameM91079i19.getClass();
        FqName fqNameM91047b = fqNameM91055a.m91047b(nameM91079i19);
        f63800B = fqNameM91047b;
        Name nameM91079i20 = Name.m91079i("collections");
        nameM91079i20.getClass();
        FqName fqNameM91047b2 = fqNameM91055a.m91047b(nameM91079i20);
        f63801C = fqNameM91047b2;
        Name nameM91079i21 = Name.m91079i("ranges");
        nameM91079i21.getClass();
        FqName fqNameM91047b3 = fqNameM91055a.m91047b(nameM91079i21);
        f63802D = fqNameM91047b3;
        Name nameM91079i22 = Name.m91079i("text");
        nameM91079i22.getClass();
        f63803E = fqNameM91055a.m91047b(nameM91079i22);
        Name nameM91079i23 = Name.m91079i("internal");
        nameM91079i23.getClass();
        FqName fqNameM91047b4 = fqNameM91055a.m91047b(nameM91079i23);
        f63804F = fqNameM91047b4;
        Name nameM91079i24 = Name.m91079i("concurrent");
        nameM91079i24.getClass();
        FqName fqNameM91047b5 = fqNameM91055a.m91047b(nameM91079i24);
        f63805G = fqNameM91047b5;
        Name nameM91079i25 = Name.m91079i("atomics");
        nameM91079i25.getClass();
        FqName fqNameM91047b6 = fqNameM91047b5.m91047b(nameM91079i25);
        f63806H = fqNameM91047b6;
        f63807I = new FqName("error.NonExistentClass");
        f63808J = SetsKt.setOf((Object[]) new FqName[]{fqNameM91055a, fqNameM91047b2, fqNameM91047b3, fqNameM91047b, fqName2, fqNameM91047b4, fqName, fqNameM91047b6});
    }

    private StandardNames() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ClassId m88263a(int i) {
        FqName fqName = f63799A;
        Name nameM91079i = Name.m91079i(m88264b(i));
        nameM91079i.getClass();
        return new ClassId(fqName, nameM91079i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m88264b(int i) {
        return "Function" + i;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final FqName m88265c(@NotNull PrimitiveType primitiveType) {
        primitiveType.getClass();
        return f63799A.m91047b(primitiveType.getTypeName());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m88266d(int i) {
        return FunctionTypeKind.SuspendFunction.INSTANCE.m88327a() + i;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m88267e(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return FqNames.f63876U0.get(fqNameUnsafe) != null;
    }
}
