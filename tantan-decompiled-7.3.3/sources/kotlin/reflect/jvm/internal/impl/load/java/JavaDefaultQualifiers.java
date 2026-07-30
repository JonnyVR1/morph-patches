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
    public final NullabilityQualifierWithMigrationStatus f65329a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Collection<AnnotationQualifierApplicabilityType> f65330b;

    /* JADX INFO: renamed from: c */
    public final boolean f65331c;

    /* JADX INFO: renamed from: d */
    public final boolean f65332d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            z = nullabilityQualifierWithMigrationStatus.m90868c() == NullabilityQualifier.NOT_NULL;
        }
        this(nullabilityQualifierWithMigrationStatus, collection, z, (i & 8) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ JavaDefaultQualifiers m90275b(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.f65329a;
        }
        if ((i & 2) != 0) {
            collection = javaDefaultQualifiers.f65330b;
        }
        if ((i & 4) != 0) {
            z = javaDefaultQualifiers.f65331c;
        }
        if ((i & 8) != 0) {
            z2 = javaDefaultQualifiers.f65332d;
        }
        return javaDefaultQualifiers.m90276a(nullabilityQualifierWithMigrationStatus, collection, z, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final JavaDefaultQualifiers m90276a(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z, boolean z2) {
        nullabilityQualifierWithMigrationStatus.getClass();
        collection.getClass();
        return new JavaDefaultQualifiers(nullabilityQualifierWithMigrationStatus, collection, z, z2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90277c() {
        return this.f65331c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final NullabilityQualifierWithMigrationStatus m90278d() {
        return this.f65329a;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Collection<AnnotationQualifierApplicabilityType> m90279e() {
        return this.f65330b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return Intrinsics.m88377d(this.f65329a, javaDefaultQualifiers.f65329a) && Intrinsics.m88377d(this.f65330b, javaDefaultQualifiers.f65330b) && this.f65331c == javaDefaultQualifiers.f65331c && this.f65332d == javaDefaultQualifiers.f65332d;
    }

    public int hashCode() {
        return (((((this.f65329a.hashCode() * 31) + this.f65330b.hashCode()) * 31) + Boolean.hashCode(this.f65331c)) * 31) + Boolean.hashCode(this.f65332d);
    }

    @NotNull
    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f65329a + ", qualifierApplicabilityTypes=" + this.f65330b + ", definitelyNotNull=" + this.f65331c + ", preferQualifierOverBound=" + this.f65332d + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaDefaultQualifiers(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z, boolean z2) {
        nullabilityQualifierWithMigrationStatus.getClass();
        collection.getClass();
        this.f65329a = nullabilityQualifierWithMigrationStatus;
        this.f65330b = collection;
        this.f65331c = z;
        this.f65332d = z2;
    }
}
