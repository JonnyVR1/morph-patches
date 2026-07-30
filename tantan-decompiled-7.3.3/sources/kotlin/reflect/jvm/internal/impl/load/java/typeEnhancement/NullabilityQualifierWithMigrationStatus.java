package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NullabilityQualifier f65643a;

    /* JADX INFO: renamed from: b */
    public final boolean f65644b;

    public NullabilityQualifierWithMigrationStatus(@NotNull NullabilityQualifier nullabilityQualifier, boolean z) {
        nullabilityQualifier.getClass();
        this.f65643a = nullabilityQualifier;
        this.f65644b = z;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ NullabilityQualifierWithMigrationStatus m90866b(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.f65643a;
        }
        if ((i & 2) != 0) {
            z = nullabilityQualifierWithMigrationStatus.f65644b;
        }
        return nullabilityQualifierWithMigrationStatus.m90867a(nullabilityQualifier, z);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final NullabilityQualifierWithMigrationStatus m90867a(@NotNull NullabilityQualifier nullabilityQualifier, boolean z) {
        nullabilityQualifier.getClass();
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final NullabilityQualifier m90868c() {
        return this.f65643a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90869d() {
        return this.f65644b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.f65643a == nullabilityQualifierWithMigrationStatus.f65643a && this.f65644b == nullabilityQualifierWithMigrationStatus.f65644b;
    }

    public int hashCode() {
        return (this.f65643a.hashCode() * 31) + Boolean.hashCode(this.f65644b);
    }

    @NotNull
    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f65643a + ", isForWarningOnly=" + this.f65644b + ')';
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i & 2) != 0 ? false : z);
    }
}
