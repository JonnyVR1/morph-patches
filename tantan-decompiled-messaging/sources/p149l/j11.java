package p149l;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes8.dex */
public class j11 {

    /* JADX INFO: renamed from: c */
    public static final j11 f115729c = new j11(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f115730a;

    /* JADX INFO: renamed from: b */
    public final int f115731b;

    public j11(@IntRange(from = 1) int i, @IntRange(from = 1) int i2) {
        this.f115730a = i;
        this.f115731b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m139216a() {
        return this.f115731b;
    }

    /* JADX INFO: renamed from: b */
    public float m139217b() {
        return this.f115730a / this.f115731b;
    }

    /* JADX INFO: renamed from: c */
    public int m139218c() {
        return this.f115730a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m139219d() {
        return this.f115730a == this.f115731b;
    }
}
