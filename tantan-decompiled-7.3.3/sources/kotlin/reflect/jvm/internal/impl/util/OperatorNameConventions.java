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
    public static final Name f67043A;

    /* JADX INFO: renamed from: B */
    @JvmField
    @NotNull
    public static final Name f67044B;

    /* JADX INFO: renamed from: C */
    @JvmField
    @NotNull
    public static final Name f67045C;

    /* JADX INFO: renamed from: D */
    @JvmField
    @NotNull
    public static final Name f67046D;

    /* JADX INFO: renamed from: E */
    @JvmField
    @NotNull
    public static final Name f67047E;

    /* JADX INFO: renamed from: F */
    @JvmField
    @NotNull
    public static final Name f67048F;

    /* JADX INFO: renamed from: G */
    @JvmField
    @NotNull
    public static final Name f67049G;

    /* JADX INFO: renamed from: H */
    @JvmField
    @NotNull
    public static final Name f67050H;

    /* JADX INFO: renamed from: I */
    @JvmField
    @NotNull
    public static final Name f67051I;

    @NotNull
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();

    /* JADX INFO: renamed from: J */
    @JvmField
    @NotNull
    public static final Name f67052J;

    /* JADX INFO: renamed from: K */
    @JvmField
    @NotNull
    public static final Name f67053K;

    /* JADX INFO: renamed from: L */
    @JvmField
    @NotNull
    public static final Name f67054L;

    /* JADX INFO: renamed from: M */
    @JvmField
    @NotNull
    public static final Name f67055M;

    /* JADX INFO: renamed from: N */
    @JvmField
    @NotNull
    public static final Name f67056N;

    /* JADX INFO: renamed from: O */
    @JvmField
    @NotNull
    public static final Name f67057O;

    /* JADX INFO: renamed from: P */
    @JvmField
    @NotNull
    public static final Name f67058P;

    /* JADX INFO: renamed from: Q */
    @JvmField
    @NotNull
    public static final Name f67059Q;

    /* JADX INFO: renamed from: R */
    @JvmField
    @NotNull
    public static final Name f67060R;

    /* JADX INFO: renamed from: S */
    @JvmField
    @NotNull
    public static final Name f67061S;

    /* JADX INFO: renamed from: T */
    @JvmField
    @NotNull
    public static final Name f67062T;

    /* JADX INFO: renamed from: U */
    @JvmField
    @NotNull
    public static final Set<Name> f67063U;

    /* JADX INFO: renamed from: V */
    @JvmField
    @NotNull
    public static final Set<Name> f67064V;

    /* JADX INFO: renamed from: W */
    @JvmField
    @NotNull
    public static final Set<Name> f67065W;

    /* JADX INFO: renamed from: X */
    @JvmField
    @NotNull
    public static final Set<Name> f67066X;

    /* JADX INFO: renamed from: Y */
    @JvmField
    @NotNull
    public static final Set<Name> f67067Y;

    /* JADX INFO: renamed from: Z */
    @JvmField
    @NotNull
    public static final Set<Name> f67068Z;

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final Name f67069a;

    /* JADX INFO: renamed from: a0 */
    @JvmField
    @NotNull
    public static final Set<Name> f67070a0;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final Name f67071b;

    /* JADX INFO: renamed from: b0 */
    @JvmField
    @NotNull
    public static final Set<Name> f67072b0;

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final Name f67073c;

    /* JADX INFO: renamed from: c0 */
    @JvmField
    @NotNull
    public static final Set<Name> f67074c0;

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final Name f67075d;

    /* JADX INFO: renamed from: d0 */
    @JvmField
    @NotNull
    public static final Set<Name> f67076d0;

    /* JADX INFO: renamed from: e */
    @JvmField
    @NotNull
    public static final Name f67077e;

    /* JADX INFO: renamed from: e0 */
    @JvmField
    @NotNull
    public static final Set<Name> f67078e0;

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static final Name f67079f;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Map<Name, String> f67080f0;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final Name f67081g;

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final Name f67082h;

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public static final Name f67083i;

    /* JADX INFO: renamed from: j */
    @JvmField
    @NotNull
    public static final Name f67084j;

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final Name f67085k;

    /* JADX INFO: renamed from: l */
    @JvmField
    @NotNull
    public static final Name f67086l;

    /* JADX INFO: renamed from: m */
    @JvmField
    @NotNull
    public static final Name f67087m;

    /* JADX INFO: renamed from: n */
    @JvmField
    @NotNull
    public static final Name f67088n;

    /* JADX INFO: renamed from: o */
    @JvmField
    @NotNull
    public static final Regex f67089o;

    /* JADX INFO: renamed from: p */
    @JvmField
    @NotNull
    public static final Name f67090p;

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final Name f67091q;

    /* JADX INFO: renamed from: r */
    @JvmField
    @NotNull
    public static final Name f67092r;

    /* JADX INFO: renamed from: s */
    @JvmField
    @NotNull
    public static final Name f67093s;

    /* JADX INFO: renamed from: t */
    @JvmField
    @NotNull
    public static final Name f67094t;

    /* JADX INFO: renamed from: u */
    @JvmField
    @NotNull
    public static final Name f67095u;

    /* JADX INFO: renamed from: v */
    @JvmField
    @NotNull
    public static final Name f67096v;

    /* JADX INFO: renamed from: w */
    @JvmField
    @NotNull
    public static final Name f67097w;

    /* JADX INFO: renamed from: x */
    @JvmField
    @NotNull
    public static final Name f67098x;

    /* JADX INFO: renamed from: y */
    @JvmField
    @NotNull
    public static final Name f67099y;

    /* JADX INFO: renamed from: z */
    @JvmField
    @NotNull
    public static final Name f67100z;

    static {
        Name nameM91970i = Name.m91970i("getValue");
        nameM91970i.getClass();
        f67069a = nameM91970i;
        Name nameM91970i2 = Name.m91970i("setValue");
        nameM91970i2.getClass();
        f67071b = nameM91970i2;
        Name nameM91970i3 = Name.m91970i("provideDelegate");
        nameM91970i3.getClass();
        f67073c = nameM91970i3;
        Name nameM91970i4 = Name.m91970i("equals");
        nameM91970i4.getClass();
        f67075d = nameM91970i4;
        Name nameM91970i5 = Name.m91970i("hashCode");
        nameM91970i5.getClass();
        f67077e = nameM91970i5;
        Name nameM91970i6 = Name.m91970i("compareTo");
        nameM91970i6.getClass();
        f67079f = nameM91970i6;
        Name nameM91970i7 = Name.m91970i("contains");
        nameM91970i7.getClass();
        f67081g = nameM91970i7;
        Name nameM91970i8 = Name.m91970i("invoke");
        nameM91970i8.getClass();
        f67082h = nameM91970i8;
        Name nameM91970i9 = Name.m91970i("iterator");
        nameM91970i9.getClass();
        f67083i = nameM91970i9;
        Name nameM91970i10 = Name.m91970i("get");
        nameM91970i10.getClass();
        f67084j = nameM91970i10;
        Name nameM91970i11 = Name.m91970i("set");
        nameM91970i11.getClass();
        f67085k = nameM91970i11;
        Name nameM91970i12 = Name.m91970i("next");
        nameM91970i12.getClass();
        f67086l = nameM91970i12;
        Name nameM91970i13 = Name.m91970i("hasNext");
        nameM91970i13.getClass();
        f67087m = nameM91970i13;
        Name nameM91970i14 = Name.m91970i("toString");
        nameM91970i14.getClass();
        f67088n = nameM91970i14;
        f67089o = new Regex("component\\d+");
        Name nameM91970i15 = Name.m91970i("and");
        nameM91970i15.getClass();
        f67090p = nameM91970i15;
        Name nameM91970i16 = Name.m91970i("or");
        nameM91970i16.getClass();
        f67091q = nameM91970i16;
        Name nameM91970i17 = Name.m91970i("xor");
        nameM91970i17.getClass();
        f67092r = nameM91970i17;
        Name nameM91970i18 = Name.m91970i(BaseSei.INV);
        nameM91970i18.getClass();
        f67093s = nameM91970i18;
        Name nameM91970i19 = Name.m91970i("shl");
        nameM91970i19.getClass();
        f67094t = nameM91970i19;
        Name nameM91970i20 = Name.m91970i("shr");
        nameM91970i20.getClass();
        f67095u = nameM91970i20;
        Name nameM91970i21 = Name.m91970i("ushr");
        nameM91970i21.getClass();
        f67096v = nameM91970i21;
        Name nameM91970i22 = Name.m91970i("inc");
        nameM91970i22.getClass();
        f67097w = nameM91970i22;
        Name nameM91970i23 = Name.m91970i("dec");
        nameM91970i23.getClass();
        f67098x = nameM91970i23;
        Name nameM91970i24 = Name.m91970i("plus");
        nameM91970i24.getClass();
        f67099y = nameM91970i24;
        Name nameM91970i25 = Name.m91970i("minus");
        nameM91970i25.getClass();
        f67100z = nameM91970i25;
        Name nameM91970i26 = Name.m91970i("not");
        nameM91970i26.getClass();
        f67043A = nameM91970i26;
        Name nameM91970i27 = Name.m91970i("unaryMinus");
        nameM91970i27.getClass();
        f67044B = nameM91970i27;
        Name nameM91970i28 = Name.m91970i("unaryPlus");
        nameM91970i28.getClass();
        f67045C = nameM91970i28;
        Name nameM91970i29 = Name.m91970i("times");
        nameM91970i29.getClass();
        f67046D = nameM91970i29;
        Name nameM91970i30 = Name.m91970i("div");
        nameM91970i30.getClass();
        f67047E = nameM91970i30;
        Name nameM91970i31 = Name.m91970i("rem");
        nameM91970i31.getClass();
        f67048F = nameM91970i31;
        Name nameM91970i32 = Name.m91970i("rangeTo");
        nameM91970i32.getClass();
        f67049G = nameM91970i32;
        Name nameM91970i33 = Name.m91970i("rangeUntil");
        nameM91970i33.getClass();
        f67050H = nameM91970i33;
        Name nameM91970i34 = Name.m91970i("timesAssign");
        nameM91970i34.getClass();
        f67051I = nameM91970i34;
        Name nameM91970i35 = Name.m91970i("divAssign");
        nameM91970i35.getClass();
        f67052J = nameM91970i35;
        Name nameM91970i36 = Name.m91970i("remAssign");
        nameM91970i36.getClass();
        f67053K = nameM91970i36;
        Name nameM91970i37 = Name.m91970i("plusAssign");
        nameM91970i37.getClass();
        f67054L = nameM91970i37;
        Name nameM91970i38 = Name.m91970i("minusAssign");
        nameM91970i38.getClass();
        f67055M = nameM91970i38;
        Name nameM91970i39 = Name.m91970i("toDouble");
        nameM91970i39.getClass();
        f67056N = nameM91970i39;
        Name nameM91970i40 = Name.m91970i("toFloat");
        nameM91970i40.getClass();
        f67057O = nameM91970i40;
        Name nameM91970i41 = Name.m91970i("toLong");
        nameM91970i41.getClass();
        f67058P = nameM91970i41;
        Name nameM91970i42 = Name.m91970i("toInt");
        nameM91970i42.getClass();
        f67059Q = nameM91970i42;
        Name nameM91970i43 = Name.m91970i("toChar");
        nameM91970i43.getClass();
        f67060R = nameM91970i43;
        Name nameM91970i44 = Name.m91970i("toShort");
        nameM91970i44.getClass();
        f67061S = nameM91970i44;
        Name nameM91970i45 = Name.m91970i("toByte");
        nameM91970i45.getClass();
        f67062T = nameM91970i45;
        f67063U = SetsKt.setOf((Object[]) new Name[]{nameM91970i22, nameM91970i23, nameM91970i28, nameM91970i27, nameM91970i26, nameM91970i18});
        f67064V = SetsKt.setOf((Object[]) new Name[]{nameM91970i28, nameM91970i27, nameM91970i26, nameM91970i18});
        Set<Name> of = SetsKt.setOf((Object[]) new Name[]{nameM91970i29, nameM91970i24, nameM91970i25, nameM91970i30, nameM91970i31, nameM91970i32, nameM91970i33});
        f67065W = of;
        f67066X = SetsKt.setOf((Object[]) new Name[]{nameM91970i29, nameM91970i24, nameM91970i25, nameM91970i30, nameM91970i31});
        Set<Name> of2 = SetsKt.setOf((Object[]) new Name[]{nameM91970i15, nameM91970i16, nameM91970i17, nameM91970i18, nameM91970i19, nameM91970i20, nameM91970i21});
        f67067Y = of2;
        f67068Z = SetsKt.setOf((Object[]) new Name[]{nameM91970i15, nameM91970i16, nameM91970i17, nameM91970i19, nameM91970i20, nameM91970i21});
        f67070a0 = SetsKt.plus(SetsKt.plus((Set) of, (Iterable) of2), (Iterable) SetsKt.setOf((Object[]) new Name[]{nameM91970i4, nameM91970i7, nameM91970i6}));
        Set<Name> of3 = SetsKt.setOf((Object[]) new Name[]{nameM91970i34, nameM91970i35, nameM91970i36, nameM91970i37, nameM91970i38});
        f67072b0 = of3;
        f67074c0 = SetsKt.setOf((Object[]) new Name[]{nameM91970i, nameM91970i2, nameM91970i3});
        f67076d0 = SetsKt.plus(SetsKt.setOf(nameM91970i11), (Iterable) of3);
        f67078e0 = SetsKt.setOf((Object[]) new Name[]{nameM91970i39, nameM91970i40, nameM91970i41, nameM91970i42, nameM91970i44, nameM91970i45, nameM91970i43});
        f67080f0 = MapsKt.mapOf(TuplesKt.m88129a(nameM91970i22, "++"), TuplesKt.m88129a(nameM91970i23, "--"), TuplesKt.m88129a(nameM91970i28, Marker.ANY_NON_NULL_MARKER), TuplesKt.m88129a(nameM91970i27, "-"), TuplesKt.m88129a(nameM91970i26, "!"), TuplesKt.m88129a(nameM91970i29, "*"), TuplesKt.m88129a(nameM91970i24, Marker.ANY_NON_NULL_MARKER), TuplesKt.m88129a(nameM91970i25, "-"), TuplesKt.m88129a(nameM91970i30, "/"), TuplesKt.m88129a(nameM91970i31, "%"), TuplesKt.m88129a(nameM91970i32, ".."), TuplesKt.m88129a(nameM91970i33, "..<"));
    }

    private OperatorNameConventions() {
    }
}
