package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.qg50;

/* JADX INFO: loaded from: classes2.dex */
public class Flags {

    /* JADX INFO: renamed from: A */
    public static final BooleanFlagField f66014A;

    /* JADX INFO: renamed from: B */
    public static final BooleanFlagField f66015B;

    /* JADX INFO: renamed from: C */
    public static final BooleanFlagField f66016C;

    /* JADX INFO: renamed from: D */
    public static final BooleanFlagField f66017D;

    /* JADX INFO: renamed from: E */
    public static final BooleanFlagField f66018E;

    /* JADX INFO: renamed from: F */
    public static final BooleanFlagField f66019F;

    /* JADX INFO: renamed from: G */
    public static final BooleanFlagField f66020G;

    /* JADX INFO: renamed from: H */
    public static final BooleanFlagField f66021H;

    /* JADX INFO: renamed from: I */
    public static final BooleanFlagField f66022I;

    /* JADX INFO: renamed from: J */
    public static final BooleanFlagField f66023J;

    /* JADX INFO: renamed from: K */
    public static final BooleanFlagField f66024K;

    /* JADX INFO: renamed from: L */
    public static final BooleanFlagField f66025L;

    /* JADX INFO: renamed from: M */
    public static final BooleanFlagField f66026M;

    /* JADX INFO: renamed from: N */
    public static final BooleanFlagField f66027N;

    /* JADX INFO: renamed from: O */
    public static final BooleanFlagField f66028O;

    /* JADX INFO: renamed from: P */
    public static final BooleanFlagField f66029P;

    /* JADX INFO: renamed from: Q */
    public static final BooleanFlagField f66030Q;

    /* JADX INFO: renamed from: R */
    public static final BooleanFlagField f66031R;

    /* JADX INFO: renamed from: S */
    public static final BooleanFlagField f66032S;

    /* JADX INFO: renamed from: a */
    public static final BooleanFlagField f66033a;

    /* JADX INFO: renamed from: b */
    public static final BooleanFlagField f66034b;

    /* JADX INFO: renamed from: c */
    public static final BooleanFlagField f66035c;

    /* JADX INFO: renamed from: d */
    public static final FlagField<ProtoBuf.Visibility> f66036d;

    /* JADX INFO: renamed from: e */
    public static final FlagField<ProtoBuf.Modality> f66037e;

    /* JADX INFO: renamed from: f */
    public static final FlagField<ProtoBuf.Class.Kind> f66038f;

    /* JADX INFO: renamed from: g */
    public static final BooleanFlagField f66039g;

    /* JADX INFO: renamed from: h */
    public static final BooleanFlagField f66040h;

    /* JADX INFO: renamed from: i */
    public static final BooleanFlagField f66041i;

    /* JADX INFO: renamed from: j */
    public static final BooleanFlagField f66042j;

    /* JADX INFO: renamed from: k */
    public static final BooleanFlagField f66043k;

    /* JADX INFO: renamed from: l */
    public static final BooleanFlagField f66044l;

    /* JADX INFO: renamed from: m */
    public static final BooleanFlagField f66045m;

    /* JADX INFO: renamed from: n */
    public static final BooleanFlagField f66046n;

    /* JADX INFO: renamed from: o */
    public static final BooleanFlagField f66047o;

    /* JADX INFO: renamed from: p */
    public static final BooleanFlagField f66048p;

    /* JADX INFO: renamed from: q */
    public static final FlagField<ProtoBuf.MemberKind> f66049q;

    /* JADX INFO: renamed from: r */
    public static final BooleanFlagField f66050r;

    /* JADX INFO: renamed from: s */
    public static final BooleanFlagField f66051s;

    /* JADX INFO: renamed from: t */
    public static final BooleanFlagField f66052t;

    /* JADX INFO: renamed from: u */
    public static final BooleanFlagField f66053u;

    /* JADX INFO: renamed from: v */
    public static final BooleanFlagField f66054v;

    /* JADX INFO: renamed from: w */
    public static final BooleanFlagField f66055w;

    /* JADX INFO: renamed from: x */
    public static final BooleanFlagField f66056x;

    /* JADX INFO: renamed from: y */
    public static final BooleanFlagField f66057y;

    /* JADX INFO: renamed from: z */
    public static final BooleanFlagField f66058z;

