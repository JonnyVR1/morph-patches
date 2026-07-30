package kotlin.reflect.jvm.internal.impl.util;

import com.immomo.momomediaext.sei.BaseSei;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public final class OperatorNameConventions {

    /* JADX INFO: renamed from: A */
    @JvmField
    @NotNull
    public static final Name f66369A;

    /* JADX INFO: renamed from: B */
    @JvmField
    @NotNull
    public static final Name f66370B;

    /* JADX INFO: renamed from: C */
    @JvmField
    @NotNull
    public static final Name f66371C;

    /* JADX INFO: renamed from: D */
    @JvmField
    @NotNull
    public static final Name f66372D;

    /* JADX INFO: renamed from: E */
    @JvmField
    @NotNull
    public static final Name f66373E;

    /* JADX INFO: renamed from: F */
    @JvmField
    @NotNull
    public static final Name f66374F;

    /* JADX INFO: renamed from: G */
    @JvmField
    @NotNull
    public static final Name f66375G;

    /* JADX INFO: renamed from: H */
    @JvmField
    @NotNull
    public static final Name f66376H;

    /* JADX INFO: renamed from: I */
    @JvmField
    @NotNull
    public static final Name f66377I;

    @NotNull
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();

    /* JADX INFO: renamed from: J */
    @JvmField
    @NotNull
    public static final Name f66378J;

    /* JADX INFO: renamed from: K */
    @JvmField
    @NotNull
    public static final Name f66379K;

    /* JADX INFO: renamed from: L */
    @JvmField
    @NotNull
    public static final Name f66380L;

    /* JADX INFO: renamed from: M */
    @JvmField
    @NotNull
    public static final Name f66381M;

    /* JADX INFO: renamed from: N */
    @JvmField
    @NotNull
    public static final Name f66382N;

    /* JADX INFO: renamed from: O */
    @JvmField
    @NotNull
    public static final Name f66383O;

    /* JADX INFO: renamed from: P */
    @JvmField
    @NotNull
    public static final Name f66384P;

    /* JADX INFO: renamed from: Q */
    @JvmField
    @NotNull
    public static final Name f66385Q;

    /* JADX INFO: renamed from: R */
    @JvmField
    @NotNull
    public static final Name f66386R;

    /* JADX INFO: renamed from: S */
    @JvmField
    @NotNull
    public static final Name f66387S;

    /* JADX INFO: renamed from: T */
    @JvmField
    @NotNull
    public static final Name f66388T;

    /* JADX INFO: renamed from: U */
    @JvmField
    @NotNull
    public static final Set<Name> f66389U;

    /* JADX INFO: renamed from: V */
    @JvmField
    @NotNull
    public static final Set<Name> f66390V;

    /* JADX INFO: renamed from: W */
    @JvmField
    @NotNull
    public static final Set<Name> f66391W;

    /* JADX INFO: renamed from: X */
    @JvmField
    @NotNull
    public static final Set<Name> f66392X;

    /* JADX INFO: renamed from: Y */
    @JvmField
    @NotNull
    public static final Set<Name> f66393Y;

    /* JADX INFO: renamed from: Z */
    @JvmField
    @NotNull
    public static final Set<Name> f66394Z;

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final Name f66395a;

    /* JADX INFO: renamed from: a0 */
    @JvmField
    @NotNull
    public static final Set<Name> f66396a0;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final Name f66397b;

    /* JADX INFO: renamed from: b0 */
    @JvmField
    @NotNull
    public static final Set<Name> f66398b0;

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final Name f66399c;

    /* JADX INFO: renamed from: c0 */
    @JvmField
    @NotNull
    public static final Set<Name> f66400c0;

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final Name f66401d;

    /* JADX INFO: renamed from: d0 */
    @JvmField
    @NotNull
    public static final Set<Name> f66402d0;

    /* JADX INFO: renamed from: e */
    @JvmField
    @NotNull
    public static final Name f66403e;

    /* JADX INFO: renamed from: e0 */
    @JvmField
    @NotNull
    public static final Set<Name> f66404e0;

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static final Name f66405f;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Map<Name, String> f66406f0;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final Name f66407g;

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final Name f66408h;

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public static final Name f66409i;

    /* JADX INFO: renamed from: j */
    @JvmField
    @NotNull
    public static final Name f66410j;

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final Name f66411k;

    /* JADX INFO: renamed from: l */
    @JvmField
    @NotNull
    public static final Name f66412l;

    /* JADX INFO: renamed from: m */
    @JvmField
    @NotNull
    public static final Name f66413m;

    /* JADX INFO: renamed from: n */
    @JvmField
    @NotNull
    public static final Name f66414n;

    /* JADX INFO: renamed from: o */
    @JvmField
    @NotNull
    public static final Regex f66415o;

    /* JADX INFO: renamed from: p */
    @JvmField
    @NotNull
    public static final Name f66416p;

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final Name f66417q;

    /* JADX INFO: renamed from: r */
    @JvmField
    @NotNull
    public static final Name f66418r;

    /* JADX INFO: renamed from: s */
    @JvmField
    @NotNull
    public static final Name f66419s;

    /* JADX INFO: renamed from: t */
    @JvmField
    @NotNull
    public static final Name f66420t;

    /* JADX INFO: renamed from: u */
    @JvmField
    @NotNull
    public static final Name f66421u;

    /* JADX INFO: renamed from: v */
    @JvmField
    @NotNull
    public static final Name f66422v;

    /* JADX INFO: renamed from: w */
    @JvmField
    @NotNull
    public static final Name f66423w;

    /* JADX INFO: renamed from: x */
    @JvmField
    @NotNull
    public static final Name f66424x;

    /* JADX INFO: renamed from: y */
    @JvmField
    @NotNull
    public static final Name f66425y;

    /* JADX INFO: renamed from: z */
    @JvmField
    @NotNull
    public static final Name f66426z;

    static {
        Name nameM91079i = Name.m91079i("getValue");
        nameM91079i.getClass();
        f66395a = nameM91079i;
        Name nameM91079i2 = Name.m91079i("setValue");
        nameM91079i2.getClass();
        f66397b = nameM91079i2;
        Name nameM91079i3 = Name.m91079i("provideDelegate");
        nameM91079i3.getClass();
        f66399c = nameM91079i3;
        Name nameM91079i4 = Name.m91079i("equals");
        nameM91079i4.getClass();
        f66401d = nameM91079i4;
        Name nameM91079i5 = Name.m91079i("hashCode");
        nameM91079i5.getClass();
        f66403e = nameM91079i5;
        Name nameM91079i6 = Name.m91079i("compareTo");
        nameM91079i6.getClass();
        f66405f = nameM91079i6;
        Name nameM91079i7 = Name.m91079i("contains");
        nameM91079i7.getClass();
        f66407g = nameM91079i7;
        Name nameM91079i8 = Name.m91079i("invoke");
        nameM91079i8.getClass();
        f66408h = nameM91079i8;
        Name nameM91079i9 = Name.m91079i("iterator");
        nameM91079i9.getClass();
        f66409i = nameM91079i9;
        Name nameM91079i10 = Name.m91079i("get");
        nameM91079i10.getClass();
        f66410j = nameM91079i10;
        Name nameM91079i11 = Name.m91079i("set");
        nameM91079i11.getClass();
        f66411k = nameM91079i11;
        Name nameM91079i12 = Name.m91079i("next");
        nameM91079i12.getClass();
        f66412l = nameM91079i12;
        Name nameM91079i13 = Name.m91079i("hasNext");
        nameM91079i13.getClass();
        f66413m = nameM91079i13;
        Name nameM91079i14 = Name.m91079i("toString");
        nameM91079i14.getClass();
        f66414n = nameM91079i14;
        f66415o = new Regex("component\\d+");
        Name nameM91079i15 = Name.m91079i("and");
        nameM91079i15.getClass();
        f66416p = nameM91079i15;
        Name nameM91079i16 = Name.m91079i("or");
        nameM91079i16.getClass();
        f66417q = nameM91079i16;
        Name nameM91079i17 = Name.m91079i("xor");
        nameM91079i17.getClass();
        f66418r = nameM91079i17;
        Name nameM91079i18 = Name.m91079i(BaseSei.INV);
        nameM91079i18.getClass();
        f66419s = nameM91079i18;
        Name nameM91079i19 = Name.m91079i("shl");
        nameM91079i19.getClass();
        f66420t = nameM91079i19;
        Name nameM91079i20 = Name.m91079i("shr");
        nameM91079i20.getClass();
        f66421u = nameM91079i20;
        Name nameM91079i21 = Name.m91079i("ushr");
        nameM91079i21.getClass();
        f66422v = nameM91079i21;
        Name nameM91079i22 = Name.m91079i("inc");
        nameM91079i22.getClass();
        f66423w = nameM91079i22;
        Name nameM91079i23 = Name.m91079i("dec");
        nameM91079i23.getClass();
        f66424x = nameM91079i23;
        Name nameM91079i24 = Name.m91079i("plus");
        nameM91079i24.getClass();
        f66425y = nameM91079i24;
        Name nameM91079i25 = Name.m91079i("minus");
        nameM91079i25.getClass();
        f66426z = nameM91079i25;
        Name nameM91079i26 = Name.m91079i("not");
        nameM91079i26.getClass();
        f66369A = nameM91079i26;
        Name nameM91079i27 = Name.m91079i("unaryMinus");
        nameM91079i27.getClass();
        f66370B = nameM91079i27;
        Name nameM91079i28 = Name.m91079i("unaryPlus");
        nameM91079i28.getClass();
        f66371C = nameM91079i28;
        Name nameM91079i29 = Name.m91079i("times");
        nameM91079i29.getClass();
        f66372D = nameM91079i29;
        Name nameM91079i30 = Name.m91079i("div");
        nameM91079i30.getClass();
        f66373E = nameM91079i30;
        Name nameM91079i31 = Name.m91079i("rem");
        nameM91079i31.getClass();
        f66374F = nameM91079i31;
        Name nameM91079i32 = Name.m91079i("rangeTo");
        nameM91079i32.getClass();
        f66375G = nameM91079i32;
        Name nameM91079i33 = Name.m91079i("rangeUntil");
        nameM91079i33.getClass();
        f66376H = nameM91079i33;
        Name nameM91079i34 = Name.m91079i("timesAssign");
        nameM91079i34.getClass();
        f66377I = nameM91079i34;
        Name nameM91079i35 = Name.m91079i("divAssign");
        nameM91079i35.getClass();
        f66378J = nameM91079i35;
        Name nameM91079i36 = Name.m91079i("remAssign");
        nameM91079i36.getClass();
        f66379K = nameM91079i36;
        Name nameM91079i37 = Name.m91079i("plusAssign");
        nameM91079i37.getClass();
        f66380L = nameM91079i37;
        Name nameM91079i38 = Name.m91079i("minusAssign");
        nameM91079i38.getClass();
        f66381M = nameM91079i38;
        Name nameM91079i39 = Name.m91079i("toDouble");
        nameM91079i39.getClass();
        f66382N = nameM91079i39;
        Name nameM91079i40 = Name.m91079i("toFloat");
        nameM91079i40.getClass();
        f66383O = nameM91079i40;
        Name nameM91079i41 = Name.m91079i("toLong");
        nameM91079i41.getClass();
        f66384P = nameM91079i41;
        Name nameM91079i42 = Name.m91079i("toInt");
        nameM91079i42.getClass();
        f66385Q = nameM91079i42;
        Name nameM91079i43 = Name.m91079i("toChar");
        nameM91079i43.getClass();
        f66386R = nameM91079i43;
        Name nameM91079i44 = Name.m91079i("toShort");
        nameM91079i44.getClass();
        f66387S = nameM91079i44;
        Name nameM91079i45 = Name.m91079i("toByte");
        nameM91079i45.getClass();
        f66388T = nameM91079i45;
        f66389U = SetsKt.setOf((Object[]) new Name[]{nameM91079i22, nameM91079i23, nameM91079i28, nameM91079i27, nameM91079i26, nameM91079i18});
        f66390V = SetsKt.setOf((Object[]) new Name[]{nameM91079i28, nameM91079i27, nameM91079i26, nameM91079i18});
        Set<Name> of = SetsKt.setOf((Object[]) new Name[]{nameM91079i29, nameM91079i24, nameM91079i25, nameM91079i30, nameM91079i31, nameM91079i32, nameM91079i33});
        f66391W = of;
        f66392X = SetsKt.setOf((Object[]) new Name[]{nameM91079i29, nameM91079i24, nameM91079i25, nameM91079i30, nameM91079i31});
        Set<Name> of2 = SetsKt.setOf((Object[]) new Name[]{nameM91079i15, nameM91079i16, nameM91079i17, nameM91079i18, nameM91079i19, nameM91079i20, nameM91079i21});
        f66393Y = of2;
        f66394Z = SetsKt.setOf((Object[]) new Name[]{nameM91079i15, nameM91079i16, nameM91079i17, nameM91079i19, nameM91079i20, nameM91079i21});
        f66396a0 = SetsKt.plus(SetsKt.plus((Set) of, (Iterable) of2), (Iterable) SetsKt.setOf((Object[]) new Name[]{nameM91079i4, nameM91079i7, nameM91079i6}));
        Set<Name> of3 = SetsKt.setOf((Object[]) new Name[]{nameM91079i34, nameM91079i35, nameM91079i36, nameM91079i37, nameM91079i38});
        f66398b0 = of3;
        f66400c0 = SetsKt.setOf((Object[]) new Name[]{nameM91079i, nameM91079i2, nameM91079i3});
        f66402d0 = SetsKt.plus(SetsKt.setOf(nameM91079i11), (Iterable) of3);
        f66404e0 = SetsKt.setOf((Object[]) new Name[]{nameM91079i39, nameM91079i40, nameM91079i41, nameM91079i42, nameM91079i44, nameM91079i45, nameM91079i43});
        f66406f0 = MapsKt.mapOf(TuplesKt.m87240a(nameM91079i22, "++"), TuplesKt.m87240a(nameM91079i23, "--"), TuplesKt.m87240a(nameM91079i28, Marker.ANY_NON_NULL_MARKER), TuplesKt.m87240a(nameM91079i27, "-"), TuplesKt.m87240a(nameM91079i26, "!"), TuplesKt.m87240a(nameM91079i29, "*"), TuplesKt.m87240a(nameM91079i24, Marker.ANY_NON_NULL_MARKER), TuplesKt.m87240a(nameM91079i25, "-"), TuplesKt.m87240a(nameM91079i30, "/"), TuplesKt.m87240a(nameM91079i31, "%"), TuplesKt.m87240a(nameM91079i32, ".."), TuplesKt.m87240a(nameM91079i33, "..<"));
    }

    private OperatorNameConventions() {
    }
}
