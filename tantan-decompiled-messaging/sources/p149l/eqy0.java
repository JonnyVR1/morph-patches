package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class eqy0 {

    /* JADX INFO: renamed from: a */
    public final Object f92867a;

    /* JADX INFO: renamed from: b */
    public final int f92868b;

    /* JADX INFO: renamed from: c */
    public final int f92869c;

    /* JADX INFO: renamed from: d */
    public final long f92870d;

    /* JADX INFO: renamed from: e */
    public final int f92871e;

    public eqy0(Object obj, int i, int i2, long j, int i3) {
        this.f92867a = obj;
        this.f92868b = i;
        this.f92869c = i2;
        this.f92870d = j;
        this.f92871e = i3;
    }

    /* JADX INFO: renamed from: a */
    public final eqy0 m117806a(Object obj) {
        return this.f92867a.equals(obj) ? this : new eqy0(obj, this.f92868b, this.f92869c, this.f92870d, this.f92871e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m117807b() {
        return this.f92868b != -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqy0)) {
            return false;
        }
        eqy0 eqy0Var = (eqy0) obj;
        return this.f92867a.equals(eqy0Var.f92867a) && this.f92868b == eqy0Var.f92868b && this.f92869c == eqy0Var.f92869c && this.f92870d == eqy0Var.f92870d && this.f92871e == eqy0Var.f92871e;
    }

    public final int hashCode() {
        return ((((((((this.f92867a.hashCode() + 527) * 31) + this.f92868b) * 31) + this.f92869c) * 31) + ((int) this.f92870d)) * 31) + this.f92871e;
    }

    public eqy0(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public eqy0(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public eqy0(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
