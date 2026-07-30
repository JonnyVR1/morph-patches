package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NullabilityQualifier f64969a;

    /* JADX INFO: renamed from: b */
    public final boolean f64970b;

    public NullabilityQualifierWithMigrationStatus(@NotNull NullabilityQualifier nullabilityQualifier, boolean z) {
        nullabilityQualifier.getClass();
        this.f64969a = nullabilityQualifier;
        this.f64970b = z;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ NullabilityQualifierWithMigrationStatus m89975b(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.f64969a;
        }
        if ((i & 2) != 0) {
            z = nullabilityQualifierWithMigrationStatus.f64970b;
        }
        return nullabilityQualifierWithMigrationStatus.m89976a(nullabilityQualifier, z);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final NullabilityQualifierWithMigrationStatus m89976a(@NotNull NullabilityQualifier nullabilityQualifier, boolean z) {
        nullabilityQualifier.getClass();
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final NullabilityQualifier m89977c() {
        return this.f64969a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89978d() {
        return this.f64970b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.f64969a == nullabilityQualifierWithMigrationStatus.f64969a && this.f64970b == nullabilityQualifierWithMigrationStatus.f64970b;
    }

    public int hashCode() {
        return (this.f64969a.hashCode() * 31) + Boolean.hashCode(this.f64970b);
    }

    @NotNull
    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f64969a + ", isForWarningOnly=" + this.f64970b + ')';
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i & 2) != 0 ? false : z);
    }
}
