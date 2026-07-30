package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class wb5 {

    /* JADX INFO: renamed from: a */
    public final int f185551a;

    /* JADX INFO: renamed from: b */
    public final int f185552b;

    /* JADX INFO: renamed from: c */
    public final int f185553c;

    /* JADX INFO: renamed from: d */
    public final int f185554d;

    /* JADX INFO: renamed from: e */
    public int f185555e = -1;

    public wb5(int i, int i2, int i3, int i4) {
        this.f185551a = i;
        this.f185552b = i2;
        this.f185553c = i3;
        this.f185554d = i4;
    }

    /* JADX INFO: renamed from: a */
    public int m202513a() {
        return this.f185553c;
    }

    /* JADX INFO: renamed from: b */
    public int m202514b() {
        return this.f185552b;
    }

    /* JADX INFO: renamed from: c */
    public int m202515c() {
        return this.f185555e;
    }

    /* JADX INFO: renamed from: d */
    public int m202516d() {
        return this.f185551a;
    }

    /* JADX INFO: renamed from: e */
    public int m202517e() {
        return this.f185554d;
    }

    /* JADX INFO: renamed from: f */
    public int m202518f() {
        return this.f185552b - this.f185551a;
    }

    /* JADX INFO: renamed from: g */
    public boolean m202519g() {
        return m202520h(this.f185555e);
    }

    /* JADX INFO: renamed from: h */
    public boolean m202520h(int i) {
        return i != -1 && this.f185553c == (i % 3) * 3;
    }

    /* JADX INFO: renamed from: i */
    public void m202521i(int i) {
        this.f185555e = i;
    }

    /* JADX INFO: renamed from: j */
    public void m202522j() {
        this.f185555e = ((this.f185554d / 30) * 3) + (this.f185553c / 3);
    }

    public String toString() {
        return this.f185555e + "|" + this.f185554d;
    }
}
