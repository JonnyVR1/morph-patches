package p007l;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class j11 {

    /* JADX INFO: renamed from: c */
    public static final j11 f2952c = new j11(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f2953a;

    /* JADX INFO: renamed from: b */
    public final int f2954b;

    public j11(@IntRange(from = 1) int i, @IntRange(from = 1) int i2) {
        this.f2953a = i;
        this.f2954b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m9451a() {
        return this.f2954b;
    }

    /* JADX INFO: renamed from: b */
    public float m9452b() {
        return this.f2953a / this.f2954b;
    }

    /* JADX INFO: renamed from: c */
    public int m9453c() {
        return this.f2953a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m9454d() {
        return this.f2953a == this.f2954b;
    }
}
