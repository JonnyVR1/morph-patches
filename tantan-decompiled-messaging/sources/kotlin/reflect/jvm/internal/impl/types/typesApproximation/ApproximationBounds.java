package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ApproximationBounds<T> {

    /* JADX INFO: renamed from: a */
    public final T f66347a;

    /* JADX INFO: renamed from: b */
    public final T f66348b;

    public ApproximationBounds(T t, T t2) {
        this.f66347a = t;
        this.f66348b = t2;
    }

    /* JADX INFO: renamed from: a */
    public final T m93107a() {
        return this.f66347a;
    }

    /* JADX INFO: renamed from: b */
    public final T m93108b() {
        return this.f66348b;
    }

    /* JADX INFO: renamed from: c */
    public final T m93109c() {
        return this.f66347a;
    }

    /* JADX INFO: renamed from: d */
    public final T m93110d() {
        return this.f66348b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.m87488d(this.f66347a, approximationBounds.f66347a) && Intrinsics.m87488d(this.f66348b, approximationBounds.f66348b);
    }

    public int hashCode() {
        T t = this.f66347a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f66348b;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApproximationBounds(lower=" + this.f66347a + ", upper=" + this.f66348b + ')';
    }
}
