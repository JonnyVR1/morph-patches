package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j850;

/* JADX INFO: loaded from: classes2.dex */
public class Flags {

    /* JADX INFO: renamed from: A */
    public static final BooleanFlagField f65340A;

    /* JADX INFO: renamed from: B */
    public static final BooleanFlagField f65341B;

    /* JADX INFO: renamed from: C */
    public static final BooleanFlagField f65342C;

    /* JADX INFO: renamed from: D */
    public static final BooleanFlagField f65343D;

    /* JADX INFO: renamed from: E */
    public static final BooleanFlagField f65344E;

    /* JADX INFO: renamed from: F */
    public static final BooleanFlagField f65345F;

    /* JADX INFO: renamed from: G */
    public static final BooleanFlagField f65346G;

    /* JADX INFO: renamed from: H */
    public static final BooleanFlagField f65347H;

    /* JADX INFO: renamed from: I */
    public static final BooleanFlagField f65348I;

    /* JADX INFO: renamed from: J */
    public static final BooleanFlagField f65349J;

    /* JADX INFO: renamed from: K */
    public static final BooleanFlagField f65350K;

    /* JADX INFO: renamed from: L */
    public static final BooleanFlagField f65351L;

    /* JADX INFO: renamed from: M */
    public static final BooleanFlagField f65352M;

    /* JADX INFO: renamed from: N */
    public static final BooleanFlagField f65353N;

    /* JADX INFO: renamed from: O */
    public static final BooleanFlagField f65354O;

    /* JADX INFO: renamed from: P */
    public static final BooleanFlagField f65355P;

    /* JADX INFO: renamed from: Q */
    public static final BooleanFlagField f65356Q;

    /* JADX INFO: renamed from: R */
    public static final BooleanFlagField f65357R;

    /* JADX INFO: renamed from: S */
    public static final BooleanFlagField f65358S;

    /* JADX INFO: renamed from: a */
    public static final BooleanFlagField f65359a;

    /* JADX INFO: renamed from: b */
    public static final BooleanFlagField f65360b;

    /* JADX INFO: renamed from: c */
    public static final BooleanFlagField f65361c;

    /* JADX INFO: renamed from: d */
    public static final FlagField<ProtoBuf.Visibility> f65362d;

    /* JADX INFO: renamed from: e */
    public static final FlagField<ProtoBuf.Modality> f65363e;

    /* JADX INFO: renamed from: f */
    public static final FlagField<ProtoBuf.Class.Kind> f65364f;

    /* JADX INFO: renamed from: g */
    public static final BooleanFlagField f65365g;

    /* JADX INFO: renamed from: h */
    public static final BooleanFlagField f65366h;

    /* JADX INFO: renamed from: i */
    public static final BooleanFlagField f65367i;

    /* JADX INFO: renamed from: j */
    public static final BooleanFlagField f65368j;

    /* JADX INFO: renamed from: k */
    public static final BooleanFlagField f65369k;

    /* JADX INFO: renamed from: l */
    public static final BooleanFlagField f65370l;

    /* JADX INFO: renamed from: m */
    public static final BooleanFlagField f65371m;

    /* JADX INFO: renamed from: n */
    public static final BooleanFlagField f65372n;

    /* JADX INFO: renamed from: o */
    public static final BooleanFlagField f65373o;

    /* JADX INFO: renamed from: p */
    public static final BooleanFlagField f65374p;

    /* JADX INFO: renamed from: q */
    public static final FlagField<ProtoBuf.MemberKind> f65375q;

    /* JADX INFO: renamed from: r */
    public static final BooleanFlagField f65376r;

    /* JADX INFO: renamed from: s */
    public static final BooleanFlagField f65377s;

    /* JADX INFO: renamed from: t */
    public static final BooleanFlagField f65378t;

    /* JADX INFO: renamed from: u */
    public static final BooleanFlagField f65379u;

    /* JADX INFO: renamed from: v */
    public static final BooleanFlagField f65380v;

    /* JADX INFO: renamed from: w */
    public static final BooleanFlagField f65381w;

    /* JADX INFO: renamed from: x */
    public static final BooleanFlagField f65382x;

    /* JADX INFO: renamed from: y */
    public static final BooleanFlagField f65383y;

    /* JADX INFO: renamed from: z */
    public static final BooleanFlagField f65384z;

