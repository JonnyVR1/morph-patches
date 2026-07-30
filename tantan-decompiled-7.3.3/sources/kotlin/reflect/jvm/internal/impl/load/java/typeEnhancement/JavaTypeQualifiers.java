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
    public static final JavaTypeQualifiers f65637e = new JavaTypeQualifiers(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public final NullabilityQualifier f65638a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final MutabilityQualifier f65639b;

    /* JADX INFO: renamed from: c */
    public final boolean f65640c;

    /* JADX INFO: renamed from: d */
    public final boolean f65641d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final JavaTypeQualifiers m90855a() {
            return JavaTypeQualifiers.f65637e;
        }

        private Companion() {
        }
    }

    public JavaTypeQualifiers(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.f65638a = nullabilityQualifier;
        this.f65639b = mutabilityQualifier;
        this.f65640c = z;
        this.f65641d = z2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ JavaTypeQualifiers m90849c(JavaTypeQualifiers javaTypeQualifiers, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = javaTypeQualifiers.f65638a;
        }
        if ((i & 2) != 0) {
            mutabilityQualifier = javaTypeQualifiers.f65639b;
        }
        if ((i & 4) != 0) {
            z = javaTypeQualifiers.f65640c;
        }
        if ((i & 8) != 0) {
            z2 = javaTypeQualifiers.f65641d;
        }
        return javaTypeQualifiers.m90850b(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final JavaTypeQualifiers m90850b(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90851d() {
        return this.f65640c;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final MutabilityQualifier m90852e() {
        return this.f65639b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaTypeQualifiers)) {
            return false;
        }
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) obj;
        return this.f65638a == javaTypeQualifiers.f65638a && this.f65639b == javaTypeQualifiers.f65639b && this.f65640c == javaTypeQualifiers.f65640c && this.f65641d == javaTypeQualifiers.f65641d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final NullabilityQualifier m90853f() {
        return this.f65638a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m90854g() {
        return this.f65641d;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f65638a;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f65639b;
        return ((((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31) + Boolean.hashCode(this.f65640c)) * 31) + Boolean.hashCode(this.f65641d);
    }

    @NotNull
    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f65638a + ", mutability=" + this.f65639b + ", definitelyNotNull=" + this.f65640c + ", isNullabilityQualifierForWarning=" + this.f65641d + ')';
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z, (i & 8) != 0 ? false : z2);
    }
}
