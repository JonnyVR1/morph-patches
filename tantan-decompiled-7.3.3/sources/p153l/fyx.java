package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class fyx {

    /* JADX INFO: renamed from: a */
    public final Object f101422a;

    /* JADX INFO: renamed from: b */
    public final int f101423b;

    /* JADX INFO: renamed from: c */
    public final int f101424c;

    /* JADX INFO: renamed from: d */
    public final long f101425d;

    /* JADX INFO: renamed from: e */
    public final int f101426e;

    public fyx(fyx fyxVar) {
        this.f101422a = fyxVar.f101422a;
        this.f101423b = fyxVar.f101423b;
        this.f101424c = fyxVar.f101424c;
        this.f101425d = fyxVar.f101425d;
        this.f101426e = fyxVar.f101426e;
    }

    /* JADX INFO: renamed from: a */
    public fyx m128141a(Object obj) {
        return this.f101422a.equals(obj) ? this : new fyx(obj, this.f101423b, this.f101424c, this.f101425d, this.f101426e);
    }

    /* JADX INFO: renamed from: b */
    public boolean m128142b() {
        return this.f101423b != -1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyx)) {
            return false;
        }
        fyx fyxVar = (fyx) obj;
        return this.f101422a.equals(fyxVar.f101422a) && this.f101423b == fyxVar.f101423b && this.f101424c == fyxVar.f101424c && this.f101425d == fyxVar.f101425d && this.f101426e == fyxVar.f101426e;
    }

    public int hashCode() {
        return ((((((((527 + this.f101422a.hashCode()) * 31) + this.f101423b) * 31) + this.f101424c) * 31) + ((int) this.f101425d)) * 31) + this.f101426e;
    }

    public fyx(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public fyx(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public fyx(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public fyx(Object obj) {
        this(obj, -1L);
    }

    public fyx(Object obj, int i, int i2, long j, int i3) {
        this.f101422a = obj;
        this.f101423b = i;
        this.f101424c = i2;
        this.f101425d = j;
        this.f101426e = i3;
    }
}
