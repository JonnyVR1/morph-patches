package p153l;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes8.dex */
public class q11 {

    /* JADX INFO: renamed from: c */
    public static final q11 f155139c = new q11(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f155140a;

    /* JADX INFO: renamed from: b */
    public final int f155141b;

    public q11(@IntRange(from = 1) int i, @IntRange(from = 1) int i2) {
        this.f155140a = i;
        this.f155141b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m174803a() {
        return this.f155141b;
    }

    /* JADX INFO: renamed from: b */
    public float m174804b() {
        return this.f155140a / this.f155141b;
    }

    /* JADX INFO: renamed from: c */
    public int m174805c() {
        return this.f155140a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m174806d() {
        return this.f155140a == this.f155141b;
    }
}