    public static class BooleanFlagField extends FlagField<Boolean> {
        public BooleanFlagField(int i) {
            super(i, 1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean mo90875d(int i) {
            return Boolean.valueOf(((1 << this.f65385a) & i) != 0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int mo90876e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f65385a;
            }
            return 0;
        }
    }

    public static abstract class FlagField<E> {

        /* JADX INFO: renamed from: a */
        public final int f65385a;

        /* JADX INFO: renamed from: b */
        public final int f65386b;

        public FlagField(int i, int i2) {
            this.f65385a = i;
            this.f65386b = i2;
        }

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/Internal$EnumLite;>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<*>;[TE;)Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<TE;>; */
        /* JADX INFO: renamed from: a */
        public static FlagField m90879a(FlagField flagField, Internal.EnumLite[] enumLiteArr) {
            return new C15276b(flagField.f65385a + flagField.f65386b, enumLiteArr);
        }

        /* JADX INFO: renamed from: b */
        public static BooleanFlagField m90880b(FlagField<?> flagField) {
            return new BooleanFlagField(flagField.f65385a + flagField.f65386b);
        }

        /* JADX INFO: renamed from: c */
        public static BooleanFlagField m90881c() {
            return new BooleanFlagField(0);
        }

        /* JADX INFO: renamed from: d */
        public abstract E mo90875d(int i);

        /* JADX INFO: renamed from: e */
        public abstract int mo90876e(E e);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$b */
    public static class C15276b<E extends Internal.EnumLite> extends FlagField<E> {

        /* JADX INFO: renamed from: c */
        public final E[] f65387c;

        public C15276b(int i, E[] eArr) {
            super(i, m90883g(eArr));
            this.f65387c = eArr;
        }

        /* JADX INFO: renamed from: f */
        private static /* synthetic */ void m90882f(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        /* JADX INFO: renamed from: g */
        public static <E> int m90883g(@NotNull E[] eArr) {
            if (eArr == null) {
                m90882f(0);
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
            j850.m140190a("Empty enum: ", eArr.getClass());
            return 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        @Nullable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public E mo90875d(int i) {
            int i2 = (1 << this.f65386b) - 1;
            int i3 = this.f65385a;
            int i4 = (i & (i2 << i3)) >> i3;
            for (E e : this.f65387c) {
                if (e.getNumber() == i4) {
                    return e;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int mo90876e(E e) {
            return e.getNumber() << this.f65385a;
        }
    }

    static {
        BooleanFlagField booleanFlagFieldM90881c = FlagField.m90881c();
        f65359a = booleanFlagFieldM90881c;
        f65360b = FlagField.m90880b(booleanFlagFieldM90881c);
        BooleanFlagField booleanFlagFieldM90881c2 = FlagField.m90881c();
        f65361c = booleanFlagFieldM90881c2;
        FlagField<ProtoBuf.Visibility> flagFieldM90879a = FlagField.m90879a(booleanFlagFieldM90881c2, ProtoBuf.Visibility.values());
        f65362d = flagFieldM90879a;
        FlagField<ProtoBuf.Modality> flagFieldM90879a2 = FlagField.m90879a(flagFieldM90879a, ProtoBuf.Modality.values());
        f65363e = flagFieldM90879a2;
        FlagField<ProtoBuf.Class.Kind> flagFieldM90879a3 = FlagField.m90879a(flagFieldM90879a2, ProtoBuf.Class.Kind.values());
        f65364f = flagFieldM90879a3;
        BooleanFlagField booleanFlagFieldM90880b = FlagField.m90880b(flagFieldM90879a3);
        f65365g = booleanFlagFieldM90880b;
        BooleanFlagField booleanFlagFieldM90880b2 = FlagField.m90880b(booleanFlagFieldM90880b);
        f65366h = booleanFlagFieldM90880b2;
        BooleanFlagField booleanFlagFieldM90880b3 = FlagField.m90880b(booleanFlagFieldM90880b2);
        f65367i = booleanFlagFieldM90880b3;
        BooleanFlagField booleanFlagFieldM90880b4 = FlagField.m90880b(booleanFlagFieldM90880b3);
        f65368j = booleanFlagFieldM90880b4;
        BooleanFlagField booleanFlagFieldM90880b5 = FlagField.m90880b(booleanFlagFieldM90880b4);
        f65369k = booleanFlagFieldM90880b5;
        BooleanFlagField booleanFlagFieldM90880b6 = FlagField.m90880b(booleanFlagFieldM90880b5);
        f65370l = booleanFlagFieldM90880b6;
        f65371m = FlagField.m90880b(booleanFlagFieldM90880b6);
        BooleanFlagField booleanFlagFieldM90880b7 = FlagField.m90880b(flagFieldM90879a);
        f65372n = booleanFlagFieldM90880b7;
        BooleanFlagField booleanFlagFieldM90880b8 = FlagField.m90880b(booleanFlagFieldM90880b7);
        f65373o = booleanFlagFieldM90880b8;
        f65374p = FlagField.m90880b(booleanFlagFieldM90880b8);
        FlagField<ProtoBuf.MemberKind> flagFieldM90879a4 = FlagField.m90879a(flagFieldM90879a2, ProtoBuf.MemberKind.values());
        f65375q = flagFieldM90879a4;
        BooleanFlagField booleanFlagFieldM90880b9 = FlagField.m90880b(flagFieldM90879a4);
        f65376r = booleanFlagFieldM90880b9;
        BooleanFlagField booleanFlagFieldM90880b10 = FlagField.m90880b(booleanFlagFieldM90880b9);
        f65377s = booleanFlagFieldM90880b10;
        BooleanFlagField booleanFlagFieldM90880b11 = FlagField.m90880b(booleanFlagFieldM90880b10);
        f65378t = booleanFlagFieldM90880b11;
        BooleanFlagField booleanFlagFieldM90880b12 = FlagField.m90880b(booleanFlagFieldM90880b11);
        f65379u = booleanFlagFieldM90880b12;
        BooleanFlagField booleanFlagFieldM90880b13 = FlagField.m90880b(booleanFlagFieldM90880b12);
        f65380v = booleanFlagFieldM90880b13;
        BooleanFlagField booleanFlagFieldM90880b14 = FlagField.m90880b(booleanFlagFieldM90880b13);
        f65381w = booleanFlagFieldM90880b14;
        BooleanFlagField booleanFlagFieldM90880b15 = FlagField.m90880b(booleanFlagFieldM90880b14);
        f65382x = booleanFlagFieldM90880b15;
        BooleanFlagField booleanFlagFieldM90880b16 = FlagField.m90880b(booleanFlagFieldM90880b15);
        f65383y = booleanFlagFieldM90880b16;
        f65384z = FlagField.m90880b(booleanFlagFieldM90880b16);
        BooleanFlagField booleanFlagFieldM90880b17 = FlagField.m90880b(flagFieldM90879a4);
        f65340A = booleanFlagFieldM90880b17;
        BooleanFlagField booleanFlagFieldM90880b18 = FlagField.m90880b(booleanFlagFieldM90880b17);
        f65341B = booleanFlagFieldM90880b18;
        BooleanFlagField booleanFlagFieldM90880b19 = FlagField.m90880b(booleanFlagFieldM90880b18);
        f65342C = booleanFlagFieldM90880b19;
        BooleanFlagField booleanFlagFieldM90880b20 = FlagField.m90880b(booleanFlagFieldM90880b19);
        f65343D = booleanFlagFieldM90880b20;
        BooleanFlagField booleanFlagFieldM90880b21 = FlagField.m90880b(booleanFlagFieldM90880b20);
        f65344E = booleanFlagFieldM90880b21;
        BooleanFlagField booleanFlagFieldM90880b22 = FlagField.m90880b(booleanFlagFieldM90880b21);
        f65345F = booleanFlagFieldM90880b22;
        BooleanFlagField booleanFlagFieldM90880b23 = FlagField.m90880b(booleanFlagFieldM90880b22);
        f65346G = booleanFlagFieldM90880b23;
        BooleanFlagField booleanFlagFieldM90880b24 = FlagField.m90880b(booleanFlagFieldM90880b23);
        f65347H = booleanFlagFieldM90880b24;
        BooleanFlagField booleanFlagFieldM90880b25 = FlagField.m90880b(booleanFlagFieldM90880b24);
        f65348I = booleanFlagFieldM90880b25;
        f65349J = FlagField.m90880b(booleanFlagFieldM90880b25);
        BooleanFlagField booleanFlagFieldM90880b26 = FlagField.m90880b(booleanFlagFieldM90881c2);
        f65350K = booleanFlagFieldM90880b26;
        BooleanFlagField booleanFlagFieldM90880b27 = FlagField.m90880b(booleanFlagFieldM90880b26);
        f65351L = booleanFlagFieldM90880b27;
        f65352M = FlagField.m90880b(booleanFlagFieldM90880b27);
        BooleanFlagField booleanFlagFieldM90880b28 = FlagField.m90880b(flagFieldM90879a2);
        f65353N = booleanFlagFieldM90880b28;
        BooleanFlagField booleanFlagFieldM90880b29 = FlagField.m90880b(booleanFlagFieldM90880b28);
        f65354O = booleanFlagFieldM90880b29;
        f65355P = FlagField.m90880b(booleanFlagFieldM90880b29);
        BooleanFlagField booleanFlagFieldM90881c3 = FlagField.m90881c();
        f65356Q = booleanFlagFieldM90881c3;
        f65357R = FlagField.m90880b(booleanFlagFieldM90881c3);
        f65358S = FlagField.m90881c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m90873a(int i) {
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
    public static int m90874b(boolean z, @NotNull ProtoBuf.Visibility visibility, @NotNull ProtoBuf.Modality modality, boolean z2, boolean z3, boolean z4) {
        if (visibility == null) {
            m90873a(10);
        }
        if (modality == null) {
            m90873a(11);
        }
        return f65361c.mo90876e(Boolean.valueOf(z)) | f65363e.mo90876e(modality) | f65362d.mo90876e(visibility) | f65353N.mo90876e(Boolean.valueOf(z2)) | f65354O.mo90876e(Boolean.valueOf(z3)) | f65355P.mo90876e(Boolean.valueOf(z4));
    }
}
