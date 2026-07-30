package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class nli {

    /* JADX INFO: renamed from: a */
    public final int f139554a;

    /* JADX INFO: renamed from: b */
    public final int[] f139555b;

    /* JADX INFO: renamed from: c */
    public final pxc0[] f139556c;

    public nli(int i, int[] iArr, int i2, int i3, int i4) {
        this.f139554a = i;
        this.f139555b = iArr;
        float f = i2;
        float f2 = i4;
        this.f139556c = new pxc0[]{new pxc0(f, f2), new pxc0(i3, f2)};
    }

    /* JADX INFO: renamed from: a */
    public pxc0[] m160055a() {
        return this.f139556c;
    }

    /* JADX INFO: renamed from: b */
    public int[] m160056b() {
        return this.f139555b;
    }

    /* JADX INFO: renamed from: c */
    public int m160057c() {
        return this.f139554a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof nli) && this.f139554a == ((nli) obj).f139554a;
    }

    public int hashCode() {
        return this.f139554a;
    }
}
