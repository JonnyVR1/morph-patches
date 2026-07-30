package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class joi {

    /* JADX INFO: renamed from: a */
    public final int f122026a;

    /* JADX INFO: renamed from: b */
    public final int[] f122027b;

    /* JADX INFO: renamed from: c */
    public final s5d0[] f122028c;

    public joi(int i, int[] iArr, int i2, int i3, int i4) {
        this.f122026a = i;
        this.f122027b = iArr;
        float f = i2;
        float f2 = i4;
        this.f122028c = new s5d0[]{new s5d0(f, f2), new s5d0(i3, f2)};
    }

    /* JADX INFO: renamed from: a */
    public s5d0[] m146460a() {
        return this.f122028c;
    }

    /* JADX INFO: renamed from: b */
    public int[] m146461b() {
        return this.f122027b;
    }

    /* JADX INFO: renamed from: c */
    public int m146462c() {
        return this.f122026a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof joi) && this.f122026a == ((joi) obj).f122026a;
    }

    public int hashCode() {
        return this.f122026a;
    }
}
