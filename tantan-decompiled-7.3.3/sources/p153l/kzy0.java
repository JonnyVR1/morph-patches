package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class kzy0 {

    /* JADX INFO: renamed from: a */
    public final Object f129476a;

    /* JADX INFO: renamed from: b */
    public final int f129477b;

    /* JADX INFO: renamed from: c */
    public final int f129478c;

    /* JADX INFO: renamed from: d */
    public final long f129479d;

    /* JADX INFO: renamed from: e */
    public final int f129480e;

    public kzy0(Object obj, int i, int i2, long j, int i3) {
        this.f129476a = obj;
        this.f129477b = i;
        this.f129478c = i2;
        this.f129479d = j;
        this.f129480e = i3;
    }

    /* JADX INFO: renamed from: a */
    public final kzy0 m152239a(Object obj) {
        return this.f129476a.equals(obj) ? this : new kzy0(obj, this.f129477b, this.f129478c, this.f129479d, this.f129480e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m152240b() {
        return this.f129477b != -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzy0)) {
            return false;
        }
        kzy0 kzy0Var = (kzy0) obj;
        return this.f129476a.equals(kzy0Var.f129476a) && this.f129477b == kzy0Var.f129477b && this.f129478c == kzy0Var.f129478c && this.f129479d == kzy0Var.f129479d && this.f129480e == kzy0Var.f129480e;
    }

    public final int hashCode() {
        return ((((((((this.f129476a.hashCode() + 527) * 31) + this.f129477b) * 31) + this.f129478c) * 31) + ((int) this.f129479d)) * 31) + this.f129480e;
    }

    public kzy0(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public kzy0(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public kzy0(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
