package kotlin.reflect.jvm.internal.impl.builtins;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
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
    public static final FqName f64473A;

    /* JADX INFO: renamed from: B */
    @JvmField
    @NotNull
    public static final FqName f64474B;

    /* JADX INFO: renamed from: C */
    @JvmField
    @NotNull
    public static final FqName f64475C;

    /* JADX INFO: renamed from: D */
    @JvmField
    @NotNull
    public static final FqName f64476D;

    /* JADX INFO: renamed from: E */
    @JvmField
    @NotNull
    public static final FqName f64477E;

    /* JADX INFO: renamed from: F */
    @JvmField
    @NotNull
    public static final FqName f64478F;

    /* JADX INFO: renamed from: G */
    @JvmField
    @NotNull
    public static final FqName f64479G;

    /* JADX INFO: renamed from: H */
    @JvmField
    @NotNull
    public static final FqName f64480H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public static final FqName f64481I;

    @NotNull
    public static final StandardNames INSTANCE = new StandardNames();

    /* JADX INFO: renamed from: J */
    @JvmField
    @NotNull
    public static final Set<FqName> f64482J;

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final Name f64483a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final Name f64484b;

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final Name f64485c;

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final Name f64486d;

    /* JADX INFO: renamed from: e */
    @JvmField
    @NotNull
    public static final Name f64487e;

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static final Name f64488f;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final String f64489g;

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final Name f64490h;

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public static final Name f64491i;

    /* JADX INFO: renamed from: j */
    @JvmField
    @NotNull
    public static final Name f64492j;

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final Name f64493k;

    /* JADX INFO: renamed from: l */
    @JvmField
    @NotNull
    public static final Name f64494l;

    /* JADX INFO: renamed from: m */
    @JvmField
    @NotNull
    public static final Name f64495m;

    /* JADX INFO: renamed from: n */
    @JvmField
    @NotNull
    public static final Name f64496n;

    /* JADX INFO: renamed from: o */
    @JvmField
    @NotNull
    public static final Name f64497o;

    /* JADX INFO: renamed from: p */
    @JvmField
    @NotNull
    public static final Name f64498p;

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final FqName f64499q;

    /* JADX INFO: renamed from: r */
    @JvmField
    @NotNull
    public static final FqName f64500r;

    /* JADX INFO: renamed from: s */
    @JvmField
    @NotNull
    public static final FqName f64501s;

    /* JADX INFO: renamed from: t */
    @JvmField
    @NotNull
    public static final FqName f64502t;

    /* JADX INFO: renamed from: u */
    @JvmField
    @NotNull
    public static final Name f64503u;

    /* JADX INFO: renamed from: v */
    @JvmField
    @NotNull
    public static final FqName f64504v;

    /* JADX INFO: renamed from: w */
    @JvmField
    @NotNull
    public static final FqName f64505w;

    /* JADX INFO: renamed from: x */
    @JvmField
    @NotNull
    public static final FqName f64506x;

    /* JADX INFO: renamed from: y */
    @JvmField
    @NotNull
    public static final List<String> f64507y;

    /* JADX INFO: renamed from: z */
    @JvmField
    @NotNull
    public static final Name f64508z;

    @SourceDebugExtension
    public static final class FqNames {

        /* JADX INFO: renamed from: A */
        @JvmField
        @NotNull
        public static final FqName f64509A;

        /* JADX INFO: renamed from: A0 */
        @JvmField
        @NotNull
        public static final FqName f64510A0;

        /* JADX INFO: renamed from: B */
        @JvmField
        @NotNull
        public static final FqName f64511B;

        /* JADX INFO: renamed from: B0 */
        @JvmField
        @NotNull
        public static final FqName f64512B0;

        /* JADX INFO: renamed from: C */
        @JvmField
        @NotNull
        public static final FqName f64513C;

        /* JADX INFO: renamed from: C0 */
        @JvmField
        @NotNull
        public static final ClassId f64514C0;

        /* JADX INFO: renamed from: D */
        @JvmField
        @NotNull
        public static final FqName f64515D;

        /* JADX INFO: renamed from: D0 */
        @JvmField
        @NotNull
        public static final ClassId f64516D0;

        /* JADX INFO: renamed from: E */
        @JvmField
        @NotNull
        public static final ClassId f64517E;

        /* JADX INFO: renamed from: E0 */
        @JvmField
        @NotNull
        public static final ClassId f64518E0;

        /* JADX INFO: renamed from: F */
        @JvmField
        @NotNull
        public static final FqName f64519F;

        /* JADX INFO: renamed from: F0 */
        @JvmField
        @NotNull
        public static final ClassId f64520F0;

        /* JADX INFO: renamed from: G */
        @JvmField
        @NotNull
        public static final FqName f64521G;

        /* JADX INFO: renamed from: G0 */
        @JvmField
        @NotNull
        public static final FqName f64522G0;

        /* JADX INFO: renamed from: H */
        @JvmField
        @NotNull
        public static final ClassId f64523H;

        /* JADX INFO: renamed from: H0 */
        @JvmField
        @NotNull
        public static final FqName f64524H0;

        /* JADX INFO: renamed from: I */
        @JvmField
        @NotNull
        public static final FqName f64525I;

        /* JADX INFO: renamed from: I0 */
        @JvmField
        @NotNull
        public static final FqName f64526I0;

        @NotNull
        public static final FqNames INSTANCE;

        /* JADX INFO: renamed from: J */
        @JvmField
        @NotNull
        public static final FqName f64527J;

        /* JADX INFO: renamed from: J0 */
        @JvmField
        @NotNull
        public static final FqName f64528J0;

        /* JADX INFO: renamed from: K */
        @JvmField
        @NotNull
        public static final FqName f64529K;

        /* JADX INFO: renamed from: K0 */
        @JvmField
        @NotNull
        public static final FqName f64530K0;

        /* JADX INFO: renamed from: L */
        @JvmField
        @NotNull
        public static final ClassId f64531L;

        /* JADX INFO: renamed from: L0 */
        @JvmField
        @NotNull
        public static final FqName f64532L0;

        /* JADX INFO: renamed from: M */
        @JvmField
        @NotNull
        public static final FqName f64533M;

        /* JADX INFO: renamed from: M0 */
        @JvmField
        @NotNull
        public static final FqName f64534M0;

        /* JADX INFO: renamed from: N */
        @JvmField
        @NotNull
        public static final ClassId f64535N;

        /* JADX INFO: renamed from: N0 */
        @JvmField
        @NotNull
        public static final FqName f64536N0;

        /* JADX INFO: renamed from: O */
        @JvmField
        @NotNull
        public static final FqName f64537O;

        /* JADX INFO: renamed from: O0 */
        @JvmField
        @NotNull
        public static final FqName f64538O0;

        /* JADX INFO: renamed from: P */
        @JvmField
        @NotNull
        public static final FqName f64539P;

        /* JADX INFO: renamed from: P0 */
        @JvmField
        @NotNull
        public static final FqName f64540P0;

        /* JADX INFO: renamed from: Q */
        @JvmField
        @NotNull
        public static final FqName f64541Q;

        /* JADX INFO: renamed from: Q0 */
        @JvmField
        @NotNull
        public static final FqName f64542Q0;

        /* JADX INFO: renamed from: R */
        @JvmField
        @NotNull
        public static final FqName f64543R;

        /* JADX INFO: renamed from: R0 */
        @JvmField
        @NotNull
        public static final Set<Name> f64544R0;

        /* JADX INFO: renamed from: S */
        @JvmField
        @NotNull
        public static final FqName f64545S;

        /* JADX INFO: renamed from: S0 */
        @JvmField
        @NotNull
        public static final Set<Name> f64546S0;

        /* JADX INFO: renamed from: T */
        @JvmField
        @NotNull
        public static final ClassId f64547T;

        /* JADX INFO: renamed from: T0 */
        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> f64548T0;

        /* JADX INFO: renamed from: U */
        @JvmField
        @NotNull
        public static final FqName f64549U;

        /* JADX INFO: renamed from: U0 */
        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> f64550U0;

        /* JADX INFO: renamed from: V */
        @JvmField
        @NotNull
        public static final FqName f64551V;

        /* JADX INFO: renamed from: W */
        @JvmField
        @NotNull
        public static final FqName f64552W;

        /* JADX INFO: renamed from: X */
        @JvmField
        @NotNull
        public static final FqName f64553X;

        /* JADX INFO: renamed from: Y */
        @JvmField
        @NotNull
        public static final FqName f64554Y;

        /* JADX INFO: renamed from: Z */
        @JvmField
        @NotNull
        public static final FqName f64555Z;

        /* JADX INFO: renamed from: a */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64556a;

        /* JADX INFO: renamed from: a0 */
        @JvmField
        @NotNull
        public static final FqName f64557a0;

        /* JADX INFO: renamed from: b */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64558b;

        /* JADX INFO: renamed from: b0 */
        @JvmField
        @NotNull
        public static final FqName f64559b0;

        /* JADX INFO: renamed from: c */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64560c;

        /* JADX INFO: renamed from: c0 */
        @JvmField
        @NotNull
        public static final FqName f64561c0;

        /* JADX INFO: renamed from: d */
        @JvmField
        @NotNull
        public static final FqName f64562d;

        /* JADX INFO: renamed from: d0 */
        @JvmField
        @NotNull
        public static final FqName f64563d0;

        /* JADX INFO: renamed from: e */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64564e;

        /* JADX INFO: renamed from: e0 */
        @JvmField
        @NotNull
        public static final FqName f64565e0;

        /* JADX INFO: renamed from: f */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64566f;

        /* JADX INFO: renamed from: f0 */
        @JvmField
        @NotNull
        public static final FqName f64567f0;

        /* JADX INFO: renamed from: g */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64568g;

        /* JADX INFO: renamed from: g0 */
        @JvmField
        @NotNull
        public static final FqName f64569g0;

        /* JADX INFO: renamed from: h */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64570h;

        /* JADX INFO: renamed from: h0 */
        @JvmField
        @NotNull
        public static final FqName f64571h0;

        /* JADX INFO: renamed from: i */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64572i;

        /* JADX INFO: renamed from: i0 */
        @JvmField
        @NotNull
        public static final FqName f64573i0;

        /* JADX INFO: renamed from: j */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64574j;

        /* JADX INFO: renamed from: j0 */
        @JvmField
        @NotNull
        public static final FqName f64575j0;

        /* JADX INFO: renamed from: k */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64576k;

        /* JADX INFO: renamed from: k0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64577k0;

        /* JADX INFO: renamed from: l */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64578l;

        /* JADX INFO: renamed from: l0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64579l0;

        /* JADX INFO: renamed from: m */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64580m;

        /* JADX INFO: renamed from: m0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64581m0;

        /* JADX INFO: renamed from: n */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64582n;

        /* JADX INFO: renamed from: n0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64583n0;

        /* JADX INFO: renamed from: o */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64584o;

        /* JADX INFO: renamed from: o0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64585o0;

        /* JADX INFO: renamed from: p */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64586p;

        /* JADX INFO: renamed from: p0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64587p0;

        /* JADX INFO: renamed from: q */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64588q;

        /* JADX INFO: renamed from: q0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64589q0;

        /* JADX INFO: renamed from: r */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64590r;

        /* JADX INFO: renamed from: r0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64591r0;

        /* JADX INFO: renamed from: s */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64592s;

        /* JADX INFO: renamed from: s0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64593s0;

        /* JADX INFO: renamed from: t */
        @JvmField
        @NotNull
        public static final FqName f64594t;

        /* JADX INFO: renamed from: t0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64595t0;

        /* JADX INFO: renamed from: u */
        @JvmField
        @NotNull
        public static final FqName f64596u;

        /* JADX INFO: renamed from: u0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64597u0;

        /* JADX INFO: renamed from: v */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64598v;

        /* JADX INFO: renamed from: v0 */
        @JvmField
        @NotNull
        public static final ClassId f64599v0;

        /* JADX INFO: renamed from: w */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64600w;

        /* JADX INFO: renamed from: w0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64601w0;

        /* JADX INFO: renamed from: x */
        @JvmField
        @NotNull
        public static final FqName f64602x;

        /* JADX INFO: renamed from: x0 */
        @JvmField
        @NotNull
        public static final FqNameUnsafe f64603x0;

        /* JADX INFO: renamed from: y */
        @JvmField
        @NotNull
        public static final FqName f64604y;

        /* JADX INFO: renamed from: y0 */
        @JvmField
        @NotNull
        public static final FqName f64605y0;

        /* JADX INFO: renamed from: z */
        @JvmField
        @NotNull
        public static final FqName f64606z;

        /* JADX INFO: renamed from: z0 */
        @JvmField
        @NotNull
        public static final FqName f64607z0;

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            f64556a = fqNames.m89164e("Any");
            f64558b = fqNames.m89164e("Nothing");
            f64560c = fqNames.m89164e("Cloneable");
            f64562d = fqNames.m89163d("Suppress");
            f64564e = fqNames.m89164e("Unit");
            f64566f = fqNames.m89164e("CharSequence");
            f64568g = fqNames.m89164e("String");
            f64570h = fqNames.m89164e("Array");
            f64572i = fqNames.m89164e("Boolean");
            f64574j = fqNames.m89164e("Char");
            f64576k = fqNames.m89164e("Byte");
            f64578l = fqNames.m89164e("Short");
            f64580m = fqNames.m89164e("Int");
            f64582n = fqNames.m89164e("Long");
            f64584o = fqNames.m89164e("Float");
            f64586p = fqNames.m89164e("Double");
            f64588q = fqNames.m89164e("Number");
            f64590r = fqNames.m89164e("Enum");
            f64592s = fqNames.m89164e("Function");
            f64594t = fqNames.m89163d("Throwable");
            f64596u = fqNames.m89163d("Comparable");
            f64598v = fqNames.m89166g("IntRange");
            f64600w = fqNames.m89166g("LongRange");
            f64602x = fqNames.m89163d("Deprecated");
            f64604y = fqNames.m89163d("DeprecatedSinceKotlin");
            f64606z = fqNames.m89163d("DeprecationLevel");
            f64509A = fqNames.m89163d("ReplaceWith");
            f64511B = fqNames.m89163d("ExtensionFunctionType");
            f64513C = fqNames.m89163d("ContextFunctionTypeParams");
            FqName fqNameM89163d = fqNames.m89163d("ParameterName");
            f64515D = fqNameM89163d;
            ClassId.Companion companion = ClassId.Companion;
            f64517E = companion.m91936c(fqNameM89163d);
            f64519F = fqNames.m89163d("Annotation");
            FqName fqNameM89160a = fqNames.m89160a("Target");
            f64521G = fqNameM89160a;
            f64523H = companion.m91936c(fqNameM89160a);
            f64525I = fqNames.m89160a("AnnotationTarget");
            f64527J = fqNames.m89160a("AnnotationRetention");
            FqName fqNameM89160a2 = fqNames.m89160a("Retention");
            f64529K = fqNameM89160a2;
            f64531L = companion.m91936c(fqNameM89160a2);
            FqName fqNameM89160a3 = fqNames.m89160a("Repeatable");
            f64533M = fqNameM89160a3;
            f64535N = companion.m91936c(fqNameM89160a3);
            f64537O = fqNames.m89160a("MustBeDocumented");
            f64539P = fqNames.m89163d("UnsafeVariance");
            f64541Q = fqNames.m89163d("PublishedApi");
            f64543R = fqNames.m89165f("AccessibleLateinitPropertyLiteral");
            FqName fqName = new FqName("kotlin.internal.PlatformDependent");
            f64545S = fqName;
            f64547T = companion.m91936c(fqName);
            f64549U = fqNames.m89161b("Iterator");
            f64551V = fqNames.m89161b("Iterable");
            f64552W = fqNames.m89161b("Collection");
            f64553X = fqNames.m89161b("List");
            f64554Y = fqNames.m89161b("ListIterator");
            f64555Z = fqNames.m89161b("Set");
            FqName fqNameM89161b = fqNames.m89161b("Map");
            f64557a0 = fqNameM89161b;
            Name nameM91970i = Name.m91970i("Entry");
            nameM91970i.getClass();
            f64559b0 = fqNameM89161b.m91938b(nameM91970i);
            f64561c0 = fqNames.m89161b("MutableIterator");
            f64563d0 = fqNames.m89161b("MutableIterable");
            f64565e0 = fqNames.m89161b("MutableCollection");
            f64567f0 = fqNames.m89161b("MutableList");
            f64569g0 = fqNames.m89161b("MutableListIterator");
            f64571h0 = fqNames.m89161b("MutableSet");
            FqName fqNameM89161b2 = fqNames.m89161b("MutableMap");
            f64573i0 = fqNameM89161b2;
            Name nameM91970i2 = Name.m91970i("MutableEntry");
            nameM91970i2.getClass();
            f64575j0 = fqNameM89161b2.m91938b(nameM91970i2);
            f64577k0 = m89159h("KClass");
            f64579l0 = m89159h("KType");
            f64581m0 = m89159h("KCallable");
            f64583n0 = m89159h("KProperty0");
            f64585o0 = m89159h("KProperty1");
            f64587p0 = m89159h("KProperty2");
            f64589q0 = m89159h("KMutableProperty0");
            f64591r0 = m89159h("KMutableProperty1");
            f64593s0 = m89159h("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeM89159h = m89159h("KProperty");
            f64595t0 = fqNameUnsafeM89159h;
            f64597u0 = m89159h("KMutableProperty");
            f64599v0 = companion.m91936c(fqNameUnsafeM89159h.m91959m());
            f64601w0 = m89159h("KDeclarationContainer");
            f64603x0 = m89159h("findAssociatedObject");
            FqName fqNameM89163d2 = fqNames.m89163d("UByte");
            f64605y0 = fqNameM89163d2;
            FqName fqNameM89163d3 = fqNames.m89163d("UShort");
            f64607z0 = fqNameM89163d3;
            FqName fqNameM89163d4 = fqNames.m89163d("UInt");
            f64510A0 = fqNameM89163d4;
            FqName fqNameM89163d5 = fqNames.m89163d("ULong");
            f64512B0 = fqNameM89163d5;
            f64514C0 = companion.m91936c(fqNameM89163d2);
            f64516D0 = companion.m91936c(fqNameM89163d3);
            f64518E0 = companion.m91936c(fqNameM89163d4);
            f64520F0 = companion.m91936c(fqNameM89163d5);
            f64522G0 = fqNames.m89163d("UByteArray");
            f64524H0 = fqNames.m89163d("UShortArray");
            f64526I0 = fqNames.m89163d("UIntArray");
            f64528J0 = fqNames.m89163d("ULongArray");
            f64530K0 = fqNames.m89162c("AtomicInt");
            f64532L0 = fqNames.m89162c("AtomicLong");
            f64534M0 = fqNames.m89162c("AtomicBoolean");
            f64536N0 = fqNames.m89162c("AtomicReference");
            f64538O0 = fqNames.m89162c("AtomicIntArray");
            f64540P0 = fqNames.m89162c("AtomicLongArray");
            f64542Q0 = fqNames.m89162c("AtomicArray");
            HashSet hashSetM94074f = CollectionsKt.m94074f(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetM94074f.add(primitiveType.getTypeName());
            }
            f64544R0 = hashSetM94074f;
            HashSet hashSetM94074f2 = CollectionsKt.m94074f(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetM94074f2.add(primitiveType2.getArrayTypeName());
            }
            f64546S0 = hashSetM94074f2;
            HashMap mapM94073e = CollectionsKt.m94073e(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String strM91973b = primitiveType3.getTypeName().m91973b();
                strM91973b.getClass();
                mapM94073e.put(fqNames2.m89164e(strM91973b), primitiveType3);
            }
            f64548T0 = mapM94073e;
            HashMap mapM94073e2 = CollectionsKt.m94073e(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames3 = INSTANCE;
                String strM91973b2 = primitiveType4.getArrayTypeName().m91973b();
                strM91973b2.getClass();
                mapM94073e2.put(fqNames3.m89164e(strM91973b2), primitiveType4);
            }
            f64550U0 = mapM94073e2;
        }

        private FqNames() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: h */
        public static final FqNameUnsafe m89159h(@NotNull String str) {
            str.getClass();
            FqName fqName = StandardNames.f64506x;
            Name nameM91970i = Name.m91970i(str);
            nameM91970i.getClass();
            return fqName.m91938b(nameM91970i).m91945i();
        }

        /* JADX INFO: renamed from: a */
        public final FqName m89160a(String str) {
            FqName fqName = StandardNames.f64474B;
            Name nameM91970i = Name.m91970i(str);
            nameM91970i.getClass();
            return fqName.m91938b(nameM91970i);
        }

        /* JADX INFO: renamed from: b */
        public final FqName m89161b(String str) {
            FqName fqName = StandardNames.f64475C;
            Name nameM91970i = Name.m91970i(str);
            nameM91970i.getClass();
            return fqName.m91938b(nameM91970i);
        }

        /* JADX INFO: renamed from: c */
        public final FqName m89162c(String str) {
            FqName fqName = StandardNames.f64480H;
            Name nameM91970i = Name.m91970i(str);
            nameM91970i.getClass();
            return fqName.m91938b(nameM91970i);
        }

        /* JADX INFO: renamed from: d */
        public final FqName m89163d(String str) {
            FqName fqName = StandardNames.f64473A;
            Name nameM91970i = Name.m91970i(str);
            nameM91970i.getClass();
            return fqName.m91938b(nameM91970i);
        }

        /* JADX INFO: renamed from: e */
        public final FqNameUnsafe m89164e(String str) {
            return m89163d(str).m91945i();
        }

        /* JADX INFO: renamed from: f */
        public final FqName m89165f(String str) {
            FqName fqName = StandardNames.f64478F;
            Name nameM91970i = Name.m91970i(str);
            nameM91970i.getClass();
            return fqName.m91938b(nameM91970i);
        }

        /* JADX INFO: renamed from: g */
        public final FqNameUnsafe m89166g(String str) {
            FqName fqName = StandardNames.f64476D;
            Name nameM91970i = Name.m91970i(str);
            nameM91970i.getClass();
            return fqName.m91938b(nameM91970i).m91945i();
        }
    }

    static {
        Name nameM91970i = Name.m91970i("field");
        nameM91970i.getClass();
        f64483a = nameM91970i;
        Name nameM91970i2 = Name.m91970i("value");
        nameM91970i2.getClass();
        f64484b = nameM91970i2;
        Name nameM91970i3 = Name.m91970i("values");
        nameM91970i3.getClass();
        f64485c = nameM91970i3;
        Name nameM91970i4 = Name.m91970i(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        nameM91970i4.getClass();
        f64486d = nameM91970i4;
        Name nameM91970i5 = Name.m91970i("valueOf");
        nameM91970i5.getClass();
        f64487e = nameM91970i5;
        Name nameM91970i6 = Name.m91970i(Constants.COPY_TYPE);
        nameM91970i6.getClass();
        f64488f = nameM91970i6;
        f64489g = "component";
        Name nameM91970i7 = Name.m91970i("hashCode");
        nameM91970i7.getClass();
        f64490h = nameM91970i7;
        Name nameM91970i8 = Name.m91970i("toString");
        nameM91970i8.getClass();
        f64491i = nameM91970i8;
        Name nameM91970i9 = Name.m91970i("equals");
        nameM91970i9.getClass();
        f64492j = nameM91970i9;
        Name nameM91970i10 = Name.m91970i("code");
        nameM91970i10.getClass();
        f64493k = nameM91970i10;
        Name nameM91970i11 = Name.m91970i(AuthenticationTokenClaims.JSON_KEY_NAME);
        nameM91970i11.getClass();
        f64494l = nameM91970i11;
        Name nameM91970i12 = Name.m91970i(BLiveTraceServerLocation.main);
        nameM91970i12.getClass();
        f64495m = nameM91970i12;
        Name nameM91970i13 = Name.m91970i("nextChar");
        nameM91970i13.getClass();
        f64496n = nameM91970i13;
        Name nameM91970i14 = Name.m91970i(Careers.f39580it);
        nameM91970i14.getClass();
        f64497o = nameM91970i14;
        Name nameM91970i15 = Name.m91970i("count");
        nameM91970i15.getClass();
        f64498p = nameM91970i15;
        f64499q = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        f64500r = fqName;
        f64501s = new FqName("kotlin.coroutines.jvm.internal");
        f64502t = new FqName("kotlin.coroutines.intrinsics");
        Name nameM91970i16 = Name.m91970i("COROUTINE_SUSPENDED");
        nameM91970i16.getClass();
        f64503u = nameM91970i16;
        Name nameM91970i17 = Name.m91970i("Continuation");
        nameM91970i17.getClass();
        f64504v = fqName.m91938b(nameM91970i17);
        f64505w = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        f64506x = fqName2;
        f64507y = kotlin.collections.CollectionsKt.listOf((Object[]) new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name nameM91970i18 = Name.m91970i("kotlin");
        nameM91970i18.getClass();
        f64508z = nameM91970i18;
        FqName fqNameM91946a = FqName.Companion.m91946a(nameM91970i18);
        f64473A = fqNameM91946a;
        Name nameM91970i19 = Name.m91970i("annotation");
        nameM91970i19.getClass();
        FqName fqNameM91938b = fqNameM91946a.m91938b(nameM91970i19);
        f64474B = fqNameM91938b;
        Name nameM91970i20 = Name.m91970i("collections");
        nameM91970i20.getClass();
        FqName fqNameM91938b2 = fqNameM91946a.m91938b(nameM91970i20);
        f64475C = fqNameM91938b2;
        Name nameM91970i21 = Name.m91970i("ranges");
        nameM91970i21.getClass();
        FqName fqNameM91938b3 = fqNameM91946a.m91938b(nameM91970i21);
        f64476D = fqNameM91938b3;
        Name nameM91970i22 = Name.m91970i("text");
        nameM91970i22.getClass();
        f64477E = fqNameM91946a.m91938b(nameM91970i22);
        Name nameM91970i23 = Name.m91970i("internal");
        nameM91970i23.getClass();
        FqName fqNameM91938b4 = fqNameM91946a.m91938b(nameM91970i23);
        f64478F = fqNameM91938b4;
        Name nameM91970i24 = Name.m91970i("concurrent");
        nameM91970i24.getClass();
        FqName fqNameM91938b5 = fqNameM91946a.m91938b(nameM91970i24);
        f64479G = fqNameM91938b5;
        Name nameM91970i25 = Name.m91970i("atomics");
        nameM91970i25.getClass();
        FqName fqNameM91938b6 = fqNameM91938b5.m91938b(nameM91970i25);
        f64480H = fqNameM91938b6;
        f64481I = new FqName("error.NonExistentClass");
        f64482J = SetsKt.setOf((Object[]) new FqName[]{fqNameM91946a, fqNameM91938b2, fqNameM91938b3, fqNameM91938b, fqName2, fqNameM91938b4, fqName, fqNameM91938b6});
    }

    private StandardNames() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ClassId m89154a(int i) {
        FqName fqName = f64473A;
        Name nameM91970i = Name.m91970i(m89155b(i));
        nameM91970i.getClass();
        return new ClassId(fqName, nameM91970i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m89155b(int i) {
        return "Function" + i;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final FqName m89156c(@NotNull PrimitiveType primitiveType) {
        primitiveType.getClass();
        return f64473A.m91938b(primitiveType.getTypeName());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m89157d(int i) {
        return FunctionTypeKind.SuspendFunction.INSTANCE.m89218a() + i;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m89158e(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return FqNames.f64550U0.get(fqNameUnsafe) != null;
    }
}
