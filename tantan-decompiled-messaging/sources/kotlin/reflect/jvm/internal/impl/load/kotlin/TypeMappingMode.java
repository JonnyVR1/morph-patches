package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.android.gms.common.ConnectionResult;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeMappingMode {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: l */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65077l;

    /* JADX INFO: renamed from: m */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65078m;

    /* JADX INFO: renamed from: n */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65079n;

    /* JADX INFO: renamed from: o */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65080o;

    /* JADX INFO: renamed from: p */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65081p;

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65082q;

    /* JADX INFO: renamed from: r */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65083r;

    /* JADX INFO: renamed from: s */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65084s;

    /* JADX INFO: renamed from: t */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65085t;

    /* JADX INFO: renamed from: u */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65086u;

    /* JADX INFO: renamed from: v */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65087v;

    /* JADX INFO: renamed from: w */
    @JvmField
    @NotNull
    public static final TypeMappingMode f65088w;

    /* JADX INFO: renamed from: a */
    public final boolean f65089a;

    /* JADX INFO: renamed from: b */
    public final boolean f65090b;

    /* JADX INFO: renamed from: c */
    public final boolean f65091c;

    /* JADX INFO: renamed from: d */
    public final boolean f65092d;

    /* JADX INFO: renamed from: e */
    public final boolean f65093e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final TypeMappingMode f65094f;

    /* JADX INFO: renamed from: g */
    public final boolean f65095g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final TypeMappingMode f65096h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final TypeMappingMode f65097i;

    /* JADX INFO: renamed from: j */
    public final boolean f65098j;

    /* JADX INFO: renamed from: k */
    public final boolean f65099k;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65100a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65100a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        TypeMappingMode typeMappingMode = new TypeMappingMode(z, z2, z3, z4, z5, null, false, null, null, z6, z7, 2047, null);
        f65077l = typeMappingMode;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        TypeMappingMode typeMappingMode2 = null;
        TypeMappingMode typeMappingMode3 = null;
        TypeMappingMode typeMappingMode4 = new TypeMappingMode(z8, z9, z6, z7, z10, null, z11, typeMappingMode2, typeMappingMode3, false, true, 1023, defaultConstructorMarker);
        f65078m = typeMappingMode4;
        boolean z12 = false;
        TypeMappingMode typeMappingMode5 = new TypeMappingMode(z8, z9, z6, z7, z10, 0 == true ? 1 : 0, z11, typeMappingMode2, typeMappingMode3, true, z12, 1535, defaultConstructorMarker);
        f65079n = typeMappingMode5;
        f65080o = new TypeMappingMode(z8, true, z6, z7, z10, 0 == true ? 1 : 0, z11, typeMappingMode2, typeMappingMode3, false, z12, 2045, defaultConstructorMarker);
        f65081p = new TypeMappingMode(z, z2, z3, z4, z5, typeMappingMode, false, null, null, z6, z7, 2012, 0 == true ? 1 : 0);
        f65082q = new TypeMappingMode(false, false, z6, z7, false, typeMappingMode5, z11, typeMappingMode2, typeMappingMode3, true, z12, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, defaultConstructorMarker);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z13 = false;
        TypeMappingMode typeMappingMode6 = null;
        TypeMappingMode typeMappingMode7 = null;
        f65083r = new TypeMappingMode(z, true, z3, z4, z5, typeMappingMode, z13, typeMappingMode6, typeMappingMode7, z6, z7, 2012, defaultConstructorMarker2);
        boolean z14 = false;
        f65084s = new TypeMappingMode(z, z14, z3, true, z5, typeMappingMode, z13, typeMappingMode6, typeMappingMode7, z6, z7, 2007, defaultConstructorMarker2);
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = true;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = true;
        f65085t = new TypeMappingMode(z15, z16, z6, z17, z18, typeMappingMode4, z11, typeMappingMode2, typeMappingMode3, z19, z20, 983, defaultConstructorMarker);
        f65086u = new TypeMappingMode(z15, z16, z6, z17, z18, typeMappingMode4, z11, typeMappingMode2, typeMappingMode3, z19, z20, 919, defaultConstructorMarker);
        boolean z21 = true;
        boolean z22 = false;
        TypeMappingMode typeMappingMode8 = null;
        boolean z23 = false;
        f65087v = new TypeMappingMode(z, z14, z21, z22, z5, typeMappingMode, false, null, typeMappingMode8, z6, z23, 2008, null);
        f65088w = new TypeMappingMode(true, z21, z22, z5, false, null, true, typeMappingMode8, null, z23, false, 1980, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TypeMappingMode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TypeMappingMode typeMappingMode, boolean z6, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        typeMappingMode = (i & 32) != 0 ? null : typeMappingMode;
        this(z, z2, z3, z4, z5, typeMappingMode, (i & 64) != 0 ? true : z6, (i & 128) != 0 ? typeMappingMode : typeMappingMode2, (i & 256) != 0 ? typeMappingMode : typeMappingMode3, (i & 512) != 0 ? false : z7, (i & 1024) != 0 ? false : z8);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m90405a() {
        return this.f65095g;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m90406b() {
        return this.f65098j;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90407c() {
        return this.f65090b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90408d() {
        return this.f65089a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m90409e() {
        return this.f65091c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final TypeMappingMode m90410f(@NotNull Variance variance, boolean z) {
        variance.getClass();
        if (!z || !this.f65091c) {
            int i = WhenMappings.f65100a[variance.ordinal()];
            if (i == 1) {
                TypeMappingMode typeMappingMode = this.f65096h;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i != 2) {
                TypeMappingMode typeMappingMode2 = this.f65094f;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.f65097i;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final TypeMappingMode m90411g() {
        return new TypeMappingMode(this.f65089a, true, this.f65091c, this.f65092d, this.f65093e, this.f65094f, this.f65095g, this.f65096h, this.f65097i, this.f65098j, this.f65099k);
    }

    public TypeMappingMode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable TypeMappingMode typeMappingMode, boolean z6, @Nullable TypeMappingMode typeMappingMode2, @Nullable TypeMappingMode typeMappingMode3, boolean z7, boolean z8) {
        this.f65089a = z;
        this.f65090b = z2;
        this.f65091c = z3;
        this.f65092d = z4;
        this.f65093e = z5;
        this.f65094f = typeMappingMode;
        this.f65095g = z6;
        this.f65096h = typeMappingMode2;
        this.f65097i = typeMappingMode3;
        this.f65098j = z7;
        this.f65099k = z8;
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, false, 2047, null);
    }
}
