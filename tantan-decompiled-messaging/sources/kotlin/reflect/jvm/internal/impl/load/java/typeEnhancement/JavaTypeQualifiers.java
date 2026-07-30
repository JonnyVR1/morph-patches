package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeQualifiers {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final JavaTypeQualifiers f64963e = new JavaTypeQualifiers(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public final NullabilityQualifier f64964a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final MutabilityQualifier f64965b;

    /* JADX INFO: renamed from: c */
    public final boolean f64966c;

    /* JADX INFO: renamed from: d */
    public final boolean f64967d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final JavaTypeQualifiers m89964a() {
            return JavaTypeQualifiers.f64963e;
        }

        private Companion() {
        }
    }

    public JavaTypeQualifiers(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.f64964a = nullabilityQualifier;
        this.f64965b = mutabilityQualifier;
        this.f64966c = z;
        this.f64967d = z2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ JavaTypeQualifiers m89958c(JavaTypeQualifiers javaTypeQualifiers, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = javaTypeQualifiers.f64964a;
        }
        if ((i & 2) != 0) {
            mutabilityQualifier = javaTypeQualifiers.f64965b;
        }
        if ((i & 4) != 0) {
            z = javaTypeQualifiers.f64966c;
        }
        if ((i & 8) != 0) {
            z2 = javaTypeQualifiers.f64967d;
        }
        return javaTypeQualifiers.m89959b(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final JavaTypeQualifiers m89959b(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89960d() {
        return this.f64966c;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final MutabilityQualifier m89961e() {
        return this.f64965b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaTypeQualifiers)) {
            return false;
        }
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) obj;
        return this.f64964a == javaTypeQualifiers.f64964a && this.f64965b == javaTypeQualifiers.f64965b && this.f64966c == javaTypeQualifiers.f64966c && this.f64967d == javaTypeQualifiers.f64967d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final NullabilityQualifier m89962f() {
        return this.f64964a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m89963g() {
        return this.f64967d;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f64964a;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f64965b;
        return ((((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31) + Boolean.hashCode(this.f64966c)) * 31) + Boolean.hashCode(this.f64967d);
    }

    @NotNull
    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f64964a + ", mutability=" + this.f64965b + ", definitelyNotNull=" + this.f64966c + ", isNullabilityQualifierForWarning=" + this.f64967d + ')';
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z, (i & 8) != 0 ? false : z2);
    }
}