    public static class BooleanFlagField extends FlagField<Boolean> {
        public BooleanFlagField(int i) {
            super(i, 1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean mo91766d(int i) {
            return Boolean.valueOf(((1 << this.f66059a) & i) != 0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int mo91767e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f66059a;
            }
            return 0;
        }
    }

    public static abstract class FlagField<E> {

        /* JADX INFO: renamed from: a */
        public final int f66059a;

        /* JADX INFO: renamed from: b */
        public final int f66060b;

        public FlagField(int i, int i2) {
            this.f66059a = i;
            this.f66060b = i2;
        }

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/Internal$EnumLite;>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<*>;[TE;)Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<TE;>; */
        /* JADX INFO: renamed from: a */
        public static FlagField m91770a(FlagField flagField, Internal.EnumLite[] enumLiteArr) {
            return new C15383b(flagField.f66059a + flagField.f66060b, enumLiteArr);
        }

        /* JADX INFO: renamed from: b */
        public static BooleanFlagField m91771b(FlagField<?> flagField) {
            return new BooleanFlagField(flagField.f66059a + flagField.f66060b);
        }

        /* JADX INFO: renamed from: c */
        public static BooleanFlagField m91772c() {
            return new BooleanFlagField(0);
        }

        /* JADX INFO: renamed from: d */
        public abstract E mo91766d(int i);

        /* JADX INFO: renamed from: e */
        public abstract int mo91767e(E e);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$b */
    public static class C15383b<E extends Internal.EnumLite> extends FlagField<E> {

        /* JADX INFO: renamed from: c */
        public final E[] f66061c;

        public C15383b(int i, E[] eArr) {
            super(i, m91774g(eArr));
            this.f66061c = eArr;
        }

        /* JADX INFO: renamed from: f */
        private static /* synthetic */ void m91773f(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        /* JADX INFO: renamed from: g */
        public static <E> int m91774g(@NotNull E[] eArr) {
            if (eArr == null) {
                m91773f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            qg50.m176437a("Empty enum: ", eArr.getClass());
            return 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        @Nullable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public E mo91766d(int i) {
            int i2 = (1 << this.f66060b) - 1;
            int i3 = this.f66059a;
            int i4 = (i & (i2 << i3)) >> i3;
            for (E e : this.f66061c) {
                if (e.getNumber() == i4) {
                    return e;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int mo91767e(E e) {
            return e.getNumber() << this.f66059a;
        }
    }

    static {
        BooleanFlagField booleanFlagFieldM91772c = FlagField.m91772c();
        f66033a = booleanFlagFieldM91772c;
        f66034b = FlagField.m91771b(booleanFlagFieldM91772c);
        BooleanFlagField booleanFlagFieldM91772c2 = FlagField.m91772c();
        f66035c = booleanFlagFieldM91772c2;
        FlagField<ProtoBuf.Visibility> flagFieldM91770a = FlagField.m91770a(booleanFlagFieldM91772c2, ProtoBuf.Visibility.values());
        f66036d = flagFieldM91770a;
        FlagField<ProtoBuf.Modality> flagFieldM91770a2 = FlagField.m91770a(flagFieldM91770a, ProtoBuf.Modality.values());
        f66037e = flagFieldM91770a2;
        FlagField<ProtoBuf.Class.Kind> flagFieldM91770a3 = FlagField.m91770a(flagFieldM91770a2, ProtoBuf.Class.Kind.values());
        f66038f = flagFieldM91770a3;
        BooleanFlagField booleanFlagFieldM91771b = FlagField.m91771b(flagFieldM91770a3);
        f66039g = booleanFlagFieldM91771b;
        BooleanFlagField booleanFlagFieldM91771b2 = FlagField.m91771b(booleanFlagFieldM91771b);
        f66040h = booleanFlagFieldM91771b2;
        BooleanFlagField booleanFlagFieldM91771b3 = FlagField.m91771b(booleanFlagFieldM91771b2);
        f66041i = booleanFlagFieldM91771b3;
        BooleanFlagField booleanFlagFieldM91771b4 = FlagField.m91771b(booleanFlagFieldM91771b3);
        f66042j = booleanFlagFieldM91771b4;
        BooleanFlagField booleanFlagFieldM91771b5 = FlagField.m91771b(booleanFlagFieldM91771b4);
        f66043k = booleanFlagFieldM91771b5;
        BooleanFlagField booleanFlagFieldM91771b6 = FlagField.m91771b(booleanFlagFieldM91771b5);
        f66044l = booleanFlagFieldM91771b6;
        f66045m = FlagField.m91771b(booleanFlagFieldM91771b6);
        BooleanFlagField booleanFlagFieldM91771b7 = FlagField.m91771b(flagFieldM91770a);
        f66046n = booleanFlagFieldM91771b7;
        BooleanFlagField booleanFlagFieldM91771b8 = FlagField.m91771b(booleanFlagFieldM91771b7);
        f66047o = booleanFlagFieldM91771b8;
        f66048p = FlagField.m91771b(booleanFlagFieldM91771b8);
        FlagField<ProtoBuf.MemberKind> flagFieldM91770a4 = FlagField.m91770a(flagFieldM91770a2, ProtoBuf.MemberKind.values());
        f66049q = flagFieldM91770a4;
        BooleanFlagField booleanFlagFieldM91771b9 = FlagField.m91771b(flagFieldM91770a4);
        f66050r = booleanFlagFieldM91771b9;
        BooleanFlagField booleanFlagFieldM91771b10 = FlagField.m91771b(booleanFlagFieldM91771b9);
        f66051s = booleanFlagFieldM91771b10;
        BooleanFlagField booleanFlagFieldM91771b11 = FlagField.m91771b(booleanFlagFieldM91771b10);
        f66052t = booleanFlagFieldM91771b11;
        BooleanFlagField booleanFlagFieldM91771b12 = FlagField.m91771b(booleanFlagFieldM91771b11);
        f66053u = booleanFlagFieldM91771b12;
        BooleanFlagField booleanFlagFieldM91771b13 = FlagField.m91771b(booleanFlagFieldM91771b12);
        f66054v = booleanFlagFieldM91771b13;
        BooleanFlagField booleanFlagFieldM91771b14 = FlagField.m91771b(booleanFlagFieldM91771b13);
        f66055w = booleanFlagFieldM91771b14;
        BooleanFlagField booleanFlagFieldM91771b15 = FlagField.m91771b(booleanFlagFieldM91771b14);
        f66056x = booleanFlagFieldM91771b15;
        BooleanFlagField booleanFlagFieldM91771b16 = FlagField.m91771b(booleanFlagFieldM91771b15);
        f66057y = booleanFlagFieldM91771b16;
        f66058z = FlagField.m91771b(booleanFlagFieldM91771b16);
        BooleanFlagField booleanFlagFieldM91771b17 = FlagField.m91771b(flagFieldM91770a4);
        f66014A = booleanFlagFieldM91771b17;
        BooleanFlagField booleanFlagFieldM91771b18 = FlagField.m91771b(booleanFlagFieldM91771b17);
        f66015B = booleanFlagFieldM91771b18;
        BooleanFlagField booleanFlagFieldM91771b19 = FlagField.m91771b(booleanFlagFieldM91771b18);
        f66016C = booleanFlagFieldM91771b19;
        BooleanFlagField booleanFlagFieldM91771b20 = FlagField.m91771b(booleanFlagFieldM91771b19);
        f66017D = booleanFlagFieldM91771b20;
        BooleanFlagField booleanFlagFieldM91771b21 = FlagField.m91771b(booleanFlagFieldM91771b20);
        f66018E = booleanFlagFieldM91771b21;
        BooleanFlagField booleanFlagFieldM91771b22 = FlagField.m91771b(booleanFlagFieldM91771b21);
        f66019F = booleanFlagFieldM91771b22;
        BooleanFlagField booleanFlagFieldM91771b23 = FlagField.m91771b(booleanFlagFieldM91771b22);
        f66020G = booleanFlagFieldM91771b23;
        BooleanFlagField booleanFlagFieldM91771b24 = FlagField.m91771b(booleanFlagFieldM91771b23);
        f66021H = booleanFlagFieldM91771b24;
        BooleanFlagField booleanFlagFieldM91771b25 = FlagField.m91771b(booleanFlagFieldM91771b24);
        f66022I = booleanFlagFieldM91771b25;
        f66023J = FlagField.m91771b(booleanFlagFieldM91771b25);
        BooleanFlagField booleanFlagFieldM91771b26 = FlagField.m91771b(booleanFlagFieldM91772c2);
        f66024K = booleanFlagFieldM91771b26;
        BooleanFlagField booleanFlagFieldM91771b27 = FlagField.m91771b(booleanFlagFieldM91771b26);
        f66025L = booleanFlagFieldM91771b27;
        f66026M = FlagField.m91771b(booleanFlagFieldM91771b27);
        BooleanFlagField booleanFlagFieldM91771b28 = FlagField.m91771b(flagFieldM91770a2);
        f66027N = booleanFlagFieldM91771b28;
        BooleanFlagField booleanFlagFieldM91771b29 = FlagField.m91771b(booleanFlagFieldM91771b28);
        f66028O = booleanFlagFieldM91771b29;
        f66029P = FlagField.m91771b(booleanFlagFieldM91771b29);
        BooleanFlagField booleanFlagFieldM91772c3 = FlagField.m91772c();
        f66030Q = booleanFlagFieldM91772c3;
        f66031R = FlagField.m91771b(booleanFlagFieldM91772c3);
        f66032S = FlagField.m91772c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m91764a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "modality";
        } else if (i == 2) {
            objArr[0] = "kind";
        } else if (i == 5) {
            objArr[0] = "modality";
        } else if (i == 6) {
            objArr[0] = "memberKind";
        } else if (i == 8) {
            objArr[0] = "modality";
        } else if (i == 9) {
            objArr[0] = "memberKind";
        } else if (i != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: b */
    public static int m91765b(boolean z, @NotNull ProtoBuf.Visibility visibility, @NotNull ProtoBuf.Modality modality, boolean z2, boolean z3, boolean z4) {
        if (visibility == null) {
            m91764a(10);
        }
        if (modality == null) {
            m91764a(11);
        }
        return f66035c.mo91767e(Boolean.valueOf(z)) | f66037e.mo91767e(modality) | f66036d.mo91767e(visibility) | f66027N.mo91767e(Boolean.valueOf(z2)) | f66028O.mo91767e(Boolean.valueOf(z3)) | f66029P.mo91767e(Boolean.valueOf(z4));
    }
}
