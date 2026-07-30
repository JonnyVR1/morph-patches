package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDefaultQualifiers {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NullabilityQualifierWithMigrationStatus f64655a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Collection<AnnotationQualifierApplicabilityType> f64656b;

    /* JADX INFO: renamed from: c */
    public final boolean f64657c;

    /* JADX INFO: renamed from: d */
    public final boolean f64658d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            z = nullabilityQualifierWithMigrationStatus.m89977c() == NullabilityQualifier.NOT_NULL;
        }
        this(nullabilityQualifierWithMigrationStatus, collection, z, (i & 8) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ JavaDefaultQualifiers m89384b(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.f64655a;
        }
        if ((i & 2) != 0) {
            collection = javaDefaultQualifiers.f64656b;
        }
        if ((i & 4) != 0) {
            z = javaDefaultQualifiers.f64657c;
        }
        if ((i & 8) != 0) {
            z2 = javaDefaultQualifiers.f64658d;
        }
        return javaDefaultQualifiers.m89385a(nullabilityQualifierWithMigrationStatus, collection, z, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final JavaDefaultQualifiers m89385a(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z, boolean z2) {
        nullabilityQualifierWithMigrationStatus.getClass();
        collection.getClass();
        return new JavaDefaultQualifiers(nullabilityQualifierWithMigrationStatus, collection, z, z2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89386c() {
        return this.f64657c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final NullabilityQualifierWithMigrationStatus m89387d() {
        return this.f64655a;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Collection<AnnotationQualifierApplicabilityType> m89388e() {
        return this.f64656b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return Intrinsics.m87488d(this.f64655a, javaDefaultQualifiers.f64655a) && Intrinsics.m87488d(this.f64656b, javaDefaultQualifiers.f64656b) && this.f64657c == javaDefaultQualifiers.f64657c && this.f64658d == javaDefaultQualifiers.f64658d;
    }

    public int hashCode() {
        return (((((this.f64655a.hashCode() * 31) + this.f64656b.hashCode()) * 31) + Boolean.hashCode(this.f64657c)) * 31) + Boolean.hashCode(this.f64658d);
    }

    @NotNull
    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f64655a + ", qualifierApplicabilityTypes=" + this.f64656b + ", definitelyNotNull=" + this.f64657c + ", preferQualifierOverBound=" + this.f64658d + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaDefaultQualifiers(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z, boolean z2) {
        nullabilityQualifierWithMigrationStatus.getClass();
        collection.getClass();
        this.f64655a = nullabilityQualifierWithMigrationStatus;
        this.f64656b = collection;
        this.f64657c = z;
        this.f64658d = z2;
    }
}
