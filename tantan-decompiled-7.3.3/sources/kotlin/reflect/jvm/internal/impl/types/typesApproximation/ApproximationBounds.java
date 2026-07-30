package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ApproximationBounds<T> {

    /* JADX INFO: renamed from: a */
    public final T f67021a;

    /* JADX INFO: renamed from: b */
    public final T f67022b;

    public ApproximationBounds(T t, T t2) {
        this.f67021a = t;
        this.f67022b = t2;
    }

    /* JADX INFO: renamed from: a */
    public final T m93998a() {
        return this.f67021a;
    }

    /* JADX INFO: renamed from: b */
    public final T m93999b() {
        return this.f67022b;
    }

    /* JADX INFO: renamed from: c */
    public final T m94000c() {
        return this.f67021a;
    }

    /* JADX INFO: renamed from: d */
    public final T m94001d() {
        return this.f67022b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.m88377d(this.f67021a, approximationBounds.f67021a) && Intrinsics.m88377d(this.f67022b, approximationBounds.f67022b);
    }

    public int hashCode() {
        T t = this.f67021a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f67022b;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApproximationBounds(lower=" + this.f67021a + ", upper=" + this.f67022b + ')';
    }
}
